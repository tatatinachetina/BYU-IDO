
package byuido;

import citbyui.cit260.model.Actor;
import citbyui.cit260.model.ChallengeScene;
import citbyui.cit260.model.Game;
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
        //Game
        Game game = new Game();
        game.setCurrentScore(20.75);
        game.setTotalDays(10);
        System.out.println(game.toString());
   
        //Player
        Player playerOne = new Player();
        playerOne.setName("Tatatina");
        playerOne.setGender("female");
        playerOne.setBestTime(7.00);
        System.out.println(playerOne.toString());

        //Actor        
        System.out.println(Actor.John.toString());
        
        //Inventory Item
        
        //Map  
        Map mapOne = new Map();
        mapOne.setDescription("Walmart");
        mapOne.setRowCount(5);
        mapOne.setColumnCount(5);
        System.out.println(mapOne.toString());
        
        //Location
        
        //Relationship
        Relationship relationship = new Relationship();
        relationship.setRelationshipScore(59);
        relationship.setStatus("Friends");
        System.out.println(relationship.toString());
        //ChallengeScene
       
        
        //Question
        Question question = new Question();
        question.setQuestion("Where's my hat?!?!");
        question.setAnswer("over here!");
        question.setScore(12);
        question.setAmount(120);
        System.out.println(question.toString());
        
    }
    
}
