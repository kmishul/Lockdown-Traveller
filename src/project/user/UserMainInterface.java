/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.user;

/**
 *
 * @author Folio
 */
public class UserMainInterface extends javax.swing.JFrame {

    /**
     * Creates new form UserMainInterface
     */
    public UserMainInterface() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panUserHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panUserviewtrains = new javax.swing.JPanel();
        panUserSearchtrains = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserStartstation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUserStopstation = new javax.swing.JTextField();
        btnUsersearchtrain = new javax.swing.JButton();
        panUserReserveseat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUserssnreserveseat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUsertrainnumreserveseat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUserclassreserveseat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUsernosreserveseat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnUserreserveseat = new javax.swing.JButton();
        panUserCancelbooking = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUserssncancelbooking = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtUsertrainnumcancelbooking = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUserticketnocancelbooking = new javax.swing.JTextField();
        btnUsercancelbooking = new javax.swing.JButton();
        panUserAlltravels = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        panUserTicket = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Welcome to MMS Railway Enquiry System");

        javax.swing.GroupLayout panUserHomeLayout = new javax.swing.GroupLayout(panUserHome);
        panUserHome.setLayout(panUserHomeLayout);
        panUserHomeLayout.setHorizontalGroup(
            panUserHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserHomeLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panUserHomeLayout.setVerticalGroup(
            panUserHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserHomeLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Home", panUserHome);

        javax.swing.GroupLayout panUserviewtrainsLayout = new javax.swing.GroupLayout(panUserviewtrains);
        panUserviewtrains.setLayout(panUserviewtrainsLayout);
        panUserviewtrainsLayout.setHorizontalGroup(
            panUserviewtrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        panUserviewtrainsLayout.setVerticalGroup(
            panUserviewtrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("View Trains", panUserviewtrains);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Search Trains Between Two Stations");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("From:");

        txtUserStartstation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserStartstationActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("To:");

        txtUserStopstation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserStopstationActionPerformed(evt);
            }
        });

        btnUsersearchtrain.setText("Search");

        javax.swing.GroupLayout panUserSearchtrainsLayout = new javax.swing.GroupLayout(panUserSearchtrains);
        panUserSearchtrains.setLayout(panUserSearchtrainsLayout);
        panUserSearchtrainsLayout.setHorizontalGroup(
            panUserSearchtrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserSearchtrainsLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addGroup(panUserSearchtrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserSearchtrainsLayout.createSequentialGroup()
                        .addGroup(panUserSearchtrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panUserSearchtrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserStartstation, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserStopstation, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserSearchtrainsLayout.createSequentialGroup()
                        .addComponent(btnUsersearchtrain)
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserSearchtrainsLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
        );
        panUserSearchtrainsLayout.setVerticalGroup(
            panUserSearchtrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserSearchtrainsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(panUserSearchtrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserStartstation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panUserSearchtrainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUserStopstation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnUsersearchtrain)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Search Trains", panUserSearchtrains);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Reserve Seats in Train");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("User ID:");

        txtUserssnreserveseat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserssnreserveseatActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Train Num:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Class:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("No. of Seats:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Date of Travel:");

        btnUserreserveseat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUserreserveseat.setText("Reserve Seat");

        javax.swing.GroupLayout panUserReserveseatLayout = new javax.swing.GroupLayout(panUserReserveseat);
        panUserReserveseat.setLayout(panUserReserveseatLayout);
        panUserReserveseatLayout.setHorizontalGroup(
            panUserReserveseatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserReserveseatLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(panUserReserveseatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(panUserReserveseatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserssnreserveseat)
                    .addComponent(txtUsertrainnumreserveseat)
                    .addComponent(txtUserclassreserveseat)
                    .addComponent(txtUsernosreserveseat, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserReserveseatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUserreserveseat)
                .addGap(303, 303, 303))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserReserveseatLayout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        panUserReserveseatLayout.setVerticalGroup(
            panUserReserveseatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserReserveseatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panUserReserveseatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserssnreserveseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panUserReserveseatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUsertrainnumreserveseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panUserReserveseatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUserclassreserveseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panUserReserveseatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtUsernosreserveseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(40, 40, 40)
                .addComponent(btnUserreserveseat)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reserve Seat", panUserReserveseat);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Cancel Bookings");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("User SSN:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Train Num:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Ticket No.:");

        btnUsercancelbooking.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUsercancelbooking.setText("Cancel Booking");

        javax.swing.GroupLayout panUserCancelbookingLayout = new javax.swing.GroupLayout(panUserCancelbooking);
        panUserCancelbooking.setLayout(panUserCancelbookingLayout);
        panUserCancelbookingLayout.setHorizontalGroup(
            panUserCancelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserCancelbookingLayout.createSequentialGroup()
                .addGroup(panUserCancelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panUserCancelbookingLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel11))
                    .addGroup(panUserCancelbookingLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(panUserCancelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(panUserCancelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserssncancelbooking)
                            .addComponent(txtUsertrainnumcancelbooking)
                            .addComponent(txtUserticketnocancelbooking, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserCancelbookingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUsercancelbooking)
                .addGap(320, 320, 320))
        );
        panUserCancelbookingLayout.setVerticalGroup(
            panUserCancelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserCancelbookingLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(panUserCancelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(txtUserssncancelbooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panUserCancelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtUsertrainnumcancelbooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panUserCancelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtUserticketnocancelbooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnUsercancelbooking)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cancel Booking", panUserCancelbooking);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("All Past And Upcoming Travels");

        javax.swing.GroupLayout panUserAlltravelsLayout = new javax.swing.GroupLayout(panUserAlltravels);
        panUserAlltravels.setLayout(panUserAlltravelsLayout);
        panUserAlltravelsLayout.setHorizontalGroup(
            panUserAlltravelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserAlltravelsLayout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(236, 236, 236))
        );
        panUserAlltravelsLayout.setVerticalGroup(
            panUserAlltravelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserAlltravelsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("All Travels", panUserAlltravels);

        javax.swing.GroupLayout panUserTicketLayout = new javax.swing.GroupLayout(panUserTicket);
        panUserTicket.setLayout(panUserTicketLayout);
        panUserTicketLayout.setHorizontalGroup(
            panUserTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        panUserTicketLayout.setVerticalGroup(
            panUserTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tickets", panUserTicket);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserStartstationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserStartstationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserStartstationActionPerformed

    private void txtUserStopstationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserStopstationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserStopstationActionPerformed

    private void txtUserssnreserveseatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserssnreserveseatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserssnreserveseatActionPerformed

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
            java.util.logging.Logger.getLogger(UserMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsercancelbooking;
    private javax.swing.JButton btnUserreserveseat;
    private javax.swing.JButton btnUsersearchtrain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panUserAlltravels;
    private javax.swing.JPanel panUserCancelbooking;
    private javax.swing.JPanel panUserHome;
    private javax.swing.JPanel panUserReserveseat;
    private javax.swing.JPanel panUserSearchtrains;
    private javax.swing.JPanel panUserTicket;
    private javax.swing.JPanel panUserviewtrains;
    private javax.swing.JTextField txtUserStartstation;
    private javax.swing.JTextField txtUserStopstation;
    private javax.swing.JTextField txtUserclassreserveseat;
    private javax.swing.JTextField txtUsernosreserveseat;
    private javax.swing.JTextField txtUserssncancelbooking;
    private javax.swing.JTextField txtUserssnreserveseat;
    private javax.swing.JTextField txtUserticketnocancelbooking;
    private javax.swing.JTextField txtUsertrainnumcancelbooking;
    private javax.swing.JTextField txtUsertrainnumreserveseat;
    // End of variables declaration//GEN-END:variables
}
