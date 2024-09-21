/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.posto.xiquexique;

/**
 * Classe que implementa a interface gráfica para excluir um item do estoque
 * 
 * Editando um item do estoque, a mudança é salva na tabela da interface gráfica
 * e na tabela hash
 * 
 * 
 * @author aliran
 */
public class EditarEstoque extends javax.swing.JFrame {

    HashEstoque hashEstoque;

    TableModifier tableModifier = new TableModifier();
    /**
     * Creates new form EditarEstoque
     */
    public EditarEstoque(HashEstoque estoque) {
        this.hashEstoque = estoque;
        initComponents();
        tableModifier.tableAddEstoque(estoque, tabelaEstoque);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog = new javax.swing.JDialog();
        campoDialogo = new javax.swing.JTextField();
        btnConcluir = new javax.swing.JButton();
        spinnerQuant = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        warnLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        campoTexto = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        jDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jDialog.setTitle("Editando");
        jDialog.setMaximumSize(new java.awt.Dimension(400, 300));
        jDialog.setMinimumSize(new java.awt.Dimension(400, 300));
        jDialog.setPreferredSize(new java.awt.Dimension(400, 300));

        campoDialogo.setEditable(false);
        campoDialogo.setFocusable(false);
        campoDialogo.setMaximumSize(new java.awt.Dimension(110, 30));
        campoDialogo.setMinimumSize(new java.awt.Dimension(110, 30));
        campoDialogo.setPreferredSize(new java.awt.Dimension(110, 30));

        btnConcluir.setText("Concluir");
        btnConcluir.setMaximumSize(new java.awt.Dimension(110, 30));
        btnConcluir.setMinimumSize(new java.awt.Dimension(110, 30));
        btnConcluir.setPreferredSize(new java.awt.Dimension(110, 30));
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        spinnerQuant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 128, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quantidade");
        jLabel1.setMaximumSize(new java.awt.Dimension(110, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(110, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Preço");
        jLabel2.setMaximumSize(new java.awt.Dimension(110, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(110, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 30));

        campoPreco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoPreco.setText("Preço");
        campoPreco.setPreferredSize(new java.awt.Dimension(64, 30));
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });

        warnLabel.setMaximumSize(new java.awt.Dimension(110, 30));
        warnLabel.setMinimumSize(new java.awt.Dimension(110, 30));
        warnLabel.setPreferredSize(new java.awt.Dimension(110, 30));

        javax.swing.GroupLayout jDialogLayout = new javax.swing.GroupLayout(jDialog.getContentPane());
        jDialog.getContentPane().setLayout(jDialogLayout);
        jDialogLayout.setHorizontalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(spinnerQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(jDialogLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(warnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoDialogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogLayout.setVerticalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(campoDialogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(warnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Estoque");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("Tabela Vendas");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabelaEstoque.setAutoCreateRowSorter(true);
        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nome", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaEstoque.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        tabelaEstoque.setMaximumSize(jScrollPane2.getSize());
        tabelaEstoque.setMinimumSize(jScrollPane2.getSize());
        tabelaEstoque.setName(""); // NOI18N
        tabelaEstoque.setPreferredSize(getSize());
        tabelaEstoque.setShowGrid(true);
        tabelaEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEstoqueMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaEstoque);

        jLabel4.setText("Opção Selecionada: ");

        campoTexto.setColumns(4);
        campoTexto.setToolTipText("Selecionada");
        campoTexto.setActionCommand("<Not Set>");
        campoTexto.setFocusable(false);
        campoTexto.setMinimumSize(new java.awt.Dimension(450, 30));
        campoTexto.setPreferredSize(new java.awt.Dimension(450, 30));
        campoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setMaximumSize(new java.awt.Dimension(100, 30));
        btnSair.setMinimumSize(new java.awt.Dimension(100, 30));
        btnSair.setPreferredSize(new java.awt.Dimension(100, 30));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnEditar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnEditar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4)
                    .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Função que fecha o menu de edição do estoque
     */
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * Função que seleciona um item da tabela para edição
     * 
     */    
    private void tabelaEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEstoqueMouseClicked
        int row = tabelaEstoque.rowAtPoint(evt.getPoint());
        int col = tabelaEstoque.columnAtPoint(evt.getPoint());

        if (row >= 0 && col >= 0) {
            Object value = tabelaEstoque.getValueAt(row, 0);
            campoTexto.setText(value.toString());

        }
    }//GEN-LAST:event_tabelaEstoqueMouseClicked

    private void campoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoActionPerformed

    /**
     * Função que abre a edição do item selecionado na tabela
     * 
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String item = campoTexto.getText();
        if (item.equals("")) {
            return;
        }
        HashEstoque.EstruturaEstoque estoqueItem = hashEstoque.buscarItem(item);
        jDialog.setVisible(true);
        campoDialogo.setText(estoqueItem.getItem());
        spinnerQuant.setValue(estoqueItem.getQuantidade());
        campoPreco.setText(Float.toString(estoqueItem.getPrecoUnit()));

    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * Função que conclui a edição do item selecionado
     * 
     */
    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        
        HashEstoque.EstruturaEstoque estoqueItem = hashEstoque.buscarItem(campoDialogo.getText()); 
        // busca o item na tabela hash
        estoqueItem.setQuantidade((int) spinnerQuant.getValue()); // pega a quantidade do spinner

        try {
            campoPreco.setText(campoPreco.getText().replace(",", ".")); // troca vírgula por ponto
            float preco = Float.parseFloat(campoPreco.getText()); // converte o texto do campo para float
            if(preco <= 0){ // verifica se o preço é válido
                warnLabel.setText("Preço inválido");
                return;
            }
            
            estoqueItem.setPrecoUnit(preco); // seta o preço
        } catch (NumberFormatException e) {
            warnLabel.setText("Preço inválido");
            return;
        }
        tableModifier.tableAddEstoque(hashEstoque, tabelaEstoque); // atualiza a tabela
        jDialog.setVisible(false); // fecha a janela de edição
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEstoque(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField campoDialogo;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoTexto;
    private javax.swing.JDialog jDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinnerQuant;
    private javax.swing.JTable tabelaEstoque;
    private javax.swing.JLabel warnLabel;
    // End of variables declaration//GEN-END:variables
}
