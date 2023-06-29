/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2a2p1_powers_recoskie;

import java.util.Scanner;

public class U2A2P1_Powers_Recoskie {

  
    public static void main(String[] args) {
        /* Created by Conner Recoskie
        
           March 28, 2022
        
           This program calculates the square, cube or any number to any powers
           value
        */
        
       Scanner keyedInput = new Scanner(System.in);
       
       // Intilizing variables to be used in calculating users question
       int usersChoice = 0;
       double numSquared;
       double numCubed;
       double base;
       double exponent;
       double result;
       
       /* Declaring a while loop, so the program will continue to run till 
       the users exits */
       while (usersChoice != 4)
       {
        // prompting starting message, asking the user what they would like to do
           System.out.println("Enter 1 to find the value of a number squared." +
                   " Enter 2 to find the value of a number cubed." +
                   " Enter 3 to find the value of a number to any power." +
                   " Enter 4 to exit.");
    
       usersChoice = keyedInput.nextInt();
       
       /* Calculating and outputting the users answer depending on what the user
       wants to accomplish and the values they type in.
       */
       if (usersChoice == 1)
       {
           System.out.println("Please enter the number you want squared");
           numSquared = keyedInput.nextDouble();
           System.out.println(numSquared * numSquared);
       }
       else if (usersChoice == 2)
       {
          System.out.println("Please enter the value you want cubed");
          numCubed = keyedInput.nextDouble();
          System.out.println(numCubed * numCubed * numCubed);
       }
       else if (usersChoice == 3)
       {
           System.out.println("Please enter the number you wish to be the base");
           base = keyedInput.nextDouble();
           
           System.out.println("Please enter the value you wish to be the"
                   + " exponent");
           exponent = keyedInput.nextDouble();
           result = Math.pow(base,exponent);
           System.out.println(result);
       }
            
       }      
       /* If the user wants to exit, (keys in 4), they will be prompted with a 
       goodbye message.
       */
       if (usersChoice == 4)
       {
           System.out.println("You exited, goodbye!");
       }
       
    }
       
}
