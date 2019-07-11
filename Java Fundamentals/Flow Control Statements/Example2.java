import java.util.*;
import java.io.*;

class Example2 {
    public static void main(String args[]){
        System.out.println("Only Integer Input...");
        while(true){
            int a;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if(a % 2 == 0){
                System.out.println("Even");
            }
            else if(a == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}
