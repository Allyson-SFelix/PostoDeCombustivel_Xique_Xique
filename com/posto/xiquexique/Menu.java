package com.posto.xiquexique;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {

    JButton closeButton;
    public static class Vendas{
        private JFrame frameVenda;
        private JFrame frameVisualizarVenda;

        private float valorTotal(EstruturaVenda dadosVenda){
            return (dadosVenda.getPrecoUnit() * dadosVenda.getQuantidadeVendida());
        }

        private void visualizarVendas(EstruturaVenda dadosVenda){
            frameVisualizarVenda = new JFrame("Visualizar Vendas");
            frameVisualizarVenda.setLocation(300, 100);
            frameVisualizarVenda.setSize(400, 300);
            frameVisualizarVenda.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frameVisualizarVenda.setLayout(null);
            
            JLabel labelItem = new JLabel("Item"+dadosVenda.getItem());
            labelItem.setBounds(10, 10, 80, 25);
            frameVisualizarVenda.add(labelItem);
            

            JLabel labelPrecoUnit = new JLabel("Preco Unitario"+dadosVenda.getPrecoUnit());
            labelPrecoUnit.setBounds(10,50,80, 25);
            
            frameVisualizarVenda.add(labelPrecoUnit);

            JLabel labelQuant = new JLabel("Quantidade"+dadosVenda.getQuantidadeVendida());
            labelQuant.setBounds(10,100 ,80, 25);
            frameVisualizarVenda.add(labelQuant);


            JLabel label1 = new JLabel("Preco Total"+valorTotal(dadosVenda));
            label1.setBounds(10, 150 ,80, 25);
            frameVisualizarVenda.add(label1);
            

            frameVisualizarVenda.setVisible(true);
        
        }
        
        private Vendas(){
            frameVenda = new JFrame("Vendas");
            frameVenda.setLocation(300, 100);
            frameVenda.setSize(500, 400);
            frameVenda.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frameVenda.setLayout(null);

            /*Visualizar Vendas */
            
            JButton button = new JButton("APARECER");
            button.setBounds(100, 70, 80, 25);
            frameVenda.add(button);


            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    visualizarVendas(new EstruturaVenda("Gasolina",5.0f,100));
                }
            });
            
            frameVenda.setVisible(true);
        }

        

    }

    // private class Estoque{

    // }
    
    public static void main(String[] args){
        Vendas venda= new Vendas();

    } 
}
