import java.util.*;
import java.io.*;

class Example7{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         while(true){
            char a = sc.next().charAt(0);
            
            if(a >= 65 && a<=90){
                a = (char)((a%65) + 97);
                System.out.println(a);
            }
            else if(a>=97 && a<=122){
                a = (char)((a%97) + 65);
                System.out.println(a);
            }
         }
    }
}
