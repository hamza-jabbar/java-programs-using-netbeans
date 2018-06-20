/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */

public class MagicName {
    private String name;
    public MagicName() {
    name = "No Name"; //B1 A
    }

    public MagicName (String name) {
    if (name.length()>0)
        this.name = name;
    else
        this.name = "No Name";
  //B1 A
    }

    public void setName(String name) {
    this.name = name;
    }
//B1 B
    public String getName() {
        return name;
    }
//B1 B
 
    public int magicNumber() {
        int sum=0;
    for(int i=0; i<name.length(); i++) {
        sum += (int)(name.charAt(i));
    }
    return sum/name.length();
    }

    public String toString() {
        return name + ":" + magicNumber();
    }
//B1 C
 
    public boolean equals(MagicName other) {
        boolean result = false;
    if (this.magicNumber()==other.magicNumber()) result = true;
       return result;
    }
}
/*Question 1 for past exam paper*/
 

 
