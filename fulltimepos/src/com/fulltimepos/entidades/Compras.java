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
@Table(name = "fulltimepos_compras")
public class Compras implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2673419701016538597L;
	@Id
	@Column(name="fulltimepos_compras_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int comprasId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_compras_proveddor")
	private Proveedor proveedor;
	@Column(name="fulltimepos_compras_total")
	private double total;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_compras_operador")
	private Usuarios operador;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_compras_estado")
	private Estados estado;
	@Column(name="fulltimepos_compras_factura")
	private String factura;
	@Column(name="fulltimepos_compras_pendiente")
	private Double montoPendiente;
	@Column(name="fulltimepos_compras_status")
	private Boolean status;
	@Column(name="fulltimepos_compras_carga")
	private Boolean carga;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_compras_almacen")
	private Almacen almacen;
	
	public Compras() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compras(Proveedor proveedor, double total, Usuarios operador, Estados estado, String factura,
			Double montoPendiente, Boolean status, Boolean carga, Almacen almacen) {
		super();
		this.proveedor = proveedor;
		this.total = total;
		this.operador = operador;
		this.estado = estado;
		this.factura = factura;
		this.montoPendiente = montoPendiente;
		this.status = status;
		this.carga = carga;
		this.almacen = almacen;
	}

	public int getComprasId() {
		return comprasId;
	}

	public void setComprasId(int comprasId) {
		this.comprasId = comprasId;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Usuarios getOperador() {
		return operador;
	}

	public void setOperador(Usuarios operador) {
		this.operador = operador;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public Double getMontoPendiente() {
		return montoPendiente;
	}

	public void setMontoPendiente(Double montoPendiente) {
		this.montoPendiente = montoPendiente;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getCarga() {
		return carga;
	}

	public void setCarga(Boolean carga) {
		this.carga = carga;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Compras [comprasId=" + comprasId + ", proveedor=" + proveedor + ", total=" + total + ", operador="
				+ operador + ", estado=" + estado + ", factura=" + factura + ", montoPendiente=" + montoPendiente
				+ ", status=" + status + ", carga=" + carga + ", almacen=" + almacen + "]";
	}
	
}
