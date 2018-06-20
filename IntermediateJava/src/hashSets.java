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
public class hashSets {
    public static void main(String[] args) {
        String[] things = {"apple ", "bob", "ham", "bacon", "bob"};
        List<String> list = Arrays.asList(things);
        
        System.out.printf("%s ", list);
        System.out.println();
        
        Set<String> set = new HashSet<String>(list);
        System.out.printf("%s ", set);
    }
}
/*- The hashSet scans through a set for duplicate items, takes the duplicate
    away and gives the new set*/