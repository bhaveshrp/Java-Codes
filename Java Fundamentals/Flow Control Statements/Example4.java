//Initialize two character variables in a program and display the characters in alphabetical order.

import java.util.*;
import java.io.*;

class Example4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            char a = sc.next().charAt(0);
            char b = sc.next().charAt(0);
            if(a > b){
                System.out.println(b + "," + a);
            }    
        }
        
    }
}
