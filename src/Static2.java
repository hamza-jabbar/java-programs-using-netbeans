/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class Static2 {
    private String first; //first name
    private String last; //last name
    private static int member = 0;//The amount of members
    
    public Static2(String fn, String ln) {
        first = fn;
        last = ln;
        member++; //Increments the members when they are added
        System.out.printf("Constructor for %s %s,\t members in the club: %d\n", first, last, member);
    //this prints out the statement each time a new object is added           
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMember(){
        return member;
//These methods get the objects and return them when the objects are called in the main class    
    }
}
