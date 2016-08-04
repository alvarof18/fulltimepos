package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_tipo_identificacion")
public class TipoIdentificacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1975077030485971851L;
	@Id
	@Column(name="fulltimepos_tipo_identificacion_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tipoIdentificacionid;
	@Column(name="fulltimepos_tipo_identificacion_descripcion")
	private String descripcion;
	
	public TipoIdentificacion(){
		
		
	}
	
	public TipoIdentificacion(int tipoIdentificacionid, String descripcion) {
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
