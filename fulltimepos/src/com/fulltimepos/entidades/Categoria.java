package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_categorias")
public class Categoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4500248725826878250L;
	
	@Id
	@Column(name="fulltimepos_categorias_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categoriaId;
	@Column(name="fulltimepos_categorias_descripcion")
	private String descripcion;
	@Column(name="fulltimepos_categorias_status")
	private Boolean estado;
	
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(String descripcion, Boolean estado) {
		super();
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
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
		return this.descripcion;
	}
	
	
}
