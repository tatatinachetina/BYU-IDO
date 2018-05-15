/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byuido;

import citbyui.cit260.model.Game;

/**
 *
 * @author tanya
 */
public class ByuIdo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Game game = new Game();
        game.setCurrentScore(20.75);
        game.setTotalDays(10);
        System.out.println(game.toString());
    }
    
}
