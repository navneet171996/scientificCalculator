import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[12];
    JButton addButton, subButton, mulButton, divButton, powButton, sqrtButton, logButton, factButton;
    JButton decButton, eqlButton, delButton, clrButton;
    JPanel numPanel, funcPanel;
    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    double num1 = 0, num2 = 0, res = 0;
    char operator;

    Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(840, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 600, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        powButton = new JButton("+");
        sqrtButton = new JButton("sqrt");
        logButton = new JButton("ln");
        factButton = new JButton("fact");
        decButton = new JButton(".");
        delButton = new JButton("Del");
        eqlButton = new JButton("=");
        clrButton = new JButton("Clr");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = powButton;
        functionButtons[5] = sqrtButton;
        functionButtons[6] = logButton;
        functionButtons[7] = factButton;
        functionButtons[8] = decButton;
        functionButtons[9] = delButton;
        functionButtons[10] = eqlButton;
        functionButtons[11] = clrButton;

        for(int i=0 ; i<12 ; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        for(int i=0 ; i<10 ; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        numPanel = new JPanel();
        numPanel.setBounds(50, 100, 300, 300);
        numPanel.setLayout(new GridLayout(4, 3, 10, 10));

        numPanel.add(numberButtons[1]);
        numPanel.add(numberButtons[2]);
        numPanel.add(numberButtons[3]);
        numPanel.add(numberButtons[4]);
        numPanel.add(numberButtons[5]);
        numPanel.add(numberButtons[6]);
        numPanel.add(numberButtons[7]);
        numPanel.add(numberButtons[8]);
        numPanel.add(numberButtons[9]);
        numPanel.add(functionButtons[8]);
        numPanel.add(numberButtons[0]);


        frame.add(numPanel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for(int i=0;i<10;i++){
            if(actionEvent.getSource() == numberButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(actionEvent.getSource()==decButton){
            textField.setText(textField.getText().concat("."));
        }
        if(actionEvent.getSource()==addButton){
            num1 = Double.parseDouble(textField.getText());
        }
    }
}
