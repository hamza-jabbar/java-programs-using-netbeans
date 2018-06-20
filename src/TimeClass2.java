/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TimeClass2 {
    private int hour;
    private int minute;
    private int second;
    
    public void setTime(int h, int m, int s) {
        hour = ((h>=0 && h<24) ? h : 0);
//The numbers inputted has to be inbetween the numbers in the hours   **   
        minute = ((m>=0 && m<60) ? m : 0);
//The numbers inputted has to be inbetween the numbers in the minutes **
        second = ((s>=0 && s<60) ? s : 0);
//The numbers inputted has to be inbetween the numbers in the seconds **so that it can operate
    }
    
    public String toMilitary() { //This method is for the military time
        return String.format("%02d:%02d:%02d", hour, minute, second );//This diplays the time
//The "02d" means that it is going to display the numbers in 2 decimal places
    }
    
    public String toString(){//This is the method for regular time
        return String.format("%d:%02d:%02d %s", ((hour==0 || hour==12) ?12:hour%12), minute, second, (hour < 12? "am":"pm"));
//If hour is less than 12 then put in the numbers upto 12 and put in am, if its over then put in the numbers under 12 and put in pm
    }        
}