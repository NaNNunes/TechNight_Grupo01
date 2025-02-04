/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas_Iniciais;

import Telas_Equipe.Tela_Cadastro_Equipe;
import Telas_Equipe.Tela_Pesquisa_Equipe;
import Telas_Funcionario.Tela_Cadastro_Funcionario;
import Telas_Funcionario.Tela_Pesquisar_Funcionario;
import Telas_Iniciais.Tela_Login;
import Telas_Treinamento.Tela_Alocar_Treinamento;
import Telas_Treinamento.Tela_Cadastro_Treinamento;
import Telas_Treinamento.Tela_Pesquisar_Treinamento;
import Telas_configuracao.Popup_Opcoes;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Tela_DashBoard_Inicial extends javax.swing.JFrame {

    private final String tipoUsuario;

    /**
     * Creates new form Tela_DashBoard_Inicial
     */
    public Tela_DashBoard_Inicial(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Jbtn_AlocarTreino = new javax.swing.JButton();
        Jbtn_AlocarFuncEqp = new javax.swing.JButton();
        JPanel_BarraLateral = new javax.swing.JPanel();
        Jbtn_LogoutButton_BarraLateral = new javax.swing.JButton();
        JPanel_logo_Barra_Lateral = new javax.swing.JPanel();
        Jlbl_Logo_BarraLateral_Eqp = new javax.swing.JLabel();
        JPanel_contentFuncionarioButton = new javax.swing.JPanel();
        Jbtn_IconeFuncionario_BarraLateral_CadEqp = new javax.swing.JButton();
        Jcmbx_Funcionario_BarraLateral = new javax.swing.JComboBox<>();
        JPanel_contentEquipe_BarraLateral = new javax.swing.JPanel();
        Jbtn_iconeEquipe_BarraLateral_CadEqp = new javax.swing.JButton();
        Jcmbx_Equipe_BarraLateral = new javax.swing.JComboBox<>();
        Jbtn_trocarUsuario_BarraLateral = new javax.swing.JButton();
        Jbtn_Configuração_BarraLateral = new javax.swing.JButton();
        Jpanel_contentTreinamento_Barra_Lateral = new javax.swing.JPanel();
        Jbtn_iconeTreinamento_BarraLateral_CadEqp = new javax.swing.JButton();
        Jcmbx_Treinamento_BarraLateral = new javax.swing.JComboBox<>();
        Jlbl_TipoUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(243, 236, 196));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 797));

        Jbtn_AlocarTreino.setText("Treinar Equipe");
        Jbtn_AlocarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_AlocarTreinoActionPerformed(evt);
            }
        });

        Jbtn_AlocarFuncEqp.setText("Alocar Funcionários");
        Jbtn_AlocarFuncEqp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_AlocarFuncEqpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(Jbtn_AlocarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                .addComponent(Jbtn_AlocarFuncEqp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(714, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_AlocarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_AlocarFuncEqp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        JPanel_BarraLateral.setBackground(new java.awt.Color(47, 63, 115));
        JPanel_BarraLateral.setPreferredSize(new java.awt.Dimension(232, 832));

        Jbtn_LogoutButton_BarraLateral.setBackground(new java.awt.Color(243, 236, 196));
        Jbtn_LogoutButton_BarraLateral.setForeground(new java.awt.Color(0, 0, 0));
        Jbtn_LogoutButton_BarraLateral.setMaximumSize(new java.awt.Dimension(40, 40));
        Jbtn_LogoutButton_BarraLateral.setMinimumSize(new java.awt.Dimension(40, 40));
        Jbtn_LogoutButton_BarraLateral.setPreferredSize(new java.awt.Dimension(40, 40));
        Jbtn_LogoutButton_BarraLateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_LogoutButton_BarraLateralActionPerformed(evt);
            }
        });

        JPanel_logo_Barra_Lateral.setBackground(new java.awt.Color(47, 63, 115));
        JPanel_logo_Barra_Lateral.setPreferredSize(new java.awt.Dimension(133, 143));

        javax.swing.GroupLayout JPanel_logo_Barra_LateralLayout = new javax.swing.GroupLayout(JPanel_logo_Barra_Lateral);
        JPanel_logo_Barra_Lateral.setLayout(JPanel_logo_Barra_LateralLayout);
        JPanel_logo_Barra_LateralLayout.setHorizontalGroup(
            JPanel_logo_Barra_LateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jlbl_Logo_BarraLateral_Eqp, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );
        JPanel_logo_Barra_LateralLayout.setVerticalGroup(
            JPanel_logo_Barra_LateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jlbl_Logo_BarraLateral_Eqp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );

        JPanel_contentFuncionarioButton.setBackground(new java.awt.Color(40, 54, 98));
        JPanel_contentFuncionarioButton.setPreferredSize(new java.awt.Dimension(232, 40));
        JPanel_contentFuncionarioButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jbtn_IconeFuncionario_BarraLateral_CadEqp.setBackground(new java.awt.Color(243, 236, 196));
        Jbtn_IconeFuncionario_BarraLateral_CadEqp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_IconeFuncionario_BarraLateral_CadEqpActionPerformed(evt);
            }
        });
        JPanel_contentFuncionarioButton.add(Jbtn_IconeFuncionario_BarraLateral_CadEqp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 46));

        Jcmbx_Funcionario_BarraLateral.setBackground(new java.awt.Color(47, 63, 115));
        Jcmbx_Funcionario_BarraLateral.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        Jcmbx_Funcionario_BarraLateral.setForeground(new java.awt.Color(255, 255, 255));
        Jcmbx_Funcionario_BarraLateral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionário", "Pesquisar", "Cadastrar" }));
        Jcmbx_Funcionario_BarraLateral.setMaximumSize(new java.awt.Dimension(160, 46));
        Jcmbx_Funcionario_BarraLateral.setMinimumSize(new java.awt.Dimension(160, 46));
        Jcmbx_Funcionario_BarraLateral.setPreferredSize(new java.awt.Dimension(160, 46));
        Jcmbx_Funcionario_BarraLateral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jcmbx_Funcionario_BarraLateralMouseClicked(evt);
            }
        });
        Jcmbx_Funcionario_BarraLateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcmbx_Funcionario_BarraLateralActionPerformed(evt);
            }
        });
        JPanel_contentFuncionarioButton.add(Jcmbx_Funcionario_BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 160, -1));

        JPanel_contentEquipe_BarraLateral.setBackground(new java.awt.Color(40, 54, 98));
        JPanel_contentEquipe_BarraLateral.setMaximumSize(new java.awt.Dimension(232, 46));
        JPanel_contentEquipe_BarraLateral.setMinimumSize(new java.awt.Dimension(232, 46));
        JPanel_contentEquipe_BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jbtn_iconeEquipe_BarraLateral_CadEqp.setBackground(new java.awt.Color(243, 236, 196));
        Jbtn_iconeEquipe_BarraLateral_CadEqp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_iconeEquipe_BarraLateral_CadEqpActionPerformed(evt);
            }
        });
        JPanel_contentEquipe_BarraLateral.add(Jbtn_iconeEquipe_BarraLateral_CadEqp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 46));

        Jcmbx_Equipe_BarraLateral.setBackground(new java.awt.Color(47, 63, 115));
        Jcmbx_Equipe_BarraLateral.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        Jcmbx_Equipe_BarraLateral.setForeground(new java.awt.Color(255, 255, 255));
        Jcmbx_Equipe_BarraLateral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipe", "Pesquisar", "Cadastrar" }));
        Jcmbx_Equipe_BarraLateral.setMaximumSize(new java.awt.Dimension(160, 46));
        Jcmbx_Equipe_BarraLateral.setMinimumSize(new java.awt.Dimension(160, 46));
        Jcmbx_Equipe_BarraLateral.setPreferredSize(new java.awt.Dimension(160, 46));
        Jcmbx_Equipe_BarraLateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcmbx_Equipe_BarraLateralActionPerformed(evt);
            }
        });
        JPanel_contentEquipe_BarraLateral.add(Jcmbx_Equipe_BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        Jbtn_trocarUsuario_BarraLateral.setBackground(new java.awt.Color(243, 236, 196));
        Jbtn_trocarUsuario_BarraLateral.setForeground(new java.awt.Color(0, 0, 0));
        Jbtn_trocarUsuario_BarraLateral.setMaximumSize(new java.awt.Dimension(80, 40));
        Jbtn_trocarUsuario_BarraLateral.setMinimumSize(new java.awt.Dimension(80, 40));
        Jbtn_trocarUsuario_BarraLateral.setPreferredSize(new java.awt.Dimension(80, 40));
        Jbtn_trocarUsuario_BarraLateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_trocarUsuario_BarraLateralActionPerformed(evt);
            }
        });

        Jbtn_Configuração_BarraLateral.setBackground(new java.awt.Color(243, 236, 196));
        Jbtn_Configuração_BarraLateral.setForeground(new java.awt.Color(0, 0, 0));
        Jbtn_Configuração_BarraLateral.setMaximumSize(new java.awt.Dimension(90, 40));
        Jbtn_Configuração_BarraLateral.setMinimumSize(new java.awt.Dimension(90, 40));
        Jbtn_Configuração_BarraLateral.setPreferredSize(new java.awt.Dimension(90, 40));
        Jbtn_Configuração_BarraLateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_Configuração_BarraLateralActionPerformed(evt);
            }
        });

        Jpanel_contentTreinamento_Barra_Lateral.setBackground(new java.awt.Color(40, 54, 98));
        Jpanel_contentTreinamento_Barra_Lateral.setMaximumSize(new java.awt.Dimension(232, 46));
        Jpanel_contentTreinamento_Barra_Lateral.setMinimumSize(new java.awt.Dimension(232, 46));
        Jpanel_contentTreinamento_Barra_Lateral.setPreferredSize(new java.awt.Dimension(232, 46));
        Jpanel_contentTreinamento_Barra_Lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jbtn_iconeTreinamento_BarraLateral_CadEqp.setBackground(new java.awt.Color(243, 236, 196));
        Jbtn_iconeTreinamento_BarraLateral_CadEqp.setPreferredSize(new java.awt.Dimension(65, 32));
        Jbtn_iconeTreinamento_BarraLateral_CadEqp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_iconeTreinamento_BarraLateral_CadEqpActionPerformed(evt);
            }
        });
        Jpanel_contentTreinamento_Barra_Lateral.add(Jbtn_iconeTreinamento_BarraLateral_CadEqp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 45));

        Jcmbx_Treinamento_BarraLateral.setBackground(new java.awt.Color(47, 63, 115));
        Jcmbx_Treinamento_BarraLateral.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        Jcmbx_Treinamento_BarraLateral.setForeground(new java.awt.Color(255, 255, 255));
        Jcmbx_Treinamento_BarraLateral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Treinamento", "Pesquisar", "Cadastrar" }));
        Jcmbx_Treinamento_BarraLateral.setMaximumSize(new java.awt.Dimension(160, 46));
        Jcmbx_Treinamento_BarraLateral.setMinimumSize(new java.awt.Dimension(160, 46));
        Jcmbx_Treinamento_BarraLateral.setPreferredSize(new java.awt.Dimension(160, 46));
        Jcmbx_Treinamento_BarraLateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcmbx_Treinamento_BarraLateralActionPerformed(evt);
            }
        });
        Jpanel_contentTreinamento_Barra_Lateral.add(Jcmbx_Treinamento_BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        javax.swing.GroupLayout JPanel_BarraLateralLayout = new javax.swing.GroupLayout(JPanel_BarraLateral);
        JPanel_BarraLateral.setLayout(JPanel_BarraLateralLayout);
        JPanel_BarraLateralLayout.setHorizontalGroup(
            JPanel_BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_contentFuncionarioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanel_contentEquipe_BarraLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPanel_BarraLateralLayout.createSequentialGroup()
                .addGroup(JPanel_BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_BarraLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Jbtn_trocarUsuario_BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jbtn_Configuração_BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_BarraLateralLayout.createSequentialGroup()
                        .addGroup(JPanel_BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_BarraLateralLayout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(JPanel_logo_Barra_Lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_BarraLateralLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Jbtn_LogoutButton_BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jlbl_TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(JPanel_BarraLateralLayout.createSequentialGroup()
                .addComponent(Jpanel_contentTreinamento_Barra_Lateral, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanel_BarraLateralLayout.setVerticalGroup(
            JPanel_BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_BarraLateralLayout.createSequentialGroup()
                .addGroup(JPanel_BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_BarraLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Jbtn_LogoutButton_BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_BarraLateralLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Jlbl_TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(JPanel_logo_Barra_Lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(JPanel_contentFuncionarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPanel_contentEquipe_BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jpanel_contentTreinamento_Barra_Lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addGroup(JPanel_BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_Configuração_BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_trocarUsuario_BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(JPanel_BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_LogoutButton_BarraLateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_LogoutButton_BarraLateralActionPerformed
        Tela_Login telaLogin = new Tela_Login();
        telaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Jbtn_LogoutButton_BarraLateralActionPerformed

    private void Jbtn_IconeFuncionario_BarraLateral_CadEqpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_IconeFuncionario_BarraLateral_CadEqpActionPerformed

    }//GEN-LAST:event_Jbtn_IconeFuncionario_BarraLateral_CadEqpActionPerformed

    private void Jcmbx_Funcionario_BarraLateralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jcmbx_Funcionario_BarraLateralMouseClicked

    }//GEN-LAST:event_Jcmbx_Funcionario_BarraLateralMouseClicked

    private void Jcmbx_Funcionario_BarraLateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcmbx_Funcionario_BarraLateralActionPerformed
        if ("admin".equals(tipoUsuario)) {
            switch (Jcmbx_Funcionario_BarraLateral.getSelectedIndex()) {
                case 1 -> {
                    Tela_Pesquisar_Funcionario Tela_SearchFunc = new Tela_Pesquisar_Funcionario();
                    Tela_SearchFunc.setVisible(true);
                    this.dispose();
                }
                case 2 -> {
                    Tela_Cadastro_Funcionario Tela_CadFunc = new Tela_Cadastro_Funcionario();
                    Tela_CadFunc.setVisible(true);
                    this.dispose();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Selecione uma opção disponível!");
                }
            }
        } else if ("operador".equals(tipoUsuario) || "supervisor".equals(tipoUsuario) || "instrutor".equals(tipoUsuario)) {
            switch (Jcmbx_Funcionario_BarraLateral.getSelectedIndex()) {
                case 1 -> {
                    Tela_Pesquisar_Funcionario Tela_SearchFunc = new Tela_Pesquisar_Funcionario();
                    Tela_SearchFunc.setVisible(true);
                    this.dispose();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Você não tem permissão para acessar essa opção!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de usuário não reconhecido!");
        }
    }//GEN-LAST:event_Jcmbx_Funcionario_BarraLateralActionPerformed

    private void Jbtn_iconeEquipe_BarraLateral_CadEqpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_iconeEquipe_BarraLateral_CadEqpActionPerformed

    }//GEN-LAST:event_Jbtn_iconeEquipe_BarraLateral_CadEqpActionPerformed

    private void Jcmbx_Equipe_BarraLateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcmbx_Equipe_BarraLateralActionPerformed
        if ("supervisor".equals(tipoUsuario) || "admin".equals(tipoUsuario)) {
            switch (Jcmbx_Equipe_BarraLateral.getSelectedIndex()) {
                case 1 -> {
                    Tela_Pesquisa_Equipe Tela_SearchEqp = new Tela_Pesquisa_Equipe();
                    Tela_SearchEqp.setVisible(true);
                    this.dispose();
                }
                case 2 -> {
                    Tela_Cadastro_Equipe Tela_CadEqp = new Tela_Cadastro_Equipe();
                    Tela_CadEqp.setVisible(true);
                    this.dispose();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Selecione uma opção disponível!");
                }
            }
        } else if ("operador".equals(tipoUsuario) || "intrutor".equals(tipoUsuario)) {
            switch (Jcmbx_Equipe_BarraLateral.getSelectedIndex()) {
                case 1 -> {
                    Tela_Pesquisa_Equipe Tela_SearchEqp = new Tela_Pesquisa_Equipe();
                    Tela_SearchEqp.setVisible(true);
                    this.dispose();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Você não tem permissão para acessar essa opção!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de usuário não reconhecido!");
        }
    }//GEN-LAST:event_Jcmbx_Equipe_BarraLateralActionPerformed

    private void Jbtn_trocarUsuario_BarraLateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_trocarUsuario_BarraLateralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn_trocarUsuario_BarraLateralActionPerformed

    private void Jbtn_Configuração_BarraLateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_Configuração_BarraLateralActionPerformed
        Popup_Opcoes popup_opcoes = new Popup_Opcoes();
        popup_opcoes.setVisible(true);

    }//GEN-LAST:event_Jbtn_Configuração_BarraLateralActionPerformed

    private void Jbtn_iconeTreinamento_BarraLateral_CadEqpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_iconeTreinamento_BarraLateral_CadEqpActionPerformed

    }//GEN-LAST:event_Jbtn_iconeTreinamento_BarraLateral_CadEqpActionPerformed

    private void Jcmbx_Treinamento_BarraLateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcmbx_Treinamento_BarraLateralActionPerformed
        if ("admin".equals(tipoUsuario) || "instrutor".equals(tipoUsuario)) {
            switch (Jcmbx_Treinamento_BarraLateral.getSelectedIndex()) {
                case 1 -> {
                    Tela_Pesquisar_Treinamento Tela_SearchTreino = new Tela_Pesquisar_Treinamento();
                    Tela_SearchTreino.setVisible(true);
                    this.dispose();
                }
                case 2 -> {
                    Tela_Cadastro_Treinamento Tela_CadTreino = new Tela_Cadastro_Treinamento();
                    Tela_CadTreino.setVisible(true);
                    this.dispose();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Selecione uma opção disponível!");
                }
            }
        } else if ("operador".equals(tipoUsuario) || "supervisor".equals(tipoUsuario)) {
            switch (Jcmbx_Treinamento_BarraLateral.getSelectedIndex()) {
                case 1 -> {
                    Tela_Pesquisar_Treinamento Tela_SearchTreino = new Tela_Pesquisar_Treinamento();
                    Tela_SearchTreino.setVisible(true);
                    this.dispose();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Você não tem permissão para acessar essa opção!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de usuário não reconhecido!");
        }
    }//GEN-LAST:event_Jcmbx_Treinamento_BarraLateralActionPerformed

    private void Jbtn_AlocarTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_AlocarTreinoActionPerformed
        if ("supervisor".equals(tipoUsuario) || "admin".equals(tipoUsuario)) {
            Tela_Alocar_Treinamento CadEqp_Treino = new Tela_Alocar_Treinamento();
            CadEqp_Treino.setVisible(true);
            this.dispose();

        } else if ("operador".equals(tipoUsuario) || "instrutor".equals(tipoUsuario)) {
            Tela_Alocar_Treinamento CadEqp_Treino = new Tela_Alocar_Treinamento();
            CadEqp_Treino.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de usuário não reconhecido!");
        }
    }//GEN-LAST:event_Jbtn_AlocarTreinoActionPerformed

    private void Jbtn_AlocarFuncEqpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_AlocarFuncEqpActionPerformed
        if ("supervisor".equals(tipoUsuario) || "admin".equals(tipoUsuario)) {
            Cadastro_Funcionario_Equipe CadFunc_Treino = new Cadastro_Funcionario_Equipe();
            CadFunc_Treino.setVisible(true);
            this.dispose();

        
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de usuário não reconhecido!");
        }
    }//GEN-LAST:event_Jbtn_AlocarFuncEqpActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if ("supervisor".equals(tipoUsuario)) {
            Jlbl_TipoUsuario.setText("Supervisor");
            Jbtn_AlocarTreino.setVisible(true);
            Jbtn_AlocarFuncEqp.setVisible(true);
        } else if ("operador".equals(tipoUsuario)) {
            Jlbl_TipoUsuario.setText("Operador");
            Jbtn_AlocarTreino.setVisible(false);
            Jbtn_AlocarFuncEqp.setVisible(false);
        }

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Tela_DashBoard_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_DashBoard_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_DashBoard_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_DashBoard_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_BarraLateral;
    private javax.swing.JPanel JPanel_contentEquipe_BarraLateral;
    private javax.swing.JPanel JPanel_contentFuncionarioButton;
    private javax.swing.JPanel JPanel_logo_Barra_Lateral;
    private javax.swing.JButton Jbtn_AlocarFuncEqp;
    private javax.swing.JButton Jbtn_AlocarTreino;
    private javax.swing.JButton Jbtn_Configuração_BarraLateral;
    private javax.swing.JButton Jbtn_IconeFuncionario_BarraLateral_CadEqp;
    private javax.swing.JButton Jbtn_LogoutButton_BarraLateral;
    private javax.swing.JButton Jbtn_iconeEquipe_BarraLateral_CadEqp;
    private javax.swing.JButton Jbtn_iconeTreinamento_BarraLateral_CadEqp;
    private javax.swing.JButton Jbtn_trocarUsuario_BarraLateral;
    private javax.swing.JComboBox<String> Jcmbx_Equipe_BarraLateral;
    private javax.swing.JComboBox<String> Jcmbx_Funcionario_BarraLateral;
    private javax.swing.JComboBox<String> Jcmbx_Treinamento_BarraLateral;
    private javax.swing.JLabel Jlbl_Logo_BarraLateral_Eqp;
    private javax.swing.JLabel Jlbl_TipoUsuario;
    private javax.swing.JPanel Jpanel_contentTreinamento_Barra_Lateral;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
