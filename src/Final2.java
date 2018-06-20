/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
public class Final2 {
    private int sum; //This holds the sum of the numbers that are going to be added up
    private final int NUMBER; //constants are in caps because it is going to be constant
/*Cannot modify the integer no matter what, you can only set it equal to something once
 When that variable is set to a value, you cannot change it in a method*/
    
    public Final2(int x) {//"x" is going to take "10"
        NUMBER = x; //Make sure the variable is right
        //Now the 'NUMBER' is equal to ten no matter what
        /*You cannot change variable in another method once it is declared*/
    }
    public void add(){
        sum+=NUMBER;//The sum is added by the 'final' variable
/*In this method the sum is going to be added by 10 thus increasing the value by 10
 The method is adding 10 5 times*/
    }
    public String toString(){
        return String.format("sum = %d\n", sum);
    }
}
