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
@Table(name = "fulltimepos_producto")
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4929531918270205601L;
	@Id
	@Column(name="fulltimepos_producto_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productoId;
	@Column(name="fulltimepos_producto_codigo")
	private String codigo;
	@Column(name="fulltimepos_producto_nombre")
	private String nombre;
	@Column(name="fulltimepos_producto_descripcion")
	private String descripcion;
	@Column(name="fulltimepos_producto_status")
	private Boolean estado;
	@Column(name="fulltimepos_producto_url")
	private String url; // url de donde esta guardada la imagen del producto
	@Column(name="fulltimepos_producto_existencia")
	private Boolean existencia;
	@Column(name="fulltimepos_producto_precio1")
	private Double precio1;
	@Column(name="fulltimepos_producto_precio2")
	private Double precio2;
	@Column(name="fulltimepos_producto_precio3")
	private Double precio3;
	@Column(name="fulltimepos_producto_precio4")
	private Double precio4;
	@Column(name="fulltimepos_producto_garantia")
	private Boolean garantia;
	@Column(name="fulltimepos_producto_tiempo_garantia")
	private int tiempoGarantia;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_producto_iva")
	private Impuestos iva;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_producto_imp1")
	private Impuestos impuestoAdicional1;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_producto_imp2")
	private Impuestos impuestoAdicional2;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_producto_presentacion")
	private Presentacion presentacion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_producto_categoria")
	private Categoria categoria;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_producto_subcategoria")
	private SubCategoria subcategoria;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_producto_fabricante")
	private Fabricante fabricante;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_producto_proveedor")
	private Proveedor proveedor;
	
	public Producto(){
		
		
	}
	
	public Producto(String codigo, String nombre, String descripcion, Boolean estado, String url, Boolean existencia,
			Double precio1, Double precio2, Double precio3, Double precio4, Boolean garantia, int tiempoGarantia,
			Impuestos iva, Impuestos impuestoAdicional1, Impuestos impuestoAdicional2, Presentacion presentacion,
			Categoria categoria, SubCategoria subcategoria, Fabricante fabricante, Proveedor proveedor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.url = url;
		this.existencia = existencia;
		this.precio1 = precio1;
		this.precio2 = precio2;
		this.precio3 = precio3;
		this.precio4 = precio4;
		this.garantia = garantia;
		this.tiempoGarantia = tiempoGarantia;
		this.iva = iva;
		this.impuestoAdicional1 = impuestoAdicional1;
		this.impuestoAdicional2 = impuestoAdicional2;
		this.presentacion = presentacion;
		this.categoria = categoria;
		this.subcategoria = subcategoria;
		this.fabricante = fabricante;
		this.proveedor = proveedor;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getExistencia() {
		return existencia;
	}

	public void setExistencia(Boolean existencia) {
		this.existencia = existencia;
	}

	public Double getPrecio1() {
		return precio1;
	}

	public void setPrecio1(Double precio1) {
		this.precio1 = precio1;
	}

	public Double getPrecio2() {
		return precio2;
	}

	public void setPrecio2(Double precio2) {
		this.precio2 = precio2;
	}

	public Double getPrecio3() {
		return precio3;
	}

	public void setPrecio3(Double precio3) {
		this.precio3 = precio3;
	}

	public Double getPrecio4() {
		return precio4;
	}

	public void setPrecio4(Double precio4) {
		this.precio4 = precio4;
	}

	public Boolean getGarantia() {
		return garantia;
	}

	public void setGarantia(Boolean garantia) {
		this.garantia = garantia;
	}

	public int getTiempoGarantia() {
		return tiempoGarantia;
	}

	public void setTiempoGarantia(int tiempoGarantia) {
		this.tiempoGarantia = tiempoGarantia;
	}

	public Impuestos getIva() {
		return iva;
	}

	public void setIva(Impuestos iva) {
		this.iva = iva;
	}

	public Impuestos getImpuestoAdicional1() {
		return impuestoAdicional1;
	}

	public void setImpuestoAdicional1(Impuestos impuestoAdicional1) {
		this.impuestoAdicional1 = impuestoAdicional1;
	}

	public Impuestos getImpuestoAdicional2() {
		return impuestoAdicional2;
	}

	public void setImpuestoAdicional2(Impuestos impuestoAdicional2) {
		this.impuestoAdicional2 = impuestoAdicional2;
	}

	public Presentacion getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(Presentacion presentacion) {
		this.presentacion = presentacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public SubCategoria getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(SubCategoria subcategoria) {
		this.subcategoria = subcategoria;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Producto [productoId=" + productoId + ", codigo=" + codigo + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", estado=" + estado + ", url=" + url + ", existencia=" + existencia + ", precio1="
				+ precio1 + ", precio2=" + precio2 + ", precio3=" + precio3 + ", precio4=" + precio4 + ", garantia="
				+ garantia + ", tiempoGarantia=" + tiempoGarantia + "]";
	}


}
