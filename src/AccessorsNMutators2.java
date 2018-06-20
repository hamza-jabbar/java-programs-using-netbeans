/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AccessorsNMutators2 {
    public static void main(String [] args) {
        System.out.println("Details of my account...");
        System.out.println();
        
        AccessorsNMutators myAccount = new AccessorsNMutators();
        myAccount.balance = 40.00;
        myAccount.forename = "Hamza";
        myAccount.surname = "DGF";
        myAccount.address = "18 DGF Lane";
        
        System.out.print("Name: " + myAccount.forename + " ");
        System.out.println(myAccount.surname);
        System.out.println("Address :" + myAccount.address);
        System.out.println("Account balance: " + myAccount.balance);
        
        /*System.out.print("Name - " + myAccount.forename);
        System.out.println(" " + myAccount.surname);
        System.out.println("Address - " + myAccount.address);
        System.out.println("Balance - " + myAccount.balance);*/
        

    }
}
