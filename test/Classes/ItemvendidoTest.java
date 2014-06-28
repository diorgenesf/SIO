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
public class ItemvendidoTest {
    
    public ItemvendidoTest() {
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
     * Test of Salvar method, of class Itemvendido.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        Itemvendido instance = new Itemvendido();
        boolean expResult = false;
        boolean result = instance.Salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodVenda method, of class Itemvendido.
     */
    @Test
    public void testGetCodVenda() {
        System.out.println("getCodVenda");
        Itemvendido instance = new Itemvendido();
        int expResult = 0;
        int result = instance.getCodVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodVenda method, of class Itemvendido.
     */
    @Test
    public void testSetCodVenda() {
        System.out.println("setCodVenda");
        int CodVenda = 0;
        Itemvendido instance = new Itemvendido();
        instance.setCodVenda(CodVenda);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Itemvendido.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Itemvendido instance = new Itemvendido();
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Itemvendido.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int Quantidade = 0;
        Itemvendido instance = new Itemvendido();
        instance.setQuantidade(Quantidade);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodProduto method, of class Itemvendido.
     */
    @Test
    public void testGetCodProduto() {
        System.out.println("getCodProduto");
        Itemvendido instance = new Itemvendido();
        int expResult = 0;
        int result = instance.getCodProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodProduto method, of class Itemvendido.
     */
    @Test
    public void testSetCodProduto() {
        System.out.println("setCodProduto");
        int CodProduto = 0;
        Itemvendido instance = new Itemvendido();
        instance.setCodProduto(CodProduto);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
