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
@Table(name = "fulltimepos_mesas")
public class Mesas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4520693852591356818L;
	
	@Id
	@Column(name="fulltimepos_mesas_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mesaId;
	@Column(name="fulltimepos_mesas_numeracion")
	private String numeracion;
	@Column(name="fulltimepos_mesas_status")
	private Boolean status;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_mesas_area")
	private Areas area;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_mesas_estados")
	private Estados estado;
	@Column(name="fulltimepos_mesas_asientos")
	private int asientos;
	public Mesas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mesas(String numeracion, Boolean status, Areas area, Estados estado, int asientos) {
		super();
		this.numeracion = numeracion;
		this.status = status;
		this.area = area;
		this.estado = estado;
		this.asientos = asientos;
	}
	public int getMesaId() {
		return mesaId;
	}
	public void setMesaId(int mesaId) {
		this.mesaId = mesaId;
	}
	public String getNumeracion() {
		return numeracion;
	}
	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Areas getArea() {
		return area;
	}
	public void setArea(Areas area) {
		this.area = area;
	}
	public Estados getEstado() {
		return estado;
	}
	public void setEstado(Estados estado) {
		this.estado = estado;
	}
	public int getAsientos() {
		return asientos;
	}
	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	@Override
	public String toString() {
		return "Mesas [mesaId=" + mesaId + ", numeracion=" + numeracion + ", status=" + status + ", area=" + area
				+ ", estado=" + estado + ", asientos=" + asientos + "]";
	}
	
	
	

}
