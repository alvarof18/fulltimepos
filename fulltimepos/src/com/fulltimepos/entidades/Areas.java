package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_areas")
public class Areas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 543559485558516189L;
	
	@Id
	@Column(name="fulltimepos_areas_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int areaId;
	@Column(name="fulltimepos_areas_descripcion")
	private String descripcion;
	@Column(name="fulltimepos_areas_status")
	private Boolean estado;
	
	public Areas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Areas(String descripcion, Boolean estado) {
		super();
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
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
		return "Areas [areaId=" + areaId + ", descripcion=" + descripcion + ", estado=" + estado + "]";
	}
	
	

}
