/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import javax.swing.JTable;
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
public class VendaTest {
    
    public VendaTest() {
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
     * Test of Salvar method, of class Venda.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        Venda instance = new Venda();
        boolean expResult = false;
        boolean result = instance.Salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ExisteCod method, of class Venda.
     */
    @Test
    public void testExisteCod() {
        System.out.println("ExisteCod");
        Venda instance = new Venda();
        boolean expResult = true;
        boolean result = instance.ExisteCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaData method, of class Venda.
     */
    @Test
    public void testPesquisaData() {
        System.out.println("PesquisaData");
        String Data = "";
        JTable Tabela = null;
        Venda instance = new Venda();
        boolean expResult = false;
        boolean result = instance.PesquisaData(Data, Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaEntreData method, of class Venda.
     */
    @Test
    public void testPesquisaEntreData() {
        System.out.println("PesquisaEntreData");
        String Data1 = "";
        String Data2 = "";
        JTable Tabela = null;
        Venda instance = new Venda();
        boolean expResult = false;
        boolean result = instance.PesquisaEntreData(Data1, Data2, Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCPFClinte method, of class Venda.
     */
    @Test
    public void testGetCPFClinte() {
        System.out.println("getCPFClinte");
        Venda instance = new Venda();
        String expResult = "";
        String result = instance.getCPFClinte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCPFClinte method, of class Venda.
     */
    @Test
    public void testSetCPFClinte() {
        System.out.println("setCPFClinte");
        String CPFClinte = "";
        Venda instance = new Venda();
        instance.setCPFClinte(CPFClinte);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodVendedor method, of class Venda.
     */
    @Test
    public void testGetCodVendedor() {
        System.out.println("getCodVendedor");
        Venda instance = new Venda();
        int expResult = 0;
        int result = instance.getCodVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodVendedor method, of class Venda.
     */
    @Test
    public void testSetCodVendedor() {
        System.out.println("setCodVendedor");
        int CodVendedor = 0;
        Venda instance = new Venda();
        instance.setCodVendedor(CodVendedor);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodVenda method, of class Venda.
     */
    @Test
    public void testGetCodVenda() {
        System.out.println("getCodVenda");
        Venda instance = new Venda();
        int expResult = 0;
        int result = instance.getCodVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
