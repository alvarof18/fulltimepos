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
@Table(name = "fulltimepos_sucursales")
public class Sucursal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5413218231381774139L;
	
	@Id
	@Column(name="fulltimepos_sucursales_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sucursalId;
	@Column(name="fulltimepos_sucursales_descripcion")
	private String nombre;
	@Column(name="fulltimepos_sucursales_telefono")
	private String telefono;
	@Column(name="fulltimepos_sucursales_contacto")
	private String contacto;
	@Column(name="fulltimepos_sucursales_correo")
	private String correo;
	@Column(name="fulltimepos_sucursales_direccion")
	private String direccion;
	@Column(name="fulltimepos_sucursales_status")
	private Boolean estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_sucursales_empresa")
	private Empresa sucursalEmpresa;
	
	
	public Sucursal(){
		
		
	}
	
	public Sucursal(String nombre, String telefono, String contacto, String correo, String direccion, Boolean estado,
			Empresa sucursalEmpresa) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.contacto = contacto;
		this.correo = correo;
		this.direccion = direccion;
		this.estado = estado;
		this.sucursalEmpresa = sucursalEmpresa;
	}
	
	
	public int getSucursalId() {
		return sucursalId;
	}
	public void setSucursalId(int sucursalId) {
		this.sucursalId = sucursalId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Empresa getSucursalEmpresa() {
		return sucursalEmpresa;
	}
	public void setSucursalEmpresa(Empresa sucursalEmpresa) {
		this.sucursalEmpresa = sucursalEmpresa;
	}

	@Override
	public String toString() {
		return this.nombre;
	}
	
}
