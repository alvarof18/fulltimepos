package com.fulltimepos.dao;

import org.hibernate.Session;

import com.fulltimepos.entidades.Usuarios;

public class UsuariosDAO extends GenericoDAOImplementa<Usuarios> {
	
	public Usuarios login(String usuario){
		Session query = this.abriSession();
		
		return (Usuarios) query.createQuery("Select usuario from Usuarios usuario.usuario = :username")
				               .setParameter("username", usuario)
				               .getSingleResult();		
	}
}
