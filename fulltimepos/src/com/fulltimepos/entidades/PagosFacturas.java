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
@Table(name = "fulltimepos_pagos_factura")
public class PagosFacturas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3591800842101810730L;
	
	@Id
	@Column(name="fulltimepos_pagos_factura_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pagosFacturaId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_pagos_factura_pago")
	private Pagos pagos;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_pagos_factura_factura")
	private Factura factura;
	
	public PagosFacturas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PagosFacturas(Pagos pagos, Factura factura) {
		super();
		this.pagos = pagos;
		this.factura = factura;
	}

	public int getPagosFacturaId() {
		return pagosFacturaId;
	}

	public void setPagosFacturaId(int pagosFacturaId) {
		this.pagosFacturaId = pagosFacturaId;
	}

	public Pagos getPagos() {
		return pagos;
	}

	public void setPagos(Pagos pagos) {
		this.pagos = pagos;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "PagosFacturas [pagosFacturaId=" + pagosFacturaId + ", pagos=" + pagos + ", factura=" + factura + "]";
	}
	
}
