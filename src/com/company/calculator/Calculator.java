package com.company.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculator extends JFrame implements ActionListener {

    private DecimalFormat df = new DecimalFormat("#,###.00");
    //creating symbols of buttons
    private String[] symbols = {
            "AC", "+/-", "%", "÷",
            "7", "8", "9", "x",
            "4", "5", "6", "-",
            "3", "2", "1", "+",
            "0", ".", "Adv", "="
    };
    private int operator = 0;
    private JPanel panel = new JPanel(new BorderLayout(5, 5));
    private JPanel btnPanel = new JPanel(new GridLayout(5, 3, 2, 2));
    private JButton[] btns = new JButton[20];
    private JTextArea screen = new JTextArea(5, 40);
    private double firstNum = 0, secondNum = 0;
    private JTextField calculatingTf = new JTextField(60);

    public Calculator(){
        init();
    }

    private void init() {
        screen.setFont(new Font("Times New Roman", Font.BOLD, 18));
        setTitle("Calculator");
        screen.setBackground(Color.BLACK);
        panel.setBackground(Color.BLACK);
        btnPanel.setBackground(Color.BLACK);
        screen.setForeground(Color.WHITE);

        for (int i=0; i< btns.length; i++){
            btns[i] = new JButton(symbols[i]);

            btns[i].setOpaque(false);
            btns[i].setBorderPainted(false);
            btns[i].setBackground(Color.BLACK);
            btns[i].setForeground(Color.WHITE);
            btns[i].addActionListener(this);
            btnPanel.add(btns[i]);
        }

        calculatingTf.setForeground(Color.GRAY);
        calculatingTf.setBackground(Color.BLACK);

        panel.add(calculatingTf, BorderLayout.NORTH);
        panel.add(btnPanel, BorderLayout.CENTER);
        panel.add(screen, BorderLayout.NORTH);

        add(panel);
        setSize(450, 500);//calculator size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when we exit
        setVisible(true); //by default it's false
    }

    public static void main(String[] args) {
        Calculator c =  new Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand().toString();

        switch (cmd){
            case ".":
                if (!screen.getText().contains(".")){
                    screen.setText(screen.getText()+".");
                }
                break;
            case "0":
                screen.setText(screen.getText()+"0");
                break;
            case "1":
                screen.setText(screen.getText()+"1");
                break;
            case "2":
                screen.setText(screen.getText()+"2");
                break;
            case "3":
                screen.setText(screen.getText()+"3");
                break;
            case "4":
                screen.setText(screen.getText()+"4");
                break;
            case "5":
                screen.setText(screen.getText()+"5");
                break;
            case "6":
                screen.setText(screen.getText()+"6");
                break;
            case "7":
                screen.setText(screen.getText()+"7");
                break;
            case "8":
                screen.setText(screen.getText()+"8");
                break;
            case "9":
                screen.setText(screen.getText()+"9");
                break;

            case "+":
                if (!screen.getText().isEmpty()){
                    firstNum = Double.parseDouble(screen.getText().toString());
                    operator = 1;
                    screen.setText("");
                }
                break;
            case "-":
                if (!screen.getText().isEmpty()){
                    firstNum = Double.parseDouble(screen.getText().toString());
                    operator = 2;
                    screen.setText("");
                }
                break;
            case "x":
                if (!screen.getText().isEmpty()){
                    firstNum = Double.parseDouble(screen.getText().toString());
                    operator = 3;
                    screen.setText("");
                }
                break;
            case "÷":
                if (!screen.getText().isEmpty()){
                    firstNum = Double.parseDouble(screen.getText().toString());
                    operator = 4;
                    screen.setText("");
                }
                break;

            case "AC":
                screen.setText("");
                break;

            case "%":
                double num = Double.parseDouble(screen.getText().toString());
                screen.setText(String.valueOf(num/100.0));
                break;

            case "+/-":
                double negative = Double.parseDouble(screen.getText().toString());
                negative *= -1;

            default:
        }
        if (cmd.equalsIgnoreCase("=")){
            if (!screen.getText().isEmpty()){
                secondNum =
                        secondNum = Double.parseDouble(screen.getText().toString());

                switch (operator){
                    case 1: //Addition
                        screen.setText(String.valueOf(firstNum + secondNum));
                        calculatingTf.setText(String.valueOf(firstNum+" + "+secondNum+" = "+
                                (df.format(firstNum+secondNum))));
                        break;
                    case 2: //Subtraction
                        screen.setText(String.valueOf(firstNum - secondNum));
                        calculatingTf.setText(String.valueOf(firstNum+" - "+secondNum+" = "+
                                (df.format(firstNum-secondNum))));
                        break;
                    case 3: //Multiplication
                        screen.setText(String.valueOf(firstNum * secondNum));
                        calculatingTf.setText(String.valueOf(firstNum+" x "+secondNum+" = "+
                                (df.format(firstNum*secondNum))));
                        break;
                    case 4: //Division
                        screen.setText(String.valueOf(firstNum / secondNum));
                        calculatingTf.setText(String.valueOf(firstNum+" / "+secondNum+" = "+
                                (df.format(firstNum/secondNum))));
                        break;
                    default:
                }
            }
        }
    }
}

