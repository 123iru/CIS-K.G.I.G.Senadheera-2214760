package UI;

 
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class REGISTER1 extends javax.swing.JFrame {
 
 Connection con1 = null;
     

    public REGISTER1() {
        initComponents();
        
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtcon = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtpass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        flabe5 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText(" Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 107, 27));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText(" Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 107, 37));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText(" Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 87, 26));

        txtemail.setText(" ");
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 212, 37));

        txtcon.setText(" ");
        txtcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconActionPerformed(evt);
            }
        });
        getContentPane().add(txtcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 212, 37));

        txtname.setText(" ");
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 212, 37));

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton2.setText(" Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        txtpass.setText(" ");
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 212, 37));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, 37));

        flabe5.setText(" ");
        getContentPane().add(flabe5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 290, 27));

        back.setBackground(new java.awt.Color(255, 153, 51));
        back.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        back.setText(" Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\iruda\\Documents\\NetBeansProjects\\CIS-K.G.I.G.Senadheera-2214760\\ICON\\3.png")); // NOI18N
        jLabel5.setText(" ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String name, email, password;

         name = txtname.getText();
email = txtemail.getText();
String PATTERN2 = "^[a-zA-Z0-9]{0,50}[@][a-zA-Z]{0,10}[.][a-zA-Z]{0,5}$";
Pattern patt2 = Pattern.compile(PATTERN2);
Matcher match2 = patt2.matcher(txtemail.getText());
password = txtcon.getText();
String conpassword = txtcon.getText();

if (name.trim().equals("")) {
    JOptionPane.showMessageDialog(null, "Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
} else if (email.trim().equals("")) {
    JOptionPane.showMessageDialog(null, "Email cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
} else if (!match2.matches()) {
    JOptionPane.showMessageDialog(null, "Email is in an invalid format", "Error", JOptionPane.ERROR_MESSAGE);
} else if (password.trim().equals("")) {
    JOptionPane.showMessageDialog(null, "Password cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
} else if (txtpass.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "enter pass word");
        } else   if (txtpass.getText().equals(txtcon.getText()) == false) {
            JOptionPane.showMessageDialog(this, "password not matched");
        } else {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con1 = DriverManager.getConnection("jdbc:mysql://localhost/game", "root", "");

        Statement stmt1 = con1.createStatement();
        String query1 = "INSERT INTO register1(name,email, password) VALUES ('" + name + "','" + email + "', '" + password + "')";
        stmt1.executeUpdate(query1);

        level m = new level();
        m.setVisible(true);
    } catch (Exception e) {
        System.out.println(e);
    }
}


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        String PATTERN = "^[a-zA-Z]+";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtname.getText());
        if (!match.matches()) {
            flabe5.setText("You can only enter letters");
        } else {
            flabe5.setText(null);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameKeyReleased

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        LOGIN d = new LOGIN();
        d.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTER1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTER1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTER1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTER1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel flabe5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtcon;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
