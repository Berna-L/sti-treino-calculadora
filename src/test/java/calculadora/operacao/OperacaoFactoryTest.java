/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.operacao;

import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bernardolopes at id.uff.br
 */
public class OperacaoFactoryTest {
    
    private OperacaoFactory fac;
    
    @Before
    public void setUp(){
        fac = new OperacaoFactory();
    }
    
    @Test
    public void deveriaRetornarObjetoSoma(){
        Operacao o = fac.getOperacao(TipoOperacao.SOMA);
        assertThat(o, is(instanceOf(Soma.class)));
    }
    
    
    @Test
    public void deveriaRetornarObjetoSubtracao(){
        Operacao o = fac.getOperacao(TipoOperacao.SUBTRACAO);
        assertThat(o, is(instanceOf(Subtracao.class)));
    }

    @Test
    public void deveriaRetornarObjetoMultiplicacao(){
        Operacao o = fac.getOperacao(TipoOperacao.MULTIPLICACAO);
        assertThat(o, is(instanceOf(Multiplicacao.class)));
    }

    @Test
    public void deveriaRetornarObjetoDivisao(){
        Operacao o = fac.getOperacao(TipoOperacao.DIVISAO);
        assertThat(o, is(instanceOf(Divisao.class)));
    }
    
}
