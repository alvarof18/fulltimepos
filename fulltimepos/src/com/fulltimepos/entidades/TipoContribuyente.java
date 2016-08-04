package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_tipo_contribuyente")
public class TipoContribuyente implements Serializable{

	private static final long serialVersionUID = -1227171381606841602L;
	
	@Id
	@Column(name="fulltime_tipo_contribuyente_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tipoIdentificacionid;
	@Column(name="fulltime_tipo_contribuyente_descripcion")
	private String descripcion;
	
	public TipoContribuyente(){
		
	
	}
	
	public TipoContribuyente(int tipoIdentificacionid, String descripcion) {
		this.tipoIdentificacionid = tipoIdentificacionid;
		this.descripcion = descripcion;
	}
	
	
	public int getTipoIdentificacionid() {
		return tipoIdentificacionid;
	}
	public void setTipoIdentificacionid(int tipoIdentificacionid) {
		this.tipoIdentificacionid = tipoIdentificacionid;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return this.descripcion;
	}
	
	
	
}
