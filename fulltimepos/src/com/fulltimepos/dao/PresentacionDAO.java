package com.fulltimepos.dao;

import java.util.List;

import org.hibernate.Session;

import com.fulltimepos.entidades.Presentacion;

@SuppressWarnings("hiding")
public class PresentacionDAO<Presentacion> extends GenericoDAOImplementa<Presentacion>{
	
public String codigo(){
		
		Session entityManager = this.abriSession();
		return String.valueOf(entityManager.createQuery("Select MAX(presentacion.presentacionId) + 1 from Presentacion presentacion")
                                                .getSingleResult());
	}

@SuppressWarnings("unchecked")
public List<Presentacion> busquedaDescripcion(String cadena){
	Session entityManager = this.abriSession();
	 return (List<Presentacion>)     entityManager.createQuery("Select presentacion from Presentacion presentacion where presentacion.descripcion like :cadena")
             .setParameter("cadena","%"+cadena.trim()+"%")
             .getResultList();

}

@SuppressWarnings("unchecked")
public List<Presentacion> busquedaEstado(boolean estado){
	Session entityManager = this.abriSession();
	 return (List<Presentacion>)     entityManager.createQuery("Select presentacion from Presentacion presentacion where presentacion.estado = :estado")
            .setParameter("estado",estado)
            .getResultList();
	
}

}
