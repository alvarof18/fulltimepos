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
@Table(name = "fulltimepos_inventario")
public class Inventario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5641245130941740633L;
	
	@Id
	@Column(name="fulltimepos_inventario_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int inventarioId;
	@Column(name="fulltimepos_inventario_stock")
	private int stock;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_inventario_producto")
	private Producto producto;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_inventario_sucursal")
	private Sucursal sucursal;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_inventario_almacen")
	private Almacen almacen;
	
	public Inventario(){
		
		
	}
	
	public Inventario(int stock, Producto producto, Sucursal sucursal, Almacen almacen) {
		super();
		this.stock = stock;
		this.producto = producto;
		this.sucursal = sucursal;
		this.almacen = almacen;
	}

	public int getInventarioId() {
		return inventarioId;
	}

	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Inventario [inventarioId=" + inventarioId + ", stock=" + stock + ", sucursal=" + sucursal + ", almacen="
				+ almacen + "]";
	}
	
}
