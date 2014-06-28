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
public class ContasAPagarTest {
    
    public ContasAPagarTest() {
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
     * Test of Salvar method, of class ContasAPagar.
     */
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        ContasAPagar instance = new ContasAPagar();
        boolean expResult = false;
        boolean result = instance.Salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class ContasAPagar.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        String CNPJ = "";
        ContasAPagar instance = new ContasAPagar();
        boolean expResult = false;
        boolean result = instance.Editar(CNPJ);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ExisteCod method, of class ContasAPagar.
     */
    @Test
    public void testExisteCod() {
        System.out.println("ExisteCod");
        ContasAPagar instance = new ContasAPagar();
        boolean expResult = true;
        boolean result = instance.ExisteCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SalvarPacelas method, of class ContasAPagar.
     */
    @Test
    public void testSalvarPacelas() {
        System.out.println("SalvarPacelas");
        ContasAPagar instance = new ContasAPagar();
        boolean expResult = false;
        boolean result = instance.SalvarPacelas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscaParcela method, of class ContasAPagar.
     */
    @Test
    public void testBuscaParcela_int_int() {
        System.out.println("BuscaParcela");
        int C = 0;
        int CP = 0;
        ContasAPagar instance = new ContasAPagar();
        boolean expResult = false;
        boolean result = instance.BuscaParcela(C, CP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarParcela method, of class ContasAPagar.
     */
    @Test
    public void testMostrarParcela() {
        System.out.println("MostrarParcela");
        int CodC = 0;
        ContasAPagar instance = new ContasAPagar();
        boolean expResult = false;
        boolean result = instance.MostrarParcela(CodC);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscaParcela method, of class ContasAPagar.
     */
    @Test
    public void testBuscaParcela_int_boolean() {
        System.out.println("BuscaParcela");
        int CodC = 0;
        boolean STT = false;
        ContasAPagar instance = new ContasAPagar();
        boolean expResult = false;
        boolean result = instance.BuscaParcela(CodC, STT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PagarParcelas method, of class ContasAPagar.
     */
    @Test
    public void testPagarParcelas() {
        System.out.println("PagarParcelas");
        int C = 0;
        int CP = 0;
        ContasAPagar instance = new ContasAPagar();
        boolean expResult = false;
        boolean result = instance.PagarParcelas(C, CP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodConta method, of class ContasAPagar.
     */
    @Test
    public void testGetCodConta() {
        System.out.println("getCodConta");
        ContasAPagar instance = new ContasAPagar();
        int expResult = 0;
        int result = instance.getCodConta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodConta method, of class ContasAPagar.
     */
    @Test
    public void testSetCodConta() {
        System.out.println("setCodConta");
        int CodConta = 0;
        ContasAPagar instance = new ContasAPagar();
        instance.setCodConta(CodConta);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodParcela method, of class ContasAPagar.
     */
    @Test
    public void testGetCodParcela() {
        System.out.println("getCodParcela");
        ContasAPagar instance = new ContasAPagar();
        int expResult = 0;
        int result = instance.getCodParcela();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodParcela method, of class ContasAPagar.
     */
    @Test
    public void testSetCodParcela() {
        System.out.println("setCodParcela");
        int CodParcela = 0;
        ContasAPagar instance = new ContasAPagar();
        instance.setCodParcela(CodParcela);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValorCompra method, of class ContasAPagar.
     */
    @Test
    public void testGetValorCompra() {
        System.out.println("getValorCompra");
        ContasAPagar instance = new ContasAPagar();
        float expResult = 0.0F;
        float result = instance.getValorCompra();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValorCompra method, of class ContasAPagar.
     */
    @Test
    public void testSetValorCompra() {
        System.out.println("setValorCompra");
        float ValorCompra = 0.0F;
        ContasAPagar instance = new ContasAPagar();
        instance.setValorCompra(ValorCompra);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class ContasAPagar.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        ContasAPagar instance = new ContasAPagar();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class ContasAPagar.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String Data = "";
        ContasAPagar instance = new ContasAPagar();
        instance.setData(Data);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataPrevista method, of class ContasAPagar.
     */
    @Test
    public void testGetDataPrevista() {
        System.out.println("getDataPrevista");
        ContasAPagar instance = new ContasAPagar();
        String expResult = "";
        String result = instance.getDataPrevista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataPrevista method, of class ContasAPagar.
     */
    @Test
    public void testSetDataPrevista() {
        System.out.println("setDataPrevista");
        String DataPrevista = "";
        ContasAPagar instance = new ContasAPagar();
        instance.setDataPrevista(DataPrevista);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataPag method, of class ContasAPagar.
     */
    @Test
    public void testGetDataPag() {
        System.out.println("getDataPag");
        ContasAPagar instance = new ContasAPagar();
        String expResult = "";
        String result = instance.getDataPag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataPag method, of class ContasAPagar.
     */
    @Test
    public void testSetDataPag() {
        System.out.println("setDataPag");
        String DataPag = "";
        ContasAPagar instance = new ContasAPagar();
        instance.setDataPag(DataPag);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCNPJFornecedor method, of class ContasAPagar.
     */
    @Test
    public void testGetCNPJFornecedor() {
        System.out.println("getCNPJFornecedor");
        ContasAPagar instance = new ContasAPagar();
        String expResult = "";
        String result = instance.getCNPJFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCNPJFornecedor method, of class ContasAPagar.
     */
    @Test
    public void testSetCNPJFornecedor() {
        System.out.println("setCNPJFornecedor");
        String CNPJFornecedor = "";
        ContasAPagar instance = new ContasAPagar();
        instance.setCNPJFornecedor(CNPJFornecedor);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdParcelas method, of class ContasAPagar.
     */
    @Test
    public void testGetQtdParcelas() {
        System.out.println("getQtdParcelas");
        ContasAPagar instance = new ContasAPagar();
        int expResult = 0;
        int result = instance.getQtdParcelas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQtdParcelas method, of class ContasAPagar.
     */
    @Test
    public void testSetQtdParcelas() {
        System.out.println("setQtdParcelas");
        int QtdParcelas = 0;
        ContasAPagar instance = new ContasAPagar();
        instance.setQtdParcelas(QtdParcelas);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isStatus method, of class ContasAPagar.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        ContasAPagar instance = new ContasAPagar();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class ContasAPagar.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean Status = false;
        ContasAPagar instance = new ContasAPagar();
        instance.setStatus(Status);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValorParcela method, of class ContasAPagar.
     */
    @Test
    public void testGetValorParcela() {
        System.out.println("getValorParcela");
        ContasAPagar instance = new ContasAPagar();
        float expResult = 0.0F;
        float result = instance.getValorParcela();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValorParcela method, of class ContasAPagar.
     */
    @Test
    public void testSetValorParcela() {
        System.out.println("setValorParcela");
        float ValorParcela = 0.0F;
        ContasAPagar instance = new ContasAPagar();
        instance.setValorParcela(ValorParcela);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getParcelaPendentes method, of class ContasAPagar.
     */
    @Test
    public void testGetParcelaPendentes() {
        System.out.println("getParcelaPendentes");
        ContasAPagar instance = new ContasAPagar();
        int expResult = 0;
        int result = instance.getParcelaPendentes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setParcelaPendentes method, of class ContasAPagar.
     */
    @Test
    public void testSetParcelaPendentes() {
        System.out.println("setParcelaPendentes");
        int ParcelaPendentes = 0;
        ContasAPagar instance = new ContasAPagar();
        instance.setParcelaPendentes(ParcelaPendentes);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
