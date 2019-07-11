import java.util.*;
import java.io.*;

class Example1 {
    public static void main(String args[]){
        System.out.println("Only Integer Input...");
        while(true){
            int a;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if(a == 0){
                System.out.println("Zero");
            }
            else if(a < 0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Positive");
            }
        }
    }
}
