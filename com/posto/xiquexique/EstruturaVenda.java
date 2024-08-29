package com.posto.xiquexique;

public class EstruturaVenda{
        private String item;
        private float preco;
        private short quantidadeVendida;
        private float precoUnit;
        
        
        public String getItem(){
            return this.item;
        }

        

        public void setItem(String item){
            this.item = item;
        }

        public float getPreco(){
            return this.preco;
        }
        
        private float valorTotal(){
            return (precoUnit*quantidadeVendida);
        }



        public void setPreco(float preco) {
            this.preco = preco;
        }



        public short getQuantidadeVendida() {
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
        
}
