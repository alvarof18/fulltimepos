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
@Table(name = "fulltimepos_detalle_compras")
public class DetalleCompras implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3286643309895461448L;
	
	@Id
	@Column(name="fulltimepos_detalle_compras_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int detalleCompraId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_detalle_compras_orden")
	private Compras ordenCompra;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_detalle_compras_producto")
	private Producto producto;
	@Column(name="fulltimepos_detalle_compras_cantidad")
	private int cantidad;
	@Column(name="fulltimepos_detalle_compras_total")
	private Double total;
	@Column(name="fulltimepos_detalle_compras_preciou")
	private Double precioUnitario;
	
	public DetalleCompras() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleCompras(Compras ordenCompra, Producto producto, int cantidad, Double total,
			Double precioUnitario) {
		super();
		this.ordenCompra = ordenCompra;
		this.producto = producto;
		this.cantidad = cantidad;
		this.total = total;
		this.precioUnitario = precioUnitario;
	}

	public int getDetalleCompraId() {
		return detalleCompraId;
	}

	public void setDetalleCompraId(int detalleCompraId) {
		this.detalleCompraId = detalleCompraId;
	}

	public Compras getOrdenCompra() {
		return ordenCompra;
	}

	public void setOrdenCompra(Compras ordenCompra) {
		this.ordenCompra = ordenCompra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
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

	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "DetalleCompras [detalleCompraId=" + detalleCompraId + ", ordenCompra="
				+ ordenCompra + ", producto=" + producto + ", cantidad=" + cantidad + ", total=" + total
				+ ", precioUnitario=" + precioUnitario + "]";
	}
	

}
