/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import java.io.File;
public class FileClass {
    public static void main(String[] args) {
       File x = new File("F:\\newFile.txt");
       
       if(x.exists())
            System.out.println(x.getName() + " exists");
       else
            System.out.println("The file does not exist");
    }
}
