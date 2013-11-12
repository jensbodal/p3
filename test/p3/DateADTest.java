/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jensb
 */
public class DateADTest {
    
    public DateADTest() {
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
     * Test of compare method, of class DateAD.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        DateAD inputDate = null;
        DateAD instance = new DateAD();
        String expResult = "";
        String result = instance.compare(inputDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lessThan method, of class DateAD.
     */
    @Test
    public void testLessThan() {
        System.out.println("lessThan");
        DateAD inputDate = null;
        DateAD instance = new DateAD();
        boolean expResult = false;
        boolean result = instance.lessThan(inputDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class DateAD.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        DateAD instance = new DateAD();
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class DateAD.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        DateAD instance = new DateAD();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTomorrow method, of class DateAD.
     */
    @Test
    public void testGetTomorrow() {
        System.out.println("getTomorrow");
        DateAD inputDate = null;
        DateAD instance = new DateAD();
        DateAD expResult = null;
        DateAD result = instance.getTomorrow(inputDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYesterday method, of class DateAD.
     */
    @Test
    public void testGetYesterday() {
        System.out.println("getYesterday");
        DateAD inputDate = null;
        DateAD instance = new DateAD();
        DateAD expResult = null;
        DateAD result = instance.getYesterday(inputDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayOfMonth method, of class DateAD.
     */
    @Test
    public void testGetDayOfMonth() {
        System.out.println("getDayOfMonth");
        DateAD instance = new DateAD();
        short expResult = 0;
        short result = instance.getDayOfMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class DateAD.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        DateAD instance = new DateAD();
        short expResult = 0;
        short result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class DateAD.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        DateAD instance = new DateAD();
        short expResult = 0;
        short result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayOfWeek method, of class DateAD.
     */
    @Test
    public void testGetDayOfWeek() {
        System.out.println("getDayOfWeek");
        DateAD instance = new DateAD();
        String expResult = "";
        String result = instance.getDayOfWeek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayOfYear method, of class DateAD.
     */
    @Test
    public void testGetDayOfYear() {
        System.out.println("getDayOfYear");
        DateAD instance = new DateAD();
        short expResult = 0;
        short result = instance.getDayOfYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeapYear method, of class DateAD.
     */
    @Test
    public void testIsLeapYear() {
        System.out.println("isLeapYear");
        short inputYear = 0;
        boolean expResult = false;
        boolean result = DateAD.isLeapYear(inputYear);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentDate method, of class DateAD.
     */
    @Test
    public void testSetCurrentDate() {
        System.out.println("setCurrentDate");
        DateAD instance = new DateAD();
        instance.setCurrentDate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DateAD.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DateAD instance = new DateAD();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}