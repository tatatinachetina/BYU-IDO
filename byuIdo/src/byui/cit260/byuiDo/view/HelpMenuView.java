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
class HelpMenuView {

    public HelpMenuView() {
    }

    void displayHelpMenuView() {
        boolean endOfView = false;
    do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q") || inputs.length == 0) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);    }

    private String[] getInputs() {
       
        String[] inputs = new String[1];

        System.out.println("*** Display instructions ***");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Display the prompt message");
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

    private boolean doAction(String[] inputs) {
     String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "G":
                this.getGoalOfGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "C":
                this.startConversation();                
                break;
            case "D":
                this.howToStartDate();
                break;
            case "E":
                this.howToEarnMoney();
                break;
            case "R":
                this.howToLookGood();
                break;
            case "Q":
                return true;    

            default:
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void getGoalOfGame() {
        System.out.println("Goal of the Game");
    }

    private void howToMove() {
    System.out.println("How to move around");    }

    private void startConversation() {
    System.out.println("How to initiate conversation with someone");   }

    private void howToStartDate() {
    System.out.println("How to go on a date");    }

    private void howToEarnMoney() {
    System.out.println("How to earn money");    }

    private void howToLookGood() {
    System.out.println("How to be representable for certain places");    }
    
}
