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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Diorgenes
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Classes.EmpresaTest.class, Classes.DateTimeTest.class, Classes.VendaTest.class, Classes.ContasTest.class, Classes.EnderecoTest.class, Classes.ContasAPagarTest.class, Classes.ProdutoTest.class, Classes.ItemCompraTest.class, Classes.ClientesTest.class, Classes.ProdutoFornecidoTest.class, Classes.ContasReceberTest.class, Classes.TelefoneTest.class, Classes.FornecedorTest.class, Classes.ItemvendidoTest.class, Classes.VendedorTest.class})
public class NewTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
