package com.fulltimepos.dao;

import java.util.List;

import org.hibernate.Session;

import com.fulltimepos.entidades.SubCategoria;

@SuppressWarnings("hiding")
public class SubCategoriaDAO<SubCategoria> extends GenericoDAOImplementa<SubCategoria> {
	
	public String codigo(){
			
			Session entityManager = this.abriSession();
			return String.valueOf(entityManager.createQuery("Select MAX(subCategoria.subcategoriasId) + 1 from SubCategoria subCategoria")
	                                                .getSingleResult());
		}

	@SuppressWarnings("unchecked")
	public List<SubCategoria> busquedaDescripcion(String cadena){
		Session entityManager = this.abriSession();
		 return (List<SubCategoria>)     entityManager.createQuery("Select subCategoria from SubCategoria subCategoria where subCategoria.descripcion like :cadena")
	             .setParameter("cadena","%"+cadena.trim()+"%")
	             .getResultList();
	
	}

	@SuppressWarnings("unchecked")
	public List<SubCategoria> busquedaEstado(boolean estado){
		Session entityManager = this.abriSession();
		 return (List<SubCategoria>)     entityManager.createQuery("Select subCategoria from SubCategoria subCategoria where subCategoria.estado = :estado")
	            .setParameter("estado",estado)
	            .getResultList();
		
	}

}
