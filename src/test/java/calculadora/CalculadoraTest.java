/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author bernardolopes at id.uff.br
 */
public class CalculadoraTest {
    
    private Calculadora c;
    
    @Before
    public void setUp(){
        c = Calculadora.getInstance();
    }
    
    @Test
    public void deveriaSomarDoisNumerosInteiros(){
        int a = 1;
        int b = 2;
        int resultado = c.soma(a, b);
        
        assertEquals(3, resultado);
    }
    
//    @Test
//    public void deveriaSomarDoisNumerosFlutuantes(){
//        double a = 0.5;
//        double b = 1.25;
//        double resultado = 0;
//        
//        assertEquals(1.75, resultado, 0.0001);
//    }
//    
//    @Test
//    public void deveriaSomarInteiroComFlutuante(){
//        int a = 1;
//        double b = 1.25;
//        double resultado = 0;
//        
//        assertEquals(2.25, resultado, 0.0001);
//    }
//
//    @Test
//    public void deveriaSubtrairDoisNumerosInteiros(){
//        int a = 1;
//        int b = 2;
//        int resultado = 0;
//        
//        assertEquals(-1, resultado);
//    }
//    
//    @Test
//    public void deveriaSubtrairDoisNumerosFlutuantes(){
//        double a = 0.5;
//        double b = 1.25;
//        double resultado = 0;
//        
//        assertEquals(-0.75, resultado, 0.0001);
//    }
//    
//    @Test
//    public void deveriaSubstrairInteiroDeFlutuante(){
//        int a = 1;
//        double b = 1.25;
//        double resultado = 0;
//        
//        assertEquals(0.25, resultado, 0.0001);
//    }
//
//    @Test
//    public void deveriaSubstrairFlutuanteDeInteiro(){
//        int a = 1;
//        double b = 1.25;
//        double resultado = 0;
//        
//        assertEquals(-0.25, resultado, 0.0001);
//    }

    
}
