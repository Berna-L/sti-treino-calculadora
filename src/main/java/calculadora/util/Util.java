/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.util;

import calculadora.operacao.TipoOperacao;
import java.io.IOException;

/**
 *
 * @author bernardolopes at id.uff.br
 */
public class Util {
    
    private static final String TEXTO_SELETOR =
            "Escolha a operação:\n"
            + "1 -- Soma\n"
            + "2 -- Subtração\n"
            + "3 -- Multiplicação\n"
            + "4 -- Divisão";

    private static final String TEXTO_VALOR = 
            "Insira qual será o %dº valor para a operação de %s:";
    
    private static final String TEXTO_RESULTADO = 
            "O resultado da %s é: %d";
    
    public static TipoOperacao getOperacaoDesejada() {
        TipoOperacao to = null;
        int escolha = 0;
        do{
            System.out.println(TEXTO_SELETOR);
            try{
                escolha = System.in.read();
            } catch (IOException e) {
                escolha = 0;
            }
            to = numeroParaOperacao(escolha);
        } while(to == null);
        return to;
    }
    
    public static int getValor(String desc, int indice){
        int escolha = 0;
        boolean erro = false;
        do{
            System.out.println(String.format(TEXTO_VALOR, indice, desc));
            try{
                return System.in.read();
            } catch (IOException e){
                erro = true;
            }
        }while(erro);
        return escolha;
    }
    
    public static TipoOperacao numeroParaOperacao(int n){
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
        return null;
    }
    
    public static void imprimeResultado(String desc, int resultado){
        System.out.println(String.format(TEXTO_RESULTADO, desc, resultado));
    }
    
}
