/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

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
        String[] inputs = new String[1];

        //Display a description of the view 
        System.out.println("****************************************************");
        System.out.println("* There is a list of items you can purchase in our *");
        System.out.println("* store. You can buy no more than 20 items.        *");
        System.out.println("* C - Calculator...$12.00                          *");
        System.out.println("* Z - Freezby......$5.00                           *");
        System.out.println("* F - Flowers......$6.00                           *");
        System.out.println("* G - Gym T-shirt..$15.00                          *");
        System.out.println("* Enjoy your shopping!                             *");
        System.out.println("****************************************************");
        //valid = false 
        boolean valid = false;

        //WHILE valid == false (no input value has been entered) 
        while (valid == false) {
            //Display the prompt message 
            System.out.println("Enter your name below:");

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
        
        private boolean doAction(String[] inputs) {
        //playersName = get the first value in the inputs array
        String playersName = inputs[0];
        //player = savePlayer(playersName);
        Player player = GameControl.savePlayer(playersName);
        //IF player == null
        //display “Could not create the player. “ +
        //“Enter a different name.”
        if (player == null) {
            System.out.println("Could not create the player.");
            System.out.println("Enter a different name.");
            //RETURN false
            return false;
            //ENDIF
        }
        //Display
        System.out.println("================================================= ");
        System.out.println("Welcome to the game " + playersName + "!");
        System.out.println("We hope you have a lot of fun!");
        System.out.println("================================================= ");
        
        //mainMenuView = Create a new MainMenuView object 
        MainMenuView mainMenuView = new MainMenuView();
        //mainMenuView.displayMainMenuView()
        mainMenuView.displayMainMenuView();
        return true;
    }
}
    }
}
