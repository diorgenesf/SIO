/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import javax.swing.JComboBox;
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
public class FornecedorTest {
    
    public FornecedorTest() {
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
     * Test of Excluir method, of class Fornecedor.
     */
    @Test
    public void testExcluir() {
        System.out.println("Excluir");
        Fornecedor instance = new Fornecedor();
        boolean expResult = false;
        boolean result = instance.Excluir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of carregaTabela method, of class Fornecedor.
     */
    @Test
    public void testCarregaTabela() {
        System.out.println("carregaTabela");
        JTable Tabela = null;
        boolean expResult = false;
        boolean result = Fornecedor.carregaTabela(Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaTabelaRazao method, of class Fornecedor.
     */
    @Test
    public void testPesquisaTabelaRazao() {
        System.out.println("PesquisaTabelaRazao");
        JTable Tabela = null;
        Fornecedor instance = new Fornecedor();
        boolean expResult = false;
        boolean result = instance.PesquisaTabelaRazao(Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaTabelaCNPJ method, of class Fornecedor.
     */
    @Test
    public void testPesquisaTabelaCNPJ() {
        System.out.println("PesquisaTabelaCNPJ");
        JTable Tabela = null;
        Fornecedor instance = new Fornecedor();
        boolean expResult = false;
        boolean result = instance.PesquisaTabelaCNPJ(Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaPorRazao method, of class Fornecedor.
     */
    @Test
    public void testPesquisaPorRazao() {
        System.out.println("PesquisaPorRazao");
        Fornecedor instance = new Fornecedor();
        boolean expResult = false;
        boolean result = instance.PesquisaPorRazao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaPorCNPJ method, of class Fornecedor.
     */
    @Test
    public void testPesquisaPorCNPJ() {
        System.out.println("PesquisaPorCNPJ");
        Fornecedor instance = new Fornecedor();
        boolean expResult = false;
        boolean result = instance.PesquisaPorCNPJ();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of carregaCombo method, of class Fornecedor.
     */
    @Test
    public void testCarregaCombo() {
        System.out.println("carregaCombo");
        JComboBox combo = null;
        Fornecedor instance = new Fornecedor();
        boolean expResult = false;
        boolean result = instance.carregaCombo(combo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Alterar method, of class Fornecedor.
     */
    @Test
    public void testAlterar() {
        System.out.println("Alterar");
        Fornecedor instance = new Fornecedor();
        boolean expResult = false;
        boolean result = instance.Alterar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Inserir method, of class Fornecedor.
     */
    @Test
    public void testInserir() {
        System.out.println("Inserir");
        Fornecedor instance = new Fornecedor();
        boolean expResult = false;
        boolean result = instance.Inserir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCNPJ method, of class Fornecedor.
     */
    @Test
    public void testGetCNPJ() {
        System.out.println("getCNPJ");
        Fornecedor instance = new Fornecedor();
        String expResult = "";
        String result = instance.getCNPJ();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCNPJ method, of class Fornecedor.
     */
    @Test
    public void testSetCNPJ() {
        System.out.println("setCNPJ");
        String CNPJ = "";
        Fornecedor instance = new Fornecedor();
        instance.setCNPJ(CNPJ);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRazaoSocial method, of class Fornecedor.
     */
    @Test
    public void testGetRazaoSocial() {
        System.out.println("getRazaoSocial");
        Fornecedor instance = new Fornecedor();
        String expResult = "";
        String result = instance.getRazaoSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRazaoSocial method, of class Fornecedor.
     */
    @Test
    public void testSetRazaoSocial() {
        System.out.println("setRazaoSocial");
        String RazaoSocial = "";
        Fornecedor instance = new Fornecedor();
        instance.setRazaoSocial(RazaoSocial);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Fornecedor.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Fornecedor instance = new Fornecedor();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Fornecedor.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String Email = "";
        Fornecedor instance = new Fornecedor();
        instance.setEmail(Email);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
