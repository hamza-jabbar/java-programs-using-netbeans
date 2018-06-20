/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author hjabbar1
 */
public class TypesOfStrings {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);
        
        char data[] = {'a', 'b', 'c'};
        String p = new String(data);
        System.out.println(p);
        
        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc " + cde);
        
        String d = cde.substring(1, 2) ;
        System.out.println(d);
    }
}
