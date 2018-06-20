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
public class GenericMethod {
    public static void main(String[] args) {
        Integer[] iray = {1, 2, 3, 4, 5};
        Character[] cray = {'h', 'a', 'm', 'z', 'a'};
        
        printMe(iray);
        printMe(cray);
    }
    /*public static void printMe(Integer[] i) {
        for(Integer x: i)
            System.out.printf("%s ", x);
        System.out.println();
    }
    public static void printMe(Character[] i) {
        for(Character x: i)
            System.out.printf("%s ", x);
        System.out.println();
    }*/ 
//These are overloaded methods and here is the generic method for overload
    public static <T> void printMe(T[] x) {
        for(T b: x)
            System.out.printf("%s ", b);
        System.out.println();
    }
    
}
// "<T> - type parameter"