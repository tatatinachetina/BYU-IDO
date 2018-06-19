/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tanya
 */
public class storeControlTest {

    public storeControlTest() {
    }

    /**
     * Test of calcTotalPrice method, of class StoreControl.
     */
    @Test
    public void testCalcTotalPrice() {
        System.out.println("calcTotalPrice");

        // ---Test case 1 ---
        System.out.println("\tTest case 1");
        double itemPrice = 5.0;
        double itemAmount = 3.0;
        double expResult = 15.9;
        double result = storeControl.calcTotalPrice(itemPrice, itemAmount);
        assertEquals(expResult, result, 0.01);

        // ---Test case 2 ---
        System.out.println("\tTest case 2");
        itemPrice = 0.0;
        itemAmount = 3.0;
        expResult = -1;
        result = storeControl.calcTotalPrice(itemPrice, itemAmount);
        assertEquals(expResult, result, 0.0001);

        // ---Test case 3 ---
        System.out.println("\tTest case 3");
        itemPrice = 5.0;
        itemAmount = 0.0;
        expResult = -1;
        result = storeControl.calcTotalPrice(itemPrice, itemAmount);
        assertEquals(expResult, result, 0.0001);

        // ---Test case 4 ---
        System.out.println("\tTest case 4");
        itemPrice = 5.0;
        itemAmount = 21.0;
        expResult = -1;
        result = storeControl.calcTotalPrice(itemPrice, itemAmount);
        assertEquals(expResult, result, 0.0001);

        // ---Test case 5 ---
        System.out.println("\tTest case 5");
        itemPrice = 1.0;
        itemAmount = 3.0;
        expResult = 3.18;
        result = storeControl.calcTotalPrice(itemPrice, itemAmount);
        assertEquals(expResult, result, 0.0001);

        // ---Test case 6 ---
        System.out.println("\tTest case 6");
        itemPrice = 3.0;
        itemAmount = 1.0;
        expResult = 3.18;
        result = storeControl.calcTotalPrice(itemPrice, itemAmount);
        assertEquals(expResult, result, 0.0001);

        // ---Test case 7 ---
        System.out.println("\tTest case 7");
        itemPrice = 1.0;
        itemAmount = 20.0;
        expResult = 21.20;
        result = storeControl.calcTotalPrice(itemPrice, itemAmount);
        assertEquals(expResult, result, 0.0001);

    }

}
