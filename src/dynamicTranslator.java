/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varun
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;
public class dynamicTranslator extends JFrame {
 

//public class CurrencyConverter extends JFrame {
    private static final String[] UNITS = { "", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen" };
    private static final String[] TENS = { "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety" };
    private static final String[] THOUSANDS = { "", "thousand", "million", "billion" };
    
    private JTextField amountField;
    private JLabel wordsLabel;

    public dynamicTranslator() {
        super("Currency Converter");
        setLayout(new FlowLayout());

        amountField = new JTextField(10);
        wordsLabel = new JLabel();
        wordsLabel.setPreferredSize(new Dimension(200, 20));

        add(new JLabel("Enter amount in figures:"));
        add(amountField);
        add(new JLabel("Amount in words:"));
        add(wordsLabel);

        amountField.addKeyListener(new TextListener());
    }

    private class TextListener extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
            String amountText = amountField.getText();
            if (amountText.isEmpty()) {
                wordsLabel.setText("");
                return;
            }
            try {
                double amount = Double.parseDouble(amountText);
                String inWords = convertToWords(amount);
                wordsLabel.setText(inWords);
            } catch (NumberFormatException ex) {
                wordsLabel.setText("Invalid amount");
            }
        }
    }

    public String convertToWords(double amount) {
        if (amount == 0) {
            return "zero";
        }

        DecimalFormat df = new DecimalFormat("#.##");
        String[] arr = df.format(amount).split("\\.");

        int num = Integer.parseInt(arr[0]);

        StringBuilder sb = new StringBuilder();

        int index = 0;
        do {
            int n = num % 1000;
            if (n != 0) {
                String s = convertLessThanOneThousand(n);
                sb.insert(0, s + THOUSANDS[index] + " ");
            }
            index++;
            num /= 1000;
        } while (num > 0);

        if (arr.length > 1) {
            int paise = Integer.parseInt(arr[1]);
            sb.append("and " + convertLessThanOneThousand(paise) + " paise");
        }

        return sb.toString().trim();
    }

 /*   private static String convertLessThanOneThousand(int number) {
        if (number % 100 < 20) {
            return UNITS[number % 100];
        } else {
            return TENS[number / 10 % 10] + " " + UNITS[number % 10];
        }
    }
*/

      private static String convertLessThanOneThousand(int number) {
    if (number % 100 < 20) {
        return UNITS[number % 100];
    } else {
        return TENS[number / 10 % 10] + " " + UNITS[number % 10];
    }
}

    
    public static void main(String[] args) {
        dynamicTranslator converter = new dynamicTranslator();
        converter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        converter.setSize(300, 150);
        converter.setVisible(true);
    }
}

    

