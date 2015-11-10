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
public class MultiplicationOperator extends Operator {
    
    String tok;
    
    public MultiplicationOperator(String token) {
        tok = token;
    }

    @Override
    int priority() {
        return 3;
    }

    @Override
    Operand execute(Operand opd1, Operand opd2) {
        int product = opd1.getValue() * opd2.getValue();
        return new Operand(product);
    }
    
}
