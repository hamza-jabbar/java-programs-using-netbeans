/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MultipleConstructors2 {
    private int hour;
    private int minute;
    private int second;
    /*The variables can only be used in this class*/
    
    public MultipleConstructors2() {//Constructor with 0 arguments
        this(0,0,0);
    }
    public MultipleConstructors2 (int h) {//Constructor with 1 argument
        this(h,0,0);//Used the '5' for hour and the '0's as a default figure
    }
    public MultipleConstructors2 (int h, int m) {//Constructor with 2 arguments
        this (h,m,0);//Used the '5' for hour and '13' for minute and 0 as default for 'seconds'
    }
    public MultipleConstructors2 (int h, int m, int s) { //Constructor with 3 arguments
        setTime(h,m,s); //Sets the time in a "setTime" method
/*When all 3 numbers are used, it uses this constructor which sets the time using the set time method*/
        
/*These are constructors with multiple arguments
You can make different constructors depending on how many arguments you have*/
    }
    public void setTime(int h, int m, int s) {//This is the set time method
        setHour(h);                           //which uses 3 more methods
        setMinute(m);
        setSecond(s);
//These are the methods in order to set the time
    }
    public void setHour(int h){
        hour = ((h>=0&&h<24)?h:0);//This method checks for numbers between 0 & 24 
    }
    public void setMinute(int m){
        minute = ((m>=0&&m<60)?m:0);//This method checks for numbers between 0 & 60 
    }
        public void setSecond(int s){
        second = ((s>=0&&s<60)?s:0);//This method checks for numbers between 0 & 60 
    }
    public int getHour(){//Method gets the hour and returns it when the "toMiltary" method is called
        return hour;
    }
    public int getMinute(){ //Method gets the minute and returns it when the "toMiltary" method is called
        return minute;
    }
    public int getSecond(){ //Method gets the second and returns it when the "toMiltary" method is called
        return second;
    }
    public String toMilitary(){//This method is for the object in "MultipleConstructors
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
        /*The method returns the Hour, Minute and Second by getting it from the
        method and returns it by displays it by using this string format (as
        stated in the method)*/
    }
}