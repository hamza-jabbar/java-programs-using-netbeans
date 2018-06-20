/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import java.util.*;
public class MethodsReverseCopyNFill {
    public static void main(String[] args) {
        //create an array and convert to list
        Character[] ray = {'p', 'w', 'n'};
        List<Character> l = Arrays.asList(ray);
        System.out.println("\n" + "List is: ");
        output(l);
        
        //reverse and print out the list
        Collections.reverse(l);
        System.out.println("\n" + "After reverse : ");
        output(l);
        
        //create a new array and a new list
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);
        
        //copy contents of list into listcopy
        Collections.copy(listCopy, l);
        System.out.println("\n" + "Copy of list : ");
        output(listCopy);
        
        //fill collection with crap
        
        Collections.fill(l, 'X');
        //This is going to replace the charcters from l and replace it with X
        System.out.println("\n" + "After filling the list : ");
        output(l);
    }
    //output method
    private static void output(List<Character> theList) {
        for (Character thing: theList)
    //this is going to treat everything from 'theList' as thing        
            System.out.printf("%s ", thing);   //then output it
    }
}
