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
public class ConvertListToArrays {
    public static void main(String[] args) {
        String[] stuff = {"babies", "watermelon", "melons", "fudge"};
        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
        //Was needed to convert from a list to an array using raight good methods
        thelist.add("pumpkin");
        thelist.addFirst("firstthing");
        
        //convert back to array
        stuff = thelist.toArray(new String[thelist.size()]);
        
        for(String x : stuff)
            System.out.printf("%s ", x);
    }
}
