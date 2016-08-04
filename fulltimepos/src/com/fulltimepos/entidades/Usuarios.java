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
@Table(name = "fulltimepos_usuarios")
public class Usuarios implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1756536151122010525L;
	@Id
	@Column(name="fulltimepos_usuarios_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int usuariosId;
	@Column(name="fullitmepos_usuarios_usuario")
	private String usuario;
	@Column(name="fullitmepos_usuarios_pass")
	private String password;
	@Column(name="fullitmepos_usuarios_nombre")
	private String nombre;
	@Column(name="fullitmepos_usuarios_identificacion")
	private String identificacion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_usuarios_tipo_identificacion")
	private TipoIdentificacion tipoIdentificacion;
	@Column(name="fullitmepos_usuarios_status")
	private Boolean estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_usuarios_rol")
	private Rol rol;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_usuarios_cargo")
	private Cargo usuarioCargo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_usuarios_departamento")
	private Departamento usuarioDepartamento;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_usuarios_empresa")
	private Empresa empresa;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fullitmepos_usuarios_sucursal")
	private Sucursal sucursal;
	
	
	public Usuarios(){
		
		
	}
	
	
	public Usuarios(String usuario, String password, String nombre, String identificacion,
			TipoIdentificacion tipoIdentificacion, Boolean estado, Rol rol, Cargo usuarioCargo,
			Departamento usuarioDepartamento, Empresa empresa, Sucursal sucursal) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.tipoIdentificacion = tipoIdentificacion;
		this.estado = estado;
		this.rol = rol;
		this.usuarioCargo = usuarioCargo;
		this.usuarioDepartamento = usuarioDepartamento;
		this.empresa = empresa;
		this.sucursal = sucursal;
	}


	public int getUsuariosId() {
		return usuariosId;
	}


	public void setUsuariosId(int usuariosId) {
		this.usuariosId = usuariosId;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}


	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}


	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	public Rol getRol() {
		return rol;
	}


	public void setRol(Rol rol) {
		this.rol = rol;
	}


	public Cargo getUsuarioCargo() {
		return usuarioCargo;
	}


	public void setUsuarioCargo(Cargo usuarioCargo) {
		this.usuarioCargo = usuarioCargo;
	}


	public Departamento getUsuarioDepartamento() {
		return usuarioDepartamento;
	}


	public void setUsuarioDepartamento(Departamento usuarioDepartamento) {
		this.usuarioDepartamento = usuarioDepartamento;
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public Sucursal getSucursal() {
		return sucursal;
	}


	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}


	@Override
	public String toString() {
		return "Usuarios [usuario=" + usuario + ", password=" + password + ", nombre=" + nombre + ", identificacion="
				+ identificacion + ", tipoIdentificacion=" + tipoIdentificacion + ", estado=" + estado + "]";
	}
	

}
