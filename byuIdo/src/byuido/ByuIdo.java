package byuido;

import byui.cit260.byuiDo.view.StartProgramView;
import citbyui.cit260.model.StoreLocation;
import citbyui.cit260.model.Actor;
import citbyui.cit260.model.ChallengeScene;
import citbyui.cit260.model.Game;
import citbyui.cit260.model.InventoryItem;
import citbyui.cit260.model.Location;
import citbyui.cit260.model.Map;
import citbyui.cit260.model.Player;
import citbyui.cit260.model.Question;
import citbyui.cit260.model.Relationship;

/**
 *
 * @author tanya
 */
public class ByuIdo {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
       
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ByuIdo.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ByuIdo.player = player;
    }

}


