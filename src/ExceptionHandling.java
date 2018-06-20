/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        do {
            try {
                System.out.println("Enter first number: ");
                int n1 = input.nextInt();
                System.out.println("Enter second number: ");
                int n2 = input.nextInt();
                int sum = n1/n2;
                System.out.println("Answer: " + sum);
            }
            catch (Exception e) {
                System.out.println("Naa mate, you can't do that");
            }
        } while (x == 1);
    }
}
