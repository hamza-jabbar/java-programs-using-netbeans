/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class toString {
    private int day;
    private int month;
    private int year;
    
    public toString(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
        
        System.out.printf("The constructor for this is %s\n", this);
        //"this" is a keyword to the current object and it it needs a string then
    }   // it goes to the "toString" method to get the string for "this"
    
    public String toString() {//If a string object is needed,you will need to come to this method
        return String.format("%d/%d/%d", day, month, year);//The numbers "4,5,6" come from this return type
    }
}
