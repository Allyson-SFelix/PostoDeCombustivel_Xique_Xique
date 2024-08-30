/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.posto.xiquexique;

/**
 *
 * @author aliran
 */
public class Main {
    private static HashEstoque estoque;

    public Main() {
        estoque = new HashEstoque();
    }

    public static void main(String[] args) {
        VendasMenuFrame vendasMenu = new VendasMenuFrame(estoque);
        vendasMenu.setVisible(true);

    }
    
}
