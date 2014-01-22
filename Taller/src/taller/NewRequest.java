/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller;
import CEN.RequestCEN;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
/**
 *
 * @author alberto
 */
public class NewRequest extends javax.swing.JFrame {
    String user;
    /**
     * Creates new form NewRequest
     */
    public NewRequest() {
        initComponents();
    }
    
    public NewRequest(String cif) {
        initComponents();        
        user=cif;        
        String unitString=darTodasUnidades();
        ArrayList<String> units;
        
        Gson gson = new Gson();
        java.lang.reflect.Type collectionType = new TypeToken<ArrayList<String>>(){}.getType();
        
        if(unitString!=null && !unitString.equals("")) {
            units = gson.fromJson(unitString, collectionType);  
            
            for(String unit: units)
                cbUnit.addItem(unit);
        }            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btCreate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfType = new javax.swing.JTextField();
        tfAmount = new javax.swing.JTextField();
        tfSize = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        tfColor = new javax.swing.JTextField();
        btCancel = new javax.swing.JButton();
        lbTypeError = new javax.swing.JLabel();
        lbAmountError = new javax.swing.JLabel();
        lbUnitError = new javax.swing.JLabel();
        tfDay = new javax.swing.JTextField();
        tfMonth = new javax.swing.JTextField();
        tfYear = new javax.swing.JTextField();
        lbSizeError = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbUnit = new javax.swing.JComboBox();
        lbPriceError = new javax.swing.JLabel();
        lbDateError = new javax.swing.JLabel();
        lbReqError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 228, 179));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel1.setText("Crear nueva solicitud");

        btCreate.setText("Crear");
        btCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo*");

        jLabel3.setText("Cantidad");

        jLabel4.setText("Color");

        jLabel5.setText("Precio máximo");

        jLabel6.setText("Fecha tope*");

        jLabel7.setText("Tamaño");

        btCancel.setText("Cancelar");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        lbTypeError.setForeground(new java.awt.Color(226, 25, 25));

        lbAmountError.setForeground(new java.awt.Color(226, 25, 25));

        lbUnitError.setForeground(new java.awt.Color(226, 25, 25));

        tfDay.setText("dd");
        tfDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDayFocusGained(evt);
            }
        });

        tfMonth.setText("mm");
        tfMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfMonthFocusGained(evt);
            }
        });

        tfYear.setText("aaaa");
        tfYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfYearFocusGained(evt);
            }
        });

        lbSizeError.setForeground(new java.awt.Color(226, 25, 25));

        jLabel8.setText("Unidad");

        cbUnit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        lbPriceError.setForeground(new java.awt.Color(201, 26, 26));

        lbDateError.setForeground(new java.awt.Color(213, 34, 34));

        lbReqError.setForeground(new java.awt.Color(232, 36, 36));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tfDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btCancel)))
                                    .addComponent(tfAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfColor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAmountError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTypeError)
                                            .addComponent(lbUnitError)
                                            .addComponent(lbPriceError)
                                            .addComponent(lbSizeError, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(119, 119, 119))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbReqError)
                                    .addComponent(lbDateError, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(32, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(133, 133, 133))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lbTypeError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lbAmountError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lbSizeError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lbUnitError))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lbPriceError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lbDateError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCreate)
                    .addComponent(btCancel)
                    .addComponent(lbReqError))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
        // TODO add your handling code here:
        String type=tfType.getText();
        String day=tfDay.getText(), month=tfMonth.getText(), year=tfYear.getText();
        boolean correct=true;
        String date=checkDate(day, month, year);
        
        lbTypeError.setText("");
        lbDateError.setText("");
        lbAmountError.setText("");
        lbPriceError.setText("");
        lbSizeError.setText("");
        lbUnitError.setText("");
        
        if(type==null || type.equals("")) {            
            lbTypeError.setText("No puede ser vacío");
            correct=false;
        }
        
        if(date==null) {
            lbDateError.setText("Fecha incorrecta");
            correct=false;
        }       
        
        String color=tfColor.getText();       
        Integer unit=cbUnit.getSelectedIndex()-1;
        
        Double amount=checkNumber(tfAmount.getText());
        Double size=checkNumber(tfSize.getText());
        Double price=checkNumber(tfPrice.getText());
        
        Integer amountInt=null;
        
        if(amount!=null && amount==-1) {
            correct=false;
            lbAmountError.setText("No es número");
        }   
        else if(amount!=null)
            amountInt=amount.intValue();

        if(size!=null && size==-1.0) {
            correct=false;
            lbSizeError.setText("No es número");
        }
        else if(size!=null && unit<0) {
            correct=false;
            lbUnitError.setText("Selecciona unidad");        
        }
        
        if(price!=null && price==-1.0) {
            correct=false;
            lbPriceError.setText("No es número");
        }
        
        if(unit<=-1)
            unit=null;
        
        if(correct) {
            int id=insert(type, date, size,unit, color, amountInt, price, getID(user), false, false);

            if(id==-1)
                lbReqError.setText("Error al crear solicitud");
            else {                
                dispose();
                Home home=new Home(user);
                home.setVisible(true);
            }
                
            
        }                        
    }//GEN-LAST:event_btCreateActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        // TODO add your handling code here:
        dispose();
        Home home=new Home(user);
        home.setVisible(true);
    }//GEN-LAST:event_btCancelActionPerformed

    private void tfDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDayFocusGained
        // TODO add your handling code here:
        if(tfDay.getText().equals("dd"))
            tfDay.setText("");
    }//GEN-LAST:event_tfDayFocusGained

    private void tfMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfMonthFocusGained
        // TODO add your handling code here:
        if(tfMonth.getText().equals("mm"))
            tfMonth.setText("");        
    }//GEN-LAST:event_tfMonthFocusGained

    private void tfYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfYearFocusGained
        // TODO add your handling code here:
        if(tfYear.getText().equals("aaaa"))
            tfYear.setText("");
    }//GEN-LAST:event_tfYearFocusGained
    
    public String checkDate(String day, String month, String year) {
        boolean correct=true;
        String dateString;

        if(!day.matches("[0-3][0-9]")) {
            lbDateError.setText("Fecha incorrecta");
            correct=false;
        }

        if(!month.matches("[0-1][0-9]")) {
            lbDateError.setText("Fecha incorrecta");
            correct=false;
        }

        if(!year.matches("[0-9]{4}")) {
            lbDateError.setText("Fecha incorrecta");
            correct=false;
        }

        if(correct) {             
            try {
                Date date = null;
                dateString = day+"-"+month+"-"+year;
                DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                formatter.setLenient(false);
                
                date = formatter.parse(dateString);
                return dateString;

            } catch (ParseException e) {                  
                 return null;

            }                                                              
        }        
        return null;
    }
    
    public Double checkNumber(String number) {        
        if(number!=null && !number.equals("")) {
            if(!number.matches("[0-9]+[.,]{0,1}[0-9]*"))
                return -1.0;
            else
                return Double.parseDouble(number);            
        }        
        return null;
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
            java.util.logging.Logger.getLogger(NewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btCreate;
    private javax.swing.JComboBox cbUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAmountError;
    private javax.swing.JLabel lbDateError;
    private javax.swing.JLabel lbPriceError;
    private javax.swing.JLabel lbReqError;
    private javax.swing.JLabel lbSizeError;
    private javax.swing.JLabel lbTypeError;
    private javax.swing.JLabel lbUnitError;
    private javax.swing.JTextField tfAmount;
    private javax.swing.JTextField tfColor;
    private javax.swing.JTextField tfDay;
    private javax.swing.JTextField tfMonth;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfSize;
    private javax.swing.JTextField tfType;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables
    
    private static String darTodasUnidades() {
        servicios.DarUnidades_Service service = new servicios.DarUnidades_Service();
        servicios.DarUnidades port = service.getDarUnidadesPort();
        return port.darTodasUnidades();
    }

    private static String darUnidadId(int id) {
        servicios.DarUnidades_Service service = new servicios.DarUnidades_Service();
        servicios.DarUnidades port = service.getDarUnidadesPort();
        return port.darUnidadId(id);
    }   

    private static int getID(java.lang.String nif) {
        servicios.DarIdClientebyNif_Service service = new servicios.DarIdClientebyNif_Service();
        servicios.DarIdClientebyNif port = service.getDarIdClientebyNifPort();
        return port.getID(nif);
    }

    private static int insert(java.lang.String tipo, java.lang.String fechaTope, java.lang.Double tamanyo, java.lang.Integer tamUnidad, java.lang.String color, java.lang.Integer cantidad, java.lang.Double precioMax, int usuario, boolean autoElect, boolean finalizado) {
        servicios.NewPeticion_Service service = new servicios.NewPeticion_Service();
        servicios.NewPeticion port = service.getNewPeticionPort();
        return port.insert(tipo, fechaTope, tamanyo, tamUnidad, color, cantidad, precioMax, usuario, autoElect, finalizado);
    }  
}


