/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Inheritance2 extends Inheritance3 {//Only can "extend" 1 class at a time
//"Inheritance3" is the superclas because it is inherited by a subclass
//To inherit, you will need to put in "extends" *and the class you want to herit from*
    public void eat(){
        System.out.println("I am the new method of the eating class");
/*When you inherit from a class but you put in a different method in the class 
 you want to change, you are overiding the class you have inherited from*/
    }
}