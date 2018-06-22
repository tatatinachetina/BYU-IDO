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
class GameMenuView extends View{

    public GameMenuView() {
    }

    public String[] getInputs() {
String[] inputs = new String[1];
        System.out.println("****************************************************");
        System.out.println("* M - Map                                          *");
        System.out.println("* W - Where am I                                   *");
        System.out.println("* C - Initiate Conversation                        *");
        System.out.println("* A - Ask out on date                              *");
        System.out.println("* R - View relationship status                     *");
        System.out.println("* I - View inventory                               *");
        System.out.println("* P - Shop                                         *");
        System.out.println("* J - Go to Work                                   *");
        System.out.println("* S - Save Game                                    *");
        System.out.println("* Q - Go back to main menue                        *");
        System.out.println("****************************************************");
        String input = this.getInput("\nEnter letter below:");
        inputs[0] = input;
       return inputs;
    }

    public boolean doAction(String[] inputs) {
String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "M":
                this.getMap();
                break;
            case "W":
                this.getWhereAmI();
                break;
            case "C":
                this.startConversation();                
                break;
            case "A":
                this.askToStartDate();
                break;
            case "R":
                this.getRelationshipStatus();
                break;
            case "I":
                this.viewInventory();
                break;
            case "P":
                this.goToShop();
            case "J":
                this.goToWork();
                break;
            case "S":
                this.saveGame();
                break;
            case "Q":
                return true;    

            default:
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void getMap() {
  
    }

    private void getWhereAmI() {

    }

    private void startConversation() {
     ConversationMenuView conversationMenu = new ConversationMenuView();
     conversationMenu.displayConversationMenu();
    }

    private void askToStartDate() {
    DateMenuView dateMenu = new DateMenuView();
     dateMenu.displayDateMenu();
    }

    private void getRelationshipStatus() {

    }

    private void viewInventory() {

    }

    private void saveGame() {

    }

    private void goToShop() {
        StoreMenuView storeMenu = new StoreMenuView();
        storeMenu.displayStoreMenuView();
    }

    private void goToWork() {
        JobMenuView jobMenu = new JobMenuView();
        jobMenu.display();
    }

}
