package com.posto.xiquexique;

import javax.swing.table.DefaultTableModel;



/**
 * Classe que modifica uma tabela
 * 
 * @author aliran
 */
public class TableModifier extends javax.swing.JTable{

    public TableModifier(){
    }


    public void tableAddEstoque(HashEstoque estoque, javax.swing.JTable tabelaEstoque) {
        tableClear(tabelaEstoque);

        HashEstoque.EstruturaEstoque[] estoqueArrayAux = new HashEstoque.EstruturaEstoque[estoque.getTamanho()];
        HashEstoque.EstruturaEstoque[] aux = estoque.getTabela();
        int auxIndex = 0;
        for (HashEstoque.EstruturaEstoque estoqueItem : aux) {
            if (estoqueItem != null) {
                estoqueArrayAux[auxIndex] = estoqueItem;
                auxIndex++;
            }
        }
        HashEstoque.EstruturaEstoque[] estoqueArray = estoqueArrayAux;

        for (int i = 0; i < auxIndex; i++) {
            HashEstoque.EstruturaEstoque estoqueItem = estoqueArray[i];
            if (estoqueItem != null) {
                ((DefaultTableModel) tabelaEstoque.getModel()).addRow(new Object[]{estoqueItem.getItem(), estoqueItem.getQuantidade(), estoqueItem.getPrecoUnit()});
            }
        }
    }

    private void tableClear(javax.swing.JTable tabelaEstoque) {
        DefaultTableModel model = (DefaultTableModel) tabelaEstoque.getModel();
        model.setRowCount(0);
    }
    
}
