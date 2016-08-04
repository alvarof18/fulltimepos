package com.fulltimepos.modelo;

import com.fulltimepos.dao.DetalleContactoDAO;
import com.fulltimepos.entidades.DetalleContacto;
import com.fulltimepos.entidades.Proveedor;
import com.fulltimepos.utilidades.Validador;

public class DetalleContactoServicios extends DetalleContactoDAO<DetalleContacto>{
	
	public String resultado;
	private Validador valida = new Validador();	
	
    public String guardar(String codigo, String nombre, String telefono, String correo, String cargo, Proveedor proveedor, Boolean actualizar){
		
		this.resultado = "";
		
		if(nombre.isEmpty()){
			resultado = "Complete el campo Nombre";			
		}else if(telefono.isEmpty()){
				resultado = "Complete el campo Telefono";
		}else if(!valida.validarNumeros(telefono)){
			  resultado = "Campo telefono solo acepta numeros";
		} else if(!correo.isEmpty()){
			  if(!valida.Correo(correo)){
				  resultado = "Formato de correo invalido";
			  }
		}
			
		if(resultado.equals("")){
			  if(actualizar){
				DetalleContacto detalleContacto = new DetalleContacto();  
				detalleContacto = super.buscarId(Integer.parseInt(codigo));
				detalleContacto.setCargo(cargo);
				detalleContacto.setCorreo(correo);
				detalleContacto.setNombre(nombre);
				detalleContacto.setTelefono(telefono);
				super.actualizar(detalleContacto);
				
			  }else{
				  DetalleContacto detalleContacto = new DetalleContacto(nombre,cargo,telefono,correo,proveedor);
				super.guardar(detalleContacto);
				}	
			}
	
		return resultado;		
	}
    
    public void eliminar(String codigo){
		DetalleContacto contacto = new DetalleContacto();
	    contacto = super.buscarId(Integer.parseInt(codigo));	
	    super.eliminar(contacto);	
	    	
	 }
    

}
