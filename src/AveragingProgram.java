/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */

import java.util.Scanner;
public class AveragingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Allows the user to input numbers
        int total = 0;// Total of all the numbers
        int grade; //Numbers are the grades
        int average; //Average all the numbers together
        int counter = 0; //The counter starts at 0 because it starts counting at 0
        
        while(counter < 10) {
            grade = input.nextInt();//Here the user inputs a grade
            total = total + grade; //Here the grade is added to the total
            counter++; //It increments so that the loop can finish
        }
        average = total/10; //Takes the total of the grades and divides by 10 to get the average
        System.out.println("Your average is "+ average);//Prints out the statmenet including the average
        System.out.println(" ");
        System.out.println("#DGF");
    }
}
/*The program finds the average grades inputted by the user and prints out the 
average from the numbers inputted by the user*/