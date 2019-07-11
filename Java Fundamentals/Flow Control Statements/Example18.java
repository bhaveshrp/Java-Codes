import java.util.*;
import java.io.*;

class Example18{
    public static void main(String args[]){
        int num=Integer.parseInt(args[0]);
        int numcopy = num;
        String reverse="";
        while(num!=0){
            reverse = reverse + num % 10;
            num = num / 10;
        }
        if(numcopy == Integer.parseInt(reverse)){
            System.out.println(numcopy + " is a palindrome");
        }
        else{
            System.out.println(numcopy + " is not a palindrome");
        }
    }
}
