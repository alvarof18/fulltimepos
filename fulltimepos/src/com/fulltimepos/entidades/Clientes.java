package com.fulltimepos.entidades;

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
@Table(name = "fulltimepos_clientes")
public class Clientes implements java.io.Serializable{

	private static final long serialVersionUID = -3921997196738162534L;
	
	@Id
	@Column(name="fulltimepos_clientes_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int clienteid;
	@Column(name="fulltimepos_clientes_nombre")
	private String nombre;
	@Column(name="fulltimepos_clientes_razonsocial")
	private String razonSocial;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_clientes_tipo_id")
	private TipoIdentificacion tipoIdentificacion;
	@Column(name="fulltimepos_clientes_identificacion")
	private String identificacion;
	@Column(name="fulltimepos_clientes_telefono")
	private String telefono;
	@Column(name="fulltimepos_clientes_direccion")
	private String direccion;
	@Column(name="fulltimepos_clientes_observacion")
	private String observacion;
	@Column(name="fulltimepos_clientes_web")
	private String web;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_clientes_tipo_contribuyente")
	private TipoContribuyente tipoContribuyente;
	@Column(name="fulltimepos_clientes_credito")
	private Boolean credito;
	@Column(name="fulltimepos_clientes_limite")
	private double limite;
	@Column(name="fulltimepos_clientes_descuento")
	private double descuento;
	@Column(name="fulltimepos_clientes_mercancia")
	private Boolean mercancia;
	@Column(name="fulltimepos_clientes_status")
	private Boolean estado;
	@Column(name="fulltimepos_clientes_correo")
	private String correo;
	
	
	public Clientes() {
		
	}
	
	public Clientes(String nombre, String razonSocial, TipoIdentificacion tipoIdentificacion, String identificacion,
			String telefono, String direccion, String observacion, String web, TipoContribuyente tipoContribuyente,
			Boolean credito, double limite, double descuento, Boolean mercancia, Boolean estado, String correo) {
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.tipoIdentificacion = tipoIdentificacion;
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.direccion = direccion;
		this.observacion = observacion;
		this.web = web;
		this.tipoContribuyente = tipoContribuyente;
		this.credito = credito;
		this.limite = limite;
		this.descuento = descuento;
		this.mercancia = mercancia;
		this.estado = estado;
		this.correo = correo;
	}
	public int getClienteid() {
		return clienteid;
	}
	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public TipoContribuyente getTipoContribuyente() {
		return tipoContribuyente;
	}
	public void setTipoContribuyente(TipoContribuyente tipoContribuyente) {
		this.tipoContribuyente = tipoContribuyente;
	}
	public Boolean getCredito() {
		return credito;
	}
	public void setCredito(Boolean credito) {
		this.credito = credito;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public Boolean getMercancia() {
		return mercancia;
	}
	public void setMercancia(Boolean mercancia) {
		this.mercancia = mercancia;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Clientes [clienteid=" + clienteid + ", nombre=" + nombre + ", razonSocial=" + razonSocial
				+ ", tipoIdentificacion=" + tipoIdentificacion + ", identificacion=" + identificacion + ", telefono="
				+ telefono + ", direccion=" + direccion + ", observacion=" + observacion + ", web=" + web
				+ ", tipoContribuyente=" + tipoContribuyente + ", credito=" + credito + ", limite=" + limite
				+ ", descuento=" + descuento + ", mercancia=" + mercancia + ", estado=" + estado + "]";
	}
		 	
}
