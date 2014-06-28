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
public class EnderecoTest {
    
    public EnderecoTest() {
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
     * Test of SalvarCliente method, of class Endereco.
     */
    @Test
    public void testSalvarCliente() {
        System.out.println("SalvarCliente");
        Endereco instance = new Endereco();
        boolean expResult = false;
        boolean result = instance.SalvarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarCliente method, of class Endereco.
     */
    @Test
    public void testEditarCliente() {
        System.out.println("EditarCliente");
        Endereco instance = new Endereco();
        boolean expResult = false;
        boolean result = instance.EditarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SalvarFornecedor method, of class Endereco.
     */
    @Test
    public void testSalvarFornecedor() {
        System.out.println("SalvarFornecedor");
        Endereco instance = new Endereco();
        boolean expResult = false;
        boolean result = instance.SalvarFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarFornecedor method, of class Endereco.
     */
    @Test
    public void testEditarFornecedor() {
        System.out.println("EditarFornecedor");
        Endereco instance = new Endereco();
        boolean expResult = false;
        boolean result = instance.EditarFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SalvarVendedor method, of class Endereco.
     */
    @Test
    public void testSalvarVendedor() {
        System.out.println("SalvarVendedor");
        Endereco instance = new Endereco();
        boolean expResult = false;
        boolean result = instance.SalvarVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarVendedor method, of class Endereco.
     */
    @Test
    public void testEditarVendedor() {
        System.out.println("EditarVendedor");
        Endereco instance = new Endereco();
        boolean expResult = false;
        boolean result = instance.EditarVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaCliente method, of class Endereco.
     */
    @Test
    public void testPesquisaCliente() {
        System.out.println("PesquisaCliente");
        String CPF = "";
        Endereco instance = new Endereco();
        boolean expResult = false;
        boolean result = instance.PesquisaCliente(CPF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaVendedor method, of class Endereco.
     */
    @Test
    public void testPesquisaVendedor() {
        System.out.println("PesquisaVendedor");
        int Cod = 0;
        Endereco instance = new Endereco();
        boolean expResult = false;
        boolean result = instance.PesquisaVendedor(Cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaFornecedor method, of class Endereco.
     */
    @Test
    public void testPesquisaFornecedor() {
        System.out.println("PesquisaFornecedor");
        String CNPJ = "";
        Endereco instance = new Endereco();
        boolean expResult = false;
        boolean result = instance.PesquisaFornecedor(CNPJ);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCNPJFornecedor method, of class Endereco.
     */
    @Test
    public void testGetCNPJFornecedor() {
        System.out.println("getCNPJFornecedor");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getCNPJFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCNPJFornecedor method, of class Endereco.
     */
    @Test
    public void testSetCNPJFornecedor() {
        System.out.println("setCNPJFornecedor");
        String CNPJFornecedor = "";
        Endereco instance = new Endereco();
        instance.setCNPJFornecedor(CNPJFornecedor);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodVendedor method, of class Endereco.
     */
    @Test
    public void testGetCodVendedor() {
        System.out.println("getCodVendedor");
        Endereco instance = new Endereco();
        int expResult = 0;
        int result = instance.getCodVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodVendedor method, of class Endereco.
     */
    @Test
    public void testSetCodVendedor() {
        System.out.println("setCodVendedor");
        int CodVendedores = 0;
        Endereco instance = new Endereco();
        instance.setCodVendedor(CodVendedores);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCPFCliente method, of class Endereco.
     */
    @Test
    public void testGetCPFCliente() {
        System.out.println("getCPFCliente");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getCPFCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCPFCliente method, of class Endereco.
     */
    @Test
    public void testSetCPFCliente() {
        System.out.println("setCPFCliente");
        String CPFCliente = "";
        Endereco instance = new Endereco();
        instance.setCPFCliente(CPFCliente);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRua method, of class Endereco.
     */
    @Test
    public void testGetRua() {
        System.out.println("getRua");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getRua();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRua method, of class Endereco.
     */
    @Test
    public void testSetRua() {
        System.out.println("setRua");
        String Rua = "";
        Endereco instance = new Endereco();
        instance.setRua(Rua);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Endereco.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Endereco instance = new Endereco();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Endereco.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int Numero = 0;
        Endereco instance = new Endereco();
        instance.setNumero(Numero);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCidade method, of class Endereco.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCidade method, of class Endereco.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        String Cidade = "";
        Endereco instance = new Endereco();
        instance.setCidade(Cidade);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Endereco.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBairro method, of class Endereco.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        String Bairro = "";
        Endereco instance = new Endereco();
        instance.setBairro(Bairro);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPais method, of class Endereco.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getPais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPais method, of class Endereco.
     */
    @Test
    public void testSetPais() {
        System.out.println("setPais");
        String Pais = "";
        Endereco instance = new Endereco();
        instance.setPais(Pais);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCEP method, of class Endereco.
     */
    @Test
    public void testGetCEP() {
        System.out.println("getCEP");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getCEP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCEP method, of class Endereco.
     */
    @Test
    public void testSetCEP() {
        System.out.println("setCEP");
        String CEP = "";
        Endereco instance = new Endereco();
        instance.setCEP(CEP);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUF method, of class Endereco.
     */
    @Test
    public void testGetUF() {
        System.out.println("getUF");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getUF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUF method, of class Endereco.
     */
    @Test
    public void testSetUF() {
        System.out.println("setUF");
        String UF = "";
        Endereco instance = new Endereco();
        instance.setUF(UF);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
