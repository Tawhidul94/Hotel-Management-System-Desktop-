
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import project.InsertUpdateDelate;
import project.ConnectionDemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sohag
 */
public class sinup extends javax.swing.JFrame {

    /**
     * Creates new form sinup
     */
    public sinup() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        semail = new javax.swing.JTextField();
        spass = new javax.swing.JPasswordField();
        Saddress = new javax.swing.JTextField();
        cb = new javax.swing.JComboBox<>();
        sinup = new javax.swing.JButton();
        login = new javax.swing.JButton();
        repass = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sinup");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 96, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 100, 30));

        Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Secuity Question");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 80, 30));

        sname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 290, 30));

        semail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(semail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 290, 30));

        spass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(spass, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 300, 30));

        Saddress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(Saddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 300, 30));

        cb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your first pet?", "What was your first car?", "What elementary school did you attend?", "What is the name of the town where you were born?" }));
        getContentPane().add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 300, 30));

        sinup.setBackground(new java.awt.Color(204, 0, 0));
        sinup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sinup.setForeground(new java.awt.Color(255, 255, 255));
        sinup.setText("sinup");
        sinup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinupActionPerformed(evt);
            }
        });
        getContentPane().add(sinup, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, -1));

        login.setBackground(new java.awt.Color(204, 0, 0));
        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));

        repass.setBackground(new java.awt.Color(204, 0, 0));
        repass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        repass.setForeground(new java.awt.Color(255, 255, 255));
        repass.setText("Forgrt Password?");
        repass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repassActionPerformed(evt);
            }
        });
        getContentPane().add(repass, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hotel Images & Icon/close.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 30, -1));

        jLabel7.setBackground(new java.awt.Color(204, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hotel Images & Icon/signup.PNG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sinupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinupActionPerformed
        // TODO add your handling code here:
         
       
        String name=sname.getText();
        String email=semail.getText();
         String password=spass.getText();
         String secuity=cb.getItemAt(cb.getSelectedIndex());
         String address=Saddress.getText();
         if(name.equals("")|| email.equals("")|| password.equals("") || secuity.equals("") || address.equals("") )
             JOptionPane.showMessageDialog(null, "Every field is requierd");
         else{
             
             
            String  Query = " insert into users values('"+name+"','" +email+"','"+ password+ "','"+ secuity+"','"+address+"')";
            
             InsertUpdateDelate.setData(Query, "Registation successfully");
             setVisible(false);
             new sinup().setVisible(true);
             
             
                 
             }        
         
        
         
         
        
        
    }//GEN-LAST:event_sinupActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        setVisible(false);
       new login().setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void repassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repassActionPerformed
        // TODO add your handling code here:
        setVisible(false);
       new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_repassActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "You are really want to close the application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed
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
            java.util.logging.Logger.getLogger(sinup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sinup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sinup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sinup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sinup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JTextField Saddress;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton login;
    private javax.swing.JButton repass;
    private javax.swing.JTextField semail;
    private javax.swing.JButton sinup;
    private javax.swing.JTextField sname;
    private javax.swing.JPasswordField spass;
    // End of variables declaration//GEN-END:variables
}
