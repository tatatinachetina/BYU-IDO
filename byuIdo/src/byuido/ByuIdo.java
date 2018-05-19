package byuido;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Player
        Player playerOne = new Player();
        playerOne.setName("Tatatina");
        playerOne.setGender("female");
        playerOne.setBestTime(7.00);

        /*String playerOneName = playerOne.getName();
        String playerOneGender = playerOne.getGender();
        double playerOneBestTime = playerOne.getBestTime();
         */
        System.out.println(playerOne.toString());
        
        //Location
        Location locationOne = new Location();
        locationOne.setDescription("Walmart");
        locationOne.setRow(2);
        locationOne.setColumn(2);
        locationOne.setVisited(true);
        locationOne.setDisplaySimbol('a');
        locationOne.setBlocked(false);
        System.out.println(locationOne.toString());
        
        
        //Map  
        Map mapOne = new Map();
        mapOne.setDescription("Rexburg");
        mapOne.setRowCount(5);
        mapOne.setColumnCount(5);
        System.out.println(mapOne.toString());
        
        //Relationship
        Relationship relationship = new Relationship();
        relationship.setRelationshipScore(59);
        relationship.setStatus("Friends");
        relationship.setActorOne(Actor.John);
        relationship.setActorTwo(Actor.Anna);
        System.out.println(relationship.toString());
        
        //Actor        
        System.out.println(Actor.John.toString());
    
        
        
       
        
        //Question
        Question question = new Question();
        question.setQuestion("Where's my hat?!?!");
        question.setAnswer("over here!");
        question.setScore(12);
        question.setAmount(120);
        System.out.println(question.toString());
       
        //ChallengeScene
        ChallengeScene sceneOne = new ChallengeScene();
        sceneOne.setNoCorrect(0);
        sceneOne.setRequiredCorrect(1);
        sceneOne.setQuestion(question);
        System.out.println(sceneOne.toString());
        
        //Game
        Game game = new Game();
        game.setCurrentScore(20.75);
        game.setTotalDays(10);
        game.setMap(mapOne);
        game.setPlayer(playerOne);
        System.out.println(game.toString());
   
        //Inventory Item
        InventoryItem itemOne = new InventoryItem();
        itemOne.setItemType("Store Item");
        itemOne.setDescription("A Calculator");
        itemOne.setName("Calculator");
        itemOne.setQuantityInStock(1);
        itemOne.setGame(game);
        System.out.println(itemOne.toString());
        
        //Store location
        StoreLocation store = new StoreLocation();
        store.setInventoryItem(itemOne);
        System.out.println(store.toString());
    }

}
