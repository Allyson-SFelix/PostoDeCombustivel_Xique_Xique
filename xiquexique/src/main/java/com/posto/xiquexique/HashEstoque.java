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


    /**
     * Generates a hash code for the given item using a hash function.
     * 
     * @param item the item to generate the hash code for
     * @return the generated hash code
     */
    public int codigoHashGen(String item){
        // TODO lembrar de implementar a função hash
        int hash = item.hashCode();
        if(hash<0){
            hash = hash*-1;
        }
        return hash%tamanho;

    };

    public class EstruturaEstoque{
        private String item;
        private int quantidade;
        private float precoUnit;
        private final String codigo;

        
        public EstruturaEstoque(String item,float precoUnit, int quantidade, String codigo){
            this.item=item;
            this.precoUnit=precoUnit;
            this.quantidade=quantidade;
            this.codigo = codigo;
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
     * Inserts an item into the hash table.
     * 
     * @param item the item to be inserted
     * @param precoUnit the unit price of the item
     * @param quantidade the quantity of the item
     */
    public void inserir(String item, float precoUnit, int quantidade){
        int hash = codigoHashGen(item)%tamanho;

        if(tabela[hash]==null){
            tabela[hash] = new EstruturaEstoque(item, precoUnit, quantidade, hash+"");
        }else{
            int i = 1;
            while(tabela[hash+i]!=null){
                i++;
            }
            tabela[hash+i] = new EstruturaEstoque(item, precoUnit, quantidade, hash+i+"");
        }
    }

    /**
     * Removes a specified quantity of an item from the inventory.
     * 
     * @param item The item to be removed.
     * @param quantidade The quantity of the item to be removed.
     * @return 0 if the item was successfully removed, 1 if the item was completely removed from the inventory, -1 if the quantity is insufficient.
     */
    public byte retirarQuant(String item, int quantidade){
        int hash = codigoHashGen(item)%tamanho;
        if(tabela[hash]!=null){
            if(tabela[hash].getItem().equals(item)){
                if(tabela[hash].getQuantidade()>quantidade){
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
                        if(tabela[hash+i].getQuantidade()>quantidade){
                            tabela[hash+i].setQuantidade((int) (tabela[hash+i].getQuantidade()-quantidade));
                            return 0;
                            
                        } else if (tabela[hash].getQuantidade() == quantidade){
                            remover(tabela[hash].getItem());
                            return 1;
                            
                        }
                        System.out.println("Quantidade insuficiente");
                        return -1;
                        
                    }
                    i++;
                }
            }
            
        }
        return -1;
    }

    /**
     * Removes an item from the hash table.
     * 
     * @param item the item to be removed
     */
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
