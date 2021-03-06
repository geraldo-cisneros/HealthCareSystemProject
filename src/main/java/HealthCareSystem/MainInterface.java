/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareSystem;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author geraldocisneros
 */
public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        Toolkit tk = getToolkit();
        Dimension size = tk.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
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
        currentlyLoggedIn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        updateApptButton1 = new javax.swing.JButton();
        makePaymentButton = new javax.swing.JButton();
        newApptButton = new javax.swing.JButton();
        cancelApptButton = new javax.swing.JButton();
        updateMeasurementsButton = new javax.swing.JButton();
        patientTreatmentButton = new javax.swing.JButton();
        checkInButton = new javax.swing.JButton();
        viewDailyReportButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clearScheduleButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Health Care System");

        currentlyLoggedIn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentlyLoggedIn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "User ID", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentlyLoggedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(currentlyLoggedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        updateApptButton1.setText("Change Appointment");
        updateApptButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateApptButton1ActionPerformed(evt);
            }
        });

        makePaymentButton.setText("Make Payment");
        makePaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makePaymentButtonActionPerformed(evt);
            }
        });

        newApptButton.setText("New Appointment");
        newApptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newApptButtonActionPerformed(evt);
            }
        });

        cancelApptButton.setText("Cancel Appointment");
        cancelApptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelApptButtonActionPerformed(evt);
            }
        });

        updateMeasurementsButton.setText("Measurements/Reason");
        updateMeasurementsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMeasurementsButtonActionPerformed(evt);
            }
        });

        patientTreatmentButton.setText("Patient Treatment");
        patientTreatmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTreatmentButtonActionPerformed(evt);
            }
        });

        checkInButton.setText("Patient Lookup");
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });

        viewDailyReportButton.setText("View Daily Report");
        viewDailyReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDailyReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateMeasurementsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientTreatmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewDailyReportButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(makePaymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelApptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateApptButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newApptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(newApptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateApptButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelApptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateMeasurementsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(patientTreatmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(makePaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewDailyReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Switch User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        clearScheduleButton.setText("Clear Schedule");
        clearScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearScheduleButtonActionPerformed(evt);
            }
        });

        jButton2.setText("View Schedule");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearScheduleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearScheduleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
                // TODO add your handling code here:
                EmployeeLogin e = new EmployeeLogin();
                e.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void newApptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newApptButtonActionPerformed
        // TODO add your handling code here:
        NewAppointment n = new NewAppointment();
        n.setVisible(true);
    }//GEN-LAST:event_newApptButtonActionPerformed

    private void cancelApptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelApptButtonActionPerformed
        // TODO add your handling code here:
        CancelAppointment ca = new CancelAppointment();
        ca.setVisible(true);
    }//GEN-LAST:event_cancelApptButtonActionPerformed

    private void updateApptButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateApptButton1ActionPerformed
        // TODO add your handling code here:
        ChangeAppointment ca = new ChangeAppointment();
        ca.setVisible(true);
    }//GEN-LAST:event_updateApptButton1ActionPerformed

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed
        // TODO add your handling code here:
        CheckIn pc = new CheckIn();
        pc.setVisible(true);
    }//GEN-LAST:event_checkInButtonActionPerformed

    private void updateMeasurementsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMeasurementsButtonActionPerformed
        // TODO add your handling code here:
        Boolean accessGranted = EmployeeLogin.checkCredentials(1, 4);
       if (accessGranted){
           UpdateMeasurements um = new UpdateMeasurements();
           um.setVisible(true);
       }
       else{
           JOptionPane.showMessageDialog(null, "Access Denied");
       }
    }//GEN-LAST:event_updateMeasurementsButtonActionPerformed

    private void makePaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makePaymentButtonActionPerformed
        // TODO add your handling code here:
        MakePayment mp = new MakePayment();
        Boolean accessGranted = EmployeeLogin.checkCredentials(0, 2);
       if (accessGranted){
          mp.setVisible(true);
       }
       else{
           JOptionPane.showMessageDialog(null, "Access Denied");
       }
    }//GEN-LAST:event_makePaymentButtonActionPerformed

    private void patientTreatmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTreatmentButtonActionPerformed
        // TODO add your handling code here:
       Boolean accessGranted = EmployeeLogin.checkCredentials(2, 4);
       if (accessGranted){
           TreatmentRecord tr = new TreatmentRecord();
           tr.setVisible(true);
       }
       else{
           JOptionPane.showMessageDialog(null, "Access Denied");
       }
    }//GEN-LAST:event_patientTreatmentButtonActionPerformed

    private void viewDailyReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDailyReportButtonActionPerformed
        // TODO add your handling code here:
        Boolean accessGranted = EmployeeLogin.checkCredentials(3, 5);
        if (accessGranted){
            try {
                File file = new File("src/main/java/HealthCareSystem/dailyReport.txt");
                
                //first check if Desktop is supported by Platform or not
                if(!Desktop.isDesktopSupported()){
                    System.out.println("Desktop is not supported");
                    return;
                }
                
                Desktop desktop = Desktop.getDesktop();
                if(file.exists()) desktop.open(file);
            } catch (IOException ex) {
                Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
    }//GEN-LAST:event_viewDailyReportButtonActionPerformed

    private void clearScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearScheduleButtonActionPerformed
        // TODO add your handling code here:
        LocalDate date = LocalDate.now();
        String today = date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        clearNoShowAppointments(today);
        
    }//GEN-LAST:event_clearScheduleButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EmployeeLogin e = new EmployeeLogin();
                e.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
                File file = new File("src/main/java/HealthCareSystem/appointments.txt");
                
                //first check if Desktop is supported by Platform or not
                if(!Desktop.isDesktopSupported()){
                    System.out.println("Desktop is not supported");
                    return;
                }
                
                Desktop desktop = Desktop.getDesktop();
                if(file.exists()) desktop.open(file);
            } catch (IOException ex) {
                Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void clearNoShowAppointments(String d){
        try {   
                String temp = "src/main/java/HealthCareSystem/temp.txt";
                String out = "src/main/java/HealthCareSystem/output.txt";
                String appts = "src/main/java/HealthCareSystem/appointments.txt";
                File f = new File(temp);
                File appointments = new File(appts);
                Scanner myReader = new Scanner(appointments);
                String line;
                //String appt = first + ' ' + last + ' ' + doc + ' ' + d + ' ' + t;
                Boolean found = false;
                
                while (myReader.hasNextLine()) {
                    line = myReader.nextLine();
                    found = true;
                    if ((line.split(" ")[4]).compareTo(d) < 0 || (line.split(" ")[4]).compareTo(d) == 0){
                        ViewPatientChart.storeWriteData(line + "\n", temp, false);
                        try {
                            CancelAppointment.updateDataFile(out, appts, temp);
                        } catch (IOException ex) {
                            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                
                
                
                
                if (found == false){
                    JOptionPane.showMessageDialog(null, "Appointment not Found");
                }
            myReader.close();
            } catch (FileNotFoundException e) {
                  System.out.println("An error occurred.");
                  e.printStackTrace();
            }
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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelApptButton;
    private javax.swing.JButton checkInButton;
    private javax.swing.JButton clearScheduleButton;
    public javax.swing.JLabel currentlyLoggedIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton makePaymentButton;
    private javax.swing.JButton newApptButton;
    private javax.swing.JButton patientTreatmentButton;
    private javax.swing.JButton updateApptButton1;
    private javax.swing.JButton updateMeasurementsButton;
    private javax.swing.JButton viewDailyReportButton;
    // End of variables declaration//GEN-END:variables
}
