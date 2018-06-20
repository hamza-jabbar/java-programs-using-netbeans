/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class toString2 {
    public static void main(String[] args){
        toString toStringObject = new toString (15,03,1996);
/*This took the method 'toString' from the 'toString' class and it is used 
 in the main method*/
        
        toString3 toString3Object = new toString3("Hamza", toStringObject);
/*This passed 2 arguments, it took the name and set it to name and it took the
 object and set it to birthday*/
        
        System.out.println(toString3Object);
        
        System.out.println(" ");
        System.out.println("#DGF");
        
    }
}