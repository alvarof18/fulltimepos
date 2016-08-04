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
@Table(name = "fulltimepos_politicas")
public class Politicas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6930939319006434937L;
	@Id
	@Column(name="fulltimepos_politicas_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int politicasId;
	@Column(name="fulltimepos_politicas_descripcion")
	private String descripcion;
	
	public Politicas(){
		
		
	}
	
	public Politicas(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	public int getPoliticasId() {
		return politicasId;
	}
	public void setPoliticasId(int politicasId) {
		this.politicasId = politicasId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Politicas [politicasId=" + politicasId + ", descripcion=" + descripcion + "]";
	}

}
