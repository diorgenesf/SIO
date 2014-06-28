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
public class VendedorTest {
    
    public VendedorTest() {
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
     * Test of Salvar method, of class Vendedor.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        Vendedor instance = new Vendedor();
        boolean expResult = false;
        boolean result = instance.Salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarVendedor method, of class Vendedor.
     */
    @Test
    public void testEditarVendedor() {
        System.out.println("EditarVendedor");
        int Cod = 0;
        Vendedor instance = new Vendedor();
        boolean expResult = false;
        boolean result = instance.EditarVendedor(Cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ExcluirVendedor method, of class Vendedor.
     */
    @Test
    public void testExcluirVendedor() {
        System.out.println("ExcluirVendedor");
        int Cod = 0;
        Vendedor instance = new Vendedor();
        boolean expResult = false;
        boolean result = instance.ExcluirVendedor(Cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of carregaTabelaVendedor method, of class Vendedor.
     */
    @Test
    public void testCarregaTabelaVendedor() {
        System.out.println("carregaTabelaVendedor");
        JTable jTableMedida = null;
        boolean expResult = false;
        boolean result = Vendedor.carregaTabelaVendedor(jTableMedida);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaVendedor method, of class Vendedor.
     */
    @Test
    public void testPesquisaVendedor() {
        System.out.println("PesquisaVendedor");
        int Cod = 0;
        Vendedor instance = new Vendedor();
        boolean expResult = false;
        boolean result = instance.PesquisaVendedor(Cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaNome method, of class Vendedor.
     */
    @Test
    public void testPesquisaNome() {
        System.out.println("PesquisaNome");
        String N = "";
        JTable Tabela = null;
        Vendedor instance = new Vendedor();
        boolean expResult = false;
        boolean result = instance.PesquisaNome(N, Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisaCod method, of class Vendedor.
     */
    @Test
    public void testPesquisaCod() {
        System.out.println("pesquisaCod");
        String CPF = "";
        JTable Tabela = null;
        Vendedor instance = new Vendedor();
        boolean expResult = false;
        boolean result = instance.pesquisaCod(CPF, Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodVendedor method, of class Vendedor.
     */
    @Test
    public void testGetCodVendedor() {
        System.out.println("getCodVendedor");
        Vendedor instance = new Vendedor();
        int expResult = 0;
        int result = instance.getCodVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodVendedor method, of class Vendedor.
     */
    @Test
    public void testSetCodVendedor() {
        System.out.println("setCodVendedor");
        int CodVendedor = 0;
        Vendedor instance = new Vendedor();
        instance.setCodVendedor(CodVendedor);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Vendedor.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Vendedor instance = new Vendedor();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Vendedor.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String Nome = "";
        Vendedor instance = new Vendedor();
        instance.setNome(Nome);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSalario method, of class Vendedor.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Vendedor instance = new Vendedor();
        float expResult = 0.0F;
        float result = instance.getSalario();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSalario method, of class Vendedor.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        float Salario = 0.0F;
        Vendedor instance = new Vendedor();
        instance.setSalario(Salario);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Vendedor.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Vendedor instance = new Vendedor();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Vendedor.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String Email = "";
        Vendedor instance = new Vendedor();
        instance.setEmail(Email);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Vendedor.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Vendedor instance = new Vendedor();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Vendedor.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String Data = "";
        Vendedor instance = new Vendedor();
        instance.setData(Data);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
