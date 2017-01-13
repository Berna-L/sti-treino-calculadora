/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.util;

import calculadora.operacao.TipoOperacao;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author bernardolopes at id.uff.br
 */
public class UtilTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    
    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @After
    public void cleanUpStreams(){
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void numeroParaOperacaoDevolveSoma(){
        TipoOperacao to = Util.numeroParaOperacao(1);
        assertEquals(TipoOperacao.SOMA, to);
    }

    @Test
    public void numeroParaOperacaoDevolveSubtracao(){
        TipoOperacao to = Util.numeroParaOperacao(2);
        assertEquals(TipoOperacao.SUBTRACAO, to);
    }
    
    @Test
    public void numeroParaOperacaoDevolveMultiplicacao(){
        TipoOperacao to = Util.numeroParaOperacao(3);
        assertEquals(TipoOperacao.MULTIPLICACAO, to);
    }
    
    @Test
    public void numeroParaOperacaoDevolveDivisao(){
        TipoOperacao to = Util.numeroParaOperacao(4);
        assertEquals(TipoOperacao.DIVISAO, to);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numeroParaOperacaoInvalidoLevantaExcecao(){
        Util.numeroParaOperacao(5);
    }
    
    @Test
    public void getOperacaoDesejadaDevolveSoma(){
        Scanner in = new Scanner("1");
        TipoOperacao to = Util.getOperacaoDesejada(in);
        assertEquals(TipoOperacao.SOMA, to);
    }

    @Test
    public void getOperacaoDesejadaDevolveSubtracao(){
        Scanner in = new Scanner("2");
        TipoOperacao to = Util.getOperacaoDesejada(in);
        assertEquals(TipoOperacao.SUBTRACAO, to);
    }

    @Test
    public void getOperacaoDesejadaDevolveMultiplicacao(){
        Scanner in = new Scanner("3");
        TipoOperacao to = Util.getOperacaoDesejada(in);
        assertEquals(TipoOperacao.MULTIPLICACAO, to);
    }

    @Test
    public void getOperacaoDesejadaDevolveDivisao(){
        Scanner in = new Scanner("4");
        TipoOperacao to = Util.getOperacaoDesejada(in);
        assertEquals(TipoOperacao.DIVISAO, to);
    }
    
    @Test
    public void getOperacaoDesejadaPediuMaisDeUmaVez(){
        Scanner in = new Scanner("5\n1");
        TipoOperacao to = Util.getOperacaoDesejada(in);
        assertEquals(TipoOperacao.SOMA, to);
        assertTrue(!in.hasNext());
    }

    @Test
    public void getValorDevolveValorCorreto(){
        Scanner in = new Scanner("3");
        int valor = Util.getValor(in, "Teste", 1);
        assertEquals(3, valor);
        assertEquals(String.format(Util.TEXTO_VALOR, 1, "Teste") +
                System.getProperty("line.separator"), outContent.toString());
    }
    
    @Test
    public void imprimeValorImprimeCorreto(){
        Util.imprimeResultado("Teste", 10);
        assertEquals(String.format(Util.TEXTO_RESULTADO, "Teste", 10) +
                System.getProperty("line.separator"), outContent.toString());
    }
}
