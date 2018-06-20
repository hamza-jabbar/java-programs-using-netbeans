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
public class MethodsnInstances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MnI MnIObject = new MnI();
        System.out.println("Enter name of first gf here: ");
        String DGF = input.nextLine(); //This allows to enter a name store in the string DGF
        MnIObject.setName(DGF); //Gets the set name method used in the MnI class
        MnIObject.saying();//this uses he ssying method in the class tuna
    }
}