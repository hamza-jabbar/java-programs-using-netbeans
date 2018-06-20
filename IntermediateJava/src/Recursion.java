/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(8));
    }
    public static long fact(long n) {
        if(n <= 1)
            return 1;
        else
            return n * fact(n-1);
    }
}
