package com.fulltimepos.modelo;

import java.util.List;

import com.fulltimepos.dao.ClienteDAO;
import com.fulltimepos.entidades.Clientes;
import com.fulltimepos.entidades.TipoContribuyente;
import com.fulltimepos.entidades.TipoIdentificacion;
import com.fulltimepos.utilidades.Validador;

public class ClienteServicios extends ClienteDAO<Clientes> {
	
	private Validador valida = new Validador();	
	
	public String guardar(String codigo, String nombre, String razonSocial, TipoIdentificacion tipoIdentificacion, String identificacion,
						  String telefono, String direccion, String observacion, String web, TipoContribuyente tipoContribuyente,
						  Boolean credito, String limite, String descuento, Boolean mercancia,Boolean estado, String correo, boolean actualizar){
		
	    String resultado ="";
	    
	    if(nombre != null  ||  identificacion != null){
		
			if(valida.validarLetras(nombre) || valida.validarNumeros(identificacion)){
				if(tipoIdentificacion.getDescripcion().toLowerCase().equals("cedula")){
				  	if(!valida.Cedula(identificacion)){
						resultado = "Numero de cedula incorrecto";
					}
				}else if(tipoIdentificacion.getDescripcion().toLowerCase().equals("ruc")){
					if(!valida.validarRUC(identificacion)){
						resultado = "Numero de ruc invalido";
					}
				}
				/* Si funciona pero como estoy haciendo pruebas lo comento desppues de las pruebas volver activar
				if(resultado.equals("")){
					if(this.busquedaIdentificacion(identificacion) != null){
						resultado = "Ya existe el numero de identificacion";						
					}
				}*/
			}else{
				resultado = "Error en algunos de los siguientes campos Nombre, Razon Social o identificacion";
			}

	}else{
		resultado = "Llene los campos obligatorios";
	}
	    
	if(!correo.equals("")){
		if(!valida.Correo(correo)){
			resultado = "Formato de correo invalido";
		}
	}
	
	if(!telefono.equals("")){
		if(!valida.validarNumeros(telefono)){
			resultado = "Numero de telefono invalido";
		}	
	}
	    
	if(resultado.equals("")){
     	Clientes cliente = new Clientes(nombre, razonSocial,tipoIdentificacion,identificacion,telefono,direccion,observacion,web,tipoContribuyente,
					                        credito,Double.parseDouble(limite), Double.parseDouble(descuento),mercancia,estado,correo);
     	
     	   if(!actualizar){
			super.guardar(cliente);
     	   }else{
     		  Clientes clienteActualizar = new Clientes();
     		  clienteActualizar = super.buscarId(Integer.parseInt(codigo));
     		 
     		  clienteActualizar.setNombre(nombre);
     		  clienteActualizar.setRazonSocial(razonSocial);
     		  clienteActualizar.setTipoIdentificacion(tipoIdentificacion);
     		  clienteActualizar.setIdentificacion(identificacion);
     		  clienteActualizar.setTelefono(telefono);
     		  clienteActualizar.setDireccion(direccion);
     		  clienteActualizar.setObservacion(observacion);
     		  clienteActualizar.setWeb(web);
     		  clienteActualizar.setTipoContribuyente(tipoContribuyente);
     		  clienteActualizar.setCredito(credito);
     		  clienteActualizar.setLimite(Double.parseDouble(limite));
     		  clienteActualizar.setDescuento(Double.parseDouble(descuento));
     		  clienteActualizar.setMercancia(mercancia);
     		  clienteActualizar.setEstado(estado);
     		  clienteActualizar.setCorreo(correo);
     		  this.actualizar(clienteActualizar);
     	   }
	}   
   return resultado; 
}
	
	
	
}

