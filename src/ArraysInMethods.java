/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ArraysInMethods {
    public static void main(String[] args) {
        int DGF[] = {2,3,45,56,6,78,67};//Array is created
        change(DGF);//The array passed onto the method and it is changed
        
        for(int y:DGF)//This prints the values out on the screen
            System.out.println(y);
            System.out.println(" ");
            System.out.println("#DGF");
    }
    public static void change(int x[]) {//The array is changed in this method
        for (int counter = 0; counter < x.length; counter++)
            x[counter] +=5;//This takes each of the values and adds 5
    }
}
/*This program adds 5 to the array values and prints the values added out
on the screen*/