/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MultidemensionalArrays {
    public static void main(String[] args){
        int firstArray[][]={{8,9,10,11},{12,13,14,15}};//1st sq bracket is for the row and 2nd is for the column
        //This is the same with the curly brackets in the curly brackets
        
        int secondArray[][] = {{30,31,32,33},{43},{4,5,6}};
        /*The numbers in the first curly curly bracket would '0' and number.
        In the second curly brackets it would be '1' and number. And so on*/
//^^^^^^^^^^^^These are multidimesional arrays, (Arrays in an array)^^^^^^^^^^^
        System.out.println("This is the first array");
        display(firstArray);
        System.out.println("This is the second array");
        display(secondArray);
        System.out.println(" ");
        System.out.println("#DGF");
        //This caused the method
    }
    public static void display(int x[][]){ //This passes the multidemensional array
        for(int row = 0;row<x.length;row++){//The line loops through the rows
//^^^^^^^^^Takes the row numbers^^^^^^^^^^
            for(int column = 0; column<x[row].length; column++){//Loops through the columns
//^^^^^^^^^^^^^^^Takes the column number^^^^^^^^^^^^^^^^^^^^^^
//Loops through the column and rows
                System.out.print(x[row][column] +"\t");//prints a row
/*This is a method that prints out the arrays in the main method*/
/***************************this is a for statement***************************/
            }
            System.out.println();//When the end of the row is reached prints out a new line/row
        }
    }
}
/*This program makes a table using multidemensional arrays*/