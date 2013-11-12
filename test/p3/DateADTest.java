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
 * @author jensbodal
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
        DateAD inputDate = new DateAD((short)28, (short)1, (short)1891);
        DateAD instance = new DateAD((short)28, (short)1, (short)1891);
        boolean expResult = true;
        boolean result = instance.equals(inputDate);
        assertEquals(expResult, result);
    }

    /**
     * Test of dateFromDayOfYear method, of class DateAD.
     */
    @Test
    public void testDateFromDayOfYear() {
        System.out.println("dateFromDayOfYear");
        short dayOfYear = (short)1;
        short year = (short)2000;
        DateAD instance = new DateAD();
        DateAD expResult = new DateAD(dayOfYear, (short)1, year);
        DateAD result = instance.dateFromDayOfYear(dayOfYear, year);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of getTomorrow method, of class DateAD.
     */
    @Test
    public void testGetTomorrow() {
        System.out.println("getTomorrow");
        DateAD inputDate = new DateAD((short)31, (short)12, (short)1999);
        DateAD instance = new DateAD((short)31, (short)12, (short)1999);
        DateAD expResult = new DateAD((short)1, (short) 1, (short)2000);
        DateAD result = instance.getTomorrow(inputDate);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of getYesterday method, of class DateAD.
     */
    @Test
    public void testGetYesterday() {
        System.out.println("getYesterday");
        DateAD inputDate = new DateAD((short)1, (short)3, (short)2000);
        DateAD instance = new DateAD();
        DateAD expResult = new DateAD((short)29, (short)2, (short)2000);
        DateAD result = instance.getYesterday(inputDate);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of getDayOfMonth method, of class DateAD.
     */
    @Test
    public void testGetDayOfMonth() {
        System.out.println("getDayOfMonth");
        DateAD instance = new DateAD((short)30);
        short expResult = (short)30;
        short result = instance.getDayOfMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class DateAD.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        DateAD instance = new DateAD((short)17, (short)4);
        short expResult = (short)4;
        short result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class DateAD.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        DateAD instance = new DateAD((short)20, (short)5, (short)2014);
        short expResult = (short)2014;
        short result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDayOfWeek method, of class DateAD.
     */
    @Test
    public void testGetDayOfWeek() {
        System.out.println("getDayOfWeek");
        DateAD instance = new DateAD((short)28, (short)5, (short)1986);
        String expResult = "Wednesday";
        String result = instance.getDayOfWeek();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDayOfYear method, of class DateAD.
     */
    @Test
    public void testGetDayOfYear() {
        System.out.println("getDayOfYear");
        DateAD instance = new DateAD((short)1, (short)1, (short)(1856));
        short expResult = (short)1;
        short result = instance.getDayOfYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of isLeapYear method, of class DateAD.
     */
    @Test
    public void testIsLeapYear() {
        System.out.println("isLeapYear");
        short inputYear = (short)1996;
        boolean expResult = true;
        boolean result = DateAD.isLeapYear(inputYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of setCurrentDate method, of class DateAD.
     */
    @Test
    public void testSetCurrentDate() {
        System.out.println("setCurrentDate");
        DateAD instance = new DateAD();
        instance.setCurrentDate();
    }

    /**
     * Test of toString method, of class DateAD.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DateAD instance = new DateAD((short)28, (short)5, (short)1986);
        String expResult = "Wednesday, 28 May, 1986";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}