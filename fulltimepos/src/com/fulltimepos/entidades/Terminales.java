package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_terminales")
public class Terminales implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2944220049816119371L;
	
	@Id
	@Column(name="fulltimepos_terminales_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int terminalId;
	@Column(name="fulltimepos_terminales_descripcion")
	private String descripcion;
	@Column(name="fulltimepos_terminales_status")
	private Boolean estado;
	
	public Terminales(){
		
	}
	
	public Terminales(String descripcion, Boolean estado) {
		super();
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
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
		return "Terminales [terminalId=" + terminalId + ", descripcion=" + descripcion + ", estado=" + estado + "]";
	}
	

}
