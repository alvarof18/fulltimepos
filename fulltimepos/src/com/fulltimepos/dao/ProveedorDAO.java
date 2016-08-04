package com.fulltimepos.dao;

import java.util.List;

import org.hibernate.Session;

import com.fulltimepos.entidades.Proveedor;

@SuppressWarnings("hiding")
public class ProveedorDAO<Proveedor> extends GenericoDAOImplementa<Proveedor>{
	
	public String codigo(){
		
		Session entityManager = this.abriSession();
		return String.valueOf(entityManager.createQuery("Select MAX(proveedor.proveedorId) + 1 from Proveedor proveedor")
                                                .getSingleResult());
	}

	@SuppressWarnings("unchecked")
	public List<Proveedor> busquedaDescripcion(String cadena){
		Session entityManager = this.abriSession();
		return (List<Proveedor>)     entityManager.createQuery("Select proveedor from Proveedor proveedor where proveedor.nombre like :cadena")
             .setParameter("cadena","%"+cadena.trim()+"%")
             .getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<Proveedor> busquedaEstado(boolean estado){
		Session entityManager = this.abriSession();
		 return (List<Proveedor>)     entityManager.createQuery("Select proveedor from Proveedor proveedor where proveedor.estado = :estado")
	            .setParameter("estado",estado)
	            .getResultList();
		
	}

}
