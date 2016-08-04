package com.fulltimepos.modelo;

import com.fulltimepos.dao.PresentacionDAO;
import com.fulltimepos.entidades.*;

public class PresentacionServicios extends PresentacionDAO<Presentacion>{
	
	private String resultado ="";
	
	public PresentacionServicios(){
		super();
	}
	
	public String guardar(String codigo, String descripcion, Boolean estado, Boolean actualizar){
		Presentacion presentacion = new Presentacion();
		
		if(descripcion.isEmpty()){
			resultado = "Llene todos los campos";
		}else{
		  if(actualizar){
			presentacion = super.buscarId(Integer.parseInt(codigo));
			presentacion.setDescripcion(descripcion);
			presentacion.setEstado(estado);
			super.actualizar(presentacion);
			
		  }else{
 			presentacion.setDescripcion(descripcion);
			presentacion.setEstado(estado);	
			super.guardar(presentacion);
			}	
		}
		
		return resultado;		
	}
}
