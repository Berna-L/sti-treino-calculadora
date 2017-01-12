/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.util;

import calculadora.operacao.TipoOperacao;
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
public class UtilTest {
    
    /**
     * Test of getOperacaoDesejada method, of class Util.
     */
    @Test
    public void testGetOperacaoDesejada() {
        System.out.println("getOperacaoDesejada");
        TipoOperacao expResult = null;
        TipoOperacao result = Util.getOperacaoDesejada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Util.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        String desc = "";
        int indice = 0;
        int expResult = 0;
        int result = Util.getValor(desc, indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numeroParaOperacao method, of class Util.
     */
    @Test
    public void testNumeroParaOperacao() {
        System.out.println("numeroParaOperacao");
        int n = 0;
        TipoOperacao expResult = null;
        TipoOperacao result = Util.numeroParaOperacao(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimeResultado method, of class Util.
     */
    @Test
    public void testImprimeResultado() {
        System.out.println("imprimeResultado");
        String desc = "";
        int resultado = 0;
        Util.imprimeResultado(desc, resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
