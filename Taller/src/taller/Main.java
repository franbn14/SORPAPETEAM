/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller;

import CEN.OfferCEN;
import CEN.RequestCEN;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import security.AES;
import servicios.LoginClientes;
import servicios.PassManager;

/**
 *
 * @author alberto
 */
public class Main extends javax.swing.JFrame {
    private Comunication comunication;
    /**
     * Creates new form NewJFrame
     */
    public Main() {             
        comunication = Comunication.getInstance();
        this.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {                    
                    comunication.Finish();
                    dispose();                                            
                }
            });
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
        tfUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();
        btRegister = new javax.swing.JButton();
        tfPass = new javax.swing.JPasswordField();
        btRemember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(208, 76, 76));
        setResizable(false);

        mainPane.setBackground(new java.awt.Color(245, 228, 179));
        mainPane.setName("mainPane"); // NOI18N

        tfUser.setBackground(new java.awt.Color(252, 247, 232));
        tfUser.setName("tfUser"); // NOI18N

        jLabel1.setText("CIF / NIF");

        jLabel2.setText("Contraseña");

        btLogin.setBackground(new java.awt.Color(252, 247, 232));
        btLogin.setText("Entrar");
        btLogin.setName("btLogin"); // NOI18N
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        lbTitle.setText("Iniciar sesión");
        lbTitle.setName("lbTitle"); // NOI18N

        lbError.setForeground(new java.awt.Color(222, 41, 41));
        lbError.setText("   ");

        btRegister.setBackground(new java.awt.Color(252, 247, 232));
        btRegister.setText("Registrarse");
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });

        tfPass.setBackground(new java.awt.Color(252, 247, 232));

        btRemember.setText("Recordar");
        btRemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRememberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addGap(103, 103, 103)
                        .addComponent(btRegister))
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPaneLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)))
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbError)
                            .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfUser, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(tfPass)
                                .addGroup(mainPaneLayout.createSequentialGroup()
                                    .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btRemember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle)
                    .addComponent(btRegister))
                .addGap(29, 29, 29)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLogin)
                    .addComponent(btRemember))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbError)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
        String user=tfUser.getText();
        String pass=Register.encryptPass(tfPass.getText());        
                                
        if(user!=null && !user.equals("") && pass!=null && !pass.equals("")) {
            try {
                user=AES.encrypt(user, comunication.getAesKey());
                pass=AES.encrypt(pass, comunication.getAesKey());
                                                
                //String error=AES.decrypt(login(comunication.getID(),pass,user), comunication.getAesKey());                
                String error;               
                URL url = new URL(ServiceHandler.getURL("LoginClientes"));
                Service lcs = Service.create(url, new QName("http://Servicios/", "LoginClientes"));
                LoginClientes lc = lcs.getPort(new QName("http://Servicios/", "LoginClientesPort"), LoginClientes.class);            
                error=AES.decrypt(lc.login(comunication.getID(),pass,user), comunication.getAesKey());

                if(error.equals("")) {
                    Home home=new Home(user);
                    dispose();
                    home.setVisible(true);
                }
                else
                    lbError.setText(error);                    
            } catch (Exception ex) {
                lbError.setText("Error al conectar con el servidor.");
            }
        }        
        else
            lbError.setText("No pueden ser vacíos");
    }//GEN-LAST:event_btLoginActionPerformed

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        // TODO add your handling code here:
        comunication.Finish();
        dispose();
        Register reg=new Register();        
        reg.setVisible(true);
    }//GEN-LAST:event_btRegisterActionPerformed

    private void btRememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRememberActionPerformed
        try {
            String user=tfUser.getText();
            
            String error;
            URL url = new URL(ServiceHandler.getURL("PassManager"));
            Service lcs = Service.create(url, new QName("http://Servicios/", "PassManager")); 
            PassManager manager = lcs.getPort(new QName("http://Servicios/", "PassManagerPort"), PassManager.class);
            
            error=manager.forgetPass(user);
            
            if(error.equals(""))
                lbError.setText("Se ha enviado un email.");
            else
                lbError.setText(error);
        } catch (Exception ex) {
              lbError.setText("Error al conectar con el servidor.");
        }
    }//GEN-LAST:event_btRememberActionPerformed

   
   
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);                
            }
        });        

    } 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btRegister;
    private javax.swing.JButton btRemember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel mainPane;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
/*
    private static String login(int id, java.lang.String password, java.lang.String nifDni) {
        servicios.LoginClientes_Service service = new servicios.LoginClientes_Service();
        servicios.LoginClientes port = service.getLoginClientesPort();
        return port.login(id, password, nifDni);
    }      */ 
}
