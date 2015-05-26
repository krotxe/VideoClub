package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;




public class administradorForm extends javax.swing.JFrame {


    //conectamos a la base de datos
    
    
    int  nroFilas=0;

    private Statement estado;
    private ResultSet consulta;
    private Connection conexion;
    
    
    public administradorForm() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    
    
    
    
    

}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VideoClub Bancarrota -- Administrador");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1080, 720));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Er vidoclú su plimoo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Nuevo Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Películas");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Usuarios");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Préstamos");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)))
        );

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1092, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(301, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1087, 1087, 1087))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       
        pintaTablaPeliculas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked


    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //while (jTablePeliculas.getColumnModel().getColumnCount()>0)
        //jTablePeliculas.removeColumn(jTablePeliculas.getColumnModel().getColumn(0));
           //jTablePeliculas.addColumn(null);

pintaTablaUsuarios();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        pintaTablaPrestamos();
    }//GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(administradorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administradorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administradorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administradorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administradorForm().setVisible(true);
            }
        });
    }

    public void pintaTablaPeliculas(){
       
        String[] columnasPeliculas = {"I.d.", "Título", "Año", "País", "Género", "Puntuación"};
           
jTable1.setModel(new javax.swing.table.DefaultTableModel(null, columnasPeliculas) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            //public Class getColumnClass(int columnIndex) {
              //  return types [columnIndex];
            //}
        });
                    DefaultTableModel modeloDeMiTabla=(DefaultTableModel)jTable1.getModel();

          
         try {
            Class.forName("com.mysql.jdbc.Driver");
            // Establecemos la conexión con la base de datos.
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/videoclub", "root", "");
            // Preparamos la consulta
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("select * from peliculas");
            
            
            while (rs.next()) {
                Peliculas p = new Peliculas();
                p.id = rs.getInt(1);
                p.title = rs.getString(2);
                p.year = rs.getInt(3);
                p.country = rs.getString(4);
                p.gender = rs.getString(5);
                p.vote = rs.getString(7);
                
        modeloDeMiTabla.addRow(new Object[nroFilas]);
        

        jTable1.setValueAt(Integer.valueOf(p.id), nroFilas, 0);
        jTable1.setValueAt(String.valueOf(p.title), nroFilas, 1);
        jTable1.setValueAt(Integer.valueOf(p.year), nroFilas, 2);
        jTable1.setValueAt(String.valueOf(p.country), nroFilas, 3);
        jTable1.setValueAt(String.valueOf(p.gender), nroFilas, 4);
        jTable1.setValueAt(String.valueOf(p.vote), nroFilas, 5);
        

nroFilas++;

        
        
        
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
   
          nroFilas=0;    
  
    }
    
    
    
    public void pintaTablaUsuarios(){
        
        

        
          String[] columnasUsuarios = {"DNI", "Nombre", "Apellidos", "E-Mail"};
            

jTable1.setModel(new javax.swing.table.DefaultTableModel(null, columnasUsuarios) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            //public Class getColumnClass(int columnIndex) {
              //  return types [columnIndex];
            //}
        });
                    DefaultTableModel modeloDeMiTabla=(DefaultTableModel)jTable1.getModel();

          
            
         try {
            Class.forName("com.mysql.jdbc.Driver");
            // Establecemos la conexión con la base de datos.
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/videoclub", "root", "");
            // Preparamos la consulta
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("select * from usuarios order by"+"'nombre'");
            
            while (rs.next()) {
                Usuarios u = new Usuarios();
                u.DNI = rs.getInt(1);
                u.Nombre = rs.getString(2);
                u.Apellidos = rs.getString(3);
                u.email = rs.getString(5);
                
                
        modeloDeMiTabla.addRow(new Object[nroFilas]);
        

        jTable1.setValueAt(Integer.valueOf(u.DNI), nroFilas, 0);
        jTable1.setValueAt(String.valueOf(u.Nombre), nroFilas, 1);
        jTable1.setValueAt(String.valueOf(u.Apellidos), nroFilas, 2);
        jTable1.setValueAt(String.valueOf(u.email), nroFilas, 3);
       
        

nroFilas++;

        
        
        
        
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
   
      nroFilas=0;  
    }
    
    
 
    
    
    public void pintaTablaPrestamos(){
        
        

        
          String[] columnasPrestamos = {"I.d Película", "Nº Ejemplar", "DNI", "Salida","Devolución","Precio"};
            

jTable1.setModel(new javax.swing.table.DefaultTableModel(null, columnasPrestamos) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            //public Class getColumnClass(int columnIndex) {
              //  return types [columnIndex];
            //}
        });
                    DefaultTableModel modeloDeMiTabla=(DefaultTableModel)jTable1.getModel();

          
            
         try {
            Class.forName("com.mysql.jdbc.Driver");
            // Establecemos la conexión con la base de datos.
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/videoclub", "root", "");
            // Preparamos la consulta
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("select * from prestamos");
            
            while (rs.next()) {
                Prestamos p = new Prestamos();
                p.id = rs.getInt(3);
                p.titulo = rs.getString(2);
                p.dni = rs.getInt(1);
                p.prestamo = rs.getString(4);
                p.devolucion = rs.getString(5);
                p.precio= rs.getInt(6);
                
        modeloDeMiTabla.addRow(new Object[nroFilas]);
        

        jTable1.setValueAt(Integer.valueOf(p.id), nroFilas, 0);
        jTable1.setValueAt(String.valueOf(p.titulo), nroFilas, 1);
        jTable1.setValueAt(Integer.valueOf(p.dni), nroFilas, 2);
        jTable1.setValueAt(String.valueOf(p.prestamo), nroFilas, 3);
        jTable1.setValueAt(String.valueOf(p.devolucion), nroFilas, 4);
        jTable1.setValueAt(Integer.valueOf(p.precio), nroFilas, 5);
       
        

nroFilas++;

        
        
        
        
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
   
      nroFilas=0;  
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
