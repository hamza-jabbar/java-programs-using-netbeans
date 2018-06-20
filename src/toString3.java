/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
//Composition refers to objects in other classes as members
public class toString3 {
    private String name;
    private toString birthday;/*This is composition because it is refering to
 other the other classes as members*/
    
    public toString3(String theName, toString theDate){
        name = theName;
        birthday = theDate;
    }
    public String toString() {
        return String.format("My name is %s and my birthday is on %s", name, birthday);
/*This returns the object in a string format and it uses the object in the string
 for birthday, it turns the object into a string, When the string is wanted, it
 goes to the 'toString' class and uses the "toString" method*/

//This is a string representation of an object
        
/*If a string representation is needed then it comes to this method and returns 
the method by printing out the statment and look at the 'name' and 'birthday' 
string and see what string it is going to put in
 -The 'birthday' does not have a string, it is a reference to 'theDate' object
  and not a string*/
    }
}
