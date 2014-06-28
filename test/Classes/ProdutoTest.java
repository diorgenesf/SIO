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
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of Excluir method, of class Produto.
     */
    @Test
    public void testExcluir() {
        System.out.println("Excluir");
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.Excluir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaCodigo method, of class Produto.
     */
    @Test
    public void testPesquisaCodigo() {
        System.out.println("PesquisaCodigo");
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.PesquisaCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaQuantidade method, of class Produto.
     */
    @Test
    public void testPesquisaQuantidade() {
        System.out.println("PesquisaQuantidade");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.PesquisaQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaDesc method, of class Produto.
     */
    @Test
    public void testPesquisaDesc() {
        System.out.println("PesquisaDesc");
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.PesquisaDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Alterar method, of class Produto.
     */
    @Test
    public void testAlterar() {
        System.out.println("Alterar");
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.Alterar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of carregaCombo method, of class Produto.
     */
    @Test
    public void testCarregaCombo() {
        System.out.println("carregaCombo");
        JComboBox combo = null;
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.carregaCombo(combo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of carregaTabela method, of class Produto.
     */
    @Test
    public void testCarregaTabela_JTable() {
        System.out.println("carregaTabela");
        JTable Tabela = null;
        boolean expResult = false;
        boolean result = Produto.carregaTabela(Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of carregaTabela method, of class Produto.
     */
    @Test
    public void testCarregaTabela_JTable_boolean() {
        System.out.println("carregaTabela");
        JTable Tabela = null;
        boolean TemEstoque = false;
        boolean expResult = false;
        boolean result = Produto.carregaTabela(Tabela, TemEstoque);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaTabelaDescricao method, of class Produto.
     */
    @Test
    public void testPesquisaTabelaDescricao() {
        System.out.println("PesquisaTabelaDescricao");
        JTable Tabela = null;
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.PesquisaTabelaDescricao(Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaTabelaCodigo method, of class Produto.
     */
    @Test
    public void testPesquisaTabelaCodigo() {
        System.out.println("PesquisaTabelaCodigo");
        JTable Tabela = null;
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.PesquisaTabelaCodigo(Tabela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Inserir method, of class Produto.
     */
    @Test
    public void testInserir() {
        System.out.println("Inserir");
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.Inserir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodProduto method, of class Produto.
     */
    @Test
    public void testGetCodProduto() {
        System.out.println("getCodProduto");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getCodProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodProduto method, of class Produto.
     */
    @Test
    public void testSetCodProduto() {
        System.out.println("setCodProduto");
        int CodProduto = 0;
        Produto instance = new Produto();
        instance.setCodProduto(CodProduto);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescProduto method, of class Produto.
     */
    @Test
    public void testGetDescProduto() {
        System.out.println("getDescProduto");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getDescProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescProduto method, of class Produto.
     */
    @Test
    public void testSetDescProduto() {
        System.out.println("setDescProduto");
        String DescProduto = "";
        Produto instance = new Produto();
        instance.setDescProduto(DescProduto);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValorUnitario method, of class Produto.
     */
    @Test
    public void testGetValorUnitario() {
        System.out.println("getValorUnitario");
        Produto instance = new Produto();
        float expResult = 0.0F;
        float result = instance.getValorUnitario();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValorUnitario method, of class Produto.
     */
    @Test
    public void testSetValorUnitario() {
        System.out.println("setValorUnitario");
        float ValorUnitario = 0.0F;
        Produto instance = new Produto();
        instance.setValorUnitario(ValorUnitario);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacao method, of class Produto.
     */
    @Test
    public void testGetObservacao() {
        System.out.println("getObservacao");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getObservacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setObservacao method, of class Produto.
     */
    @Test
    public void testSetObservacao() {
        System.out.println("setObservacao");
        String Observacao = "";
        Produto instance = new Produto();
        instance.setObservacao(Observacao);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdProduto method, of class Produto.
     */
    @Test
    public void testGetQtdProduto() {
        System.out.println("getQtdProduto");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getQtdProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQtdProduto method, of class Produto.
     */
    @Test
    public void testSetQtdProduto() {
        System.out.println("setQtdProduto");
        int QtdProduto = 0;
        Produto instance = new Produto();
        instance.setQtdProduto(QtdProduto);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstoqueMinimo method, of class Produto.
     */
    @Test
    public void testGetEstoqueMinimo() {
        System.out.println("getEstoqueMinimo");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getEstoqueMinimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstoqueMinimo method, of class Produto.
     */
    @Test
    public void testSetEstoqueMinimo() {
        System.out.println("setEstoqueMinimo");
        int EstoqueMinimo = 0;
        Produto instance = new Produto();
        instance.setEstoqueMinimo(EstoqueMinimo);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
