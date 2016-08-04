package com.fulltimepos.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import com.fulltimepos.entidades.Clientes;
import com.fulltimepos.entidades.TipoContribuyente;
import com.fulltimepos.entidades.TipoIdentificacion;
import com.fulltimepos.modelo.ClienteServicios;
import com.fulltimepos.modelo.TipoContribuyenteServicios;
import com.fulltimepos.modelo.TipoIdentificacionServicios;
import com.fulltimepos.vista.ClientesSearch;
import com.fulltimepos.vista.ClientesView;
import com.fulltimepos.vista.MensajesView;


public class ControladorCliente implements ActionListener, MouseListener{
	
	 private ClienteServicios modelo;
	 private ClientesView vista;
	 
	 private ClientesSearch vistaBusqueda = new ClientesSearch();
	 
	 public String mensaje;
	 
	 public boolean actualiza = false;
	 
	 public MensajesView ventanaMensaje = new MensajesView();
	
	 public ControladorCliente(ClienteServicios modelo, ClientesView vista){
		this.modelo = modelo;
		this.vista = vista;
		
		accionCampos(false);
		
		this.vista.btnGuardar.addActionListener(this);
		this.vista.btnGuardar.setActionCommand("Guardar");
		this.vista.btnGuardar.setEnabled(false);
		
		this.vista.btnNuevo.addActionListener(new ActionListener() {
					  public void actionPerformed(ActionEvent arg0){
						  nuevoCliente();
					 }
					 });
							
		this.vista.btnEliminar.addActionListener(this);
		this.vista.btnEliminar.setActionCommand("Eliminar");
		this.vista.btnEliminar.setEnabled(false);
		
		this.vista.btnModificar.addActionListener(this);
		this.vista.btnModificar.setActionCommand("Modificar");
		this.vista.btnModificar.setEnabled(false);
		
		this.vista.btnBuscar.addActionListener(this);
		this.vista.btnBuscar.setActionCommand("Buscar");
		
		this.vista.btnCancelar.addActionListener(this);
		this.vista.btnCancelar.setActionCommand("Cancelar");
		this.vista.btnCancelar.setEnabled(false);
				
		this.cargarCombos();
		this.vista.setVisible(true);
		
		this.vistaBusqueda.tbResultado.addMouseListener(this);
		
		//Vista Buscar//
	 
		this.vistaBusqueda.btnBuscar.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent arg0){
				 buscarDatos();				 
			 }
			 });
		
		this.vista.txtCodigo.setEnabled(false);
	}

	protected void buscarDatos() {
		List<Clientes> lista = new ArrayList<Clientes>();
		Vector<Object> fila;
		
		//Limpiar los datos de la tabla
        for(int i=this.vistaBusqueda.dtm.getRowCount(); i>0; i--){
            this.vistaBusqueda.dtm.removeRow(i-1);
        }
        
		if(vistaBusqueda.cbBusqueda.getSelectedItem().equals("Seleccione") && vistaBusqueda.txtbusqueda.getText().equals("")){
			lista = modelo.lista();				
		}else if(vistaBusqueda.cbBusqueda.getSelectedItem().equals("Nombre")){
			lista = modelo.busquedaNombre(vistaBusqueda.txtbusqueda.getText().trim());
		} else if(vistaBusqueda.cbBusqueda.getSelectedItem().equals("Codigo")){
			int valor;
			try{
			   valor = Integer.parseInt(vistaBusqueda.txtbusqueda.getText().trim());	
			}
			catch(Exception ex){
			   valor = 0;
			}	
			Clientes cliente = modelo.buscarId(valor);
			if(cliente != null){
				lista.add(cliente);
			}
		}else if(vistaBusqueda.cbBusqueda.getSelectedItem().equals("Estado")){
			boolean estado= true;
			if(vistaBusqueda.txtbusqueda.getText().toLowerCase().equals("activo")){
			 estado = true;
			}else if(vistaBusqueda.txtbusqueda.getText().toLowerCase().equals("inactivo")){
				estado = false;
			}else{
				
			}
			lista = modelo.busquedaEstado(estado);
		}
		
		for(Clientes cl: lista){
			fila = new Vector<Object>();
			fila.add(cl.getClienteid());
			fila.add(cl.getNombre());
			fila.add(cl.getIdentificacion());
			if(cl.getEstado()){
				fila.add(new String("Activo"));
			}else{
				fila.add(new String("Inactivo"));
			}
			vistaBusqueda.dtm.addRow(fila);	
			
		}
		
		
	}

	@SuppressWarnings("unchecked")
	private void cargarCombos() {
		//Tipo Identificacion
		TipoIdentificacionServicios tipoIdentificacion = new TipoIdentificacionServicios();
		List<TipoIdentificacion> lista = new ArrayList<TipoIdentificacion>();
        lista = tipoIdentificacion.lista();
		this.vista.jcTIdentificacion.addItem("Seleccione");
		for(TipoIdentificacion ti:lista){
			this.vista.jcTIdentificacion.addItem(ti);
		}
		
		//Tipo Contribuyente
		TipoContribuyenteServicios tipoContribuyente = new TipoContribuyenteServicios();
		List<TipoContribuyente> listaContribuyente = new ArrayList<TipoContribuyente>();
		listaContribuyente = tipoContribuyente.lista();
		
		this.vista.jcTContribuyente.addItem("Seleccione");
		for(TipoContribuyente tc:listaContribuyente){
			this.vista.jcTContribuyente.addItem(tc);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent accion) {
		
		String comando = accion.getActionCommand();

		switch (comando){
		
		case "Guardar":
			guardarinfo();
			break;
			
		case "Buscar":
			// Limpio la tabla
			 for(int i=this.vistaBusqueda.dtm.getRowCount(); i>0; i--){
		            this.vistaBusqueda.dtm.removeRow(i-1);
		        }
			
			 accionCampos(false);
			 		 
			this.vistaBusqueda.setVisible(true);
			break;
			
		case "Modificar":
			accionCampos(true);
			this.actualiza = true;
			this.vista.btnGuardar.setEnabled(true);
			this.vista.btnCancelar.setEnabled(true);
			this.vista.btnModificar.setEnabled(false);
			break;
			
		case "Cancelar":
			accionCampos(false);
			limpiarCampos();
			this.vista.btnModificar.setEnabled(false);
			this.vista.btnNuevo.setEnabled(true);
			this.vista.btnGuardar.setEnabled(false);
			this.vista.btnCancelar.setEnabled(false);
					
		}	
	}

	private void guardarinfo() {
		
		TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();
		TipoContribuyente tipoContribuyente = new TipoContribuyente();
		
		mensaje = "";
		boolean estado = true;
		
		if(vista.jcTIdentificacion.getSelectedItem().getClass().equals(TipoIdentificacion.class)){
			tipoIdentificacion = (TipoIdentificacion) vista.jcTIdentificacion.getSelectedItem();
		}else{
			mensaje = "Seleccione un tipo de Identificacion Valido";
		}
		
		if(mensaje.equals("") && vista.jcTContribuyente.getSelectedItem().getClass().equals(TipoContribuyente.class)){
			tipoContribuyente = (TipoContribuyente) vista.jcTContribuyente.getSelectedItem();
		}else if(mensaje.equals("")){
			   mensaje = "Seleccione un tipo de Contribuyente valido";
		}
		
		if(vista.cbxEstado.getSelectedIndex() != 0){
			
			if(vista.cbxEstado.getSelectedItem().equals("Activo")){
				estado = true;
			}else{
				estado=false;
			}
		}else{
			mensaje = "Seleccione un estado";
		}
			
		if(mensaje.equals("")){	
		   mensaje = this.modelo.guardar(vista.txtCodigo.getText(),vista.txtNombre.getText(), vista.txtRazonSocial.getText(), tipoIdentificacion, vista.txtIdentificacion.getText(), 
				                      vista.txtTelefono.getText(),vista.txtDireccion.getText(), vista.txtObservacion.getText(), vista.txtWeb.getText(), tipoContribuyente, 
				                      vista.cbCredito.isSelected(), vista.txtLimite.getText(), vista.txtMonto.getText(), vista.cbMercancia.isSelected(), estado,
				                      vista.txtCorreo.getText(),this.actualiza);
		   
		   if(mensaje.equals("")){
			   
			   if(actualiza){
				   vista.btnModificar.setEnabled(false);
				   vista.btnNuevo.setEnabled(true);
				   limpiarCampos();
				   ventanaMensaje.mensajes("Informacion actualizada", 1);
			   }else{
				   ventanaMensaje.mensajes("Cliente creado de forma satisfactoria", 1);
				   limpiarCampos();
			   }
			  accionCampos(false);
			  this.vista.btnGuardar.setEnabled(false);
			  this.vista.btnCancelar.setEnabled(false);
		   }else{
			   ventanaMensaje.mensajes(mensaje, 2);
		   }
		
		}else{
			ventanaMensaje.mensajes(mensaje, 2);
		}

	}

	private void accionCampos(boolean accion) {
		
			
			//vista.txtCodigo.setEditable(accion);
			vista.txtCorreo.setEditable(accion);
			vista.txtDireccion.setEditable(accion);
			vista.txtIdentificacion.setEditable(accion);
			vista.txtLimite.setEditable(accion);
			vista.txtMonto.setEditable(accion);
			vista.txtNombre.setEditable(accion);
			vista.txtObservacion.setEditable(accion);
			vista.txtMonto.setEditable(accion);
			vista.txtRazonSocial.setEditable(accion);
			vista.cbxEstado.setEnabled(accion);
			vista.cbCredito.setEnabled(accion);
			vista.jcTContribuyente.setEnabled(accion);
			vista.jcTIdentificacion.setEnabled(accion);
			vista.txtTelefono.setEnabled(accion);
			vista.txtWeb.setEnabled(accion);
			vista.cbMercancia.setEnabled(accion);
	}

	@Override
	public void mouseClicked(MouseEvent evento) {
			
		int filaSeleccionada;
		int idCliente;
		
		if(evento.getClickCount() == 2){
		
		filaSeleccionada = vistaBusqueda.tbResultado.getSelectedRow();
			
			if(filaSeleccionada >= 0){
				idCliente = (int) this.vistaBusqueda.dtm.getValueAt(filaSeleccionada,0);
				Clientes cliente = modelo.buscarId(idCliente);
				cargarDatos(cliente);
				vistaBusqueda.setVisible(false);
				vista.btnModificar.setEnabled(true);
				vista.btnNuevo.setEnabled(false);
			}
		}	
	}
	
	private void cargarDatos(Clientes cliente){
				
		vista.txtCodigo.setText(String.valueOf(cliente.getClienteid()));
		vista.txtCorreo.setText(cliente.getCorreo());
		vista.txtDireccion.setText(cliente.getDireccion());
		vista.txtIdentificacion.setText(cliente.getIdentificacion());
		vista.txtLimite.setText(String.valueOf(cliente.getLimite()));
		vista.txtMonto.setText(String.valueOf(cliente.getDescuento()));
		vista.txtNombre.setText(cliente.getNombre());
		vista.txtObservacion.setText(cliente.getObservacion());
		vista.txtRazonSocial.setText(cliente.getRazonSocial());
		
		if(cliente.getEstado()){
			vista.cbxEstado.setSelectedItem(new String("Activo"));
		}else{
			vista.cbxEstado.setSelectedItem(new String("Inactivo"));
		}
		
		if(cliente.getCredito()){
			vista.cbCredito.setSelected(true);;
		}
	    
		for(int i = 0; i< vista.jcTContribuyente.getModel().getSize();i++){
			if(vista.jcTContribuyente.getModel().getElementAt(i).toString().equals(cliente.getTipoContribuyente().getDescripcion())){				
				vista.jcTContribuyente.setSelectedIndex(i);
				break;
			}	
		}
		
		for(int i = 0; i< vista.jcTIdentificacion.getModel().getSize();i++){
			if(vista.jcTIdentificacion.getModel().getElementAt(i).toString().equals(cliente.getTipoIdentificacion().getDescripcion())){				
				vista.jcTIdentificacion.setSelectedIndex(i);
				break;
			}	
		}
		
		vista.txtTelefono.setText(cliente.getTelefono());
		vista.txtWeb.setText(cliente.getWeb());
		
		if(cliente.getMercancia()){
			vista.cbMercancia.isSelected();	
		}
		
	}
	
	public void limpiarCampos(){
		vista.txtCodigo.setText("");
		vista.txtCorreo.setText("");
		vista.txtDireccion.setText("");
		vista.txtIdentificacion.setText("");
		vista.txtLimite.setText("0");
		vista.txtMonto.setText("0");
		vista.txtNombre.setText("");
		vista.txtObservacion.setText("");
		vista.txtRazonSocial.setText("");
		vista.cbxEstado.setSelectedIndex(0);
		vista.cbCredito.setSelected(false);
		vista.jcTContribuyente.setSelectedIndex(0);
		vista.jcTIdentificacion.setSelectedIndex(0);
		vista.txtTelefono.setText("");
		vista.txtWeb.setText("");
		vista.cbMercancia.setSelected(false);
	}
	
	public void nuevoCliente() {
		 limpiarCampos();
		 accionCampos(true);
		 vista.txtCodigo.setText(modelo.codigo());
		 vista.btnGuardar.setEnabled(true);
		 vista.btnCancelar.setEnabled(true);	
	}

	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
