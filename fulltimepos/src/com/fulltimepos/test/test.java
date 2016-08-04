package com.fulltimepos.test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.hibernate.Session;

import com.fulltimepos.controlador.ControladorCategorias;
import com.fulltimepos.controlador.ControladorCliente;
import com.fulltimepos.controlador.ControladorPresentacion;
import com.fulltimepos.controlador.ControladorProveedor;
import com.fulltimepos.controlador.ControladorSubCategoria;
import com.fulltimepos.dao.*;
import com.fulltimepos.entidades.Clientes;
import com.fulltimepos.entidades.TipoIdentificacion;
import com.fulltimepos.modelo.*;
import com.fulltimepos.utilidades.HibernateUtil;
import com.fulltimepos.utilidades.Validador;
import com.fulltimepos.vista.*;



public class test {

	public static void main(String[] args) {
				
		
		//Iniciar sesion Hibernate
		
		
		 try {
			   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			  } 
			  catch (UnsupportedLookAndFeelException e) {
			  }
			  catch (ClassNotFoundException e) {
			  }
			  catch (InstantiationException e) {
			  }
			  catch (IllegalAccessException e) {
			  } 
		 
		
		 
		 AlmacenView vista = new AlmacenView();
		/* 
		 ProveedorView vista = new ProveedorView();
		 ProveedorServicios modelo = new ProveedorServicios();
		 ControladorProveedor controlador = new ControladorProveedor(modelo,vista);
		 
		  CategoriasView vista = new CategoriasView();
		 CategoriaServicios modelo = new CategoriaServicios();
		 ControladorCategorias  controlador = new ControladorCategorias(modelo,vista);
		 
		 
		/*
		 SubCatetoriaView vista = new SubCatetoriaView();
		 SubCategoriaServicios modelo = new SubCategoriaServicios();
		 ControladorSubCategoria  controlador = new ControladorSubCategoria(modelo,vista);
		 /*
		 CategoriasView vista = new CategoriasView();
		 CategoriaServicios modelo = new CategoriaServicios();
		 ControladorCategorias  controlador = new ControladorCategorias(modelo,vista);
		 		
		 /*
		 ClientesView vista = new ClientesView();
		 ClienteServicios modelo = new ClienteServicios();
		 ControladorCliente Controlador = new ControladorCliente(modelo,vista);		
		  */    
			 
		//Pendiente crear una sola sesion de hibernate para guardar */
		/*
		List<TipoIdentificacion> lista = new ArrayList<TipoIdentificacion>();
		TipoIdentificacionServicios servicios = new TipoIdentificacionServicios();
		lista = servicios.lista();
		
		List<Clientes> lista = new ArrayList<Clientes>();
		
		ClienteDAO prueba = new ClienteDAO();
		
		lista = prueba.busquedaNombre("Alva");
		System.out.println("Tamaño " + lista.size());
		*/
		/*
		Clientes cliente = new Clientes();
		ClienteDAO prueba = new ClienteDAO();
		cliente = prueba.buscarId(1);
		cliente.setCorreo("hola mundo bitchs");
		prueba.actualizar(cliente);
		
		System.out.println(cliente);
		
		TipoIdentificacion ti = new TipoIdentificacion();
		TipoIdentificacionDAO acciontc = new TipoIdentificacionDAO();
		ti.setDescripcion("RUC");
		
		acciontc.guardar(ti);
		
		ti = acciontc
		
		System.out.println(ti);
		
		*/
		
		
		
	}

}
