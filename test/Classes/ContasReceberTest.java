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
public class ContasReceberTest {
    
    public ContasReceberTest() {
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
     * Test of Salvar method, of class ContasReceber.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        ContasReceber instance = new ContasReceber();
        boolean expResult = false;
        boolean result = instance.Salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class ContasReceber.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        String CPF = "";
        ContasReceber instance = new ContasReceber();
        boolean expResult = false;
        boolean result = instance.Editar(CPF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ExisteCod method, of class ContasReceber.
     */
    @Test
    public void testExisteCod() {
        System.out.println("ExisteCod");
        ContasReceber instance = new ContasReceber();
        boolean expResult = true;
        boolean result = instance.ExisteCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SalvarPacelas method, of class ContasReceber.
     */
    @Test
    public void testSalvarPacelas() {
        System.out.println("SalvarPacelas");
        ContasReceber instance = new ContasReceber();
        boolean expResult = false;
        boolean result = instance.SalvarPacelas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscaParcela method, of class ContasReceber.
     */
    @Test
    public void testBuscaParcela_int_int() {
        System.out.println("BuscaParcela");
        int C = 0;
        int CP = 0;
        ContasReceber instance = new ContasReceber();
        boolean expResult = false;
        boolean result = instance.BuscaParcela(C, CP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarParcela method, of class ContasReceber.
     */
    @Test
    public void testMostrarParcela() {
        System.out.println("MostrarParcela");
        int CodC = 0;
        ContasReceber instance = new ContasReceber();
        boolean expResult = false;
        boolean result = instance.MostrarParcela(CodC);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscaParcela method, of class ContasReceber.
     */
    @Test
    public void testBuscaParcela_int_boolean() {
        System.out.println("BuscaParcela");
        int CodC = 0;
        boolean STT = false;
        ContasReceber instance = new ContasReceber();
        boolean expResult = false;
        boolean result = instance.BuscaParcela(CodC, STT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PagarParcelas method, of class ContasReceber.
     */
    @Test
    public void testPagarParcelas() {
        System.out.println("PagarParcelas");
        int C = 0;
        int CP = 0;
        ContasReceber instance = new ContasReceber();
        boolean expResult = false;
        boolean result = instance.PagarParcelas(C, CP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodParcela method, of class ContasReceber.
     */
    @Test
    public void testGetCodParcela() {
        System.out.println("getCodParcela");
        ContasReceber instance = new ContasReceber();
        int expResult = 0;
        int result = instance.getCodParcela();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodParcela method, of class ContasReceber.
     */
    @Test
    public void testSetCodParcela() {
        System.out.println("setCodParcela");
        int CodParcela = 0;
        ContasReceber instance = new ContasReceber();
        instance.setCodParcela(CodParcela);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodConta method, of class ContasReceber.
     */
    @Test
    public void testGetCodConta() {
        System.out.println("getCodConta");
        ContasReceber instance = new ContasReceber();
        int expResult = 0;
        int result = instance.getCodConta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodConta method, of class ContasReceber.
     */
    @Test
    public void testSetCodConta() {
        System.out.println("setCodConta");
        int CodConta = 0;
        ContasReceber instance = new ContasReceber();
        instance.setCodConta(CodConta);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValorCompra method, of class ContasReceber.
     */
    @Test
    public void testGetValorCompra() {
        System.out.println("getValorCompra");
        ContasReceber instance = new ContasReceber();
        float expResult = 0.0F;
        float result = instance.getValorCompra();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValorCompra method, of class ContasReceber.
     */
    @Test
    public void testSetValorCompra() {
        System.out.println("setValorCompra");
        float ValorCompra = 0.0F;
        ContasReceber instance = new ContasReceber();
        instance.setValorCompra(ValorCompra);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class ContasReceber.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        ContasReceber instance = new ContasReceber();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class ContasReceber.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String Data = "";
        ContasReceber instance = new ContasReceber();
        instance.setData(Data);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCPF method, of class ContasReceber.
     */
    @Test
    public void testGetCPF() {
        System.out.println("getCPF");
        ContasReceber instance = new ContasReceber();
        String expResult = "";
        String result = instance.getCPF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCPF method, of class ContasReceber.
     */
    @Test
    public void testSetCPF() {
        System.out.println("setCPF");
        String CPF = "";
        ContasReceber instance = new ContasReceber();
        instance.setCPF(CPF);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdParcelas method, of class ContasReceber.
     */
    @Test
    public void testGetQtdParcelas() {
        System.out.println("getQtdParcelas");
        ContasReceber instance = new ContasReceber();
        int expResult = 0;
        int result = instance.getQtdParcelas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQtdParcelas method, of class ContasReceber.
     */
    @Test
    public void testSetQtdParcelas() {
        System.out.println("setQtdParcelas");
        int QtdParcelas = 0;
        ContasReceber instance = new ContasReceber();
        instance.setQtdParcelas(QtdParcelas);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isStatus method, of class ContasReceber.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        ContasReceber instance = new ContasReceber();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class ContasReceber.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean Status = false;
        ContasReceber instance = new ContasReceber();
        instance.setStatus(Status);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValorParcela method, of class ContasReceber.
     */
    @Test
    public void testGetValorParcela() {
        System.out.println("getValorParcela");
        ContasReceber instance = new ContasReceber();
        float expResult = 0.0F;
        float result = instance.getValorParcela();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValorParcela method, of class ContasReceber.
     */
    @Test
    public void testSetValorParcela() {
        System.out.println("setValorParcela");
        float ValorParcela = 0.0F;
        ContasReceber instance = new ContasReceber();
        instance.setValorParcela(ValorParcela);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataPrevista method, of class ContasReceber.
     */
    @Test
    public void testGetDataPrevista() {
        System.out.println("getDataPrevista");
        ContasReceber instance = new ContasReceber();
        String expResult = "";
        String result = instance.getDataPrevista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataPrevista method, of class ContasReceber.
     */
    @Test
    public void testSetDataPrevista() {
        System.out.println("setDataPrevista");
        String DataPrevista = "";
        ContasReceber instance = new ContasReceber();
        instance.setDataPrevista(DataPrevista);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataPag method, of class ContasReceber.
     */
    @Test
    public void testGetDataPag() {
        System.out.println("getDataPag");
        ContasReceber instance = new ContasReceber();
        String expResult = "";
        String result = instance.getDataPag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataPag method, of class ContasReceber.
     */
    @Test
    public void testSetDataPag() {
        System.out.println("setDataPag");
        String DataPag = "";
        ContasReceber instance = new ContasReceber();
        instance.setDataPag(DataPag);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getParcelaPendentes method, of class ContasReceber.
     */
    @Test
    public void testGetParcelaPendentes() {
        System.out.println("getParcelaPendentes");
        ContasReceber instance = new ContasReceber();
        int expResult = 0;
        int result = instance.getParcelaPendentes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setParcelaPendentes method, of class ContasReceber.
     */
    @Test
    public void testSetParcelaPendentes() {
        System.out.println("setParcelaPendentes");
        int ParcelaPendentes = 0;
        ContasReceber instance = new ContasReceber();
        instance.setParcelaPendentes(ParcelaPendentes);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
