


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hjabbar1
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
public class WriteToTextFile {
    public static void main(String[] args) {
        //Streams
        String filename = "E:\\Programs\\Java\\IntermediateJava\\src\\myfile.txt";
        Random r = new Random(); //random object is created
        int number;
        try {
            PrintWriter outputStream = new PrintWriter(filename);
            for(int i=0; i<10; i++) {
                number = r.nextInt(14011858);
                outputStream.println(number + " ");
            }
            /*for(int row = 0; row < 64; row++) {
                for(int col = 0; col < 128; col++) {
                    if((row * col) % (row + 1) == 0) {
                        outputStream.print("*");   
                    } else {
                        outputStream.print(" ");
                    }
                }
                outputStream.println(" ");
            }*/
            outputStream.close(); //Flushes data in file
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        
    }
}
