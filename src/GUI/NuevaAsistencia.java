package GUI;

import dataBase.AsistenteBean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import lógica.Administrador;

/**
 * Clase que abre una ventana para capturar un nuevo asistente.
 * @author Max Emmanuel Sierra Gómez
 * @version 1.0.0
 * Última fecha de actualización: 04/07/2016
 */
public class NuevaAsistencia extends javax.swing.JFrame {

    /**
     * Creates new form NuevaAsistencia
     */
    
    private AsistenteBean asis;
    private Administrador admin;
    //Variable para definir el patrón de la forma de un correo electrónico
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    public NuevaAsistencia() {
        initComponents();
        asis = new AsistenteBean();
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

        panelDatosAsistente = new javax.swing.JPanel();
        lbl_nombreAsistente = new javax.swing.JLabel();
        lbl_edadAsistente = new javax.swing.JLabel();
        lbl_dondeSeEntero = new javax.swing.JLabel();
        lbl_adscripcionAsistente = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_nombreAsistente = new javax.swing.JTextField();
        txt_dondeSeEntero = new javax.swing.JTextField();
        txt_edadAsistente = new javax.swing.JTextField();
        txt_adscripcionAsistente = new javax.swing.JTextField();
        txt_emailAsistente = new javax.swing.JTextField();
        lbl_nuevoAsistente = new javax.swing.JLabel();
        btn_guardarAsistente = new javax.swing.JButton();
        btn_cancelarAsistente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDatosAsistente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del asistente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        panelDatosAsistente.setName("datos"); // NOI18N

        lbl_nombreAsistente.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lbl_nombreAsistente.setText("Nombre:");

        lbl_edadAsistente.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lbl_edadAsistente.setText("Edad:");

        lbl_dondeSeEntero.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lbl_dondeSeEntero.setText("¿Dónde se enteró?:");

        lbl_adscripcionAsistente.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lbl_adscripcionAsistente.setText("Lugar de adscripción:");

        lbl_email.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lbl_email.setText("Correo electrónico:");

        txt_edadAsistente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadAsistenteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDatosAsistenteLayout = new javax.swing.GroupLayout(panelDatosAsistente);
        panelDatosAsistente.setLayout(panelDatosAsistenteLayout);
        panelDatosAsistenteLayout.setHorizontalGroup(
            panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosAsistenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosAsistenteLayout.createSequentialGroup()
                        .addGroup(panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombreAsistente)
                            .addComponent(lbl_edadAsistente))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_edadAsistente)
                            .addComponent(txt_nombreAsistente, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)))
                    .addGroup(panelDatosAsistenteLayout.createSequentialGroup()
                        .addGroup(panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_adscripcionAsistente)
                            .addComponent(lbl_dondeSeEntero)
                            .addComponent(lbl_email))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_emailAsistente)
                            .addComponent(txt_dondeSeEntero)
                            .addComponent(txt_adscripcionAsistente, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelDatosAsistenteLayout.setVerticalGroup(
            panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosAsistenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombreAsistente)
                    .addComponent(txt_nombreAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_edadAsistente)
                    .addComponent(txt_edadAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_adscripcionAsistente)
                    .addComponent(txt_adscripcionAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dondeSeEntero)
                    .addComponent(txt_dondeSeEntero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txt_emailAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_nuevoAsistente.setFont(new java.awt.Font("Batang", 1, 36)); // NOI18N
        lbl_nuevoAsistente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nuevoAsistente.setText("Nuevo Asistente");

        btn_guardarAsistente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_guardarAsistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        btn_guardarAsistente.setText("Guardar");
        btn_guardarAsistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarAsistenteActionPerformed(evt);
            }
        });

        btn_cancelarAsistente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_cancelarAsistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btn_cancelarAsistente.setText("Cancelar");
        btn_cancelarAsistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarAsistenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(panelDatosAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lbl_nuevoAsistente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btn_guardarAsistente)
                        .addGap(73, 73, 73)
                        .addComponent(btn_cancelarAsistente)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_nuevoAsistente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDatosAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelarAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método para guardar en base de datos un nuevo asistente
     * @param evt 
     */
    private void btn_guardarAsistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarAsistenteActionPerformed
        if(this.validarCampos()){
            this.asis.setNombre(txt_nombreAsistente.getText());
            
            try{
            this.asis.setEdad(Integer.parseInt(txt_edadAsistente.getText()));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            
            this.asis.setAdscripcion(txt_adscripcionAsistente.getText());
            this.asis.setDondeSeEntero(txt_dondeSeEntero.getText());
            this.asis.setEmail(txt_emailAsistente.getText());
            this.asis.setAsistencias(1);
            admin.guardarAsistente(this.asis);
            this.setVisible(false);
            new Principal().setVisible(true);
        }
    }//GEN-LAST:event_btn_guardarAsistenteActionPerformed

    private void btn_cancelarAsistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarAsistenteActionPerformed
        this.setVisible(false);
        new Principal().setVisible(true);
    }//GEN-LAST:event_btn_cancelarAsistenteActionPerformed

    /**
     * Método que valida si ingresaste un caracter no númerico en el campo de edad
     * @param evt 
     */
    private void txt_edadAsistenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadAsistenteKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Sólo números.");
        }
    }//GEN-LAST:event_txt_edadAsistenteKeyTyped

    /**
     * Método que valida si, al momento de intentar guardar un nuevo asistente,
     * hay algún campo vacío.
     * @return verdadero si no hay campos vacíos y falso si hay algún campo vacío o si
     * el correo electrónico está escrito de manera incorrecta.
     */
    private boolean validarCampos(){
        boolean exito = true;
        if(this.txt_nombreAsistente.getText().equals("")){
            JOptionPane.showMessageDialog(null,"No se admiten campos vacíos. Favor de escribir un nombre.");
            this.txt_nombreAsistente.requestFocus();
            exito = false;
        }else{
            if(this.txt_edadAsistente.getText().equals("")){
                JOptionPane.showMessageDialog(null,"No se admiten campos vacíos. Favor de introducir una edad.");
                this.txt_edadAsistente.requestFocus();
                exito = false;
            }else{
                if(this.txt_adscripcionAsistente.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"No se admiten campos vacíos. Favor de introducir el lugar de adscripción.");
                    this.txt_adscripcionAsistente.requestFocus();
                    exito = false;
                }else{
                    if(this.txt_dondeSeEntero.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"No se admiten campos vacíos. Favor de introducir el lugar donde se enteró.");
                        this.txt_dondeSeEntero.requestFocus();
                        exito = false;
                    }else{
                        if(this.txt_emailAsistente.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"No se admiten campos vacíos. Favor de escribir un correo electrónico");
                            this.txt_emailAsistente.requestFocus();
                            exito = false;
                        }else{
                            if(this.validarEmail(this.txt_emailAsistente.getText()) == false){
                                JOptionPane.showMessageDialog(null,"Favor de escribir un e-mail válido.");
                                this.txt_emailAsistente.requestFocus();
                                exito = false;
                            }
                        }
                    }
                }
            }
        }
        return exito;
    }
    
    /**
     * Método para validar si un email está escrito de manera correcta.
     * @param email para validar
     * @return verdadero si el email está correctamente escrito y falso si no es así.
     */
    private boolean validarEmail(String email){
        // Compiles the given regular expression into a pattern. La variable PATTER_EMAIL que guarda una expresión regular
        // es compilada para convertirse en un patrón.
	Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        // Match the given input against this pattern. Compara la cadena introducida con el patrón.
	Matcher matcher = pattern.matcher(email);
	return matcher.matches();
    }
    
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
            java.util.logging.Logger.getLogger(NuevaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelarAsistente;
    private javax.swing.JButton btn_guardarAsistente;
    private javax.swing.JLabel lbl_adscripcionAsistente;
    private javax.swing.JLabel lbl_dondeSeEntero;
    private javax.swing.JLabel lbl_edadAsistente;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nombreAsistente;
    private javax.swing.JLabel lbl_nuevoAsistente;
    private javax.swing.JPanel panelDatosAsistente;
    private javax.swing.JTextField txt_adscripcionAsistente;
    private javax.swing.JTextField txt_dondeSeEntero;
    private javax.swing.JTextField txt_edadAsistente;
    private javax.swing.JTextField txt_emailAsistente;
    private javax.swing.JTextField txt_nombreAsistente;
    // End of variables declaration//GEN-END:variables
}