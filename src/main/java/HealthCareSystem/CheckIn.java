/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author geraldocisneros
 */
public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckIn
     */
    public CheckIn() {
        initComponents();
    }
    
     public CheckIn(String id) {
        initComponents();
        
        String holder = id;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pFName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pLName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        birthdate = new javax.swing.JFormattedTextField();
        FindChart = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        checkIn.setText("Check In");
        checkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient First Name");

        pFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pFNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Patient Last Name");

        jLabel4.setText("Patient Birth Date");

        birthdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("M/d/yyyy"))));

        FindChart.setText("View Patient Chart");
        FindChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindChartActionPerformed(evt);
            }
        });

        jLabel5.setText("Find Patient");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(121, 121, 121)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(8, 8, 8)))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pFName)
                            .addComponent(pLName)
                            .addComponent(birthdate, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(checkIn)
                        .addGap(41, 41, 41)
                        .addComponent(FindChart))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel5)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel5)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindChart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pFNameActionPerformed

    private void FindChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindChartActionPerformed
        // TODO add your handling code here:
        String first = pFName.getText();
        String last = pLName.getText();
        String bday = birthdate.getText();
       
        Boolean accessGranted = EmployeeLogin.checkCredentials(0, 4);
        if (accessGranted == true){
            try {
                File appointments = new File("src/main/java/HealthCareSystem/patientCharts.txt");
                Scanner myReader = new Scanner(appointments);
                String line;
                String appt = first + " " + last + " " + bday;
                Boolean found = false;
                while (myReader.hasNextLine()) {
                    line = myReader.nextLine();
                    if (line.contains(appt)){
                        found = true;
                        myReader.close();
                        JOptionPane.showMessageDialog(null, "Appointment Found");
                        ViewPatientChart.showPatientChart(appt);
                        this.dispose();                     
                    }
                }
                if (found == false){
                    Integer selection = JOptionPane.showConfirmDialog(null, "Patient chart not found, would you like to create a new  patient chart?");
                    if (selection == 0){
                        PatientChart pc = new PatientChart();
                        pc.setVisible(true);
                        this.dispose();
                    }
                    else if(selection == 2){
                        this.dispose();
                    }
                    
                }
            myReader.close();
            } catch (FileNotFoundException e) {
                  System.out.println("An error occurred.");
                  e.printStackTrace();
            }  
        }
        else{
            JOptionPane.showMessageDialog(null, "User does not have required permissions to access the requested information");
        } 
    }//GEN-LAST:event_FindChartActionPerformed

    private void checkInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInActionPerformed
        // TODO add your handling code here:
        //create bill
        String appts = "src/main/java/HealthCareSystem/appointments.txt";
        String outfile = "src/main/java/HealthCareSystem/output.txt";
        String temp = "src/main/java/HealthCareSystem/temp.txt";
        String match = pFName.getText() + " " + pLName.getText();
        
        Boolean found = TreatmentRecord.recordExists(match, appts);
        if(found){
            try {
                String appt = CancelAppointment.getAppointment(match);
                ViewPatientChart.storeWriteData(appt, temp, false);
                CancelAppointment.updateDataFile(outfile, appts, temp);
                appts = "src/main/java/HealthCareSystem/docAvailability.txt";
                appt = appt.split(" ")[3] + " " + appt.split(" ")[4] + appt.split(" ")[5] + appt.split(" ")[6];
                ViewPatientChart.storeWriteData(appt, temp, false);
                CancelAppointment.updateDataFile(outfile, appts, temp);
            } catch (IOException ex) {
                Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            //generate billing info
            //BillingInfo bi = new BillingInfo;
            //bi.setVisible(true);
        }
        else{
            Integer selection = JOptionPane.showConfirmDialog(null, "Appointment not found, would you like to schedule a new appointment?");
            if(selection == 0){
                NewAppointment na = new NewAppointment();
                na.setVisible(true);
            }
            if(selection == 2){
                this.dispose();
            }
                
        }
        
    }//GEN-LAST:event_checkInActionPerformed
    public static void generatePaymentInfo(){
       CheckIn ci = new CheckIn();
       String match = ci.pFName.getText() + " " + ci.pLName.getText();
       String appt = CancelAppointment.getAppointment(match);
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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FindChart;
    private javax.swing.JFormattedTextField birthdate;
    private javax.swing.JButton checkIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pFName;
    private javax.swing.JTextField pLName;
    // End of variables declaration//GEN-END:variables
}