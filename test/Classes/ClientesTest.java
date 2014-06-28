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
public class ClientesTest {
    
    public ClientesTest() {
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
     * Test of Salvar method, of class Clientes.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        Clientes instance = new Clientes();
        boolean expResult = false;
        boolean result = instance.Salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarCliente method, of class Clientes.
     */
    @Test
    public void testEditarCliente() {
        System.out.println("EditarCliente");
        String CPF = "";
        Clientes instance = new Clientes();
        boolean expResult = false;
        boolean result = instance.EditarCliente(CPF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarDebito method, of class Clientes.
     */
    @Test
    public void testEditarDebito() {
        System.out.println("EditarDebito");
        String CPF = "";
        float Valor = 0.0F;
        Clientes instance = new Clientes();
        boolean expResult = false;
        boolean result = instance.EditarDebito(CPF, Valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ExcluirCliente method, of class Clientes.
     */
    @Test
    public void testExcluirCliente() {
        System.out.println("ExcluirCliente");
        String CPF = "";
        Clientes instance = new Clientes();
        boolean expResult = false;
        boolean result = instance.ExcluirCliente(CPF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of carregaTabelaCliente method, of class Clientes.
     */
    @Test
    public void testCarregaTabelaCliente() {
        System.out.println("carregaTabelaCliente");
        JTable jTableMedida = null;
        boolean expResult = false;
        boolean result = Clientes.carregaTabelaCliente(jTableMedida);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisa method, of class Clientes.
     */
    @Test
    public void testPesquisa() {
        System.out.println("pesquisa");
        String CPF = "";
        Clientes instance = new Clientes();
        boolean expResult = false;
        boolean result = instance.pesquisa(CPF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaNome method, of class Clientes.
     */
    @Test
    public void testPesquisaNome() {
        System.out.println("PesquisaNome");
        String N = "";
        JTable Tabela = null;
        Clientes instance = new Clientes();
        boolean expResult = false;
        boolean result = instance.PesquisaNome(N, Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisaCPF method, of class Clientes.
     */
    @Test
    public void testPesquisaCPF() {
        System.out.println("pesquisaCPF");
        String CPF = "";
        JTable Tabela = null;
        Clientes instance = new Clientes();
        boolean expResult = false;
        boolean result = instance.pesquisaCPF(CPF, Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Clientes.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Clientes instance = new Clientes();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Clientes.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String Nome = "";
        Clientes instance = new Clientes();
        instance.setNome(Nome);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCPF method, of class Clientes.
     */
    @Test
    public void testGetCPF() {
        System.out.println("getCPF");
        Clientes instance = new Clientes();
        String expResult = "";
        String result = instance.getCPF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCPF method, of class Clientes.
     */
    @Test
    public void testSetCPF() {
        System.out.println("setCPF");
        String CPF = "";
        Clientes instance = new Clientes();
        instance.setCPF(CPF);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValorDevido method, of class Clientes.
     */
    @Test
    public void testGetValorDevido() {
        System.out.println("getValorDevido");
        Clientes instance = new Clientes();
        Float expResult = null;
        Float result = instance.getValorDevido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValorDevido method, of class Clientes.
     */
    @Test
    public void testSetValorDevido() {
        System.out.println("setValorDevido");
        Float ValorDevido = null;
        Clientes instance = new Clientes();
        instance.setValorDevido(ValorDevido);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Clientes.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Clientes instance = new Clientes();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Clientes.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String Email = "";
        Clientes instance = new Clientes();
        instance.setEmail(Email);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Clientes.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Clientes instance = new Clientes();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Clientes.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String Data = "";
        Clientes instance = new Clientes();
        instance.setData(Data);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
