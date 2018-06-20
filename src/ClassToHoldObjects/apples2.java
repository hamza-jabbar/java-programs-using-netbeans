/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassToHoldObjects;

/**
 *
 * @author Hamza
 */
public class apples2 {
    public static void main(String[] args) {
        Animal[] theList = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();
        
        theList[0] = d;
        theList[1] = f;
        
        for(Animal x: theList) {
            x.noise();
        }
    }
}
