/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.util;

import calculadora.operacao.TipoOperacao;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bernardolopes at id.uff.br
 */
public class Util {
        
    public static final String TEXTO_SELETOR =
            "Escolha a operação:\n"
            + "1 -- Soma\n"
            + "2 -- Subtração\n"
            + "3 -- Multiplicação\n"
            + "4 -- Divisão";

    public static final String TEXTO_VALOR = 
            "Insira qual será o %dº valor para a operação de %s:";
    
    public static final String TEXTO_RESULTADO = 
            "O resultado da %s é: %d";
    
    public static TipoOperacao getOperacaoDesejada(Scanner in) {
        TipoOperacao to = null;
        int escolha = 0;
        do{
            System.out.println(TEXTO_SELETOR);
            escolha = in.nextInt();
            try{
                to = numeroParaOperacao(escolha);
            } catch (IllegalArgumentException e){ }
        } while(to == null);
        return to;
    }
    
    public static int getValor(Scanner in, String desc, int indice){
        System.out.println(String.format(TEXTO_VALOR, indice, desc));
        return in.nextInt();
    }
    
    public static TipoOperacao numeroParaOperacao(int n) throws IllegalArgumentException{
        switch(n){
            case 1:
                return TipoOperacao.SOMA;
            case 2:
                return TipoOperacao.SUBTRACAO;
            case 3:
                return TipoOperacao.MULTIPLICACAO;
            case 4:
                return TipoOperacao.DIVISAO;
        }
        throw new IllegalArgumentException("Número de operação inválido");
    }
    
    public static void imprimeResultado(String desc, int resultado){
        System.out.println(String.format(TEXTO_RESULTADO, desc, resultado));
    }
    
}
