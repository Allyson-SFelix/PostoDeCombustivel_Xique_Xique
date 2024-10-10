
package com.posto.xiquexique;

import java.time.LocalDateTime;

public class HeapVenda{

    private final EstruturaVenda[] heap;
    private int size;
    private final LocalDateTime creationTime;
    private int id;

    public HeapVenda(HashEstoque estoque){
        heap = new EstruturaVenda[estoque.getEspacosPreenchidos()];
        size = 0;
        creationTime = LocalDateTime.now();
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public class EstruturaVenda{
        private String item;
        private int quantidade;
        private float precoUnit;
        
        public EstruturaVenda(String item,float precoUnit, int quantidade){
            this.item=item;
            this.precoUnit=precoUnit;
            this.quantidade=quantidade;
        }

        
        @Override
        public String toString(){
            return "Item: "+item+" Preço Unitário: "+precoUnit+" Quantidade Vendida: "+quantidade+" Valor Total: "+valorTotal();
        }
        
        public float valorTotal(){
            return (precoUnit*quantidade);
        }

        // <editor-fold defaultstate="collapsed" desc="Getters and Setters">

        public String getItem(){
            return this.item;
        }

        public void setItem(String item){
            this.item = item;
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
        // </editor-fold>

    }

    public int getSize(){
        return size;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public EstruturaVenda[] getHeap(){
        return heap;
    }

    public float getValorTotal(){
        float total = 0;
        for(int i = 0; i < this.getSize(); i++){
            total += this.getHeap()[i].valorTotal();
        }
        return total;
    }

    public int getQuantidadeTotal(){
        int total = 0;
        for(int i = 0; i < this.getSize(); i++){
            total += this.getHeap()[i].getQuantidade();
        }
        return total;
    }

    public EstruturaVenda getHeap(int index){
        return heap[index];
    }

    public int search(String item){
        for(int i = 0; i < size; i++){
            if(heap[i].getItem().equals(item)){
                return i;
            }
        }
        return -1;
    }

    public void insert(EstruturaVenda item){
        heap[size] = item;
        heapifyUp(size);
        size++;
    }

    public EstruturaVenda remove(){
        EstruturaVenda item = heap[0];
        size--;
        heap[0] = heap[size];
        heapifyDown(0);
        return item;
    }

    public void heapifyUp(int index){
        int parent = (index)/2;
        if(index > 0 && heap[index].valorTotal() > heap[parent].valorTotal()){
            swap(index, parent);
            heapifyUp(parent);
        }
    }

    public void heapifyDown(int index){
        int left = 2*index;
        int right = 2*index+1;
        int largest = index;
        if(left < size && heap[left].valorTotal() > heap[largest].valorTotal()){
            largest = left;
        }
        if(right < size && heap[right].valorTotal() > heap[largest].valorTotal()){
            largest = right;
        }
        if(largest != index){
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    public void swap(int i, int j){
        EstruturaVenda temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }


}

