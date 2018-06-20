/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class VariableLengthArguments {
    public static void main(String[] args) {
        System.out.println(average(4,53,68,86,994,1));//Prints out the average for all the numbers
        System.out.println(" ");
        System.out.println("#DGF");
    }
//This is for unknown argument, the type of variable and the variable name
    public static int average(int...numbers) {
                                              //This is the method for the 
        int total = 0;//Starting point          program to get the average of
        for(int x:numbers)                    //integers
            total+=x;//Adds together the variable 'numbers'
        
        return total/numbers.length;//works out the average
    }
}