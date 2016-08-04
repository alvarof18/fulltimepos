package com.fulltimepos.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "fulltimepos_eventos")
public class Eventos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5846293805961782172L;
	
	@Id
	@Column(name="fulltimepos_eventos")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eventoId;
	@Temporal(TemporalType.DATE)
	@Column(name = "fulltimepos_eventos_fecha_desde")
	private Date fechaDesde;
	@Temporal(TemporalType.DATE)
	@Column(name = "fulltimepos_eventos_fecha_hasta")
	private Date fechaHasta;
	@Temporal(TemporalType.TIME)
	@Column(name = "fulltimepos_eventos_hora_desde")
	private Date horaDesde;
	@Temporal(TemporalType.TIME)
	@Column(name = "fulltimepos_eventos_hora_hasta")
	private Date horaHasta;
	@Column(name = "fulltimepos_eventos_descripcion")
	private String descripcion;
	@Column(name = "fulltimepos_eventos_contacto")
	private String contacto;
	@Column(name = "fulltimepos_eventos_telefono")
	private String telefono;
	@Column(name = "fulltimepos_eventos_nota")
	private String nota;
	
	public Eventos() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Eventos(Date fechaDesde, Date fechaHasta, Date horaDesde, Date horaHasta, String descripcion,
			String contacto, String telefono, String nota) {
		super();
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
		this.horaDesde = horaDesde;
		this.horaHasta = horaHasta;
		this.descripcion = descripcion;
		this.contacto = contacto;
		this.telefono = telefono;
		this.nota = nota;
	}


	public int getEventoId() {
		return eventoId;
	}


	public void setEventoId(int eventoId) {
		this.eventoId = eventoId;
	}


	public Date getFechaDesde() {
		return fechaDesde;
	}


	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}


	public Date getFechaHasta() {
		return fechaHasta;
	}


	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}


	public Date getHoraDesde() {
		return horaDesde;
	}


	public void setHoraDesde(Date horaDesde) {
		this.horaDesde = horaDesde;
	}


	public Date getHoraHasta() {
		return horaHasta;
	}


	public void setHoraHasta(Date horaHasta) {
		this.horaHasta = horaHasta;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getNota() {
		return nota;
	}


	public void setNota(String nota) {
		this.nota = nota;
	}


	@Override
	public String toString() {
		return "Eventos [eventoId=" + eventoId + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta
				+ ", horaDesde=" + horaDesde + ", horaHasta=" + horaHasta + ", descripcion=" + descripcion
				+ ", contacto=" + contacto + ", telefono=" + telefono + ", nota=" + nota + "]";
	}	
	
	
	

}
