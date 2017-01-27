/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroller;

/**
 *
 * @author Connor
 */

import java.util.Scanner;
public class DiceRoller {

    /**
     * @param args the command line arguments
     */
     static int type;
  
     public static void main(String[] args) {
      System.out.println("Welcome do the Dice Roller program.");
         int a = 1;
         do{
         Scanner scanner = new Scanner(System.in);
          int x = 0;
              int no;
           System.out.println("Number of dice: ");
                no = Integer.parseInt(scanner.next());  
          do{
             
    
      
       

          System.out.println("Number of sides: ");
       type = Integer.parseInt(scanner.next());    
       if((type%2)==0){x=1;}
      else{
       System.out.println("Number of sides must be even.");
       }
       }while(x==0);
       int sum = 0;
       int y = 0; 
       do{
       Die die = new Die();
        die.roll();
       int res = die.getResult();
       System.out.println("Result of die " +(y+1) +": " +res);
       sum = sum+res;
       y++;
       }while (y<no);
       System.out.println("Sum: " +sum);
       System.out.println("Exit program? (y/n)");
       if ("y".equals(scanner.next())){a=0;}
       else{a=1;
       }
         }while (a==1);
         System.out.println("Ending program.");
     }
    
}
