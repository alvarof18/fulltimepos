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
@Table(name = "fulltimepos_politica_rol")
public class PoliticaRol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3846099591805575225L;
	@Id
	@Column(name="fulltimepos_politica_rol_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int politicaRolId;
	@Column(name="fulltimepos_politica_valor")
	private Boolean valor;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_politica_rol_politica")
	private Politicas politica;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_politica_rol_rol")
	private Rol rol;
	
	
	public PoliticaRol(){
		
		
	}
		
	public PoliticaRol(Boolean valor, Politicas politica, Rol rol) {
		super();
		this.valor = valor;
		this.politica = politica;
		this.rol = rol;
	}
	
	public int getPoliticaRolId() {
		return politicaRolId;
	}
	public void setPoliticaRolId(int politicaRolId) {
		this.politicaRolId = politicaRolId;
	}
	public Boolean getValor() {
		return valor;
	}
	public void setValor(Boolean valor) {
		this.valor = valor;
	}
	public Politicas getPolitica() {
		return politica;
	}
	public void setPolitica(Politicas politica) {
		this.politica = politica;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "PoliticaRol [politicaRolId=" + politicaRolId + ", valor=" + valor + ", politica=" + politica + ", rol="
				+ rol + "]";
	}
	
}
