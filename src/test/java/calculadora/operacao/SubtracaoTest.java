/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.operacao;

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
public class SubtracaoTest {
    
    @Test
    public void deveriaSubtrairDoisInteiros() {
        int a = 3;
        int b = 2;
        
        Operacao o = new Subtracao();
        int r = o.executar(a, b);
        
        assertEquals(1, r);
    }

    @Test
    public void deveriaDevolverStringCerta() {
        Operacao o = new Subtracao();
        assertEquals("Subtração", o.toString());
    }
    
}
