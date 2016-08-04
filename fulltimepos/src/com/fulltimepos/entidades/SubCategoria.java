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
@Table(name = "fulltimepos_subcategorias")
public class SubCategoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4762373347693526930L;
	
	@Id
	@Column(name="fulltimepos_subcategorias_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subcategoriasId;
	@Column(name="fulltimepos_subcategorias_descripcion")
	private String descripcion;
	@Column(name="fulltimepos_subcategorias_status")
	private Boolean estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_subcategorias_categoria")
	private Categoria categoria;
	
	public SubCategoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubCategoria(String descripcion, Boolean estado, Categoria categoria) {
		super();
		this.descripcion = descripcion;
		this.estado = estado;
		this.categoria = categoria;
	}

	public int getSubcategoriasId() {
		return subcategoriasId;
	}

	public void setSubcategoriasId(int subcategoriasId) {
		this.subcategoriasId = subcategoriasId;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "SubCategoria [subcategoriasId=" + subcategoriasId + ", descripcion=" + descripcion + ", estado="
				+ estado + ", categoria=" + categoria + "]";
	}
	
}
