/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.posto.xiquexique;

/**
 *
 * @author aliran
 */
public class HashEstoque{

    private class EstruturaEstoque{
        private String item;
        private int quantidade;
        private float precoUnit;
        private String codigo;
        
        public EstruturaEstoque(String item,float precoUnit, int quantidade){
            this.item=item;
            this.precoUnit=precoUnit;
            this.quantidade=quantidade;
            this.codigo = item.hashCode()+"";
        }
        
        public String getItem(){
            return this.item;
        }

        public String getCodigo(){
            return this.codigo;
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

        public void setQuantidade(short quantidade) {
            this.quantidade = quantidade;
        }

        

        public float getPrecoUnit() {
            return precoUnit;
        }

        public void setPrecoUnit(float precoUnit) {
            this.precoUnit = precoUnit;
        }
    }

    private EstruturaEstoque[] tabela;
    private final int tamanho = 255;

    public HashEstoque(){
        tabela = new EstruturaEstoque[tamanho];
    }

    public void inserir(String item, float precoUnit, int quantidade){
        int hash = item.hashCode()%tamanho;
        if(tabela[hash]==null){
            tabela[hash] = new EstruturaEstoque(item, precoUnit, quantidade);
        }else{
            int i = 1;
            while(tabela[hash+i]!=null){
                i++;
            }
            tabela[hash+i] = new EstruturaEstoque(item, precoUnit, quantidade);
        }
    }

    
}
