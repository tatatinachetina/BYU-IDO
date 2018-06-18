
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byuido.ByuIdo;

import java.util.Scanner;

/**
 *
 * @author Jake
 */
class MainMenuView {

    public MainMenuView() {
    }

    void displayMainMenuView() {

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
        System.out.println("* N - Start New Game                               *");
        System.out.println("* R - Restart Existing Game                        *");
        System.out.println("* H - Get help on how to play the game             *");
        System.out.println("* Q - Quit Game                                    *");
        System.out.println("****************************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter letter below:");
            Scanner inFile;
            inFile = new Scanner(System.in);

            //Trim off leading and trailing blanks from the value 
            inputs[0] = inFile.nextLine().trim();
            if (inputs[0].length() < 1) {
                System.out.println("You must enter a value");
                continue;
            }
            valid = true;
        }

        return inputs;
    }

    //doAction(inputs): boolean 
    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "N":
                this.startNewGame();
                break;
            case "R":
                this.restartGame();
                break;
            case "H":
                this.getHelp();
                break;
            case "Q":
                return true;

            default:
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(ByuIdo.getPlayer());
        //gameMenuView = create a new GameMenuView object
        GameMenuView gameMenu = new GameMenuView();
        //gameMenuView.displayGameMenuView();
        gameMenu.displayGameMenuView();

    }

    private void restartGame() {
//        startExistingGameView = Create a new StartExistingGameView
        StartExistingGameView startExistingGame = new StartExistingGameView();
//        startExistingGameView.displayStartExistingGameView(); 
        startExistingGame.displayStartExistingGame();
    }

    private void getHelp() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

}
