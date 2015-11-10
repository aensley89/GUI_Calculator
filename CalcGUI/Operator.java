/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcGUI;

import java.util.HashMap;

/**
 *
 * @author Auzz
 */
public abstract class Operator {
    
    public static HashMap<String, Operator> operator = new HashMap<>();
    
    abstract int priority();
    
    public static void IntializeHashMap() {
        operator.put("+", new AdditionOperator("+"));
        operator.put("-", new SubtractionOperator("-"));
        operator.put("*", new MultiplicationOperator("*"));
        operator.put("/", new DivisionOperator("/"));
        operator.put("#", new PoundOperator("#"));
        operator.put("!", new ExclamationOperator("!"));
    }
    
    static boolean check(String tok) {
        if(operator.containsKey(tok))
            return true;
        return false;   
    } 
    
    abstract Operand execute(Operand opd1, Operand opd2);
    
    
}
