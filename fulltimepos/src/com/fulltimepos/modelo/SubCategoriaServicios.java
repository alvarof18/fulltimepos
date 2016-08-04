package com.fulltimepos.modelo;

import com.fulltimepos.dao.SubCategoriaDAO;
import com.fulltimepos.entidades.Categoria;
import com.fulltimepos.entidades.SubCategoria;

public class SubCategoriaServicios extends SubCategoriaDAO<SubCategoria>{
	
	private String resultado;
	
	public String guardar(String codigo, String descripcion, Boolean estado, Object categoria, Boolean actualizar){
		
		this.resultado = "";
		SubCategoria subcategoria = new SubCategoria();
		Categoria categoriaNew = new Categoria();
		
		if(descripcion.isEmpty()){
			resultado = "Llene todos los campos";
		}
		
		if(categoria.getClass().equals(Categoria.class)) {
			categoriaNew = (Categoria) categoria;
		}else{
			 resultado = "Seleccione una categoria";
		}
			
		if(resultado.equals("")){
			  if(actualizar){
				subcategoria = super.buscarId(Integer.parseInt(codigo));
				subcategoria.setDescripcion(descripcion);
				subcategoria.setEstado(estado);
				subcategoria.setCategoria(categoriaNew);
				super.actualizar(subcategoria);
				
			  }else{
				subcategoria.setDescripcion(descripcion);
				subcategoria.setEstado(estado);	
				subcategoria.setCategoria(categoriaNew);
				super.guardar(subcategoria);
				}	
			}
	
		return resultado;		
	}
}
