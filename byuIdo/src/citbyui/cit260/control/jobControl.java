/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.control;

/**
 *
 * @author Jake
 */
public class jobControl {
    
    public static double calculateWage(double hours, double pay){
        if (hours <= 0 || hours >= 8) {
            return -1;
        }
        if (pay <= 0) {
            return -2;
        }
        
        int goodDeed = 1;
        int bonus = goodDeed * 5;
        double earned = hours * pay;
        double tax = earned * 0.06;
        double wage = earned + bonus - tax;
        return wage;
    }
}
