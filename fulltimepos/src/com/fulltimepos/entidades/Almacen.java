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
@Table(name = "fulltimepos_almacen")
public class Almacen implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6883266807913934218L;
	
	@Id
	@Column(name="fulltimepos_almacen_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int almacenId;
	@Column(name="fulltimepos_almacen_descripcion")
	private String descripcion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_almacen_sucursal")
	private Sucursal sucursal;
	
	public Almacen(){
		
		
	}
	
	public Almacen(String descripcion, Sucursal sucursal) {
		super();
		this.descripcion = descripcion;
		this.sucursal = sucursal;
	}

	public int getAlmacenId() {
		return almacenId;
	}

	public void setAlmacenId(int almacenId) {
		this.almacenId = almacenId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "Almacen [almacenId=" + almacenId + ", descripcion=" + descripcion + ", sucursal=" + sucursal + "]";
	}
	
}
