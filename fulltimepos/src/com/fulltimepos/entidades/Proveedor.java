package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_proveedor")
public class Proveedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1138232249715451479L;
	@Id
	@Column(name="fulltimepos_proveedor_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int proveedorId;
	@Column(name="fulltimepos_proveedor_ruc")
	private String ruc;
	@Column(name="fulltimepos_proveedor_nombre")
	private String nombre;
	@Column(name="fulltimepos_proveedor_direccion")
	private String direccion;
	@Column(name="fulltimepos_proveedor_telefono")
	private String telefono;
	@Column(name="fulltimepos_proveedor_fax")
	private String fax;
	@Column(name="fulltimepos_proveedor_correo")
	private String correo;
	@Column(name="fulltimepos_proveedor_web")
	private String web;
	@Column(name="fulltimepos_proveedor_observacion")
	private String observacion;
	@Column(name="fulltimepos_proveedor_status")
	private Boolean estado;
	
	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proveedor(String ruc, String nombre, String direccion, String telefono, String fax,
			String correo, String web, String observacion, Boolean estado) {
		super();
		this.ruc = ruc;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fax = fax;
		this.correo = correo;
		this.web = web;
		this.observacion = observacion;
		this.estado = estado;
	}

	public int getProveedorId() {
		return proveedorId;
	}

	public void setProveedorId(int proveedorId) {
		this.proveedorId = proveedorId;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Proveedor [proveedorId=" + proveedorId + ", ruc=" + ruc + ", "+ "nombre=" + nombre
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", fax=" + fax + ", correo=" + correo
				+ ", web=" + web + ", observacion=" + observacion + ", estado=" + estado + "]";
	}

}
