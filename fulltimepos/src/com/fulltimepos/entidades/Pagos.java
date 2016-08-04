package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_pagos")
public class Pagos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7145976364399379462L;
	
	@Id
	@Column(name="fulltimepos_pagos_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pagosId;
	@Column(name="fulltimepos_pagos_descripcion")
	private String descripcion;
	
	public Pagos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pagos(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	
	public int getPagosId() {
		return pagosId;
	}
	public void setPagosId(int pagosId) {
		this.pagosId = pagosId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Pagos [pagosId=" + pagosId + ", descripcion=" + descripcion + "]";
	}

}
