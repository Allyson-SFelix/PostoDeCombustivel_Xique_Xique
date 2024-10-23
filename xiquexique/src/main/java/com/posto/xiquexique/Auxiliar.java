package com.posto.xiquexique;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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
     * caso a tabela tem 4 colunas
     * exibirá o item, a quantidade, o preço unitário e o valor total
     * caso a tabela tenha 3 colunas
     * exibirá o item, a quantidade e o preço unitário
     * 
     * Limpa a tabela antes de inserir os itens
     * 
     * @param estoque
     * @param tabelaEstoque
     */
    public void tableAddEstoque(HashEstoque estoque, javax.swing.JTable tabelaEstoque){
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
                ((DefaultTableModel) tabelaEstoque.getModel()).addRow(new Object[]{estoqueItem.getItem(), estoqueItem.getQuantidade(), estoqueItem.getPrecoUnit(), estoqueItem.getQuantidade() * estoqueItem.getPrecoUnit()});
            }
        }
    }

    /**
     * Insere os itens da venda na tabela,
     * caso a tabela tem 4 colunas
     * exibirá o item, a quantidade, o preço unitário e o valor total
     * caso a tabela tenha 3 colunas
     * exibirá o item, a quantidade e o preço unitário
     */
    public void tableAddVenda(HeapVenda venda, javax.swing.JTable tabelaVenda){
        tableClear(tabelaVenda);
        for(int i = 0; i < venda.getSize(); i++){
            HeapVenda.EstruturaVenda vendaItem = venda.getHeap()[i];
            ((DefaultTableModel) tabelaVenda.getModel()).addRow(new Object[]{vendaItem.getItem(), vendaItem.getQuantidade(), vendaItem.getPrecoUnit(), vendaItem.valorTotal()});
        }
    }

    /**
     * Insere os itens da venda na tabela,
     * exibe o id, a data, a hora, a quantidade total e o valor total
     */
    public void tableHeapVenda(EstruturaFuncionarios func, javax.swing.JTable tabelaVenda){
        tableClear(tabelaVenda);
        ArrayList<HeapVenda> vendas = func.getVendas();
        if(vendas == null){
            return;
        }
        if(vendas.isEmpty()){
            return;
        }
        for(HeapVenda venda : vendas){
            LocalDate data = venda.getCreationTime().toLocalDate();
            LocalTime hora = venda.getCreationTime().toLocalTime();
        
            DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
            String dataFormatada = data.format(formatoData);
            String horaFormatada = hora.format(formatoHora);
            ((DefaultTableModel) tabelaVenda.getModel()).addRow(new Object[]{venda.getId(), dataFormatada, horaFormatada, venda.getQuantidadeTotal(), venda.getValorTotal()});
        }
    }
 
    /**
     * Limpa a tabela
     * 
     * @param tabelaEstoque
    */
    private void tableClear(javax.swing.JTable tabelaEstoque) {
        ((DefaultTableModel) tabelaEstoque.getModel()).setRowCount(0);
    }
    
    /**
     * Recarrega o comboBox com os itens do estoque
     * 
     * @param estoque
     */
    public void comboBoxReload(HashEstoque estoque, javax.swing.JComboBox<String> comboBoxEstoque){
        comboBoxEstoque.removeAllItems();
        for(int i = 0; i < estoque.getTamanho(); i++){
            HashEstoque.EstruturaEstoque using = estoque.getTabela()[i];
            if(using!=null){
                comboBoxEstoque.addItem(using.getItem());
            }
        }
    }

}
