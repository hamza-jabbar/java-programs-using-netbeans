/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PublicPrivateThis2 {
    public int hour = 1;/*To use this in other classes you will need to chnage it ot public */
    private int minute = 2;
    private int second = 3;
    
/*Do not name the variables same as the "private" variables above (in general)*/
    
    public void setTime(int hour, int minute, int second) {
        this.hour = 4; //It uses the 'hour' inside this method
        this.minute = 5;//It uses the 'minute' inside this method
        this.second = 6;//It uses the 'second' inside this method
    }
    
    public String toMilitary() {
        return String.format("%02d:%02d:%02d", hour, minute, second );
    }
        public String toString(){
        return String.format("%d:%02d:%02d %s", ((hour==0 || hour==12) ?12:hour%12), minute, second, (hour < 12? "am":"pm"));
    }        
}

