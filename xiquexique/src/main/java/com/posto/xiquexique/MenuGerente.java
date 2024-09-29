/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.posto.xiquexique;

import java.lang.management.ThreadInfo;

/**
 * Classe para o menu do gerente
 * 
 * Possui opções para acessar o estoque, vendas e adicionar funcionários
 * 
 * @author aliran
 */
public class MenuGerente extends javax.swing.JFrame {

    HashEstoque hashEstoque;
    EstruturaFuncionarios funcionarios;
    /**
     * Creates new form MenuGerente
     */
    public MenuGerente(HashEstoque estoque, EstruturaFuncionarios func) {
        this.funcionarios = func;
        this.hashEstoque = estoque;
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

        dialogMudarSenha = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        passfieldSenhaAntiga = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        passfieldNovaSenha = new javax.swing.JPasswordField();
        passfieldConfirma = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        campoAux = new javax.swing.JTextPane();
        btnVendas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEstoque = new javax.swing.JButton();
        btnAddFunc = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnMudarSenha = new javax.swing.JButton();

        dialogMudarSenha.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogMudarSenha.setTitle("Mudar Senha");
        dialogMudarSenha.setMinimumSize(new java.awt.Dimension(500, 400));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Senha Anterior");
        jLabel2.setMaximumSize(new java.awt.Dimension(160, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(160, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(160, 30));

        passfieldSenhaAntiga.setMaximumSize(new java.awt.Dimension(160, 30));
        passfieldSenhaAntiga.setMinimumSize(new java.awt.Dimension(160, 30));
        passfieldSenhaAntiga.setPreferredSize(new java.awt.Dimension(160, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nova Senha");
        jLabel3.setMaximumSize(new java.awt.Dimension(160, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(160, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(160, 30));

        passfieldNovaSenha.setMaximumSize(new java.awt.Dimension(160, 30));
        passfieldNovaSenha.setMinimumSize(new java.awt.Dimension(160, 30));
        passfieldNovaSenha.setPreferredSize(new java.awt.Dimension(160, 30));
        passfieldNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfieldNovaSenhaActionPerformed(evt);
            }
        });

        passfieldConfirma.setMaximumSize(new java.awt.Dimension(160, 30));
        passfieldConfirma.setMinimumSize(new java.awt.Dimension(160, 30));
        passfieldConfirma.setPreferredSize(new java.awt.Dimension(160, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Confirme a Nova Senha");
        jLabel4.setMaximumSize(new java.awt.Dimension(160, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(160, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(160, 30));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.setMaximumSize(new java.awt.Dimension(160, 30));
        btnConfirmar.setMinimumSize(new java.awt.Dimension(160, 30));
        btnConfirmar.setPreferredSize(new java.awt.Dimension(160, 30));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        campoAux.setFont(new java.awt.Font("Nimbus Sans", 0, 15)); // NOI18N
        campoAux.setFocusable(false);
        campoAux.setMaximumSize(new java.awt.Dimension(170, 30));
        campoAux.setMinimumSize(new java.awt.Dimension(170, 30));
        campoAux.setPreferredSize(new java.awt.Dimension(170, 30));

        javax.swing.GroupLayout dialogMudarSenhaLayout = new javax.swing.GroupLayout(dialogMudarSenha.getContentPane());
        dialogMudarSenha.getContentPane().setLayout(dialogMudarSenhaLayout);
        dialogMudarSenhaLayout.setHorizontalGroup(
            dialogMudarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogMudarSenhaLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(dialogMudarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(passfieldConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passfieldSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passfieldNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        dialogMudarSenhaLayout.setVerticalGroup(
            dialogMudarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogMudarSenhaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passfieldSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passfieldNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passfieldConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAux, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));

        btnVendas.setText("Vendas");
        btnVendas.setMaximumSize(new java.awt.Dimension(170, 30));
        btnVendas.setMinimumSize(new java.awt.Dimension(170, 30));
        btnVendas.setPreferredSize(new java.awt.Dimension(170, 30));
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        jLabel1.setText("Bem Vindo, Gerente!");

        btnEstoque.setText("Estoque");
        btnEstoque.setMaximumSize(new java.awt.Dimension(170, 30));
        btnEstoque.setMinimumSize(new java.awt.Dimension(170, 30));
        btnEstoque.setPreferredSize(new java.awt.Dimension(170, 30));
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnAddFunc.setText("Adicionar Funcionario");
        btnAddFunc.setMaximumSize(new java.awt.Dimension(170, 30));
        btnAddFunc.setMinimumSize(new java.awt.Dimension(170, 30));
        btnAddFunc.setPreferredSize(new java.awt.Dimension(170, 30));

        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(170, 30));
        btnSair.setMinimumSize(new java.awt.Dimension(170, 30));
        btnSair.setPreferredSize(new java.awt.Dimension(170, 30));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnMudarSenha.setText("Mudar Senha");
        btnMudarSenha.setMaximumSize(new java.awt.Dimension(170, 30));
        btnMudarSenha.setMinimumSize(new java.awt.Dimension(170, 30));
        btnMudarSenha.setPreferredSize(new java.awt.Dimension(170, 30));
        btnMudarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMudarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMudarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnAddFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnMudarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método para sair do sistema

     * volta para a tela de login
     */
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        LoginMenu login = new LoginMenu(hashEstoque, funcionarios);
        login.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed


    /**
     * Método para abrir a tela de vendas
     */
    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        VendasMenu vendas = new VendasMenu(hashEstoque);
        vendas.setVisible(true);
    }//GEN-LAST:event_btnVendasActionPerformed


    /**
     * Método para abrir a tela de estoque
     */
    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        EstoqueMenu estoque = new EstoqueMenu(hashEstoque);
        estoque.setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnMudarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMudarSenhaActionPerformed
        dialogMudarSenha.setVisible(true);
    }//GEN-LAST:event_btnMudarSenhaActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if(new String(passfieldSenhaAntiga.getPassword()).equals("")){
            campoAux.setText("Digite a senha antiga!");
        } else if(new String(passfieldNovaSenha.getPassword()).equals(new String(passfieldSenhaAntiga.getPassword()))){
            campoAux.setText("A nova senha não pode ser igual a antiga!");
        }
        else if(!new String(passfieldSenhaAntiga.getPassword()).equals(this.funcionarios.getSenha())){
            campoAux.setText("Senha antiga incorreta!");
        } else if(new String(passfieldNovaSenha.getPassword()).equals("")){
            campoAux.setText("Digite a nova senha!");
        } else if(new String(passfieldConfirma.getPassword()).equals("")){
            campoAux.setText("Confirme a nova senha!");
        } else if(new String(passfieldNovaSenha.getPassword()).equals(new String(passfieldConfirma.getPassword()))){
            //mudar senha
            campoAux.setText("Senha alterada com sucesso!");
            try {
                Thread.sleep(2000); // Espera por 2 segundos
            } catch (InterruptedException e) {
            }
            this.funcionarios.setSenha(new String(passfieldNovaSenha.getPassword()));
            dialogMudarSenha.dispose();
        } else {
            campoAux.setText("As senhas não coincidem!");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void passfieldNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfieldNovaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfieldNovaSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGerente(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFunc;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnMudarSenha;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVendas;
    private javax.swing.JTextPane campoAux;
    private javax.swing.JDialog dialogMudarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passfieldConfirma;
    private javax.swing.JPasswordField passfieldNovaSenha;
    private javax.swing.JPasswordField passfieldSenhaAntiga;
    // End of variables declaration//GEN-END:variables
}
