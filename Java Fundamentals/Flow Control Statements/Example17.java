import java.util.*;
import java.io.*;

class Example17{
    public static void main(String args[]){
        int num=Integer.parseInt(args[0]);
        String reverse="";
        while(num!=0){
            reverse = reverse + num % 10;
            num = num / 10;
        }
        System.out.println(Integer.parseInt(reverse));
    }
}
