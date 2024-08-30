package com.posto.xiquexique;

public class EstruturaVenda{
        private String item;
        private int quantidadeVendida;
        private float precoUnit;
        
        public EstruturaVenda(String item,float precoUnit, int quantidadeVendida){
            this.item=item;
            this.precoUnit=precoUnit;
            this.quantidadeVendida=quantidadeVendida;
        }
        
        public String getItem(){
            return this.item;
        }

        

        public void setItem(String item){
            this.item = item;
        }

        @Override
        public String toString(){
            return "Item: "+item+" Preço Unitário: "+precoUnit+" Quantidade Vendida: "+quantidadeVendida+" Valor Total: "+valorTotal();
        }
        
        private float valorTotal(){
            return (precoUnit*quantidadeVendida);
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
        
}
