/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class Construct2 {
        private String girlName;
    
    public Construct2(String name) {
        girlName = name;
    }
        
    public void setName(String name) {
        girlName = name;//variable is equal to the name typed in by the user
    }
    public String getName() {
        return girlName;
    }
    public void saying() {
        System.out.println("Your first gf was " + girlName);
    }
}
//Gives the variable a value as soon as you use the constructor