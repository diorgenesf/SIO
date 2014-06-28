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
public class DateTimeTest {
    
    public DateTimeTest() {
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
     * Test of GetDataSql method, of class DateTime.
     */
    @Test
    public void testGetDataSql() {
        System.out.println("GetDataSql");
        String D = "";
        DateTime instance = new DateTime();
        Object expResult = null;
        Object result = instance.GetDataSql(D);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SetDataSql method, of class DateTime.
     */
    @Test
    public void testSetDataSql() {
        System.out.println("SetDataSql");
        String D = "";
        DateTime instance = new DateTime();
        String expResult = "";
        String result = instance.SetDataSql(D);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SomarMes method, of class DateTime.
     */
    @Test
    public void testSomarMes() {
        System.out.println("SomarMes");
        int N = 0;
        DateTime instance = new DateTime();
        Object expResult = null;
        Object result = instance.SomarMes(N);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllDate method, of class DateTime.
     */
    @Test
    public void testGetAllDate() {
        System.out.println("GetAllDate");
        DateTime instance = new DateTime();
        String expResult = "";
        String result = instance.GetAllDate();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetDay method, of class DateTime.
     */
    @Test
    public void testGetDay() {
        System.out.println("GetDay");
        DateTime instance = new DateTime();
        String expResult = "";
        String result = instance.GetDay();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetMonth method, of class DateTime.
     */
    @Test
    public void testGetMonth() {
        System.out.println("GetMonth");
        DateTime instance = new DateTime();
        String expResult = "";
        String result = instance.GetMonth();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetYear method, of class DateTime.
     */
    @Test
    public void testGetYear() {
        System.out.println("GetYear");
        DateTime instance = new DateTime();
        String expResult = "";
        String result = instance.GetYear();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetHour method, of class DateTime.
     */
    @Test
    public void testGetHour() {
        System.out.println("GetHour");
        DateTime instance = new DateTime();
        String expResult = "";
        String result = instance.GetHour();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetSeconds method, of class DateTime.
     */
    @Test
    public void testGetSeconds() {
        System.out.println("GetSeconds");
        DateTime instance = new DateTime();
        String expResult = "";
        String result = instance.GetSeconds();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetMinutes method, of class DateTime.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("GetMinutes");
        DateTime instance = new DateTime();
        String expResult = "";
        String result = instance.GetMinutes();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetTime method, of class DateTime.
     */
    @Test
    public void testGetTime() {
        System.out.println("GetTime");
        DateTime instance = new DateTime();
        String expResult = "";
        String result = instance.GetTime();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetDateString method, of class DateTime.
     */
    @Test
    public void testGetDateString() {
        System.out.println("GetDateString");
        DateTime instance = new DateTime();
        String expResult = "";
        String result = instance.GetDateString();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetDate method, of class DateTime.
     */
    @Test
    public void testGetDate_0args() {
        System.out.println("GetDate");
        Date expResult = null;
        Date result = DateTime.GetDate();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetDate method, of class DateTime.
     */
    @Test
    public void testGetDate_Date() {
        System.out.println("GetDate");
        Date D = null;
        String expResult = "";
        String result = DateTime.GetDate(D);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
