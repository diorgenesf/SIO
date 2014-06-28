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
public class TelefoneTest {
    
    public TelefoneTest() {
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
     * Test of SalvarCliente method, of class Telefone.
     */
    @Test
    public void testSalvarCliente() {
        System.out.println("SalvarCliente");
        Telefone instance = new Telefone();
        boolean expResult = false;
        boolean result = instance.SalvarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarCliente method, of class Telefone.
     */
    @Test
    public void testEditarCliente() {
        System.out.println("EditarCliente");
        Telefone instance = new Telefone();
        boolean expResult = false;
        boolean result = instance.EditarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SalvarFornecedor method, of class Telefone.
     */
    @Test
    public void testSalvarFornecedor() {
        System.out.println("SalvarFornecedor");
        Telefone instance = new Telefone();
        boolean expResult = false;
        boolean result = instance.SalvarFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarFornecedor method, of class Telefone.
     */
    @Test
    public void testEditarFornecedor() {
        System.out.println("EditarFornecedor");
        Telefone instance = new Telefone();
        boolean expResult = false;
        boolean result = instance.EditarFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SalvarVendedor method, of class Telefone.
     */
    @Test
    public void testSalvarVendedor() {
        System.out.println("SalvarVendedor");
        Telefone instance = new Telefone();
        boolean expResult = false;
        boolean result = instance.SalvarVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarVendedor method, of class Telefone.
     */
    @Test
    public void testEditarVendedor() {
        System.out.println("EditarVendedor");
        Telefone instance = new Telefone();
        boolean expResult = false;
        boolean result = instance.EditarVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaCliente method, of class Telefone.
     */
    @Test
    public void testPesquisaCliente() {
        System.out.println("PesquisaCliente");
        String CPF = "";
        Telefone instance = new Telefone();
        boolean expResult = false;
        boolean result = instance.PesquisaCliente(CPF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaVendedor method, of class Telefone.
     */
    @Test
    public void testPesquisaVendedor() {
        System.out.println("PesquisaVendedor");
        int Cod = 0;
        Telefone instance = new Telefone();
        boolean expResult = false;
        boolean result = instance.PesquisaVendedor(Cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaFornecedor method, of class Telefone.
     */
    @Test
    public void testPesquisaFornecedor() {
        System.out.println("PesquisaFornecedor");
        String CNPJ = "";
        Telefone instance = new Telefone();
        boolean expResult = false;
        boolean result = instance.PesquisaFornecedor(CNPJ);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCNPJFornecedor method, of class Telefone.
     */
    @Test
    public void testGetCNPJFornecedor() {
        System.out.println("getCNPJFornecedor");
        Telefone instance = new Telefone();
        String expResult = "";
        String result = instance.getCNPJFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCNPJFornecedor method, of class Telefone.
     */
    @Test
    public void testSetCNPJFornecedor() {
        System.out.println("setCNPJFornecedor");
        String CNPJFornecedor = "";
        Telefone instance = new Telefone();
        instance.setCNPJFornecedor(CNPJFornecedor);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodVendedor method, of class Telefone.
     */
    @Test
    public void testGetCodVendedor() {
        System.out.println("getCodVendedor");
        Telefone instance = new Telefone();
        int expResult = 0;
        int result = instance.getCodVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodVendedor method, of class Telefone.
     */
    @Test
    public void testSetCodVendedor() {
        System.out.println("setCodVendedor");
        int CodVendedor = 0;
        Telefone instance = new Telefone();
        instance.setCodVendedor(CodVendedor);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCPFCliente method, of class Telefone.
     */
    @Test
    public void testGetCPFCliente() {
        System.out.println("getCPFCliente");
        Telefone instance = new Telefone();
        String expResult = "";
        String result = instance.getCPFCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCPFCliente method, of class Telefone.
     */
    @Test
    public void testSetCPFCliente() {
        System.out.println("setCPFCliente");
        String CPFCliente = "";
        Telefone instance = new Telefone();
        instance.setCPFCliente(CPFCliente);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDDD method, of class Telefone.
     */
    @Test
    public void testGetDDD() {
        System.out.println("getDDD");
        Telefone instance = new Telefone();
        String expResult = "";
        String result = instance.getDDD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDDD method, of class Telefone.
     */
    @Test
    public void testSetDDD() {
        System.out.println("setDDD");
        String DDD = "";
        Telefone instance = new Telefone();
        instance.setDDD(DDD);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNTel method, of class Telefone.
     */
    @Test
    public void testGetNTel() {
        System.out.println("getNTel");
        Telefone instance = new Telefone();
        String expResult = "";
        String result = instance.getNTel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNTel method, of class Telefone.
     */
    @Test
    public void testSetNTel() {
        System.out.println("setNTel");
        String NTel = "";
        Telefone instance = new Telefone();
        instance.setNTel(NTel);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
