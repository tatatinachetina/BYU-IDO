/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byuido.ByuIdo;
import byui.cit260.byuiDo.model.Player;

/**
 *
 * @author Jake
 */
class GameControl {

    //savePlayer(name): Player 
    public static Player savePlayer(String playersName) {
        if (playersName == null || playersName.length() < 1) {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        ByuIdo.setPlayer(player);

        return new Player();
    }
    
    public static void createNewGame(Player player){
        System.out.println("*** GameControl ***");
    }

}
