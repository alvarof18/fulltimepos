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
@Table(name = "fulltimepos_detalle_pedido")
public class DetallePedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1979954539616191097L;
	
	@Id
	@Column(name="fulltimepos_detalle_pedido_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int detallePedidoId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_detalle_pedido_area")
	private Areas area;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_detalle_pedido_mesa")
	private Mesas mesa;
	@Column(name="fulltimepos_detalle_pedido_asiento")
	private int asiento;
	@Column(name="fulltimepos_detalle_pedido_total")
	private Double total;
	@Column(name="fulltimepos_detalle_pedido_preciou")
	private Double precioUnitario;
	@Column(name="fulltimepos_detalle_pedido_cantidad")
	private Double cantidad;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_detalle_pedido_producto")
	private Producto producto;
	
	public DetallePedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DetallePedido(Areas area, Mesas mesa, int asiento, Double total, Double precioUnitario, Double cantidad,
			Producto producto) {
		super();
		this.area = area;
		this.mesa = mesa;
		this.asiento = asiento;
		this.total = total;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	public int getDetallePedidoId() {
		return detallePedidoId;
	}
	public void setDetallePedidoId(int detallePedidoId) {
		this.detallePedidoId = detallePedidoId;
	}
	public Areas getArea() {
		return area;
	}
	public void setArea(Areas area) {
		this.area = area;
	}
	public Mesas getMesa() {
		return mesa;
	}
	public void setMesa(Mesas mesa) {
		this.mesa = mesa;
	}
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
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
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "DetallePedido [detallePedidoId=" + detallePedidoId + ", area=" + area + ", mesa=" + mesa + ", asiento="
				+ asiento + ", total=" + total + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad
				+ ", producto=" + producto + "]";
	}
	
	

}
