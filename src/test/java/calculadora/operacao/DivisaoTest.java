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
public class DivisaoTest {
    
    @Test
    public void deveriaDividirDoisInteiros() {
        int a = 6;
        int b = 3;
        
        Operacao o = new Divisao();
        int r = o.executar(a, b);
        
        assertEquals(2, r);
    }
    
}
