/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import citbyui.cit260.control.StoreControl;
import citbyui.cit260.model.Player;
import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class ItemsPriceMenuView {

    public ItemsPriceMenuView() {
    }

    public void displayItemsPriceMenuView() {

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

        //inputs = new String array one element long 
        String[] inputs = new String[2];

        //Display a description of the view 
        System.out.println("****************************************************");
        System.out.println("* There is a list of items you can purchase in our *");
        System.out.println("* store. You can buy no more than 20 items.        *");
        System.out.println("* C - Calculator...$12.00                          *");
        System.out.println("* Z - Freezby......$5.00                           *");
        System.out.println("* F - Flowers......$6.00                           *");
        System.out.println("* T - Gym T-shirt..$15.00                          *");
        System.out.println("* Enjoy your shopping!                             *");
        System.out.println("****************************************************");
        //valid = false 
        boolean valid = false;

        //WHILE valid == false (no input value has been entered) 
        while (valid == false) {
            //Display the prompt message 
            System.out.println("Enter the item you want to purchase:");

            //Get the value entered from the keyboard 
            Scanner inFile;
            inFile = new Scanner(System.in);

            //Trim off leading and trailing blanks from the value 
            inputs[0] = inFile.nextLine().trim();

            //IF length of the value < 1 then
            if (inputs[0].length() < 1) //Display "You must enter a non-blank value”
            {
                System.out.println("You must enter a non-blank value.");
                continue;
            }
            valid = true;
        }

        //WHILE valid == false (no input value has been entered) 
        valid = false;
        while (valid == false) {
            //Display the prompt message 
            System.out.println("Enter the number of items you want to purchase:");

            //Get the value entered from the keyboard 
            Scanner inFile;
            inFile = new Scanner(System.in);

            //Trim off leading and trailing blanks from the value 
            inputs[1] = inFile.nextLine().trim();

            //IF length of the value < 1 then
            if (inputs[1].length() < 1) //Display "You must enter a non-blank value”
            {
                System.out.println("You must enter a non-blank value.");
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
            case "C":
                this.getCalculator();
                break;
            case "Z":
                this.getFreezby();
                break;
            case "F":
                this.getFlowers();
                break;
            case "T":
                this.getTshirt();
                break;
            case "Q":
                return true;

            default:
                System.out.println("Please enter the valid item");
                return false;
        }

        // TODO - get the price of the item
        String strAmmount = inputs[1];
        double ammount = Double.parseDouble(strAmmount);
        double total = StoreControl.calcTotalPrice(15, ammount);

        if (total <= 0) {
            System.out.println("Please chek the valid number of items");
            return false;
        }
        System.out.println("Thank you for the purchase from Walmart!");

        return true;
    }

    private void getCalculator() {
    }

    private void getFreezby() {
    }

    private void getFlowers() {
    }

    private void getTshirt() {
    }
}
