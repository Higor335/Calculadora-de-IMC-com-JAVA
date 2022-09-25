package teste;

import static org.junit.jupiter.api.Assertions.*;


public class TestesTest {
    //classe construtora
    public TestesTest() {
    }
    
    //---------------------------------------TESTES---------------------------------------//
    
    /**
     * Test of Resultado method, of class Testes.
     * 3 execuções!
     */
    @org.junit.jupiter.api.Test
    public void testCalculo() {
       Testes test1 = new Testes("80","1.75");
       assertEquals(26.0,test1.Resultado(80,1.75));
       
       Testes test2 = new Testes("75","1.80");
       assertEquals(23.0,test2.Resultado(75,1.80));
       
       Testes test3 = new Testes("64","1.57");
       assertEquals(26,test3.Resultado(64,1.57));
    }

    /**
     * Test of isNum method, of class Testes.
     * 3 execuções!
     */
    @org.junit.jupiter.api.Test
    public void testIsNum() {
       Testes test1 = new Testes("85","1.75");
       assertEquals(true,test1.isNum());
       
       Testes test2 = new Testes("63","1.65");
       assertEquals(true,test2.isNum());
       
       Testes test3 = new Testes("55","1.58");
       assertEquals(true,test3.isNum());
    }

    /**
     * Test of notNegg method, of class Testes.
     * 3 execuções!
     */
    @org.junit.jupiter.api.Test
    public void testNotNegg() {
       Testes test1 = new Testes("50","2");
       assertEquals(true,test1.notNegg());
       
       Testes test2 = new Testes("90","3");
       assertEquals(true,test2.notNegg());
       
       Testes test3 = new Testes("30","1.32");
       assertEquals(true,test3.notNegg());
    }

    /**
     * Test of notHigh method, of class Testes.
     * 3 execuções!
     */
    @org.junit.jupiter.api.Test
    public void testNotHigh() {
       Testes test1 = new Testes("90","2");
       assertEquals(true,test1.notHigh());
       
       Testes test2 = new Testes("100","1.78");
       assertEquals(true,test2.notHigh());
       
       Testes test3 = new Testes("99","1.85");
       assertEquals(true,test3.notHigh());
    }

    /**
     * Test of notVoid method, of class Testes.
     * 3 execuções!
     */
    @org.junit.jupiter.api.Test
    public void testNotVoid() {
       Testes test1 = new Testes("95","2");
       assertEquals(true,test1.notVoid());
       
       Testes test2 = new Testes("55","1.34");
       assertEquals(true,test2.notVoid());
       
       Testes test3 = new Testes("75","1.74");
       assertEquals(true,test3.notVoid());
    }
    
}
