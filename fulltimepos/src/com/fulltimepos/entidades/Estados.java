package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_estado")
public class Estados implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9015119638809123890L;

	@Id
	@Column(name="fulltimepos_estado_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int estadosId;
	@Column(name="fulltimepos_estado_descripcion")
	private String descripcion;
	
	public Estados() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Estados(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	public int getEstadosId() {
		return estadosId;
	}
	public void setEstadosId(int estadosId) {
		this.estadosId = estadosId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Estados [estadosId=" + estadosId + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
}
