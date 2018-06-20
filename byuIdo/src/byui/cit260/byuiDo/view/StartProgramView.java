/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.model.Player;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
public class StartProgramView extends View{
    

    public StartProgramView() {
    }

    //get players name
    public String[] getInputs() {
        String[] inputs = new String[1];
        String playersName = this.getInput("\nPlease enter name.");
        inputs[0] = playersName;
       return inputs;
    }

    public boolean doAction(String[] inputs) {
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
