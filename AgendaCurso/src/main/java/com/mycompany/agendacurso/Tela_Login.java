/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agendacurso;

/**
 *
 * @author r.nunes
 */
public class Tela_Login extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Login
     */
    public Tela_Login() {
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

        JPanel_backg_TelaLogin = new javax.swing.JPanel();
        JPanel_bgContent_Tela_Inicial = new javax.swing.JPanel();
        jPanel_conteinerCampos_Tela_Inicial = new javax.swing.JPanel();
        jlbl_password_TelaLogin = new javax.swing.JLabel();
        jBtn_acessar_TelaLogin = new javax.swing.JButton();
        jlbl_Login_TelaLogin = new javax.swing.JLabel();
        jtxtf_campoLogin_TelaLogin = new javax.swing.JTextField();
        jpsw_campoPSW_Tela_Login = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel_backg_TelaLogin.setBackground(new java.awt.Color(38, 37, 38));

        JPanel_bgContent_Tela_Inicial.setBackground(new java.awt.Color(47, 63, 115));
        JPanel_bgContent_Tela_Inicial.setPreferredSize(new java.awt.Dimension(600, 550));

        jPanel_conteinerCampos_Tela_Inicial.setBackground(new java.awt.Color(47, 63, 115));
        jPanel_conteinerCampos_Tela_Inicial.setPreferredSize(new java.awt.Dimension(330, 300));

        jlbl_password_TelaLogin.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jlbl_password_TelaLogin.setText("Senha:");

        jBtn_acessar_TelaLogin.setBackground(new java.awt.Color(243, 236, 196));
        jBtn_acessar_TelaLogin.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jBtn_acessar_TelaLogin.setForeground(new java.awt.Color(0, 0, 0));
        jBtn_acessar_TelaLogin.setText("Acessar");
        jBtn_acessar_TelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_acessar_TelaLoginActionPerformed(evt);
            }
        });

        jlbl_Login_TelaLogin.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jlbl_Login_TelaLogin.setText("Login:");

        jtxtf_campoLogin_TelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_campoLogin_TelaLoginActionPerformed(evt);
            }
        });

        jpsw_campoPSW_Tela_Login.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel_conteinerCampos_Tela_InicialLayout = new javax.swing.GroupLayout(jPanel_conteinerCampos_Tela_Inicial);
        jPanel_conteinerCampos_Tela_Inicial.setLayout(jPanel_conteinerCampos_Tela_InicialLayout);
        jPanel_conteinerCampos_Tela_InicialLayout.setHorizontalGroup(
            jPanel_conteinerCampos_Tela_InicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_conteinerCampos_Tela_InicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_conteinerCampos_Tela_InicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtf_campoLogin_TelaLogin)
                    .addGroup(jPanel_conteinerCampos_Tela_InicialLayout.createSequentialGroup()
                        .addGroup(jPanel_conteinerCampos_Tela_InicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_password_TelaLogin)
                            .addComponent(jlbl_Login_TelaLogin))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jpsw_campoPSW_Tela_Login))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_conteinerCampos_Tela_InicialLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jBtn_acessar_TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel_conteinerCampos_Tela_InicialLayout.setVerticalGroup(
            jPanel_conteinerCampos_Tela_InicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_conteinerCampos_Tela_InicialLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbl_Login_TelaLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtf_campoLogin_TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbl_password_TelaLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpsw_campoPSW_Tela_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jBtn_acessar_TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPanel_bgContent_Tela_InicialLayout = new javax.swing.GroupLayout(JPanel_bgContent_Tela_Inicial);
        JPanel_bgContent_Tela_Inicial.setLayout(JPanel_bgContent_Tela_InicialLayout);
        JPanel_bgContent_Tela_InicialLayout.setHorizontalGroup(
            JPanel_bgContent_Tela_InicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_bgContent_Tela_InicialLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel_conteinerCampos_Tela_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_bgContent_Tela_InicialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        JPanel_bgContent_Tela_InicialLayout.setVerticalGroup(
            JPanel_bgContent_Tela_InicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_bgContent_Tela_InicialLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_conteinerCampos_Tela_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout JPanel_backg_TelaLoginLayout = new javax.swing.GroupLayout(JPanel_backg_TelaLogin);
        JPanel_backg_TelaLogin.setLayout(JPanel_backg_TelaLoginLayout);
        JPanel_backg_TelaLoginLayout.setHorizontalGroup(
            JPanel_backg_TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_backg_TelaLoginLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(JPanel_bgContent_Tela_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        JPanel_backg_TelaLoginLayout.setVerticalGroup(
            JPanel_backg_TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_backg_TelaLoginLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(JPanel_bgContent_Tela_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel_backg_TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel_backg_TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_acessar_TelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_acessar_TelaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_acessar_TelaLoginActionPerformed

    private void jtxtf_campoLogin_TelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_campoLogin_TelaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_campoLogin_TelaLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_backg_TelaLogin;
    private javax.swing.JPanel JPanel_bgContent_Tela_Inicial;
    private javax.swing.JButton jBtn_acessar_TelaLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_conteinerCampos_Tela_Inicial;
    private javax.swing.JLabel jlbl_Login_TelaLogin;
    private javax.swing.JLabel jlbl_password_TelaLogin;
    private javax.swing.JPasswordField jpsw_campoPSW_Tela_Login;
    private javax.swing.JTextField jtxtf_campoLogin_TelaLogin;
    // End of variables declaration//GEN-END:variables
}
