package com.posto.xiquexique;

public class HeapVenda{

    private final EstruturaVenda[] heap;
    private int size;
    
    public HeapVenda(int capacity, HashEstoque estoque){
        heap = new EstruturaVenda[estoque.getEspacosPreenchidos()];
        size = 0;
    }

    public class EstruturaVenda{
        private String item;
        private int quantidadeVendida;
        private float precoUnit;
        
        public EstruturaVenda(String item,float precoUnit, int quantidadeVendida){
            this.item=item;
            this.precoUnit=precoUnit;
            this.quantidadeVendida=quantidadeVendida;
        }

        
        @Override
        public String toString(){
            return "Item: "+item+" Preço Unitário: "+precoUnit+" Quantidade Vendida: "+quantidadeVendida+" Valor Total: "+valorTotal();
        }
        
        public float valorTotal(){
            return (precoUnit*quantidadeVendida);
        }

        // <editor-fold defaultstate="collapsed" desc="Getters and Setters">

        public String getItem(){
            return this.item;
        }

        public void setItem(String item){
            this.item = item;
        }

        public int getQuantidadeVendida() {
            return quantidadeVendida;
        }

        public void setQuantidadeVendida(short quantidadeVendida) {
            this.quantidadeVendida = quantidadeVendida;
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

    public EstruturaVenda[] getHeap(){
        return heap;
    }

    public EstruturaVenda getHeap(int index){
        return heap[index];
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
        int parent = (index-1)/2;
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

