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

public class CreatingFiles {
    public static void main(String[] args) {
        final Formatter x; //This outputs strings to a file that is created
        
        try {
            x = new Formatter("F:\\mine.txt");
            System.out.println("A file is created");
        } catch(Exception e) {
            System.out.println("This is an error");
        }
    }
}
