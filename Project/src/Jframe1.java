
import Student.Student;
        
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitin
 */
public class Jframe1 extends javax.swing.JFrame {

    
    public Jframe1() {
        super("INPUT WINDOW");
        setLocation(300, 100);
        setSize(600,450);
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

        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Roll = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Specialization = new javax.swing.JTextField();
        PeriodOfRegistration = new javax.swing.JTextField();
        Cgpa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ThesisArea = new javax.swing.JTextField();
        ViewDetails = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JLabel14 = new javax.swing.JLabel();
        Credits = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Department = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("   NAME* :");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("ROLL NUMBER* :");

        Roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("COURSE *:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(course));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setText("Specialization");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setText("Period of reg.*");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("CGPA");

        Specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecializationActionPerformed(evt);
            }
        });

        PeriodOfRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeriodOfRegistrationActionPerformed(evt);
            }
        });

        Cgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CgpaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel7.setText("Thesis Area");

        ThesisArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThesisAreaActionPerformed(evt);
            }
        });

        ViewDetails.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 11)); // NOI18N
        ViewDetails.setText("VIEW DETAILS");
        ViewDetails.setToolTipText("View details");
        ViewDetails.setBorder(new javax.swing.border.MatteBorder(null));
        ViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Add.setText("ADD");
        Add.setBorder(null);
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel8.setText("note : Fields with * are compulsory");

        JLabel14.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        JLabel14.setText("CREDITS *");

        Credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditsActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 9)); // NOI18N
        jLabel9.setText("DEPARTMENT");

        Department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Roll, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(Credits))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PeriodOfRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Cgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ThesisArea, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Specialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PeriodOfRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cgpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThesisArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Credits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        int c=1;
        if(courseid.equals("UG"))
        {
            if(Roll.getText().isEmpty()||Name.getText().isEmpty()||PeriodOfRegistration.getText().isEmpty()||Credits.getText().isEmpty()||Cgpa.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Invalid Input","ERROR",JOptionPane.ERROR_MESSAGE);
                c=0;
            }
            else
                st.add(new UGstudent(roll,name,por,cgpa,credits,courseid));
        }
        else if(courseid.equals("PG"))
        {
            if(Roll.getText().isEmpty()||Department.getText().isEmpty()||Specialization.getText().isEmpty()||ThesisArea.getText().isEmpty()||Name.getText().isEmpty()||PeriodOfRegistration.getText().isEmpty()||Credits.getText().isEmpty()||Cgpa.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Invalid Input","ERROR",JOptionPane.ERROR_MESSAGE);
                c=0;
            }
            else
                st.add(new PGstudent(roll,name,dep,spe,por,cgpa,credits,thar,courseid));
        }
        else if(courseid.equals("UG+PG"))
        {
            if(Roll.getText().isEmpty()||Department.getText().isEmpty()||Specialization.getText().isEmpty()||ThesisArea.getText().isEmpty()||Name.getText().isEmpty()||PeriodOfRegistration.getText().isEmpty()||Credits.getText().isEmpty()||Cgpa.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Invalid Input","ERROR",JOptionPane.ERROR_MESSAGE);
                c=0;
            }
            else
                st.add(new UGPGstudent(roll,name,dep,spe,por,cgpa,credits,thar,courseid));
        }
        else if(courseid.equals("PhD"))
        {
            if(Roll.getText().isEmpty()||ThesisArea.getText().isEmpty()||Name.getText().isEmpty()||PeriodOfRegistration.getText().isEmpty()||Credits.getText().isEmpty()||Cgpa.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Invalid Input","ERROR",JOptionPane.ERROR_MESSAGE);
                c=0;
            }
            else
                st.add(new PhDstudent(roll,name,por,credits,thar,courseid));
        }
        else if(courseid.equals("PG+PhD"))
        {
            if(Roll.getText().isEmpty()||ThesisArea.getText().isEmpty()||Name.getText().isEmpty()||PeriodOfRegistration.getText().isEmpty()||Credits.getText().isEmpty()||Cgpa.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Invalid Input","ERROR",JOptionPane.ERROR_MESSAGE);
                c=0;
            }
            else
                  st.add(new PGPhDstudent(roll,name,por,cgpa,credits,thar,courseid));
        }
        if(c==1)
        {
            Roll.setText("");
            Name.setText("");
            PeriodOfRegistration.setText("");
            Cgpa.setText("");
            Credits.setText("");
            ThesisArea.setText("");
            Specialization.setText("");
            Department.setText("");
            courseid = course[jComboBox1.getSelectedIndex()];
        }
    }//GEN-LAST:event_AddActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
        name = Name.getText();
        System.out.println(name);
    }//GEN-LAST:event_NameActionPerformed

    private void RollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollActionPerformed
        // TODO add your handling code here:
        roll = Roll.getText();
        if(Pattern.matches("(IIT|ISM|IRM|LIT|ITM|BIM|ICM|IWM|IIM)201[3-7][0-1][0-9][0-9]",roll))
        {
            System.out.println(roll);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid Roll Number","ERROR",JOptionPane.ERROR_MESSAGE);
            Roll.setText("");
        }
    }//GEN-LAST:event_RollActionPerformed

    private void SpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecializationActionPerformed
        // TODO add your handling code here:
        spe = Specialization.getText();
        System.out.println(spe);
    }//GEN-LAST:event_SpecializationActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        courseid = course[jComboBox1.getSelectedIndex()];
        System.out.println(courseid);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void PeriodOfRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeriodOfRegistrationActionPerformed
        // TODO add your handling code here:
        String pors = PeriodOfRegistration.getText();
        if(pors.matches("[0-9]*"))
        {
           por = Integer.parseInt(pors);
           System.out.println(por+"");
        }
        else
        {
           JOptionPane.showMessageDialog(this, "Invalid Period of registration","ERROR",JOptionPane.ERROR_MESSAGE);
            PeriodOfRegistration.setText(""); 
        }
    }//GEN-LAST:event_PeriodOfRegistrationActionPerformed

    private void CgpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CgpaActionPerformed
        // TODO add your handling code here:
        String cgpas = Cgpa.getText();
        if(Pattern.matches("[0-9]|10",cgpas))
        {
            cgpa = Integer.parseInt(cgpas);
            System.out.println(cgpa+"");
        }
        else
        {
             JOptionPane.showMessageDialog(this, "Invalid CGPA","ERROR",JOptionPane.ERROR_MESSAGE);
             Cgpa.setText("");
        }
    }//GEN-LAST:event_CgpaActionPerformed

    private void ThesisAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThesisAreaActionPerformed
        // TODO add your handling code here:
        thar = ThesisArea.getText();
        System.out.println(thar);
    }//GEN-LAST:event_ThesisAreaActionPerformed

    private void ViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsActionPerformed
        // TODO add your handling code here:
        if(st.size()==0)
        {
            JOptionPane.showMessageDialog(null,"No Records to be shown!!");
        }
        else
        {
            Jframe2  jf2 = new Jframe2(st);
            jf2.setVisible(true);
        }
    }//GEN-LAST:event_ViewDetailsActionPerformed

    private void CreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditsActionPerformed
        // TODO add your handling code here:
        String creditss =Credits.getText();
        if(creditss.matches("[0-9]*"))
        {
           credits = Integer.parseInt(creditss);
           System.out.println(credits+""); 
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid Credits","ERROR",JOptionPane.ERROR_MESSAGE);
            Credits.setText("");    
        }
    }//GEN-LAST:event_CreditsActionPerformed

    private void DepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentActionPerformed
        // TODO add your handling code here:
        dep = Department.getText();
        System.out.println(dep);
    }//GEN-LAST:event_DepartmentActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe1().setVisible(true);
            }
        });
    }
    private  String course[] ={"UG","PG","UG+PG","PhD","PG+PhD"};
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Cgpa;
    private javax.swing.JTextField Credits;
    private javax.swing.JTextField Department;
    private javax.swing.JLabel JLabel14;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PeriodOfRegistration;
    private javax.swing.JTextField Roll;
    private javax.swing.JTextField Specialization;
    private javax.swing.JTextField ThesisArea;
    private javax.swing.JButton ViewDetails;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    JOptionPane jp = new JOptionPane("INVALID INPUTS");
    ArrayList<Student> st = new ArrayList<Student>();
    private String name;
    private String roll;
    private String courseid="UG";
    private String spe;
    private String thar;
    private int cgpa;
    private int por;
    private int credits;
    private String dep;
}