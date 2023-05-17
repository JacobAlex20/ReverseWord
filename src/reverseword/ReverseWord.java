/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;

/**
 *
 * @author jacob
 */
import java.util.*;
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Step 1: Take input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        
        //Step 2: split char from word and store it in char[]
        char[] reverse = new char[str.length()]; //hello 5
        for(int i = 0;i<str.length();i++)
        {
           reverse[i] = str.charAt(i); //h
        }
        
        //Step 3: read array reverse print it
        for(int i=reverse.length-1;i>=0;i--)
        {
            System.out.print(reverse[i]);
        }
    }
    
}
