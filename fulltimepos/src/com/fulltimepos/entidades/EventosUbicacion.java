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
@Table(name = "fulltimepos_evento_ubicacion")
public class EventosUbicacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7397255312601234256L;
	
	@Id
	@Column(name="fulltimepos_evento_ubicacion_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eventoUbicacionId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_evento_ubicacion_evento")
    private Eventos evento;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_evento_ubicacion_area")
    private Areas area;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fulltimepos_evento_ubicacion_mesa")
    private Mesas mesas;
	public EventosUbicacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventosUbicacion(Eventos evento, Areas area, Mesas mesas) {
		super();
		this.evento = evento;
		this.area = area;
		this.mesas = mesas;
	}
	public int getEventoUbicacionId() {
		return eventoUbicacionId;
	}
	public void setEventoUbicacionId(int eventoUbicacionId) {
		this.eventoUbicacionId = eventoUbicacionId;
	}
	public Eventos getEvento() {
		return evento;
	}
	public void setEvento(Eventos evento) {
		this.evento = evento;
	}
	public Areas getArea() {
		return area;
	}
	public void setArea(Areas area) {
		this.area = area;
	}
	public Mesas getMesas() {
		return mesas;
	}
	public void setMesas(Mesas mesas) {
		this.mesas = mesas;
	}
	@Override
	public String toString() {
		return "EventosUbicacion [eventoUbicacionId=" + eventoUbicacionId + ", evento=" + evento + ", area=" + area
				+ ", mesas=" + mesas + "]";
	}
	
	


}
