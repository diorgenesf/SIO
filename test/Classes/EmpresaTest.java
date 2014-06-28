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
public class EmpresaTest {
    
    public EmpresaTest() {
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
     * Test of Salvar method, of class Empresa.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        Empresa instance = new Empresa();
        boolean expResult = false;
        boolean result = instance.Salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Pesquisa method, of class Empresa.
     */
    @Test
    public void testPesquisa() {
        System.out.println("Pesquisa");
        Empresa instance = new Empresa();
        boolean expResult = true;
        boolean result = instance.Pesquisa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarRazao method, of class Empresa.
     */
    @Test
    public void testEditarRazao() {
        System.out.println("EditarRazao");
        String CNPJ = "";
        Empresa instance = new Empresa();
        boolean expResult = false;
        boolean result = instance.EditarRazao(CNPJ);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarSaldo method, of class Empresa.
     */
    @Test
    public void testEditarSaldo() {
        System.out.println("EditarSaldo");
        Empresa instance = new Empresa();
        boolean expResult = true;
        boolean result = instance.EditarSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarDebito method, of class Empresa.
     */
    @Test
    public void testEditarDebito() {
        System.out.println("EditarDebito");
        String CNPJ = "";
        float Valor = 0.0F;
        Empresa instance = new Empresa();
        boolean expResult = false;
        boolean result = instance.EditarDebito(CNPJ, Valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCNPJ method, of class Empresa.
     */
    @Test
    public void testGetCNPJ() {
        System.out.println("getCNPJ");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getCNPJ();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCNPJ method, of class Empresa.
     */
    @Test
    public void testSetCNPJ() {
        System.out.println("setCNPJ");
        String CNPJ = "";
        Empresa instance = new Empresa();
        instance.setCNPJ(CNPJ);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class Empresa.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Empresa instance = new Empresa();
        float expResult = 0.0F;
        float result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class Empresa.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        float Saldo = 0.0F;
        Empresa instance = new Empresa();
        instance.setSaldo(Saldo);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRazaoSocial method, of class Empresa.
     */
    @Test
    public void testGetRazaoSocial() {
        System.out.println("getRazaoSocial");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getRazaoSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRazaoSocial method, of class Empresa.
     */
    @Test
    public void testSetRazaoSocial() {
        System.out.println("setRazaoSocial");
        String RazaoSocial = "";
        Empresa instance = new Empresa();
        instance.setRazaoSocial(RazaoSocial);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValorPagar method, of class Empresa.
     */
    @Test
    public void testGetValorPagar() {
        System.out.println("getValorPagar");
        Empresa instance = new Empresa();
        float expResult = 0.0F;
        float result = instance.getValorPagar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValorPagar method, of class Empresa.
     */
    @Test
    public void testSetValorPagar() {
        System.out.println("setValorPagar");
        float ValorPagar = 0.0F;
        Empresa instance = new Empresa();
        instance.setValorPagar(ValorPagar);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
