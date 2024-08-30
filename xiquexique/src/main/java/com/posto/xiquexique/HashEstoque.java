/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.posto.xiquexique;

/**
 *
 * @author aliran
 */
public final class HashEstoque{
    public int codigoHashGen(String item){
        return item.hashCode();

    };

    public class EstruturaEstoque{
        private String item;
        private int quantidade;
        private float precoUnit;
        private final String codigo;

        
        public EstruturaEstoque(String item,float precoUnit, int quantidade){
            this.item=item;
            this.precoUnit=precoUnit;
            this.quantidade=quantidade;
            this.codigo = String.valueOf(codigoHashGen(item));
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
    private final int tamanho = 255;

    public HashEstoque(){
        tabela = new EstruturaEstoque[tamanho];
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

    public byte retirarQuant(String item, int quantidade){
        int hash = codigoHashGen(item)%tamanho;
        if(tabela[hash]!=null){
            if(tabela[hash].getItem().equals(item)){
                if(tabela[hash].getQuantidade()>=quantidade){
                    tabela[hash].setQuantidade((int) (tabela[hash].getQuantidade()-quantidade));
                    return 0;
                } else if (tabela[hash].getQuantidade() == quantidade){
                    remover(tabela[hash].getItem());
                    return 1;
                }
                
                else{
                    System.out.println("Quantidade insuficiente");
                    return -1;
                }
                
            }else{
                int i = 1;
                while(tabela[hash+i]!=null){
                    if(tabela[hash+i].getItem().equals(item)){
                        if(tabela[hash+i].getQuantidade()<quantidade){
                            System.out.println("Quantidade insuficiente");
                            return -1;

                        } else if (tabela[hash].getQuantidade() == quantidade){
                            remover(tabela[hash].getItem());
                            return 1;
                            
                        }
                        tabela[hash+i].setQuantidade((int) (tabela[hash+i].getQuantidade()-quantidade));
                        return 0;
                    }
                    i++;
                }
            }
            
        }
        return -1;
    }

    public void remover(String item){
        int hash = codigoHashGen(item)%tamanho;
        if(tabela[hash]!=null){
            if(tabela[hash].getItem().equals(item)){
                tabela[hash] = null;
            }else{
                int i = 1;
                while(tabela[hash+i]!=null){
                    if(tabela[hash+i].getItem().equals(item)){
                        tabela[hash+i] = null;
                        break;
                    }
                    i++;
                }
            }
        }
    }
    
}
