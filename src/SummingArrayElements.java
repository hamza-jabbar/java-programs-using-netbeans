/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class SummingArrayElements {
    public static void main(String[] args) {
        int DGF[] = {15,3,1996};
        int sum = 0; //Keep the total of the elements, it starts from 0
        
        for(int counter = 0; counter < DGF.length; counter++) { //loops through all the elements of the array
            sum+=DGF[counter];//Adds all the elements together
        }
        System.out.println("The sum of these numbers is " + sum);//Prints out a total of all the arra elements added together
        System.out.println("");
        System.out.println("#DGF");
    }
}
/*The program adds the elements of the array together and prints out the total*/