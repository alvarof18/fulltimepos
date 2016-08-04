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
@Table(name = "fulltimepos_cargo")
public class Cargo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7684292612564285570L;
	@Id
	@Column(name="fulltimepos_cargo_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cargoId;
	@Column(name="fulltimepos_cargo_descripcion")
	private String nombre;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_cargo_departamento")
	private Departamento departamento;
	
	
	public Cargo(){
		
		
	}
	
	
	public Cargo(String nombre, Departamento departamento) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
	}
	
	
	public int getCargoId() {
		return cargoId;
	}
	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return "Cargo [cargoId=" + cargoId + ", nombre=" + nombre + "]";
	}
	

}
