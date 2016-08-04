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
@Table(name = "fulltimepos_factura")
public class Factura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4386947165144585333L;
	@Id
	@Column(name="fulltimepos_factura_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int facturaId;
	@Column(name="fulltimepos_factura_codigo")
	private int codigo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_factura_operador")
	private Usuarios operador;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_factura_cliente")
	private Clientes cliente;
	@Column(name="fulltimepos_factura_total")
	private Double total;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulltimepos_factura_estado")
	private Estados estado;
	@Column(name="fulltimepos_factura_status")
	private Boolean status;
	
	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factura(int codigo, Usuarios operador, Clientes cliente, Double total, Estados estado, Boolean status) {
		super();
		this.codigo = codigo;
		this.operador = operador;
		this.cliente = cliente;
		this.total = total;
		this.estado = estado;
		this.status = status;
	}

	public int getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(int facturaId) {
		this.facturaId = facturaId;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Usuarios getOperador() {
		return operador;
	}

	public void setOperador(Usuarios operador) {
		this.operador = operador;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Factura [facturaId=" + facturaId + ", codigo=" + codigo + ", operador=" + operador + ", cliente="
				+ cliente + ", total=" + total + ", estado=" + estado + ", status=" + status + "]";
	}
	
	
}
