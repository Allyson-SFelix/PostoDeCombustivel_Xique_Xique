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
    private static EstruturaFuncionarios funcionarios;

    public Xiquexique() {
        funcionarios = new EstruturaFuncionarios("admin", "00000000000", "admin");
        estoque = new HashEstoque();
        new LoginMenu(estoque, funcionarios).setVisible(true);
    }

    public static void main(String[] args) {
        funcionarios = new EstruturaFuncionarios("admin", "00000000000", "admin");
        estoque = new HashEstoque();
        new LoginMenu(estoque, funcionarios).setVisible(true);
        
    }
    
}
