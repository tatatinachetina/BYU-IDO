
package byuido;

import citbyui.cit260.model.Actor;
import citbyui.cit260.model.Game;
import citbyui.cit260.model.Map;
import citbyui.cit260.model.Player;

/**
 *
 * @author tanya
 */
public class ByuIdo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Tatatina");
        playerOne.setGender("female");
        playerOne.setBestTime(7.00);
        
        /*String playerOneName = playerOne.getName();
        String playerOneGender = playerOne.getGender();
        double playerOneBestTime = playerOne.getBestTime();
        */
        System.out.println(playerOne.toString());
               
        System.out.println(Actor.John.toString());
        
        //test 
        Map mapOne = new Map();
        
        mapOne.setDescription("Walmart");
        mapOne.setRowCount(5);
        mapOne.setColumnCount(5);
        
        System.out.println(mapOne.toString());
        
        Game game = new Game();
        game.setCurrentScore(20.75);
        game.setTotalDays(10);
        System.out.println(game.toString());
    }
    
}
