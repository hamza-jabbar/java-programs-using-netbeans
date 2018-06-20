/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
import java.util.EnumSet;//This is needed to import the enumeration

public class Enumeration {
    public static void main(String[] args) {
        for(Enumeration2 people: Enumeration2.values())
//"People" & "Values" are variables made to correspond with the 'Enumeration2' values
            
            System.out.printf("%s\t/%s\t%s\n", people, people.getDesc(), people.getAge());
/*This prints out the name, description and their age*/
            
        System.out.println("\nAnd now for the range of constants");
        
        for(Enumeration2 people: EnumSet.range(Enumeration2.Holly, Enumeration2.Chink))
//This picks out the constants
                        System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getAge());
    }                   //This prints the range of constants chosen in a neat manner
}
