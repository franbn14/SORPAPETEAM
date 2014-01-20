/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author alberto
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfCif = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfSurname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbSuranme = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        lbDate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btRegister = new javax.swing.JButton();
        lbError = new javax.swing.JLabel();
        cbTaller = new javax.swing.JCheckBox();
        tfMonth = new javax.swing.JTextField();
        tfYear = new javax.swing.JTextField();
        tfDay = new javax.swing.JTextField();
        lbCIFError = new javax.swing.JLabel();
        lbDateError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPane.setBackground(new java.awt.Color(245, 228, 179));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel1.setText("Registro de nuevo usuario");

        jLabel2.setText("NIF/CIF");

        jLabel3.setText("Nombre");

        jLabel4.setText("Direccion");

        jLabel5.setText("Password");

        lbSuranme.setText("Apellidos");

        lbDate.setText("Fecha nac.");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btRegister.setText("Registrar");
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });

        lbError.setForeground(new java.awt.Color(255, 0, 0));

        cbTaller.setText("Registro de taller");
        cbTaller.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbTallerStateChanged(evt);
            }
        });

        tfMonth.setText("mm");

        tfYear.setText("aaaa");

        tfDay.setText("dd");

        lbCIFError.setForeground(new java.awt.Color(255, 0, 0));
        lbCIFError.setText("    ");

        lbDateError.setForeground(new java.awt.Color(233, 26, 26));
        lbDateError.setText("  ");

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addComponent(cbTaller)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPaneLayout.createSequentialGroup()
                                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(lbSuranme)
                                    .addComponent(lbDate))
                                .addGap(18, 18, 18)
                                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPaneLayout.createSequentialGroup()
                                        .addComponent(btRegister)
                                        .addGap(12, 12, 12)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbError, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(mainPaneLayout.createSequentialGroup()
                                        .addComponent(tfDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbDateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(mainPaneLayout.createSequentialGroup()
                                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(tfCif, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(tfAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(tfSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(tfPass, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbCIFError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(mainPaneLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))))
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTaller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lbCIFError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSuranme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate)
                    .addComponent(tfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDateError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRegister)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        // TODO add your handling code here:
        String name=tfName.getText();
        String cif=null;
        String address=tfAddress.getText();
        String pass=tfPass.getText();
        String surname=null;
        String dob=null;
        boolean correct=true, dateCorrect=true;

        lbError.setText("");
        lbDateError.setText("");
        lbCIFError.setText("");

        
        if(name!=null && !name.equals("") && pass!=null && !pass.equals("") && address!=null && !address.equals(""))
        {
            cif=tfCif.getText();

            if(cif!=null && !cif.isEmpty() && !validateCif(cif,cbTaller.isSelected())) {
                lbCIFError.setText("No es valido");
                correct=false;
            }

            if(!cbTaller.isSelected()) {
                surname=tfSurname.getText();

                String day=tfDay.getText(), month=tfMonth.getText(), year=tfYear.getText();

                if(!day.matches("[0-3][0-9]")) {
                    lbDateError.setText("Formato incorrecto");
                    dateCorrect=false;
                }

                if(!month.matches("[0-1][0-9]")) {
                    lbDateError.setText("Formato incorrecto");
                    dateCorrect=false;
                }

                if(!year.matches("[0-9]{4}")) {
                    lbDateError.setText("Formato incorrecto");
                    dateCorrect=false;
                }

                if(dateCorrect) {                   
                    Date date = null;
                    dob = year+"-"+month+"-"+day;
                    
                    try {
                        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                        formatter.setLenient(false);
                        date = formatter.parse(dob);
                        
                    } catch (ParseException e) { 
                         lbDateError.setText("Formato incorrecto");
                    }                                                              
                }

            }

            if(correct && dateCorrect) {
                String error=registroCli(cif,name,address,pass,surname,dob);

                if(error.equals("")) {
                    Main main=new Main();
                    dispose();
                    main.setVisible(true);
                }
                else
                lbError.setText(error);
            }/*
            else
            lbError.setText("Registro incorrecto");*/
        }
        else
            lbError.setText("No puede haber vacíos");
    }//GEN-LAST:event_btRegisterActionPerformed

    private void cbTallerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbTallerStateChanged
        // TODO add your handling code here:
        if(cbTaller.isSelected()) {
            lbSuranme.setEnabled(false);
            tfSurname.setEnabled(false);
            lbDate.setEnabled(false);
            tfDay.setEnabled(false);
            tfMonth.setEnabled(false);
            tfYear.setEnabled(false);
        }
        else {
            lbSuranme.setEnabled(true);
            tfSurname.setEnabled(true);
            lbDate.setEnabled(true);
            tfDay.setEnabled(true);
            tfMonth.setEnabled(true);
            tfYear.setEnabled(true);
        }
            
            
    }//GEN-LAST:event_cbTallerStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main main=new Main();
        dispose();
        main.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegister;
    private javax.swing.JCheckBox cbTaller;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbCIFError;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDateError;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbSuranme;
    private javax.swing.JPanel mainPane;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfCif;
    private javax.swing.JTextField tfDay;
    private javax.swing.JTextField tfMonth;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfSurname;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables
     
    public boolean validateCif(String cif, boolean isTaller)
    {        
         cif = cif.toUpperCase();
         
         if (cif.length() != 9) 
             return false;
         
         String letters, letter, digits;
         
         if(isTaller) {
            letter = cif.substring(0,1);        
            letters = "ABCDEFGHJNPQRSUVW";            
            digits = cif.substring(1);
            
         }
         else {
             System.out.println("AQUI "+cif);
             letter = cif.substring(8);            
             letters="TRWAGMYFPDXBNJZSQVHLCKE";                          
             digits = cif.substring(0, 8);
         }
         
         if (letters.indexOf(letter) == -1) 
               return false;
            
         return digits.matches("[0-9]{8}");         
    }

    private static String registroCli(java.lang.String nif, java.lang.String nombre, java.lang.String direccion, java.lang.String password, java.lang.String apellidos, java.lang.String fecha) {
        servicios.RegistroCliente_Service service = new servicios.RegistroCliente_Service();
        servicios.RegistroCliente port = service.getRegistroClientePort();
        return port.registroCli(nif, nombre, direccion, password, apellidos, fecha);
    }
    
}
