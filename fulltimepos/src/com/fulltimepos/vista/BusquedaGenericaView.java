package com.fulltimepos.vista;

import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class BusquedaGenericaView extends JFrame{
	
	 /**
		 * 
		 */
		private static final long serialVersionUID = -1240573661612287159L;
			public javax.swing.JScrollPane ScrollResultado;
		    public javax.swing.JButton btnBuscar;
			public javax.swing.JComboBox cbBusqueda;
		    public javax.swing.JPanel jpBusqueda;
		    public javax.swing.JLabel lblOpcion;
		    public javax.swing.JLabel lblcadena;
		    public javax.swing.JTable tbResultado;
		    public javax.swing.JTextField txtbusqueda;
		    
		    //Tabla//
		    protected Object[][] datos; //Cuerpo de la tabla
		    protected String[] cabecera = null;    //Cabecera de la tabla
		    public DefaultTableModel dtm;//Unión de la cabecera y la tabla
		 
		    
		    public BusquedaGenericaView() {
		        initComponents();
		    }
		    
		    private void initComponents() {
		    	
		    	 jpBusqueda = new javax.swing.JPanel();
		         lblOpcion = new javax.swing.JLabel();
		         cbBusqueda = new javax.swing.JComboBox();
		         lblcadena = new javax.swing.JLabel();
		         txtbusqueda = new javax.swing.JTextField();
		         btnBuscar = new javax.swing.JButton();
		         ScrollResultado = new javax.swing.JScrollPane();
		         tbResultado = new javax.swing.JTable();

		         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		         //setName("Consulta Clientes"); // NOI18N
		         setResizable(false);

		         jpBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));

		         lblOpcion.setText("Opcion de Busqueda");

		         cbBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Codigo", "Descripcion", "Estado" }));

		         lblcadena.setText("Cadena de Busqueda");

		         btnBuscar.setText("Buscar");

		         javax.swing.GroupLayout jpBusquedaLayout = new javax.swing.GroupLayout(jpBusqueda);
		         jpBusqueda.setLayout(jpBusquedaLayout);
		         jpBusquedaLayout.setHorizontalGroup(
		             jpBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		             .addGroup(jpBusquedaLayout.createSequentialGroup()
		                 .addGap(21, 21, 21)
		                 .addComponent(lblOpcion)
		                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                 .addComponent(cbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
		                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
		                 .addComponent(lblcadena)
		                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                 .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
		                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                 .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
		                 .addGap(40, 40, 40))
		         );
		         jpBusquedaLayout.setVerticalGroup(
		             jpBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		             .addGroup(jpBusquedaLayout.createSequentialGroup()
		                 .addGap(18, 18, 18)
		                 .addGroup(jpBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                     .addComponent(lblOpcion)
		                     .addComponent(cbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                     .addComponent(lblcadena)
		                     .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                     .addComponent(btnBuscar))
		                 .addContainerGap(19, Short.MAX_VALUE))
		         );
		         
		         cabecera = new String[] {"Codigo", "Descripcion", "Estado"};
		         dtm = new DefaultTableModel(datos,cabecera){
		        	 @Override
		        	 public boolean isCellEditable(int row, int column) {
		        	       return false;
		        	    } 
		         };
		         tbResultado.setName("tbResultado");
		         tbResultado.setModel(dtm);
		         tbResultado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		         ScrollResultado.setViewportView(tbResultado);

		         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		         getContentPane().setLayout(layout);
		         layout.setHorizontalGroup(
		             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		             .addGroup(layout.createSequentialGroup()
		                 .addContainerGap()
		                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                     .addComponent(jpBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                     .addComponent(ScrollResultado))
		                 .addContainerGap())
		         );
		         layout.setVerticalGroup(
		             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		             .addGroup(layout.createSequentialGroup()
		                 .addGap(30, 30, 30)
		                 .addComponent(jpBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                 .addGap(18, 18, 18)
		                 .addComponent(ScrollResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
		                 .addContainerGap(46, Short.MAX_VALUE))
		         );

		         pack();
		    }

}
