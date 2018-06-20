/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PublicPrivateThis {
    public static void main(String[] args) {
        PublicPrivateThis2 PublicPrivateThis2Object = new PublicPrivateThis2();
        System.out.println(PublicPrivateThis2Object.toMilitary());
        System.out.println(PublicPrivateThis2Object.toString());

        PublicPrivateThis2Object.setTime(13, 27, 6);
        System.out.println(PublicPrivateThis2Object.toMilitary());
        System.out.println(PublicPrivateThis2Object.toString());
        
        PublicPrivateThis2Object.hour = 7;
/*It has an error because the "hour" is private stated in PublicPrivateThis2 class
only the public methods in PublicPrivateThis2 class can use the private "hour"
        
To use the "hour" variable in other classes, you will have to change the
variable to 'public' instead of private*/
    }
}
