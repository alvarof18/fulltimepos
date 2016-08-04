package com.fulltimepos.entidades;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_departamento")
public class Departamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2261310845522856455L;
	@Id
	@Column(name="fulltimepos_departamento_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int departamentoId;
	@Column(name="fulltimepos_departamento_descripcion")
	private String nombre;
	
	public Departamento(){
		
		
	}
	
	public Departamento(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamento [departamentoId=" + departamentoId + ", nombre=" + nombre + "]";
	}
	
}
