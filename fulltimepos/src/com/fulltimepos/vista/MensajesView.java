package com.fulltimepos.vista;

import javax.swing.JOptionPane;

public class MensajesView {
	
	public int mensajes(String mensaje,int tipo){
		
		int respuesta = 0;
		/*
		 * 1: Satisfaccion
		 * 2: Error
		 * 3: Advertencia
		 * 4: Confirmar
		 * */
		
		switch(tipo){
		
		case 1:
			JOptionPane.showMessageDialog(null,mensaje,null,JOptionPane.INFORMATION_MESSAGE);
		break;
		
		case 2:
			JOptionPane.showMessageDialog(null,mensaje,"Error",JOptionPane.ERROR_MESSAGE);
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null,mensaje,"Advertencia",JOptionPane.WARNING_MESSAGE);
			break;
			
		case 4:
			respuesta = JOptionPane.showConfirmDialog(null,mensaje,"Confirmacion",JOptionPane.OK_CANCEL_OPTION);
			break;
		}
		return respuesta;
	}
	
	
	
}
