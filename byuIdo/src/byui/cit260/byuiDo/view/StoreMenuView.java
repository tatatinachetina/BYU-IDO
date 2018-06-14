package byui.cit260.byuiDo.view;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanya
 */
public class StoreMenuView {
    public void displayShopMenuView() {

        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q") || inputs.length == 0) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
        

    }

    //get players name
    private String[] getInputs() {

        //inputs = new String array one element long 
        String[] inputs = new String[1];

        //Display a description of the view 
        System.out.println("****************************************************");
        System.out.println("* Welcome to Walmart shop                          *");
        System.out.println("* Here you can buy all kind of items for your      *");
        System.out.println("* How can I help you?                              *");
        System.out.println("* Choose the option below:                         *");
        System.out.println("* W - Browse Wares                                 *");
        System.out.println("* B - Buy Items                                    *");
        System.out.println("* Q - Exit                                         *");
        System.out.println("****************************************************");
        //valid = false 
        boolean valid = false;

        //WHILE valid == false (no input value has been entered) 
        while (valid == false) {
            //Display the prompt message 
            System.out.println("Enter the valid option:");

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

        return inputs;
    }

    private boolean doAction(String[] inputs) {
    String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "W":
                this.getWares();
                break;
            case "B":
                this.getShop();
                break;
            case "Q":
                return true;    

            default:
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void getWares() {
    }

    private void getShop() {
    }
}
