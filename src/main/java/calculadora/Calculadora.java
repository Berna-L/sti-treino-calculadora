package calculadora;

import calculadora.operacao.OperacaoFactory;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bernardolopes at id.uff.br
 */
public class Calculadora {

    private OperacaoFactory fac;
    
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.setOperacaoFactory(new OperacaoFactory());
        c.run();
    }

    public void setOperacaoFactory(OperacaoFactory fac){
        this.fac = fac;
    }
        
    public void run(){

    }
    
}
