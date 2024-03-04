import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[13];
    JButton addButton, subButton, mulButton, divButton, powButton, sqrtButton, logButton, factButton;
    JButton decButton, eqlButton, delButton, clrButton, negButton;
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
        powButton = new JButton("^");
        sqrtButton = new JButton("√");
        logButton = new JButton("ln");
        factButton = new JButton("n!");
        decButton = new JButton(".");
        delButton = new JButton("Del");
        eqlButton = new JButton("=");
        clrButton = new JButton("Clr");
        negButton = new JButton("neg");

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
        functionButtons[12] = negButton;

        for(int i=0 ; i<13 ; i++){
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

        funcPanel = new JPanel();
        funcPanel.setBounds(500, 100, 300, 300);
        funcPanel.setLayout(new GridLayout(4, 4, 10, 10));

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


        funcPanel.add(functionButtons[0]);
        funcPanel.add(functionButtons[1]);
        funcPanel.add(functionButtons[2]);
        funcPanel.add(functionButtons[3]);
        funcPanel.add(functionButtons[4]);
        funcPanel.add(functionButtons[5]);
        funcPanel.add(functionButtons[6]);
        funcPanel.add(functionButtons[7]);
        funcPanel.add(functionButtons[9]);
        funcPanel.add(functionButtons[10]);
        funcPanel.add(functionButtons[11]);
        funcPanel.add(functionButtons[12]);

        frame.add(numPanel);
        frame.add(funcPanel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();
    }

    public static double factorial(double x){
        if(x == 0)
            return 0;
        if(x == 1)
            return 1;
        return x * factorial(x-1);
    }

    public static double sqrt(double x){
        return Math.sqrt(x);
    }

    public static double log(double x){
        return Math.log(x);
    }

    public static double pow(double x, double y){
        return Math.pow(x, y);
    }

    public static double add(double x, double y){
        return x+y;
    }

    public static double subtract(double x, double y){
        return x-y;
    }

    public static double multiply(double x, double y){
       return x*y;
    }

    public static double divide(double x, double y){
        return x/y;
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
            operator = '+';
            textField.setText("");
        }
        if(actionEvent.getSource()==subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if(actionEvent.getSource()==mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if(actionEvent.getSource()==divButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if(actionEvent.getSource()==powButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '^';
            textField.setText("");
        }
        if(actionEvent.getSource()==sqrtButton){
            num1 = Double.parseDouble(textField.getText());
            res = Math.sqrt(num1);
            textField.setText(String.valueOf(res));
        }
        if(actionEvent.getSource()==factButton){
            num1 = Double.parseDouble(textField.getText());
            res = factorial(num1);
            textField.setText(String.valueOf(res));
        }
        if(actionEvent.getSource()==logButton){
            num1 = Double.parseDouble(textField.getText());
            res = Math.log(num1);
            textField.setText(String.valueOf(res));
        }
        if(actionEvent.getSource()==eqlButton){
            num2 = Double.parseDouble(textField.getText());
            switch (operator){
                case '+':
                    res = num1+num2;
                    break;
                case '-':
                    res = num1-num2;
                    break;
                case '*':
                    res = num1*num2;
                    break;
                case '/':
                    res = num1/num2;
                    break;
                case '^':
                    res = Math.pow(num1, num2);
                    break;
            }
            textField.setText(String.valueOf(res));
            num1 = res;
        }
        if(actionEvent.getSource()==clrButton){
            textField.setText("");
        }
        if(actionEvent.getSource()==delButton){
            String s = textField.getText();
            textField.setText("");
            for(int i=0; i<s.length()-1;i++){
                textField.setText(textField.getText()+s.charAt(i));
            }
        }
        if(actionEvent.getSource()==negButton){
            double temp = Double.parseDouble(textField.getText());
            temp*=-1;
            textField.setText(String.valueOf(temp));
        }
    }
}
