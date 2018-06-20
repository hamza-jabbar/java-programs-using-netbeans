/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class ElseIf {
    public static void main(String[] args) {
        int age = 10;
        
        if (age >= 60)
            System.out.println("You are a senior citizen");
        else if (age >= 50)
            System.out.println("You are middle aged bro!!!");
        else if (age <= 59)
            System.out.println("You are gonna be 59 one day");
        else
            System.out.println("You're young");
               
        }
}
/*program can only perform one of the statements*/