/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import citbyui.cit260.control.jobControl;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
class EndShiftView {

    public EndShiftView() {
    }

    void displayEndShift() {
        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q") || inputs.length == 0) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("****************************************************");
        System.out.println("* P - Perform good deeds                           *");
        System.out.println("****************************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter hours");
            Scanner hours;
            hours = new Scanner(System.in);
            System.out.println("Enter pay");
            Scanner pay;
            pay = new Scanner(System.in);

            //Trim off leading and trailing blanks from the value 
            inputs[0] = hours.nextLine().trim();
            if (inputs[0].length() < 1) {
                System.out.println("Enter letter below:");
                continue;
                
            }
            valid = true;
        }

        return inputs;
    }

    private boolean doAction(String[] inputs) {
double hours = Double.parseDouble(inputs[0]);
double pay = Double.parseDouble(inputs[0]);
double wage = jobControl.calculateWage(hours, pay);

//double hours = jobControl.calculateWage(0, 0)
return true;
    }
}
