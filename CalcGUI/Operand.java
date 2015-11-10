/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcGUI;

/**
 *
 * @author Auzz
 */
public class Operand {
    
    public int a;
    
    Operand(String tok){
        a = Integer.parseInt(tok);
    }    
    
    Operand(int value) {
        a = value;
    }
    
    static boolean check(String tok) {
        try {
            Integer.parseInt(tok);
        } catch(NumberFormatException e) {
            return false;
        }   
        return true;
    }
    
    int getValue(){
        return a;
        
    }
    
}

