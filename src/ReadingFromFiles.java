/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
import java.io.*;
import java.util.*;
public class ReadingFromFiles {
    private Scanner x;
    public void openFile() {
        try {
            x = new Scanner(new File("F:\\chinese.txt"));
        } 
        catch (Exception e) {
            System.out.println("Could not find file");
        }
    }
    public void readFile() {
        while(x.hasNext()) { //While the file (x) has something in that file
            String a = x.next();
            String b = x.next();
            String c = x.next();
            
            //System.out.println(a + " " + b + " " + c);
            System.out.printf("%s %s %s\n", a, b, c);
        }
    }
    public void closeFile() {
        x.close();
    }
    public static void main(String[] args) {
        ReadingFromFiles r = new ReadingFromFiles();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
