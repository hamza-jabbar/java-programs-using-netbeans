/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MultipleConstructors {
    public static void main(String [] args){
        
        MultipleConstructors2 MultipleConstructors2Object = new MultipleConstructors2();//Object with 0 parameters
        MultipleConstructors2 MultipleConstructors2Object2 = new MultipleConstructors2(5);//Object with 1 parameter
        MultipleConstructors2 MultipleConstructors2Object3 = new MultipleConstructors2(5,13);//Object with 2 parameters
        MultipleConstructors2 MultipleConstructors2Object4 = new MultipleConstructors2(5,13,43);//Object with 3 parameters
        
        System.out.printf("%s\n", MultipleConstructors2Object.toMilitary());
        System.out.printf("%s\n", MultipleConstructors2Object2.toMilitary());
        System.out.printf("%s\n", MultipleConstructors2Object3.toMilitary());
        System.out.printf("%s\n", MultipleConstructors2Object4.toMilitary());
/*"toMilitary" calls the method from 'MultipleConstructors2' class and prints it
  out on screen
 - When the 'toMilitary' method is called, it uses the return type in that method*/
       
        System.out.println(" ");
        System.out.println("#DGF");
    }
}
