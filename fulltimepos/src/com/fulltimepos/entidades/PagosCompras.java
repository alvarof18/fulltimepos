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
@Table(name = "fulltimepos_pagos_compras")
public class PagosCompras implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7454342417134071331L;
	
	@Id
	@Column(name="fulltimepos_pagos_compras_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pagosComrprasId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_pagos_compras_orden")
	private Compras orderCompra;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_pagos_compras_pagos")
	private Pagos pagoCompra;
	public PagosCompras() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PagosCompras(Compras orderCompra, Pagos pagoCompra) {
		super();
		this.orderCompra = orderCompra;
		this.pagoCompra = pagoCompra;
	}
	public int getPagosComrprasId() {
		return pagosComrprasId;
	}
	public void setPagosComrprasId(int pagosComrprasId) {
		this.pagosComrprasId = pagosComrprasId;
	}
	public Compras getOrderCompra() {
		return orderCompra;
	}
	public void setOrderCompra(Compras orderCompra) {
		this.orderCompra = orderCompra;
	}
	public Pagos getPagoCompra() {
		return pagoCompra;
	}
	public void setPagoCompra(Pagos pagoCompra) {
		this.pagoCompra = pagoCompra;
	}
	@Override
	public String toString() {
		return "PagosCompras [pagosComrprasId=" + pagosComrprasId + ", pagoCompra=" + pagoCompra + "]";
	}
	
	

}
