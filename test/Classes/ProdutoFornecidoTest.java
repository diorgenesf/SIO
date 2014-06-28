/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.sql.Date;
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
public class ProdutoFornecidoTest {
    
    public ProdutoFornecidoTest() {
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
     * Test of Inserir method, of class ProdutoFornecido.
     */
    @Test
    public void testInserir() {
        System.out.println("Inserir");
        ProdutoFornecido instance = new ProdutoFornecido();
        boolean expResult = false;
        boolean result = instance.Inserir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of AlterarCNPJ method, of class ProdutoFornecido.
     */
    @Test
    public void testAlterarCNPJ() {
        System.out.println("AlterarCNPJ");
        ProdutoFornecido instance = new ProdutoFornecido();
        boolean expResult = false;
        boolean result = instance.AlterarCNPJ();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaCodigoProduto method, of class ProdutoFornecido.
     */
    @Test
    public void testPesquisaCodigoProduto() {
        System.out.println("PesquisaCodigoProduto");
        ProdutoFornecido instance = new ProdutoFornecido();
        boolean expResult = false;
        boolean result = instance.PesquisaCodigoProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaIDProdutoFornecido method, of class ProdutoFornecido.
     */
    @Test
    public void testPesquisaIDProdutoFornecido() {
        System.out.println("PesquisaIDProdutoFornecido");
        ProdutoFornecido instance = new ProdutoFornecido();
        boolean expResult = false;
        boolean result = instance.PesquisaIDProdutoFornecido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCNPJFornecedor method, of class ProdutoFornecido.
     */
    @Test
    public void testGetCNPJFornecedor() {
        System.out.println("getCNPJFornecedor");
        ProdutoFornecido instance = new ProdutoFornecido();
        String expResult = "";
        String result = instance.getCNPJFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCNPJFornecedor method, of class ProdutoFornecido.
     */
    @Test
    public void testSetCNPJFornecedor() {
        System.out.println("setCNPJFornecedor");
        String CNPJFornecedor = "";
        ProdutoFornecido instance = new ProdutoFornecido();
        instance.setCNPJFornecedor(CNPJFornecedor);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodProduto method, of class ProdutoFornecido.
     */
    @Test
    public void testGetCodProduto() {
        System.out.println("getCodProduto");
        ProdutoFornecido instance = new ProdutoFornecido();
        int expResult = 0;
        int result = instance.getCodProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodProduto method, of class ProdutoFornecido.
     */
    @Test
    public void testSetCodProduto() {
        System.out.println("setCodProduto");
        int CodProduto = 0;
        ProdutoFornecido instance = new ProdutoFornecido();
        instance.setCodProduto(CodProduto);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFornecimento method, of class ProdutoFornecido.
     */
    @Test
    public void testGetDataFornecimento() {
        System.out.println("getDataFornecimento");
        ProdutoFornecido instance = new ProdutoFornecido();
        Date expResult = null;
        Date result = instance.getDataFornecimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFornecimento method, of class ProdutoFornecido.
     */
    @Test
    public void testSetDataFornecimento() {
        System.out.println("setDataFornecimento");
        Date DataFornecimento = null;
        ProdutoFornecido instance = new ProdutoFornecido();
        instance.setDataFornecimento(DataFornecimento);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProdutoFornecido method, of class ProdutoFornecido.
     */
    @Test
    public void testGetIdProdutoFornecido() {
        System.out.println("getIdProdutoFornecido");
        ProdutoFornecido instance = new ProdutoFornecido();
        int expResult = 0;
        int result = instance.getIdProdutoFornecido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdProdutoFornecido method, of class ProdutoFornecido.
     */
    @Test
    public void testSetIdProdutoFornecido() {
        System.out.println("setIdProdutoFornecido");
        int idProdutoFornecido = 0;
        ProdutoFornecido instance = new ProdutoFornecido();
        instance.setIdProdutoFornecido(idProdutoFornecido);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
