package com.fulltimepos.modelo;

import com.fulltimepos.dao.ProveedorDAO;
import com.fulltimepos.entidades.Proveedor;
import com.fulltimepos.utilidades.Validador;

public class ProveedorServicios extends ProveedorDAO<Proveedor>{
	
	public String resultado;
	private Validador valida = new Validador();	
	
    public String guardar(String codigo, String ruc, String nombre, String direccion, String telefono, String fax, String correo, 
		              String web, String observacion, Boolean estado, Boolean actualizar){
		
		this.resultado = "";
		
		if(nombre.isEmpty()){
			resultado = "Complete el campo Nombre";			
		}else if(!valida.validarRUC(ruc)){
			resultado = "RUC invalido";
		}else if (direccion.isEmpty()){
			resultado = "Complete el campo Direccion";
		}else if(!valida.validarNumeros(telefono)){
			resultado = "Campo telefono solo acepta numeros";
		}else if(!correo.isEmpty()){
			  if(!valida.Correo(correo)){
				  resultado = "Formato de correo invalido";
			  }
		}
			
		if(resultado.equals("")){
			  if(actualizar){
				Proveedor proveedor = new Proveedor();  
				proveedor = super.buscarId(Integer.parseInt(codigo));
				proveedor.setRuc(ruc);
				proveedor.setNombre(nombre);
				proveedor.setCorreo(correo);
				proveedor.setDireccion(direccion);
				proveedor.setEstado(estado);
				proveedor.setFax(fax);
				proveedor.setWeb(web);
				proveedor.setObservacion(observacion);
				proveedor.setTelefono(telefono);
				super.actualizar(proveedor);
				
			  }else{
				Proveedor proveedor = new Proveedor(ruc,nombre,direccion,telefono,fax,correo,web,observacion,estado);
				super.guardar(proveedor);
				}	
			}
	
		return resultado;		
	}
    
  
    
    

}
