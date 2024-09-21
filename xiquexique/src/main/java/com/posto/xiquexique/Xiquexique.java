/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posto.xiquexique;

/**
 * Classe principal do sistema
 * 
 * Trata-se de um sistema de gerenciamento de estoque e vendas de um posto de gasolina
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
        LoginMenu loginMenu = new LoginMenu(estoque);
        loginMenu.setVisible(true);
        
        
    }
    
}
