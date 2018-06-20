/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

/**
 *
 * @author Jake
 */
public abstract class View implements ViewInterface {

    public View() {
    }
    @Override
    public void display() {
        
        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q") || inputs.length == 0) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
        
    }
    @Override
        public String getInputs(String promptMessage){
        
    }
}
