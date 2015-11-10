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
public class ExclamationOperator extends Operator {
    
    String tok;
    
    public ExclamationOperator(String token) {
        tok = token;
    }

    @Override
    int priority() {
        return 1;
    }

    @Override
    Operand execute(Operand opd1, Operand opd2) {
        return opd1;       
    }
    
}
