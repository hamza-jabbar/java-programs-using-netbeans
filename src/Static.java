/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class Static {
    public static void main(String[] args) {
        Static2 member1 = new Static2 ("Megan", "Fox");
        Static2 member2 = new Static2 ("Cameron", "Diaz");
        Static2 member3 = new Static2 ("Angelina", "Jolie");
        //each member has its own set of variables
/*All of the objects share the same static variable, so that means they can all 
   see that the members of the club has changed each time a member is added*/
        System.out.println(Static2.getMember());
/*This print line prints out the main 'static method' and the total members
 - With static you can get the method from the getMembers method in 'Static2' 
   class and display the number of members with the members shown*/
        System.out.println();
        System.out.println(member1.getFirst());
        System.out.println(member1.getLast());
        System.out.println(member1.getMember()); 
/*This shows the number of members in the club because the 'ststic' variable is 
 shared by the objects used*/        
        
        
    }
}
