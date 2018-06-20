/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class NestedIf {
    public static void main(String[] args) {
        int age = 60;
        
        if (age < 50){
            System.out.println("You are young");
            System.out.println(" ");
            System.out.println("#DGF");
        }else{
            System.out.println("You are old");
            System.out.println(" ");
            System.out.println("#DGF");
            if (age < 75) {
                System.out.println("You're an old budda");
            }else{
                System.out.println("Not really");
            }
        }
    }
}
