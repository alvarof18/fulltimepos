package com.fulltimepos.vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MantenimientoGenericoView extends JFrame{
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 5470426815183001987L;
		public JTabbedPane Pestanas;
	    public JButton btnBuscar;
	    public JButton btnCancelar;
	    public JButton btnEliminar;
	    public JButton btnGuardar;
	    public JButton btnModificar;
	    public JButton btnNuevo;
	    public JPanel pGeneral;
	    
	    public MantenimientoGenericoView() {
	        initComponents();
	    }

		private void initComponents() {
			  btnNuevo = new JButton();
		      btnModificar = new JButton();
		      btnEliminar = new  JButton();
		      btnCancelar = new JButton();
		      btnGuardar = new JButton();
		      btnBuscar = new JButton();
		      Pestanas = new JTabbedPane();
		      pGeneral = new JPanel();

		      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		      btnNuevo.setText("Nuevo");
		      btnModificar.setText("Modificar");
		      btnEliminar.setText("Eliminar");
		      btnCancelar.setText("Cancelar");
		      btnGuardar.setText("Guardar");
		      btnBuscar.setText("Buscar");
		      
		      javax.swing.GroupLayout pGeneralLayout = new javax.swing.GroupLayout(pGeneral);
		        pGeneral.setLayout(pGeneralLayout);
		        pGeneralLayout.setHorizontalGroup(
		            pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 675, Short.MAX_VALUE)
		        );
		        pGeneralLayout.setVerticalGroup(
		            pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 273, Short.MAX_VALUE)
		        );

		        Pestanas.addTab("General", pGeneral);

		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        getContentPane().setLayout(layout);
		        layout.setHorizontalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(Pestanas)
		                    .addGroup(layout.createSequentialGroup()
		                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                .addContainerGap())
		        );
		        layout.setVerticalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addGap(18, 18, 18)
		                .addComponent(Pestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        );

		        Pestanas.getAccessibleContext().setAccessibleName("General");
		        pack();
		}

}
