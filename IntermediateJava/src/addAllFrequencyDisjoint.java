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
public class addAllFrequencyDisjoint {
    public static void main(String[] args) {
        //convert stuff array to a list
        String[] stuff = {"apples", "beef", "corn", "ham"};
        List<String> list1 = Arrays.asList(stuff);
        
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("Google");
        list2.add("Twitter");
        
        for(String x : list2)
            System.out.printf("%s ", x);
        
        Collections.addAll(list2, stuff);
        //This gets the things from stuff and adds it to list2
        System.out.println();
        for(String x : list2)
            System.out.printf("%s ", x);
        System.out.println();
        System.out.println(Collections.frequency(list2, "Google"));
        
        boolean tof = Collections.disjoint(list2, list1);
        System.out.println(tof);
        
        if(tof)
            System.out.println("These lists do not have anything in common");
        else
            System.out.println("These lists must have something in common");
    }
}
