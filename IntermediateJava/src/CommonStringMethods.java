/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
public class CommonStringMethods {
    public static void main(String[] args) {
        System.out.println("*************Method 1*************");
        String[] words = {"funk", "chunk", "furry", "baconator"};
        
        //StartsWith
        for(String w: words) {
            if(w.startsWith("fu"))
                System.out.println(w + " starts with fu");
        }
        
        //EndsWith
        for(String w: words) {
            if(w.endsWith("unk"))
                System.out.println(w + " ends with unk");
        }
        
        System.out.println("\n");
        System.out.println("*************Method 2*************"); 
        String s = "HamzaIs19YearsOld";
        System.out.println(s.indexOf("Is"));
        
        System.out.println("\n");
        System.out.println("*************Method 3*************");
        String x = "Bacon ";
        String y = "Monster";
        System.out.println(x.concat(y));
        System.out.println(x.replace("B", "M") + y.replace("M", "B"));
        System.out.println(x.toUpperCase() + y.toUpperCase());
    }
}
