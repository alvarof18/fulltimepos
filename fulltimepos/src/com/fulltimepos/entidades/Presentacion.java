package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_presentacion")
public class Presentacion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7643661414153020077L;
	@Id
	@Column(name="fulltimepos_presentacion_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int presentacionId;
	@Column(name="fulltimepos_presentacion_descripcion")
	private String descripcion;
	@Column(name="fulltimepos_presentacion_status")
	private Boolean estado;
	
	public Presentacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Presentacion(String descripcion, Boolean estado) {
		super();
		this.descripcion = descripcion;
		this.estado = estado;
	}
	
	
	public int getPresentacionId() {
		return presentacionId;
	}
	public void setPresentacionId(int presentacionId) {
		this.presentacionId = presentacionId;
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
	
	@Override
	public String toString() {
		return "Presentacion [presentacionId=" + presentacionId + ", descripcion=" + descripcion + ", estado=" + estado
				+ "]";
	}
	
	

}
