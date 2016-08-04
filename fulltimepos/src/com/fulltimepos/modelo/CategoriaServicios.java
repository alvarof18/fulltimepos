package com.fulltimepos.modelo;

import com.fulltimepos.dao.CategoriaDAO;
import com.fulltimepos.entidades.Categoria;


public class CategoriaServicios extends CategoriaDAO<Categoria>{
	
	private String resultado ="";
	
	public CategoriaServicios(){
		super();
	}
	
	public String guardar(String codigo, String descripcion, Boolean estado, Boolean actualizar){
		Categoria categoria = new Categoria();
		
		if(descripcion.isEmpty()){
			resultado = "Llene todos los campos";
		}else{
		  if(actualizar){
			categoria = super.buscarId(Integer.parseInt(codigo));
			categoria.setDescripcion(descripcion);
			categoria.setEstado(estado);
			super.actualizar(categoria);
			
		  }else{
 			categoria.setDescripcion(descripcion);
			categoria.setEstado(estado);	
			super.guardar(categoria);
			}	
		}
		
		return resultado;		
	}

}
