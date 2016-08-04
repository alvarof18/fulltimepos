package com.fulltimepos.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fulltimepos_empresa")
public class Empresa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -719630930210433639L;
	
	@Id
	@Column(name="fulltimepos_empresa_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empresaId;
	@Column(name="fulltimepos_empresa_ruc")
	private String ruc;
	@Column(name="fulltimepos_empresa_nombre")
	private String nombre;
	@Column(name="fulltimepos_empresa_razon")
	private String razon;
	@Column(name="fulltimepos_empresa_direccion")
	private String direccion;
	@Column(name="fulltimepos_empresa_telefono")
	private String telefono;
	@Column(name="fulltimepos_empresa_telefono2")
	private String telefono2;
	@Column(name="fulltimepos_empresa_fax")
	private String fax;
	@Column(name="fulltimepos_empresa_correo")
	private String correo;
	@Column(name="fulltimepos_empresa_asri")
	private String autorizacionSRI;
	@Column(name="fulltimepos_empresa_url")
	private String URL;
	
	public Empresa(){
		
		
	}
	
	public Empresa(String ruc, String nombre, String razon, String direccion, String telefono, String telefono2,
			String fax, String correo, String autorizacionSRI, String uRL) {
		super();
		this.ruc = ruc;
		this.nombre = nombre;
		this.razon = razon;
		this.direccion = direccion;
		this.telefono = telefono;
		this.telefono2 = telefono2;
		this.fax = fax;
		this.correo = correo;
		this.autorizacionSRI = autorizacionSRI;
		URL = uRL;
	}
	
	public int getEmpresaId() {
		return empresaId;
	}
	public void setEmpresaId(int empresaId) {
		this.empresaId = empresaId;
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
	public String getRazon() {
		return razon;
	}
	public void setRazon(String razon) {
		this.razon = razon;
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
	public String getTelefono2() {
		return telefono2;
	}
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
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
	public String getAutorizacionSRI() {
		return autorizacionSRI;
	}
	public void setAutorizacionSRI(String autorizacionSRI) {
		this.autorizacionSRI = autorizacionSRI;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	
	@Override
	public String toString() {
		return "Empresa [empresaId=" + empresaId + ", ruc=" + ruc + ", nombre=" + nombre + ", razon=" + razon
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", telefono2=" + telefono2 + ", fax=" + fax
				+ ", correo=" + correo + ", autorizacionSRI=" + autorizacionSRI + ", URL=" + URL + "]";
	}
	
	

}
