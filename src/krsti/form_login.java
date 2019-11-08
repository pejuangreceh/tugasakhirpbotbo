
package krsti;
import java.sql.*;
import javax.swing.JOptionPane;
import koneksi.konek;

public class form_login extends javax.swing.JFrame {
    konek xxx;
    
    public form_login() {
        initComponents();
        xxx = new konek();
        xxx.Class();
        this.setLocationRelativeTo(null);
    }
    private void masuk(){
        try{
            String username = fuser.getText();
            String password = new String(fpass.getPassword());
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT * FROM tb_user WHERE user = '"+username+"' && pass = '"+password+"'" ;
            xxx.rr = xxx.ss.executeQuery(sql);
                if(xxx.rr.next()){
                    if(fpass.getText().equals(xxx.rr.getString("pass"))){
                        new home().show();
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "Password salah silahkan coba lagi !!");
                        fpass.setText("");
                        fpass.requestFocus();
                    }
                }
                else{
                     JOptionPane.showMessageDialog(null, "LOGIN GAGAL!!");
                }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fuser = new javax.swing.JTextField();
        fpass = new javax.swing.JPasswordField();
        flogin = new javax.swing.JButton();
        fkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setText("SILAHKAN LOGIN");

        fuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuserActionPerformed(evt);
            }
        });

        fpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpassActionPerformed(evt);
            }
        });

        flogin.setText("LOGIN");
        flogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floginActionPerformed(evt);
            }
        });

        fkeluar.setText("KELUAR");
        fkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(flogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fkeluar))
                    .addComponent(jLabel3)
                    .addComponent(fuser)
                    .addComponent(fpass))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flogin)
                    .addComponent(fkeluar))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuserActionPerformed

    private void fpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fpassActionPerformed

    private void floginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floginActionPerformed
        // TODO add your handling code here:
        masuk();
    }//GEN-LAST:event_floginActionPerformed

    private void fkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_fkeluarActionPerformed

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
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fkeluar;
    private javax.swing.JButton flogin;
    private javax.swing.JPasswordField fpass;
    private javax.swing.JTextField fuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
