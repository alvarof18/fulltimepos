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
@Table(name = "fulltimepos_impuestos")
public class Impuestos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3261581177213465058L;
	
	@Id
	@Column(name="fulltimepos_impuestos_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int impuestoId;
	@Column(name="fulltimepos_impuestos_descripcion")
	private String descripcion;
	@Column(name="fulltimepos_impuestos_valor")
	private double valor;
	
	public Impuestos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Impuestos(String descripcion, double valor) {
		super();
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public int getImpuestoId() {
		return impuestoId;
	}

	public void setImpuestoId(int impuestoId) {
		this.impuestoId = impuestoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Impuestos [impuestoId=" + impuestoId + ", descripcion=" + descripcion + ", valor=" + valor + "]";
	}

}
