/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.posto.xiquexique;

/**
 * Classe que implementa uma tabela hash para o estoque
 * Primeira Classe implementada no sistema
 * Funções:
 * - Inserir um item na tabela
 * - Buscar um item na tabela
 * - Retirar uma quantidade de um item da tabela
 * - Remover um item da tabela
 * - Gerar um código hash
 * - Classe interna EstruturaEstoque que representa um item do estoque
 * 
 * @author aliran
 */
public final class HashEstoque{

    /**
     * Converte uma string em um inteiro
     * 
     * @param item a string a ser convertida
     * @return o inteiro gerado ao quadrado
     */   
    private int stringToInt(String item){
        int hash = 0;
        for(int i = 0 ; i < item.length() ; i++){
            hash += item.charAt(i);
        }
        return hash*hash;
    }
    
    /**
     * Gerador de código hash
     * 
     * @param item o item a ser gerado o código hash
     * @return o código hash gerado
     */
    public int codigoHashGen(String item){
        return stringToInt(item)%tamanho;
    };

    public class EstruturaEstoque{
        private String item;
        private int quantidade;
        private float precoUnit;
        

        
        public EstruturaEstoque(String item,float precoUnit, int quantidade){
            this.item=item;
            this.precoUnit=precoUnit;
            this.quantidade=quantidade;
            
        }
        
        public String getItem(){
            return this.item;
        }

        

        public void setItem(String item){
            this.item = item;
        }

        @Override
        public String toString(){
            return "Item: "+item+" Preço Unitário: "+precoUnit+" Quantidade: "+quantidade;
        }
        
        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        

        public float getPrecoUnit() {
            return precoUnit;
        }

        public void setPrecoUnit(float precoUnit) {
            this.precoUnit = precoUnit;
        }
    }

    private final EstruturaEstoque[] tabela;
    private final int tamanho = 257;

    /**
     * Retorna o tamanho da tabela
     * @return tamanho da tabela
     */
    public int getTamanho(){
        return this.tamanho;
    }


    /**
     * Construtor da classe
     */
    public HashEstoque(){
        tabela = new EstruturaEstoque[tamanho];
        for(int i = 0; i<tamanho; i++){
            tabela[i] = null;
        }

        this.inserir("Coca-Cola", 5, 10);
        this.inserir("Pepsi", 4, 10);
        this.inserir("Fanta", 3, 10);
        this.inserir("Guaraná", 2, 10);
        this.inserir("Sprite", 1, 10);
        this.inserir("Água", 0.5f, 10);
        this.inserir("Vinho", 10, 10);
    }

    public EstruturaEstoque[] getTabela(){
        return this.tabela;
    }

    /**
     * Retorna a quantidade de espaços preenchidos na tabela
     * ,
     * @return a quantidade de espaços preenchidos
     * 
     */
    public int getEspacosPreenchidos(){
        int count = 0;
        HashEstoque.EstruturaEstoque[] aux = this.getTabela();
        for (HashEstoque.EstruturaEstoque estoqueItem : aux) {
            if (estoqueItem != null) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Insere um item na tabela hash
     * 
     * @param item o item a ser inserido
     * @param precoUnit o preço unitário do item
     * @param quantidade a quantidade do item
     */
    public void inserir(EstruturaEstoque item){
        int hash = codigoHashGen(item.getItem());

        if(tabela[hash]==null){
            tabela[hash] = item;
        }else{
            int i = 1;
            while(tabela[hash+i]!=null && hash+i<tamanho){
                i++;
            }
            if(hash+i<tamanho){
                tabela[hash+i] = item;
                return;
            }
            System.out.println("Tabela cheia");
        }
    }

    /**
     * Reinsere um item na tabela 
     * a partir de uma venda cancelada
     * 
     * é feito para evitar a duplicação de itens
     * 
     * @param item
     * @param precoUnit
     * @param quantidade
     */
    public void inserir(String item, float precoUnit, int quantidade){
        int busca = buscar(item);
        EstruturaEstoque itemEstoque = new EstruturaEstoque(item, precoUnit, quantidade);
        if(busca!=-1){
            tabela[busca].setQuantidade(tabela[busca].getQuantidade()+quantidade);
        }else{
            inserir(itemEstoque);
        }
    }

    /**
     * Busca um item na tabela e retorna o hash
     * 
     * 
     * @param item o item a ser buscado
     * @return o hash do item
     */
    private int buscar(String item){
        int hash = codigoHashGen(item);
        if(tabela[hash]!=null){
            if(tabela[hash].getItem().equals(item)){
                return hash;
            }else{
                int i = 1;
                while(tabela[hash+i]!=null||hash+i<tamanho){
                    if(tabela[hash+i].getItem().equals(item)){
                        return hash+i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }


    /**
     * Busca um item na tabela
     * 
     * @param item o item a ser buscado
     * @return a estrutura do item
     */
    public EstruturaEstoque buscarItem(String item){
        int hash = buscar(item);
        if(hash!=-1){
            return tabela[hash];
        }
        return null;
    }

    /**
     * Retira uma quantidade de um item da tabela
     * 
     * @param item o item a ser retirado
     * @param quantidade a quantidade a ser retirada
     * 
     * @return 0 se a quantidade foi retirada com sucesso, 1 se o item foi removido e -1 se a quantidade é insuficiente
     */
    public byte retirarQuant(String item, int quantidade){
        int hash = buscar(item);
        if(tabela[hash]!=null && hash!=-1){
            if(tabela[hash].getQuantidade()>=quantidade){
                tabela[hash].setQuantidade(tabela[hash].getQuantidade()-quantidade);
                if(tabela[hash].getQuantidade()==0){
                    remover(item);
                    return 1;
                }
                return 0;
            }
            System.out.println("Quantidade insuficiente");
        }
        return -1;
    }

    /**
     * Remove um item da tabela
     * 
     * @param item o item a ser removido
     */
    public void remover(String item){
        int hash = buscar(item);
        if(hash!=-1){
            tabela[hash] = null;
        }
    }
    
}
