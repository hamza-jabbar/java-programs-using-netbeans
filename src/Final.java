/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class Final {
    public static void main (String[] args) {
        Final2 Final2Object = new Final2(10); //Passed in 10 for the constructor
        
        for(int i = 0; i<5;i++){
            Final2Object.add();
            System.out.printf("%s", Final2Object);
            
        }
        System.out.println();
        System.out.println("#DGF");
    }
}
