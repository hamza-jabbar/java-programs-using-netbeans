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
public class StacksPushPop {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        
        //"push"ing the stack
        stack.push("bottom");
        printStack(stack);
        
        stack.push("second");
        printStack(stack);
        
        stack.push("third");
        printStack(stack);
        
        System.out.println((stack.peek()));
        
        stack.push("fourth");
        printStack(stack);
        
        System.out.println((stack.peek())); //Looks at the stack and outputs what is in the stack
        
        System.out.println(stack.size());//outputs the size of the stack
        
        System.out.println(stack.isEmpty());//checks to see if stack is empty or not
        
        //"pop"ing the stack
        stack.pop();
        printStack(stack); //bottom
        
        stack.pop();
        printStack(stack);//first
        
        stack.pop();
        printStack(stack);//second
        
        stack.pop();
        printStack(stack);//third
    }
    
    private static void printStack(Stack<String> s) {
        if(s.isEmpty())
            System.out.println("You have nothing else in your stack ");
        else
            System.out.printf("%s TOP\n", s);
    }
}
