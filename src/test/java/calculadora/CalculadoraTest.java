/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import calculadora.operacao.Operacao;
import calculadora.operacao.OperacaoFactory;
import calculadora.operacao.TipoOperacao;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author bernardolopes at id.uff.br
 */
public class CalculadoraTest {
    
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
    public void testaRun(){
        //mocks
        OperacaoFactory fac = mock(OperacaoFactory.class);
        TipoOperacao to = mock(TipoOperacao.class);
        Operacao o = mock(Operacao.class);    
    }
}
