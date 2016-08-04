package com.fulltimepos.dao;

import java.util.List;

import org.hibernate.Session;

import com.fulltimepos.entidades.Almacen;

@SuppressWarnings("hiding")
public class AlmacenDAO<Almacen> extends GenericoDAOImplementa<Almacen>{
	
	public String codigo(){
		
		Session entityManager = this.abriSession();
		return String.valueOf(entityManager.createQuery("Select MAX(almacen.almacenId) + 1 from Almacen almacen")
                                                .getSingleResult());
	}

	@SuppressWarnings("unchecked")
	public List<Almacen> busquedaDescripcion(String cadena){
		Session entityManager = this.abriSession();
		 return (List<Almacen>)     entityManager.createQuery("Select almacen from Almacen almacen where almacen.descripcion like :cadena")
	             .setParameter("cadena","%"+cadena.trim()+"%")
	             .getResultList();
	
	}

	@SuppressWarnings("unchecked")
	public List<Almacen> busquedaEstado(boolean estado){
		Session entityManager = this.abriSession();
		 return (List<Almacen>)     entityManager.createQuery("Select almacen from Almacen almacen where almacen.estado = :estado")
	            .setParameter("estado",estado)
	            .getResultList();
		
	}

}
