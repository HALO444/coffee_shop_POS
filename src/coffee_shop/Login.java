/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee_shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HALO44O
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        profilepic = new javax.swing.JLabel();
        loginb = new javax.swing.JLabel();
        clearb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 614));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 614));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 614));
        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(null);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(660, 200, 320, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("USERNAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 220, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(520, 310, 90, 30);

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(null);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(670, 290, 310, 70);

        profilepic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bear1.png"))); // NOI18N
        jPanel1.add(profilepic);
        profilepic.setBounds(650, 10, 194, 180);

        loginb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/login1.png"))); // NOI18N
        loginb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginbMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginbMouseReleased(evt);
            }
        });
        jPanel1.add(loginb);
        loginb.setBounds(510, 390, 230, 90);

        clearb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clear1.png"))); // NOI18N
        clearb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearbMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearbMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearbMouseReleased(evt);
            }
        });
        jPanel1.add(clearb);
        clearb.setBounds(750, 390, 230, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 1030, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1020)/2, (screenSize.height-614)/2, 1020, 614);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/bear22.png"));
        profilepic.setIcon(ii);
    }//GEN-LAST:event_usernameMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
         ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/baer3.png"));
        profilepic.setIcon(ii);
    }//GEN-LAST:event_passwordMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/bear1.png"));
        profilepic.setIcon(ii);
    }//GEN-LAST:event_formMouseClicked

    private void loginbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/login2.png"));
        loginb.setIcon(ii);
    }//GEN-LAST:event_loginbMouseEntered

    private void loginbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbMouseExited
         ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/login1.png"));
         loginb.setIcon(ii);
    }//GEN-LAST:event_loginbMouseExited

    private void loginbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbMousePressed
         ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/login3.png"));
         loginb.setIcon(ii);
    }//GEN-LAST:event_loginbMousePressed

    private void loginbMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbMouseReleased
       ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/login2.png"));
        loginb.setIcon(ii);
    }//GEN-LAST:event_loginbMouseReleased

    private void clearbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/clear2.png"));
        clearb.setIcon(ii);
    }//GEN-LAST:event_clearbMouseEntered

    private void clearbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/clear1.png"));
        clearb.setIcon(ii);
    }//GEN-LAST:event_clearbMouseExited

    private void clearbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/clear3.png"));
        clearb.setIcon(ii);
    }//GEN-LAST:event_clearbMousePressed

    private void clearbMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/clear2.png"));
        clearb.setIcon(ii);
    }//GEN-LAST:event_clearbMouseReleased

    private void clearbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbMouseClicked
       username.setText("");
       password.setText("");
       ImageIcon ii = new ImageIcon(getClass().getResource("/IMG/bear1.png"));
       profilepic.setIcon(ii);
    }//GEN-LAST:event_clearbMouseClicked

    private void loginbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbMouseClicked
         String user1 = username.getText();
        String pass = password.getText();
       
        
        
         if(user1.isEmpty()){
           login_user_error jf2 = new   login_user_error();
            jf2.show();
             
       }else if(pass.isEmpty()){
           login_pass_error jf2 = new   login_pass_error();
            jf2.show();
         
       }else{
           //db connection
            String url = "jdbc:mysql://localhost:3306/coffee_shop";
            String user =  "root";
            String dbpassword = "1234";  
            try {
                Class.forName("com.mysql.jdbc.Driver");       
                Connection con = DriverManager.getConnection(url, user, dbpassword);
                Statement st = con.createStatement(); 
                ResultSet result = st.executeQuery("SELECT * FROM user_login WHERE user='"+user1+"'");
                
                if(result.first()){
                    if(result.getString("password").equals(pass)){
                         login_success jf2 = new login_success();
                         jf2.show();
                         dispose();
                    }else{
                      login_user_invalid jf2 = new   login_user_invalid();
                      jf2.show();
                    }
                }else{
                    login_pass_invalid jf2 = new   login_pass_invalid();
                    jf2.show();
                }
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
       }
        
    }//GEN-LAST:event_loginbMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clearb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginb;
    private javax.swing.JTextField password;
    private javax.swing.JLabel profilepic;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
