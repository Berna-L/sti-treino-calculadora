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
public class OperacaoFactory {
    
    public OperacaoFactory() {}
    
    public Operacao getOperacao(TipoOperacao o){
        if (o == null){
            return null;
        }
        switch(o){
            case SOMA:
                return new Soma();
            case SUBTRACAO:
                return new Subtracao();
            case MULTIPLICACAO:
                return new Multiplicacao();
            case DIVISAO:
                return new Divisao();
            default:
                return null;
        }
    }
    
}
