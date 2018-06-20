/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class SwitchStatements {
    public static void main(String args[]) {
       int age = 28; //Variable// Value of variable
       switch (age){ //This finds the value of the variable which is in the parameters
           case 10: //If the age is equal to this case it prints out the "println's"
               System.out.println("You can crawl");
               System.out.println(" ");
               System.out.println("#DGF");
               break; //breaks off to the other case statement
           case 28:
               System.out.println("You are successful, congrats");
               System.out.println(" ");
               System.out.println("#DGF");
               break;
           case 39:
               System.out.println("You can get in trouble");
               System.out.println(" ");
               System.out.println("#DGF");
               break;
           case 43:
               System.out.println("You need to grow up");
               System.out.println(" ");
               System.out.println("#DGF");
           default: /* if the variable does not match the case statements then it
                    goes to this line ("default") and prints out this statement*/
               System.out.println("Idk how old you are");
               System.out.println(" ");
               System.out.println("#DGF");
           break; //It finishes off here
       }
    }
    
}
/*Tests one variable. it gives you multiple choices depending on the value of 
the variable. The program gets the variable value, checks if the value is in the
case statements, if it is then it prints out the case number matching the
variable value. if it doesnt then it prints out the default statement*/
