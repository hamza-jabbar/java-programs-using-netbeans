/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class EnhancedForLoop {
    public static void main(String[] args) {
        int DGF[] = {4,5,6,67,7,4,54}; //Array called DGF
        int total = 0; //variable with the value 0
//type of variable and the identifier
        for(int x: DGF){//What array you are working with and loop through
            total += x; //Adds them altogether
        }
        
        System.out.println(total);
        System.out.println(" ");
        System.out.println("#DGF");
    }
}
