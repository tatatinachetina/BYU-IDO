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
 * @author Jake
 */
public class StartProgramView extends View {

    public StartProgramView() {
    }

    public void displayStartProgramView() {

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
        System.out.println("* The game is a text-based dating simulator game.  *");
        System.out.println("* You are a student at BYU-I, and you haven't been *");
        System.out.println("* able to go on many dates in the past and the     *");
        System.out.println("* the semester is coming to a close in ten days!   *");
        System.out.println("* Your goal is to break the cycle and meet the     *");
        System.out.println("* person of your dreams                            *");
        System.out.println("* Good luck!                                       *");
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
    }

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
