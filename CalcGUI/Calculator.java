/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcGUI;

import java.applet.Applet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Auzz
 */
public class Calculator extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    static int width = 500;
    static int height = 500;
    boolean check = false;
    boolean start = true;
    JButton test;
    JTextField Display;
    
    public Calculator() {
        
        //create the frame and name of the calculator
        JFrame calc = new JFrame("413 Calculator");
        setLayout(new BorderLayout());
        
        //create elements the buttons will display from left to right
        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+"};
        
        //the panels hold the content for the text field and key pad
        JPanel textArea = new JPanel();
        JPanel keyPad = new JPanel();
        
        //set default close and calculator dimensions 
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setBounds(0, 0, width, height);
        
        //create the grid for the calculator 
        GridLayout keys = new GridLayout(4, 4);
        keyPad.setLayout(keys);
        
        //set initial value in text display to 0
        //display the text field
        Display = new JTextField("0", 30);
        Display.setHorizontalAlignment(JTextField.RIGHT);
        textArea.add(Display);
        
        //add panels to calc
        calc.add(textArea, BorderLayout.NORTH);
        calc.add(keyPad, BorderLayout.CENTER);

        //load buttons with elements from string 
        for (int i = 0; i < buttons.length; i++) {
            JButton newButton = new JButton(buttons[i]);
            newButton.addActionListener(this);
            keyPad.add(newButton);
        }

        //this line displays the calculator 
        calc.setVisible(true);
    }

    public void Result() {
        String input = Display.getText();
        
        //statement inputs values into the text field according 
        //to which key has been pressed
        if (input.equalsIgnoreCase("0") && start == true) {
            Display.setText(test.getText());
            start = false;
            
            //when the 'C' key is pressed it will delete one digit
        } else if (test.getText().equalsIgnoreCase("C")) {
            if (input.length() > 0) {
                input = input.substring(0, input.length() - 1);
                Display.setText(input);
            }
        } else if (test.getText().equalsIgnoreCase("=") && check == false) {
            Evaluator anEvaluator = new Evaluator();
            Integer result = anEvaluator.eval(this.Display.getText());
            this.Display.setText(result.toString());
            check = true;
        } else {
            Display.setText(input + test.getText());
            check = false;
        }
    }
     
    @Override
    public void actionPerformed(ActionEvent arg0) {
        test = (JButton) arg0.getSource();
        Result();
    }
    public static void main(String[] args){
        Calculator newCalc = new Calculator();
    }
}
