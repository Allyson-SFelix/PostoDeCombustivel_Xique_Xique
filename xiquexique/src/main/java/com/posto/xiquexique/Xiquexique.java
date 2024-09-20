/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posto.xiquexique;

/**
 *
 * @author aliran
 */
public class Xiquexique {
    private static HashEstoque estoque;

    public Xiquexique() {
        estoque = new HashEstoque();
    }

    public static void main(String[] args) {
        estoque = new HashEstoque();
        VendasMenuFrame vendasMenu = new VendasMenuFrame(estoque);
        vendasMenu.setVisible(true);
        EstoqueMenu estoqueMenu = new EstoqueMenu(estoque);
        estoqueMenu.setVisible(true); 
    }
    
}
