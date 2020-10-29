/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Req_Res.Req_Res;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Folio
 */
public class AddCoaches extends javax.swing.JFrame implements Serializable{
    private final Req_Res rr;
    private final String adminid;
    /**
     * Creates new form AddSeats
     */
    public AddCoaches(Req_Res rr,String adminid) {
        initComponents();
        this.rr=rr;
        this.adminid=adminid;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttrainno = new javax.swing.JTextField();
        cmbclass = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add Seats");

        jLabel2.setText("Train Num:");

        jLabel3.setText("Class:");

        txttrainno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrainnoActionPerformed(evt);
            }
        });
        txttrainno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttrainnoKeyReleased(evt);
            }
        });

        cmbclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First AC", "Second AC", "Sleeper" }));

        jLabel5.setText("Coaches to be added:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton1.setText("ADD SEATS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbclass, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txttrainno, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(335, 335, 335))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txttrainno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    if(checkfields()){
        String tnum=txttrainno.getText();
        String clss=(String) cmbclass.getSelectedItem();
        int coach=Integer.parseInt(jTextField1.getText());
       // ObjectOutputStream oos=rr.getObjectOutputStream();
        //ObjectInputStream ois=rr.getObjectInputStream();
        String Res="";
        int seats = 0;
        switch (clss) {
            case"First AC" :{
                seats=coach*60;
                try {
                    
                    ViewTrain train=new ViewTrain();
                    train.settrainNum(tnum);
                    train.setNOSfc(seats);
                    Res=rr.addseatfc(train);
                    //oos.writeObject(train);
                } catch (IOException ex) {
                    Logger.getLogger(AddCoaches.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddCoaches.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
            }
            case "Second AC"  :{
                seats=coach*60;
                try {
                    ViewTrain train=new ViewTrain();
                    train.settrainNum(tnum);
                    train.setNOSsc(seats);
                    Res=rr.addseatsc(train);
                    //oos.writeObject(train);
                } catch (IOException ex) {
                    Logger.getLogger(AddCoaches.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddCoaches.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
            }
            default :{
                seats=coach*80;
                ViewTrain train=new ViewTrain();
                train.settrainNum(tnum);
                train.setNOSslc(seats);
            try {
                Res=rr.addseatlc(train);
            } catch (IOException ex) {
                Logger.getLogger(AddCoaches.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddCoaches.class.getName()).log(Level.SEVERE, null, ex);
            }
                //oos.writeObject(train);
                break;
            }


        }
        if(Res.equals("valid")){
            System.out.println(Res+"2\n");
            JOptionPane.showMessageDialog(this,"Coaches added Succesfully");
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,Res);
            System.out.println("\n"+Res);
        }
    }
    else{
        JOptionPane.showMessageDialog(this, "check if u have entered valic entries");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttrainnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttrainnoKeyReleased
//        TODO add your handling code here:
        
            String PATTERN="^[0-9]{2,5}$";
           Pattern patt=Pattern.compile(PATTERN);
           Matcher match=patt.matcher(txttrainno.getText());
            if(!match.matches()){
             jLabel6.setText("invalid password");
            }
            else{
                jLabel6.setText(null);
            }
    }//GEN-LAST:event_txttrainnoKeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        
        String PATTERN="^[0-9]{1,2}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(jTextField1.getText());
        if(!match.matches()){
           jLabel7.setText("invalid ");
        }
        else{
            jLabel7.setText(null);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void txttrainnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrainnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrainnoActionPerformed
    public boolean checkfields(){
        if (jLabel6.getText()=="invalid"&&jLabel7.getText()=="invalid"){
            return false;
        }
        else{
            return true;
        }
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddSeats().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbclass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txttrainno;
    // End of variables declaration//GEN-END:variables
}
