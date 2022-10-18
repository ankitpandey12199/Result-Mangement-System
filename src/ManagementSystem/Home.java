package ManagementSystem;

import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Student = new javax.swing.JButton();
        Admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESULT MANAGEMENT SYSTEM");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-schoolboy-at-a-desk-30.png"))); // NOI18N
        Student.setText("STUDENT");
        Student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Student.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        getContentPane().add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 150, 50));

        Admin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-admin-settings-male-30.png"))); // NOI18N
        Admin.setText("ADMIN");
        Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 150, 50));

        jLabel1.setDisplayedMnemonic('R');
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ankit\\Documents\\NetBeansProjects\\Result Manangement System\\Icons_ResultManagement\\Icons_ResultManagement\\schoolPic1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        setVisible(false);
        StudentHomePage frame=new StudentHomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_StudentActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
        String pass=JOptionPane.showInputDialog(null, "ENTER THE PASSWORD", "");
        if(pass.equals("ANKIT1234")){
         setVisible(false);
        AdminHomePage frame=new AdminHomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);  
    }//GEN-LAST:event_AdminActionPerformed
else
        {
            JOptionPane.showMessageDialog(null, "INVALID PASS WORD TRY AGAIN!");
        }
    }
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Home frame=new Home();
                 frame.setVisible(true);
                 frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton Student;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
