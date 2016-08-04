package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_roles")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2678541713171131643L;
	
	@Id
	@Column(name="fulltimepos_roles_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rolId;
	@Column(name="fulltimepos_roles_descripcion")
	private String descripcion;
	@Column(name="fulltimepos_roles_status")
	private Boolean estado;
	
	public Rol(String descripcion, Boolean estado) {
		super();
		this.descripcion = descripcion;
		this.estado = estado;
	}
	
	public Rol(){
		
		
	}

	public int getRolId() {
		return rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	

}
