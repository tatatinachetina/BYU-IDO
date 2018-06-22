/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.control;

import byui.cit260.byuiDo.control.ChallengeSceneControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jake
 */
public class challengeSceneControlTest {
    
    public challengeSceneControlTest() {
    }

    /**
     * Test of calculateInterest method, of class challengeSceneControl.
     */
    @Test
    public void testCalculateInterest() {
        System.out.println("calculateInterest");
        
        System.out.println("Test case 1");
        double borrowed = 10000.0;
        double interestRate = 6.0;
        long years = 3L;
        double expResult = 1800;
        double result = ChallengeSceneControl.calculateInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0001);
        
             
        System.out.println("Test case 2");
         borrowed = 0.0;
         interestRate = 6.0;
         years = 3L;
         expResult = -1;
         result = ChallengeSceneControl.calculateInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("Test case 3");
         borrowed = 10000.0;
         interestRate = 0.0;
         years = 3L;
         expResult = -2;
         result = ChallengeSceneControl.calculateInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("Test case 4");
         borrowed = 10000.0;
         interestRate = 6.0;
         years = 0L;
         expResult = -3;
         result = ChallengeSceneControl.calculateInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("Test case 5");
         borrowed = 1.0;
         interestRate = 1.0;
         years = 1L;
         expResult = 0.01;
         result = ChallengeSceneControl.calculateInterest(borrowed, interestRate, years);
        assertEquals(expResult, result, 0.0001);
    }
    }
    
    
    

