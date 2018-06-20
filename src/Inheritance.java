/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Inheritance {
    public static void main(String[] args){
/*The main method would inherit all the methods from the "Inheritance2 & 3"
 classes even though we cannot see them*/
        Inheritance2 Inheritance2Object = new Inheritance2();
        Inheritance3 Inheritance3Object = new Inheritance3();
        
        Inheritance2Object.eat();
        Inheritance3Object.eat();

/*You are able to inherit from another class and that class can inherit from another class
 -Private methods cannot be inherited, Only public methods can be inherited*/
    }
}
