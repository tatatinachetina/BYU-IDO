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
public class StartProgramView {
    
    public StartProgramView() {
    }
   public void displayStartProgramView(){
   
       boolean endOfView = false;
 do {
    String[] inputs = this.getInputs();
 if (inputs.length == 0 || inputs.equals('Q') || inputs.equals('q')){
endOfView = doAction(inputs);}
 }
while (endOfView != true); 
         {
   
   }
 
   
}

    private String[] getInputs() {
        System.out.println("");
        System.out.println("");
        String[] inputs = new String[1];
        inputs[0] = "testInputs";
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("doAction() called");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }
}