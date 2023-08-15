/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varun
 */
//public class newdynamic {
 
    
    import javax.swing.*;
import javax.swing.event.*;
import java.text.DecimalFormat;

      public class newdynamic{
           
          public static void main(String []args){
                new CurrencyConverter();
          }
      }
    class CurrencyConverter extends JFrame {
    private static final String[] UNITS = { "", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen" };
    private static final String[] TENS = { "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety" };
    private static final String[] THOUSANDS = { "", "thousand", "lakh", "crore" };
    private JTextField inputField;
    private JLabel outputLabel;
    
    public CurrencyConverter() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        setSize(400, 200);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        
        JLabel inputLabel = new JLabel("Enter amount in figures:");
        inputField = new JTextField();
        inputField.getDocument().addDocumentListener(new InputListener());
        outputLabel = new JLabel();
        
        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(outputLabel);
        
        add(panel);
        setVisible(true);
    }
    
    private class InputListener implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateOutput();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateOutput();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateOutput();
        }

        private void updateOutput() {
            String input = inputField.getText().trim();
            if (!input.isEmpty()) {
                try {
                    double amount = Double.parseDouble(input);
                    String amountInWords = convert(amount);
                    outputLabel.setText("Amount in words: " + amountInWords);
                } catch (NumberFormatException ex) {
                    outputLabel.setText("Invalid input");
                }
            } else {
                outputLabel.setText("");
            }
        }
    }
    
    private static String convert(double number) {
        DecimalFormat formatter = new DecimalFormat("#,##,###.00");
        String[] parts = formatter.format(number).split("\\.");
        int wholePart = Integer.parseInt(parts[0]);
        int decimalPart = Integer.parseInt(parts[1]);

        String words = "";
        int index = 0;
        do {
            int num = wholePart % 1000;
            if (num != 0) {
                String str = convertLessThanOneThousand(num);
                words = str + " " + THOUSANDS[index] + " " + words;
            }
            index++;
            wholePart /= 1000;
        } while (wholePart > 0);

        if (decimalPart > 0) {
            String decimalWords = convertLessThanOneThousand(decimalPart);
            words += "and " + decimalWords + " paise";
        }

        return words.trim();
    }
    
      private static String convertLessThanOneThousand(int number) {
    String word = "";
    if (number % 100 < 20) {
        word = UNITS[number % 100];
        number /= 100;
    } else {
        word = UNITS[number % 10];
        number /= 10;
        
        word = TENS[number % 10] + " " + word;
        number /= 10;
    }
    
    if (number != 0) {
        word = UNITS[number] + " hundred " + word;
    }
    
    return word.trim();
}
    
}


