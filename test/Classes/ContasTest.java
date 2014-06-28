/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diorgenes
 */
public class ContasTest {
    
    public ContasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Salvar method, of class Contas.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        Contas instance = new ContasImpl();
        boolean expResult = false;
        boolean result = instance.Salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class Contas.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        String C = "";
        Contas instance = new ContasImpl();
        boolean expResult = false;
        boolean result = instance.Editar(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    public class ContasImpl extends Contas {

        public boolean Salvar() {
            return false;
        }

        public boolean Editar(String C) {
            return false;
        }
    }
    
}
