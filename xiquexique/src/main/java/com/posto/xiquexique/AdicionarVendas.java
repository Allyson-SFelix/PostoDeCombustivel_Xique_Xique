/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.posto.xiquexique;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe que implementa a interface gráfica de adicionar vendas
 * Funções:
 * - Adicionar um item a tabela de vendas
 * - Recarregar o comboBoxEstoque com os itens do estoque
 * - Sair do sistema
 * @author aliran
 */
public class AdicionarVendas extends javax.swing.JFrame {

    HashEstoque hashEstoque;
    EstruturaFuncionarios funcionario;
    Auxiliar mod = new Auxiliar();
    HeapVenda venda;

    /**
     * Creates new form AdicionarVendasMenu
     */
    public AdicionarVendas(HashEstoque estoque, EstruturaFuncionarios func) {
        this.hashEstoque = estoque;
        this.funcionario = func;
        this.venda = new HeapVenda(estoque);
        initComponents();
        mod.comboBoxReload(estoque, comboBoxEstoque);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxEstoque = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        spinnerQuantidade = new javax.swing.JSpinner();
        btnConcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Venda");
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setName("AdicionarVenda"); // NOI18N

        comboBoxEstoque.setToolTipText("Itens em estoque");
        comboBoxEstoque.setMinimumSize(new java.awt.Dimension(90, 30));
        comboBoxEstoque.setPreferredSize(new java.awt.Dimension(90, 30));
        comboBoxEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEstoqueActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Preço Unit.", "Preço Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        jTable1.setPreferredSize(new java.awt.Dimension(200, 200));
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(jTable1);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(90, 30));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        spinnerQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, 255, 1));
        spinnerQuantidade.setToolTipText("Quantidade");

        btnConcluir.setText("Concluido");
        btnConcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConcluir.setPreferredSize(new java.awt.Dimension(90, 24));
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setPreferredSize(new java.awt.Dimension(90, 24));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxEstoqueActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        if(venda.getSize() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum item selecionado");
            return;
        }
        funcionario.addVenda(venda);
        this.dispose();
    }//GEN-LAST:event_btnConcluirActionPerformed

    /**
     * Função de Sair do sistema
     */
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.dispose();

    }
                                          
    /**
     * Adiciona um item a tabela de vendas
     * via comboBoxEstoque e spinnerQuantidade
     */
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {     
        try {
                                                
            int quant = (int) spinnerQuantidade.getValue();
            String item = comboBoxEstoque.getSelectedItem().toString();
            HashEstoque.EstruturaEstoque estoqueItem = hashEstoque.buscarItem(item);
            if(hashEstoque.retirarQuant(item, quant) == -1){
                JOptionPane.showMessageDialog(null, "Quantidade insuficiente ou Item não encontrado");
                return;
            }
            HeapVenda.EstruturaVenda vendaItem = venda.new EstruturaVenda(item, estoqueItem.getPrecoUnit(), quant);
            int busca = venda.search(item);
            if(busca != -1){
                for(int i = 0; i < jTable1.getRowCount(); i++){
                    if(jTable1.getValueAt(i, 0).equals(item)){
                        venda.getHeap(busca).setQuantidade(quant + (int) jTable1.getValueAt(i, 1));
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.removeRow(i);
                    }
                }
            } else{
                venda.insert(vendaItem);
            }
            mod.tableAddVenda(venda, jTable1);
            mod.comboBoxReload(hashEstoque, comboBoxEstoque);
        } catch (NullPointerException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar item: " + e.getMessage());
        }
    }
                                           
                                            

    /**
     * @param args the command line arguments
     */
    public void main(String args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        HashEstoque estoque = this.hashEstoque;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdicionarVendas(null,null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> comboBoxEstoque;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spinnerQuantidade;
    // End of variables declaration//GEN-END:variables
}
