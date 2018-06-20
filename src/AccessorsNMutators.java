/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AccessorsNMutators {
    public String forename;
    public String surname;
    public String address;
    public double balance = 0;
    
        public void setBalance(double bal){
            balance = bal;
        }
        public double getBalance(){
            return balance;
        }
}
