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
@Table(name = "fulltimepos_detalle_factura")
public class DetalleFactura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3689584353573987397L;
	
	@Id
	@Column(name="fulltimepos_detalle_factura_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int detalleFacturaId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_detalle_factura_factura")
	private Factura factura;
	@Column(name="fulltimepos_detalle_factura_cantidad")
	private int cantidad;
	@Column(name="fulltimepos_detalle_factura_total")
	private Double total;
	@Column(name="fulltimepos_detalle_factura_preciou")
	private Double preciou;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_detalle_factura_producto")
	private Producto producto;
	
	public DetalleFactura() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DetalleFactura(Factura factura, int cantidad, Double total, Double preciou, Producto producto) {
		super();
		this.factura = factura;
		this.cantidad = cantidad;
		this.total = total;
		this.preciou = preciou;
		this.producto = producto;
	}
	
	public int getDetalleFacturaId() {
		return detalleFacturaId;
	}
	public void setDetalleFacturaId(int detalleFacturaId) {
		this.detalleFacturaId = detalleFacturaId;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getPreciou() {
		return preciou;
	}
	public void setPreciou(Double preciou) {
		this.preciou = preciou;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	@Override
	public String toString() {
		return "DetalleFactura [detalleFacturaId=" + detalleFacturaId + ", factura=" + factura + ", cantidad="
				+ cantidad + ", total=" + total + ", preciou=" + preciou + ", producto=" + producto + "]";
	}
	

}
