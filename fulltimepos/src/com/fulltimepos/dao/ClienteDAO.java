package com.fulltimepos.dao;

import java.util.List;

import org.hibernate.Session;
import com.fulltimepos.entidades.Clientes;

@SuppressWarnings("hiding")
public class ClienteDAO<Clientes> extends GenericoDAOImplementa<Clientes>{
	
	public ClienteDAO(){
		 super();			
		}
		
	
	@SuppressWarnings("unchecked")
	public Clientes busquedaIdentificacion(String identificacion){
		
		Session entityManager = this.abriSession();
	    return (Clientes)     entityManager.createQuery("Select cliente from Clientes cliente where cliente.identificacion = (:identificacion)")
				                           .setParameter("identificacion",identificacion)
				                           .setParameter("persmna", 12)
				                           .getSingleResult(); 
	}
	
	@SuppressWarnings("unchecked")
	public List<Clientes> busquedaNombre(String cadena){
		Session entityManager = this.abriSession();
		 return (List<Clientes>)     entityManager.createQuery("Select cliente from Clientes cliente where cliente.nombre like :cadena")
                 .setParameter("cadena",cadena.trim()+"%")
                 .getResultList();

	}
	
	@SuppressWarnings("unchecked")
	public List<Clientes> busquedaEstado(boolean estado){
		Session entityManager = this.abriSession();
		 return (List<Clientes>)     entityManager.createQuery("Select cliente from Clientes cliente where cliente.estado = :estado")
                .setParameter("estado",estado)
                .getResultList();
		
	}
	
	public String codigo(){
		
		Session entityManager = this.abriSession();
		return String.valueOf(entityManager.createQuery("Select MAX(cliente.clienteid) + 1 from Clientes cliente")
                                                .getSingleResult());
	}
	
// Realizar busqueda por nombre

}
