import javax.swing.*;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomaNumeros {

    public static void main(String[] args) {
        // Criando a janela principal
        JFrame frame = new JFrame("POSTO XIQUE-XIQUE");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Usando layout nulo para posicionamento absoluto

        // Criando os componentes da interface gráfica
        /*JLabel label1 = new JLabel("Número 1:");
        label1.setBounds(10, 10, 80, 25);
        frame.add(label1);
        
        
        JTextField textField1 = new JTextField();
        textField1.setBounds(100, 10, 160, 25);
        frame.add(textField1);

        JLabel label2 = new JLabel("Número 2:");
        label2.setBounds(10, 40, 80, 25);
        frame.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(100, 40, 160, 25);
        frame.add(textField2);
        */

        JButton button = new JButton("Somar");
        button.setBounds(100, 70, 80, 25);
        frame.add(button);

        JFrame frame1 = new JFrame("Somador de Números");
        frame1.setSize(300, 150);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null); // Usando layout nulo para posicionamento absoluto
        
        /*
        JLabel resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(10, 100, 250, 25);
        frame1.add(resultLabel);
         */

        // Adicionando a ação ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   /*  int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int result = num1 + num2;
                    resultLabel.setText("Resultado: " + result);
                   */
                    frame1.setVisible(true);

                    frame.setFocusableWindowState(true); 
                    frame1.setFocusableWindowState(false);

                } catch (NumberFormatException ex) {
                    System.out.print("Por favor, insira números válidos.");
                }
            }
        });

        // Tornando a janela visível
        frame.setVisible(true);
    }
}