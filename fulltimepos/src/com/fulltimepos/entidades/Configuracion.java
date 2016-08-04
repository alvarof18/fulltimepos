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
@Table(name = "fulltimepos_configuracion")
public class Configuracion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7309023483061774057L;
	@Id
	@Column(name="fulltimepos_configuracion_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int configuracionId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_configuracion_cliente")
	private Clientes cliente;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_configuracion_estacion")
	private Terminales estacion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_configuracion_almacen")
	private Almacen almacen;
	@Column(name="fulltimepos_configuracion_precio")
	private int precio; // que tipo de precio sera el de defecto
	@Column(name="fulltimepos_configuracion_pantalla")
	private String pantalla;
	@Column(name="fulltimepos_configuracion_alerta")
	private int alerta; // Alertar cuando tenga x cantidad de efectivo en la caja
	
	public Configuracion(){
		
		
	}
	
	public Configuracion(Clientes cliente, Terminales estacion, Almacen almacen, int precio, String pantalla,
			int alerta) {
		super();
		this.cliente = cliente;
		this.estacion = estacion;
		this.almacen = almacen;
		this.precio = precio;
		this.pantalla = pantalla;
		this.alerta = alerta;
	}
	
	
	public int getConfiguracionId() {
		return configuracionId;
	}
	public void setConfiguracionId(int configuracionId) {
		this.configuracionId = configuracionId;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public Terminales getEstacion() {
		return estacion;
	}
	public void setEstacion(Terminales estacion) {
		this.estacion = estacion;
	}
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getPantalla() {
		return pantalla;
	}
	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}
	public int getAlerta() {
		return alerta;
	}
	public void setAlerta(int alerta) {
		this.alerta = alerta;
	}

	@Override
	public String toString() {
		return "Configuracion [configuracionId=" + configuracionId + ", cliente=" + cliente + ", precio=" + precio
				+ ", pantalla=" + pantalla + ", alerta=" + alerta + "]";
	}
	
	
	

}
