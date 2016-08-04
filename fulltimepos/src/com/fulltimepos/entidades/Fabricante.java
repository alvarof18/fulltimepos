package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_fabricante")
public class Fabricante implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8255059581195986037L;

	@Id
	@Column(name="fulltimepos_fabricante_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fabricanteId;
	@Column(name="fulltimepos_fabricante_descripcion")
	private String descripcion;
	@Column(name="fulltimepos_fabricante_detalle")
	private String detalle;
	@Column(name="fulltimepos_fabricante_status")
	private Boolean estado;
	
	public Fabricante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fabricante(String descripcion, String detalle, Boolean estado) {
		super();
		this.descripcion = descripcion;
		this.detalle = detalle;
		this.estado = estado;
	}

	public int getFabricanteId() {
		return fabricanteId;
	}

	public void setFabricanteId(int fabricanteId) {
		this.fabricanteId = fabricanteId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Fabricante [fabricanteId=" + fabricanteId + ", descripcion=" + descripcion + ", detalle=" + detalle
				+ ", estado=" + estado + "]";
	}
	
}
