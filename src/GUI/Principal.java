/**
 * Paquete de las interfaces gráficas.
 */
package GUI;

import javax.swing.JOptionPane;
import lógica.Administrador;

/**
 * Ventana principal de la aplicación.
 * @author Max Emmanuel Sierra Gómez
 * @version 1.0.0
 * Última fecha de actualización: 04/07/2016
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    private Administrador admin;
    
    public Principal() {
        initComponents();
        admin = new Administrador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_asignarAsistencia = new javax.swing.JButton();
        btn_nuevoAsistente = new javax.swing.JButton();
        menu_principal = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        menu_listas = new javax.swing.JMenu();
        menu_constancias = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_asignarAsistencia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_asignarAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ready.png"))); // NOI18N
        btn_asignarAsistencia.setText("Asignar asistencia");
        btn_asignarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignarAsistenciaActionPerformed(evt);
            }
        });

        btn_nuevoAsistente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_nuevoAsistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new2.png"))); // NOI18N
        btn_nuevoAsistente.setText("Nuevo asistente");
        btn_nuevoAsistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoAsistenteActionPerformed(evt);
            }
        });

        menu_archivo.setText("Archivo");
        menu_archivo.setName(""); // NOI18N
        menu_principal.add(menu_archivo);

        menu_listas.setText("Listas");
        menu_principal.add(menu_listas);

        menu_constancias.setText("Constancias");
        menu_principal.add(menu_constancias);

        setJMenuBar(menu_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_asignarAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nuevoAsistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(272, 272, 272))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(btn_nuevoAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_asignarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón para abrir la ventana que sirve para crear un nuevo asistente
     * @param evt 
     */
    private void btn_nuevoAsistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoAsistenteActionPerformed
        this.setVisible(false);
        new NuevaAsistencia().setVisible(true);
    }//GEN-LAST:event_btn_nuevoAsistenteActionPerformed

    /**
     * Botón para abrir la ventana que asignará una nueva asistencia a un asistente ya creado
     * @param evt 
     */
    private void btn_asignarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignarAsistenciaActionPerformed
        this.setVisible(false);
        if(admin.existenciaAsistentes()){
            new AsignarAsistencia().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"No hay asistentes registrados aún.");
            this.setVisible(true);
        }
    }//GEN-LAST:event_btn_asignarAsistenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asignarAsistencia;
    private javax.swing.JButton btn_nuevoAsistente;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenu menu_constancias;
    private javax.swing.JMenu menu_listas;
    private javax.swing.JMenuBar menu_principal;
    // End of variables declaration//GEN-END:variables
}