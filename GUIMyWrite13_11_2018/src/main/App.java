package main;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    private ButtonGroup genders = new ButtonGroup();
    private JLabel nameLabel = new JLabel("Name:" );
    private JTextField nameInput = new JTextField();

    private JLabel ageLabel = new JLabel("Age: ");
    private JTextField ageInput = new JTextField();

    private JRadioButton maleButton = new JRadioButton("male");
    private JRadioButton femaleButton = new JRadioButton("female");

    private JButton clearButton = new JButton("Clear: ");
    private JButton createButton = new JButton("Create: ");

    public App()  {
        super("User creator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250 , 200);
        Container container = getContentPane();
        container.setLayout(new GridLayout(4 , 2));

        container.add(nameLabel);
        container.add(nameInput);
        container.add(ageLabel);
        container.add(ageInput);


        genders.add(maleButton);
        genders.add(femaleButton);
        container.add(maleButton);
        container.add(femaleButton);

        container.add(clearButton);
        container.add(createButton);

        clearButton.addActionListener((e) -> clearALL());
        createButton.addActionListener((e) ->{
            String name = nameInput.getText();
            try {
                Integer age = Integer.valueOf(ageInput.getText());
                String gender = maleButton.isSelected() ? "Male" : "Female";
                System.out.println(new User(name , age , gender));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null , "age incorrect" , "Error" , JOptionPane.ERROR_MESSAGE);
                clearALL();
                return;
            }
        });

    }
    private void clearALL(){
        nameInput.setText("");
        ageInput.setText("");
        genders.clearSelection();
    }
}
