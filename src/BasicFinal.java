/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
public class BasicFinal {
    public static void main(String[] args) {
        String a = "apples";
        String b = "Hamza";
        String c = "HAMZA";
        
        System.out.println(a.length());
        
        if(a.equals("apples"))
            System.out.println("It equals " + a);
        
        if(b.equalsIgnoreCase(c))
            System.out.println(b + c + "They both match");
    }
}