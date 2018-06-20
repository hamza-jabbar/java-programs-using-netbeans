/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public enum Enumeration2 {
    Holly("Nice", "18"),
    JBaby("Flawless", "17"),
    DXToo("Foreign", "18"),
    Chink("Good", "17"),
    Deel("Funny", "17"),
    Bari("Small", "18");
    
    private final String desc;
    private final String age;
//These constants are used as objects and they stay the same
    
    Enumeration2(String description, String birthday) {
        desc = description;
        age = birthday;
    }
    public String getDesc() {
        return desc;
//This method returns the 'desc' of the constant  when it is called by 'Enumeration' class
    }
    public String getAge() {
        return age;
//This method returns the age of the constant when it is called by 'Enumeration' class
    }
}
