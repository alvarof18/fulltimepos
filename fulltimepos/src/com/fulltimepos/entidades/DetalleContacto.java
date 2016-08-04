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
@Table(name = "fulltimepos_detalle_contacto")
public class DetalleContacto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9148656447083919111L;
	@Id
	@Column(name="fulltimepos_detalle_contacto_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int detalleContatoId;
	@Column(name="fulltimepos_detalle_contacto_nombre")
	private String nombre;
	@Column(name="fulltimepos_detalle_contacto_cargo")
	private String cargo;
	@Column(name="fulltimepos_detalle_contacto_telefono")
	private String telefono;
	@Column(name="fulltimepos_detalle_contacto_correo")
	private String correo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_detalle_contacto_proveedor")
	private Proveedor proveedor;
	
	public DetalleContacto() {
		super();
	
	}

	public DetalleContacto(String nombre, String cargo, String telefono, String correo, Proveedor proveedor) {
		super();
		this.nombre = nombre;
		this.cargo = cargo;
		this.telefono = telefono;
		this.correo = correo;
		this.proveedor = proveedor;
	}


	public int getDetalleContatoId() {
		return detalleContatoId;
	}


	public void setDetalleContatoId(int detalleContatoId) {
		this.detalleContatoId = detalleContatoId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public Proveedor getProveedor() {
		return proveedor;
	}


	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	

}
