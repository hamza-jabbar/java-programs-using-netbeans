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
public class CollectionMethodSort {
    public static void main(String[] args) {
        String[] crap = {"apples ", "lemons ", "geese ", "bacon", "youtube "};
        List<String> l1 = Arrays.asList(crap);
        
        Collections.sort(l1);
        System.out.printf("%s\n", l1);
        
        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n", l1);
 //if it has 2 parameters it sorts the list in that way      
        
    }
}
/* - You can perform methods to arrays and most come from the collection class
   - */