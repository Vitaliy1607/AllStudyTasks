package Calculator;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class App extends JFrame {
    private JLabel firstcountLabel = new JLabel("Enter first value");
    private JTextField firstcountInput = new JTextField();

    private JLabel secondcountLabel = new JLabel("Enter second value");
    private JTextField secondcountInput = new JTextField();

    private JLabel resultLabel = new JLabel("result");
    private JTextField resultInput = new JTextField();

    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton multiPly = new JButton("*");
    private JButton divide = new JButton("/");
    private JButton equals = new JButton("=");
    private JButton clearButton = new JButton("clear");

    public App(){
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350 , 200);

        Container container = getContentPane();
        container.setLayout(new GridLayout(4 , 5));

        container.add(firstcountLabel);
        container.add(firstcountInput);
        container.add(secondcountLabel);
        container.add(secondcountInput);
        container.add(resultLabel);
        container.add(resultInput);
        container.add(plus);
        container.add(minus);
        container.add(multiPly);
        container.add(divide);
        container.add(clearButton);

        container.add(equals);
clearButton.addActionListener(e -> clearAll());
plus.addActionListener(e -> {
           Integer a = Integer.valueOf(firstcountInput.getText());
           Integer b = Integer.valueOf(secondcountInput.getText());

       });
    }

    private void clearAll(){
        firstcountInput.setText("");
        secondcountInput.setText("");
    }

    private void actionPlus(double a , double b){

    }
    private void addValInVariable(double a , double b){

    }

}
