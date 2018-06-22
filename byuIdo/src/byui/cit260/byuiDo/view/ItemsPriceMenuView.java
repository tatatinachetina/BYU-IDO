/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.control.StoreControl;
import byui.cit260.byuiDo.model.Player;
import byui.cit260.byuiDo.control.StoreControl;
import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class ItemsPriceMenuView extends View {

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

    public String[] getInputs() {

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

        inputs[0] = this.getInput("\nPlease enter the item");
        inputs[1] = this.getInput("\nEnter the number of items you want to purchase:");

        return inputs;
    }

    public boolean doAction(String[] inputs) {
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

        double ammount = Double.parseDouble(inputs[0]);
        double total = StoreControl.calcTotalPrice(15, ammount);
        if (total <= 0) {
            System.out.println("Please check the valid number of items");
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
