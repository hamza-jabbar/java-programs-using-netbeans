
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
import java.lang.*;
import java.util.*;
public class WritingToFiles {
    private Formatter x;
    
    public void openFile() {
        try {
            x = new Formatter("F:\\chinese.txt");
        } catch(Exception e) {
            System.out.println("You have an error");
        }
    }
    public void addRecords() {
        x.format("%s%s%s", "19 ", "Hamza ", "Jabbar");
    }
    public void closeFile() {
        x.close();
    }
    public static void main(String[] args) {
        WritingToFiles w = new WritingToFiles();
        w.openFile();
        w.addRecords();
        w.closeFile();
    }
}