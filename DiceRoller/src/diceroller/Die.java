package diceroller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Connor
 */
import java.util.Random;
public class Die {
     private int sides=DiceRoller.type; 
    private int roll;
    private int result;
   Random rand = new Random();

   
   public Die(){
   
       result = rand.nextInt(sides)+1;
    
}

     public void roll(){
        roll = rand.nextInt(result)+1;
    }


     
    public int getResult(){
        return roll;
    }  

}
