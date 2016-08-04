package com.fulltimepos.dao;

import java.util.List;

import org.hibernate.Session;

import com.fulltimepos.entidades.DetalleContacto;
import com.fulltimepos.entidades.Proveedor;

@SuppressWarnings("hiding")
public class DetalleContactoDAO<DetalleContacto> extends GenericoDAOImplementa<DetalleContacto>{
	
	@SuppressWarnings("unchecked")
	public List<DetalleContacto> listaByProveedor(Proveedor proveedor){
		
		Session entityManager = this.abriSession();
		 return (List<DetalleContacto>)     entityManager.createQuery("Select detalleContacto from DetalleContacto detalleContacto where detalleContacto.proveedor = :proveedor")
               .setParameter("proveedor",proveedor)
               .getResultList();
		
	}
	

}
