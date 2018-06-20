/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class MnI {
    private String girlName;
    public void setName(String name) {
        girlName = name;//variable is equal to the name typed in by the user
    }
    public String getName() {
        return girlName;
    }
    public void saying() {
        System.out.println("Your first gf was " + girlName);
        System.out.println(" ");
        System.out.println("#DGF");
    }
}
