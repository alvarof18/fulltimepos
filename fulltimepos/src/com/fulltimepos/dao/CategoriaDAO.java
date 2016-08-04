package com.fulltimepos.dao;

import java.util.List;

import org.hibernate.Session;

import com.fulltimepos.entidades.*;

public class CategoriaDAO<Categorias> extends GenericoDAOImplementa<Categoria> {
	
public String codigo(){
		
		Session entityManager = this.abriSession();
		return String.valueOf(entityManager.createQuery("Select MAX(categorias.categoriaId) + 1 from Categoria categorias")
                                                .getSingleResult());
	}

@SuppressWarnings("unchecked")
public List<Categoria> busquedaDescripcion(String cadena){
	Session entityManager = this.abriSession();
	 return (List<Categoria>)     entityManager.createQuery("Select categoria from Categoria categoria where categoria.descripcion like :cadena")
             .setParameter("cadena","%"+cadena.trim()+"%")
             .getResultList();

}

@SuppressWarnings("unchecked")
public List<Categoria> busquedaEstado(boolean estado){
	Session entityManager = this.abriSession();
	 return (List<Categoria>)     entityManager.createQuery("Select categoria from Categoria categoria where categoria.estado = :estado")
            .setParameter("estado",estado)
            .getResultList();
	
}
}
