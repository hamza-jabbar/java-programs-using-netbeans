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

public class CollectionsArrayList {//Holds arrays to other things(objects)
    public static void main(String[] args) {
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();
        //add array items to list
        for(String x: things)
            list1.add(x);
        
        String[] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();
        for(String y: moreThings)
            list2.add(y);
        
        for(int i = 0; i <list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
        editlist(list1, list2);
        System.out.println();
        
        for(int i = 0; i <list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
    }
    public static void editlist(Collection<String> l1, Collection<String> l2) {
        Iterator<String> it = l1.iterator();
        while(it.hasNext()) {
            if(l2.contains(it.next()))
                it.remove();
        }
    }
}