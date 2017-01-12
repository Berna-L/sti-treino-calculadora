/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.operacao;

/**
 *
 * @author bernardolopes at id.uff.br
 */
public class Soma implements Operacao {
    
    @Override
    public int executar(int a, int b) {
        return a + b;
    }
}
