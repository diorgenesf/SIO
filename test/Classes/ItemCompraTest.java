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
public class ItemCompraTest {
    
    public ItemCompraTest() {
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
     * Test of Salvar method, of class ItemCompra.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        ItemCompra instance = new ItemCompra();
        boolean expResult = false;
        boolean result = instance.Salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodConta method, of class ItemCompra.
     */
    @Test
    public void testGetCodConta() {
        System.out.println("getCodConta");
        ItemCompra instance = new ItemCompra();
        int expResult = 0;
        int result = instance.getCodConta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodConta method, of class ItemCompra.
     */
    @Test
    public void testSetCodConta() {
        System.out.println("setCodConta");
        int CodConta = 0;
        ItemCompra instance = new ItemCompra();
        instance.setCodConta(CodConta);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class ItemCompra.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        ItemCompra instance = new ItemCompra();
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class ItemCompra.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int Quantidade = 0;
        ItemCompra instance = new ItemCompra();
        instance.setQuantidade(Quantidade);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodProduto method, of class ItemCompra.
     */
    @Test
    public void testGetCodProduto() {
        System.out.println("getCodProduto");
        ItemCompra instance = new ItemCompra();
        int expResult = 0;
        int result = instance.getCodProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodProduto method, of class ItemCompra.
     */
    @Test
    public void testSetCodProduto() {
        System.out.println("setCodProduto");
        int CodProduto = 0;
        ItemCompra instance = new ItemCompra();
        instance.setCodProduto(CodProduto);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
