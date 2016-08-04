package com.fulltimepos.vista;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SubCatetoriaView extends MantenimientoGenericoView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3736764800102909729L;
	
	
	  public JLabel lblCodigo;
	  public JLabel lblDesripcion;
	  public JLabel lblCategoria;
	  public JLabel lblActivar;
	  
	  public JTextField txtCodigo;
	  public JTextField txtDescripcion;
	  
	  public JCheckBox activar;
	  
	  public JComboBox cbCategoria;
	  
	  public SubCatetoriaView(){
		  super();
		  agreagrComponentes();
	  }
	  
	  public void agreagrComponentes() {
			
			lblCodigo = new JLabel();
			lblDesripcion = new JLabel();
			lblActivar = new JLabel();
			lblCategoria = new JLabel();
			lblCodigo.setText("Codigo");
			lblDesripcion.setText("Descripcion");
			lblActivar.setText("Activo");
			lblCategoria.setText("Categoria");
			lblCodigo.setBounds(40, 40, 89, 30);
			lblDesripcion.setBounds(40, 80, 89, 30);
			lblCategoria.setBounds(40, 115, 89, 30);
			lblActivar.setBounds(40, 145, 89, 30);
			
			txtCodigo = new JTextField();
			txtDescripcion = new JTextField();
			
			txtCodigo.setBounds(109, 45, 100, 20);
			txtCodigo.setEditable(false);
			
			txtDescripcion.setBounds(109, 85, 201, 20);
			
			activar = new JCheckBox();
			activar.setBounds(106, 145, 89, 30);
			
			cbCategoria = new JComboBox();
			cbCategoria.setBounds(109, 120, 200, 20);
			
			this.pGeneral.add(lblActivar);
			this.pGeneral.add(lblDesripcion);
			this.pGeneral.add(lblCodigo);
			this.pGeneral.add(lblCategoria);
			
			this.pGeneral.add(txtCodigo);
			this.pGeneral.add(txtDescripcion);
			
			this.pGeneral.add(activar);
			
			this.pGeneral.add(cbCategoria);
			
		}

}
