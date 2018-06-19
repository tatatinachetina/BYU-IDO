/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.control;

import byui.cit260.byuiDo.control.jobControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jake
 */
public class jobControlTest {
    
    public jobControlTest() {
    }

    /**
     * Test of calculateWage method, of class jobControl.
     */
    @Test
    public void testCalculateWage() {
        System.out.println("calculateWage");
        
        System.out.println("Test case 1");
        double hours = 4.0;
        double pay = 12.0;
        double expResult = 50.12;
        double result = jobControl.calculateWage(hours, pay);
        assertEquals(expResult, result, 0.001);
        
        System.out.println("Test case 2");
        hours = 0.0;
        pay = 12.0;
        expResult = -1;
          result = jobControl.calculateWage(hours, pay);
        assertEquals(expResult, result, 0.001);
       
        System.out.println("Test case 3");
        hours = 8;
        pay = 12.0;
        expResult = -1;
          result = jobControl.calculateWage(hours, pay);
        assertEquals(expResult, result, 0.001);
       
        System.out.println("Test case 4");
        hours = 4.0;
        pay = 0.0;
        expResult = -2;
          result = jobControl.calculateWage(hours, pay);
        assertEquals(expResult, result, 0.001);
               
        System.out.println("Test case 5");
        hours = 1.0;
        pay = 12.0;
        expResult = 16.28;
          result = jobControl.calculateWage(hours, pay);
        assertEquals(expResult, result, 0.001);
       
        System.out.println("Test case 6");
        hours = 7.0;
        pay = 12.0;
        expResult = 83.96;
          result = jobControl.calculateWage(hours, pay);
        assertEquals(expResult, result, 0.001);
       
        System.out.println("Test case 7");
        hours = 4.0;
        pay = 1.0;
        expResult = 8.76;
          result = jobControl.calculateWage(hours, pay);
        assertEquals(expResult, result, 0.001);
       
    }
    
}
