/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import java.util.Scanner;

/**
 *
 * @author Jake
 */
class JobMenuView {

    public JobMenuView() {
    }

    void displayJobMenu() {
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
        System.out.println("* E - End shift, get paid!                         *");
        System.out.println("* Q - Go back to main menue                        *");
        System.out.println("****************************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("You must enter a value");
            Scanner inFile;
            inFile = new Scanner(System.in);

            //Trim off leading and trailing blanks from the value 
            inputs[0] = inFile.nextLine().trim();
            if (inputs[0].length() < 1) {
                System.out.println("Enter letter below:");
                continue;
            }
            valid = true;
        }

        return inputs;
    }

    private boolean doAction(String[] inputs) {
String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "P":
                this.doGoodDeeds();
                break;
            case "E":
                this.endShift();
                break;
            case "Q":
                return true;    

            default:
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void doGoodDeeds() {
        
    }

    private void endShift() {
    EndShiftView endShift = new EndShiftView();
    endShift.displayEndShift();
    }
    
}
