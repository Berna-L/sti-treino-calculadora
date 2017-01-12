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
public class MultiplicacaoTest {
    
    @Test
    public void deveriaMultiplicarDoisInteiros() {
        int a = 2;
        int b = 3;
        
        Operacao o = new Multiplicacao();
        int r = o.executar(a, b);

        assertEquals(6, r);
    }
}
