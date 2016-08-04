package com.fulltimepos.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.fulltimepos.entidades.Categoria;
import com.fulltimepos.modelo.CategoriaServicios;
import com.fulltimepos.vista.BusquedaGenericaView;
import com.fulltimepos.vista.CategoriasView;
import com.fulltimepos.vista.MensajesView;


public class ControladorCategorias implements ActionListener, MouseListener{
	
	private CategoriaServicios modelo;
	private CategoriasView vista;
	
	public MensajesView ventanaMensaje  = new MensajesView();
	public BusquedaGenericaView vistaBusqueda = new BusquedaGenericaView();
	
	private String mensaje = "";
	
	private boolean actualizar = false;
		
	public ControladorCategorias(CategoriaServicios modelo, CategoriasView vista){
		
		this.modelo = modelo;
		this.vista = vista;
		
		this.vista.setTitle("Categorias");
		
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
		this.vista.setLocationRelativeTo(null);
		
		accionCampos(false);
		
		this.vista.setVisible(true);
		
		//Vista de Busqueda//
		
		this.vistaBusqueda.btnBuscar.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent accion){
				  System.out.println("hola " + vistaBusqueda.txtbusqueda.getText());
				 buscarDatos();				 
			 }
			 });
		
		this.vistaBusqueda.tbResultado.addMouseListener(this);	
	}
	
	private void buscarDatos() {
		List<Categoria> lista = new ArrayList<Categoria>();
		Vector<Object> fila;
		    
		if(vistaBusqueda.cbBusqueda.getSelectedItem().equals("Seleccione") && vistaBusqueda.txtbusqueda.getText().equals("")){
			lista = modelo.lista();			
		}else if(vistaBusqueda.cbBusqueda.getSelectedItem().equals("Descripcion")){
			lista = modelo.busquedaDescripcion(vistaBusqueda.txtbusqueda.getText().trim());
		} else if(vistaBusqueda.cbBusqueda.getSelectedItem().equals("Codigo")){
			int valor = 0;
			try{
				System.out.println(valor);
			   valor = Integer.parseInt(vistaBusqueda.txtbusqueda.getText().trim());	
			}
			catch(Exception ex){
			   valor = 0;
			}	
			System.out.println(valor);
			Categoria categoria = modelo.buscarId(valor);
			if(categoria != null){
				lista.add(categoria);
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
		
		for(Categoria cl: lista){
			fila = new Vector<Object>();
			fila.add(cl.getCategoriaId());
			fila.add(cl.getDescripcion());
			
			if(cl.getEstado()){
				fila.add(new String("Activo"));
			}else{
				fila.add(new String("Inactivo"));
			}
			vistaBusqueda.dtm.addRow(fila);		
		}
		
	}
	
	private void guardarinfo() {
		mensaje = "";
		mensaje = this.modelo.guardar(vista.txtCodigo.getText(),vista.txtDescripcion.getText(), vista.activar.isSelected(),actualizar);
		
		if(mensaje.equals("")){
			if(actualizar){
			   vista.btnModificar.setEnabled(false);
			   vista.btnNuevo.setEnabled(true);
			   limpiarCampos();
			   ventanaMensaje.mensajes("Informacion actualizada", 1);
			}else{
			   ventanaMensaje.mensajes("Presentacion creada de forma satisfactoria", 1);
			   limpiarCampos();
			}
			
			 accionCampos(false);
			 this.vista.btnGuardar.setEnabled(false);
			 this.vista.btnCancelar.setEnabled(false);
		}else{
			   ventanaMensaje.mensajes(mensaje, 2);
		     }

	}
	
	public void nuevoCliente() {
		 limpiarCampos();
		 accionCampos(true);
		 vista.txtCodigo.setText(modelo.codigo());
		 vista.btnGuardar.setEnabled(true);
		 vista.btnCancelar.setEnabled(true);	
	}
	
	public void limpiarCampos(){
		vista.txtCodigo.setText("");
		vista.txtDescripcion.setText("");
		vista.activar.setSelected(false);
	}
	
	private void accionCampos(boolean accion) {
		
		vista.txtDescripcion.setEnabled(accion);
		vista.activar.setEnabled(accion);
	}

	@Override
	public void mouseClicked(MouseEvent evento) {
		int filaSeleccionada;
		int id;
		
		if(evento.getClickCount() == 2){
		
		filaSeleccionada = vistaBusqueda.tbResultado.getSelectedRow();
			
			if(filaSeleccionada >= 0){
				id = (int) this.vistaBusqueda.dtm.getValueAt(filaSeleccionada,0);
				Categoria categoria = modelo.buscarId(id);
				cargarDatos(categoria);
				vistaBusqueda.setVisible(false);
				vista.btnModificar.setEnabled(true);
				vista.btnNuevo.setEnabled(false);
			}
		}	
		
	}
	
	private void cargarDatos(Categoria categoria) {
		
		vista.txtCodigo.setText(String.valueOf(categoria.getCategoriaId()));
		vista.txtDescripcion.setText(categoria.getDescripcion());
		if(categoria.getEstado()){
			vista.activar.setSelected(true);
		}else{
			vista.activar.setSelected(false);
		}
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
			 // Limpiar caja de Texto de Busqueda
		        vistaBusqueda.txtbusqueda.setText("");
			
			 accionCampos(false);
			this.vistaBusqueda.setLocationRelativeTo(null);
			this.vistaBusqueda.setVisible(true);
			break;
			
		case "Modificar":
			accionCampos(true);
			this.actualizar = true;
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

}
