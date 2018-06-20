/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 * 
 */
public class TimeClass {
    public static void main(String[] args) {
        TimeClass2 TimeClass2Object = new TimeClass2();//Gets the info from "TimeClass2"
        System.out.println(TimeClass2Object.toMilitary());
        System.out.println(TimeClass2Object.toString());

        TimeClass2Object.setTime(13, 27, 6);
//                             hour, min,sec
        System.out.println(TimeClass2Object.toMilitary());//This prints out the time for military time
        System.out.println(TimeClass2Object.toString());//This prints out the time for regular time
        
        System.out.println(" ");
        System.out.println("#DGF");
    }
}
