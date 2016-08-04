package com.fulltimepos.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.fulltimepos.entidades.Categoria;
import com.fulltimepos.entidades.SubCategoria;
import com.fulltimepos.entidades.TipoContribuyente;
import com.fulltimepos.entidades.TipoIdentificacion;
import com.fulltimepos.modelo.CategoriaServicios;
import com.fulltimepos.modelo.SubCategoriaServicios;
import com.fulltimepos.modelo.TipoContribuyenteServicios;
import com.fulltimepos.modelo.TipoIdentificacionServicios;
import com.fulltimepos.vista.BusquedaGenericaView;
import com.fulltimepos.vista.MensajesView;
import com.fulltimepos.vista.SubCatetoriaView;

public class ControladorSubCategoria implements ActionListener, MouseListener{
	
	private SubCategoriaServicios modelo;
	private SubCatetoriaView vista;
	
	public MensajesView ventanaMensaje  = new MensajesView();
	public BusquedaGenericaView vistaBusqueda = new BusquedaGenericaView();
	
	private String mensaje = "";
	
	private boolean actualizar = false;
	
	public ControladorSubCategoria(SubCategoriaServicios modelo, SubCatetoriaView vista){
		
		this.modelo = modelo;
		this.vista = vista;
		
		this.vista.setTitle("SubCategorias");
		
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
		
		cargarCombos();
		
		accionCampos(false);
		
		this.vista.setVisible(true);
		
		//Vista de Busqueda//
		
		this.vistaBusqueda.btnBuscar.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent accion){
				   buscarDatos();				 
			 }
			 });
		
		this.vistaBusqueda.tbResultado.addMouseListener(this);	
		
		
	}
	
	@SuppressWarnings("unchecked")
	private void cargarCombos() {
		//Categorias
		CategoriaServicios modeloCategoria = new CategoriaServicios();
		List<Categoria> lista = new ArrayList<Categoria>();
        lista = modeloCategoria.lista();
		this.vista.cbCategoria.addItem("Seleccione");
		for(Categoria ca:lista){
			this.vista.cbCategoria.addItem(ca);
		}		
	}
	
	private void buscarDatos() {
		List<SubCategoria> lista = new ArrayList<SubCategoria>();
		Vector<Object> fila;
		
		// Limpio la tabla
		 for(int i=this.vistaBusqueda.dtm.getRowCount(); i>0; i--){
	            this.vistaBusqueda.dtm.removeRow(i-1);
	        }
		    
		if(vistaBusqueda.cbBusqueda.getSelectedItem().equals("Seleccione") && vistaBusqueda.txtbusqueda.getText().equals("")){
			lista = modelo.lista();			
		}else if(vistaBusqueda.cbBusqueda.getSelectedItem().equals("Descripcion")){
			lista = modelo.busquedaDescripcion(vistaBusqueda.txtbusqueda.getText().trim());
		} else if(vistaBusqueda.cbBusqueda.getSelectedItem().equals("Codigo")){
			int valor = 0;
			try{
				valor = Integer.parseInt(vistaBusqueda.txtbusqueda.getText().trim());	
			}
			catch(Exception ex){
			   valor = 0;
			}	
			System.out.println(valor);
			SubCategoria subcategoria = modelo.buscarId(valor);
			if(subcategoria != null){
				lista.add(subcategoria);
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
		
		for(SubCategoria cl: lista){
			fila = new Vector<Object>();
			fila.add(cl.getSubcategoriasId());
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
		
		mensaje = this.modelo.guardar(vista.txtCodigo.getText(),vista.txtDescripcion.getText(), vista.activar.isSelected(),vista.cbCategoria.getSelectedItem(),actualizar);
		
		if(mensaje.equals("")){
			if(actualizar){
			   vista.btnModificar.setEnabled(false);
			   vista.btnNuevo.setEnabled(true);
			   limpiarCampos();
			   ventanaMensaje.mensajes("Informacion actualizada", 1);
			}else{
			   ventanaMensaje.mensajes("Subcategoria creada de forma satisfactoria", 1);
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
		vista.cbCategoria.setSelectedIndex(0);
	}
	
	private void accionCampos(boolean accion) {
		
		vista.txtDescripcion.setEnabled(accion);
		vista.activar.setEnabled(accion);
		vista.cbCategoria.setEnabled(accion);
	}
	

	@Override
	public void mouseClicked(MouseEvent evento) {
		int filaSeleccionada;
		int id;
		
		if(evento.getClickCount() == 2){
		
		filaSeleccionada = vistaBusqueda.tbResultado.getSelectedRow();
			
			if(filaSeleccionada >= 0){
				id = (int) this.vistaBusqueda.dtm.getValueAt(filaSeleccionada,0);
				SubCategoria subCategoria = modelo.buscarId(id);
				cargarDatos(subCategoria);
				vistaBusqueda.setVisible(false);
				vista.btnModificar.setEnabled(true);
				vista.btnNuevo.setEnabled(false);
			}
		}	
		
	}
	

	private void cargarDatos(SubCategoria subCategoria) {
		
		vista.txtCodigo.setText(String.valueOf(subCategoria.getSubcategoriasId()));
		vista.txtDescripcion.setText(subCategoria.getDescripcion());
		if(subCategoria.getEstado()){
			vista.activar.setSelected(true);
		}else{
			vista.activar.setSelected(false);
		}
		
				
		for(int i = 0; i< vista.cbCategoria.getModel().getSize();i++){
			if(vista.cbCategoria.getModel().getElementAt(i).toString().equals(subCategoria.getCategoria().getDescripcion())){				
				vista.cbCategoria.setSelectedIndex(i);
				break;
			}	
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
