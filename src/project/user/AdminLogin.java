/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.user;
//import project.user.AdminMainInterface
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Folio
 */
public class AdminLogin extends javax.swing.JFrame implements Serializable {
    Connection con= null;
    PreparedStatement pst= null;
    ResultSet rs= null;
    /**
     * Creates new form AdminLogin
     */
    String ip="localhost";
    int port=8806;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private DataInputStream dis;
    private DataOutputStream dos;
    public AdminLogin() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAdminIDlogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAdminpasswordlogin = new javax.swing.JPasswordField();
        btnAdminlogin = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Admin Login");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Admin ID:");

        txtAdminIDlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminIDloginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password:");

        btnAdminlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdminlogin.setText("Login");
        btnAdminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAdminIDlogin)
                    .addComponent(txtAdminpasswordlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdminlogin)
                        .addGap(334, 334, 334))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAdminIDlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAdminpasswordlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnAdminlogin)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminloginActionPerformed
       /* try{
            String query=("SELECT * FROM `adminaccount` WHERE adminId=? and adminPass=?");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mms","root","");
            pst= con.prepareStatement(query);
            pst.setString(1, txtAdminIDlogin.getText());
            String password= String.valueOf(txtAdminpasswordlogin.getPassword());
            pst.setString(2, password);
            rs=pst.executeQuery();
            if(rs.next()){
            
                AdminMainInterface form=new AdminMainInterface();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                this.dispose();
            }
            else{
            
                JOptionPane.showMessageDialog(null,"hello!!!dhyaan  kidhar hai tera.theek se password daal");
            }
            //JOptionPane.showMessageDialog(this, "you are logged in congratulations and celebrations!!!");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        //new AdminMainInterface().setVisible(true);*/
        String Adminid=txtAdminIDlogin.getText();
        String password= String.valueOf(txtAdminpasswordlogin.getPassword());
        try 
                    {
                        Socket s=new Socket(ip,port);
                        System.out.println("Connected To Server As A new Customer");
                        dos=new DataOutputStream(s.getOutputStream());
                        dis=new DataInputStream((s.getInputStream()));
                        dos.writeUTF("Admin login");
                        dos.writeUTF(Adminid);
                        dos.writeUTF(password);
                        
                        // Verification Message If Inserted Successfully
                        String done=dis.readUTF();
                        if(done.equals("Valid"))
                        {
                            JOptionPane.showMessageDialog(this,"Successful Login To Continue");
                            new AdminMainInterface().show();
                            this.dispose();
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Login Failed At Server End");
                    } 
                    catch (IOException ex) 
                    {
                        JOptionPane.showMessageDialog(this, ex.getMessage());
                        Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }//GEN-LAST:event_btnAdminloginActionPerformed

    private void txtAdminIDloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminIDloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminIDloginActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txtAdminIDlogin;
    private javax.swing.JPasswordField txtAdminpasswordlogin;
    // End of variables declaration//GEN-END:variables
}
