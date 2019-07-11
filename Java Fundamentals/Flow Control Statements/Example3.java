/*Write a program to check if the program has received command line arguments or not. If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)*/

import java.util.*;
import java.io.*;

class Example3 {
    public static void main(String args[]){
        if(args.length == 0){
            System.out.println("No values");
        }
        else{
            for(int i=0;i<args.length;i++){
                if((i+1) == args.length){
                    System.out.println(args[i]);
                }
                else{
                    System.out.print(args[i] + ",");
                }
                
            }
        }
    }
}
