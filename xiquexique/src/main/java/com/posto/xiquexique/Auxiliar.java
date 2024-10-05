package com.posto.xiquexique;

import javax.swing.table.DefaultTableModel;


/**
 * Classe que modifica uma tabela
 * 
 * @author aliran
 */
public class Auxiliar{

    public Auxiliar(){
    }

    /**
     * Insere os itens do estoque na tabela,
     * exibindo o preço total
     * 
     * Limpa a tabela antes de inserir os itens
     * 
     * @param estoque
     * @param tabelaEstoque
     * @param precoTotal Serve para definir se o preço total será exibido ou não
     */
    public void tableAddEstoque(HashEstoque estoque, javax.swing.JTable tabelaEstoque, boolean precoTotal){
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
                if(precoTotal)
                    ((DefaultTableModel) tabelaEstoque.getModel()).addRow(new Object[]{estoqueItem.getItem(), estoqueItem.getQuantidade(), estoqueItem.getPrecoUnit(), estoqueItem.getQuantidade() * estoqueItem.getPrecoUnit()});
                else
                    ((DefaultTableModel) tabelaEstoque.getModel()).addRow(new Object[]{estoqueItem.getItem(), estoqueItem.getQuantidade(), estoqueItem.getPrecoUnit(), estoqueItem.getQuantidade() * estoqueItem.getPrecoUnit()});
            }
        }
    }

    /**
     * Insere os itens do estoque na tabela,
     * sem exibir o preço total
     * 
     * Limpa a tabela antes de inserir os itens
     * 
     * @param estoque
     * @param tabelaEstoque
     */
    public void tableAddEstoque(HashEstoque estoque, javax.swing.JTable tabelaEstoque){
        tableAddEstoque(estoque, tabelaEstoque, false);
    }

    public void tableAddVenda(EstruturaVenda venda, javax.swing.JTable tabelaVenda){
        tableClear(tabelaVenda);
        ((DefaultTableModel) tabelaVenda.getModel()).addRow(new Object[]{venda.getItem(), venda.getQuantidadeVendida(), venda.getPrecoUnit(), venda.getQuantidadeVendida() * venda.getPrecoUnit()});
    }
 
    /**
     * Limpa a tabela
     * 
     * @param tabelaEstoque
    */
    private void tableClear(javax.swing.JTable tabelaEstoque) {
        DefaultTableModel model = (DefaultTableModel) tabelaEstoque.getModel();
        model.setRowCount(0);
    }
    
}
