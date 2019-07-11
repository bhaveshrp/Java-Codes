import java.util.*;
import java.io.*;

class Example12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int factors=0;
        int num = sc.nextInt();
        if(num == 2){
            System.out.println("Prime");
        }
        else
        {
            for(int i=2;i<20;i++){
                if(num%i == 0){
                    factors++;
                }
            }
            if(factors > 1){
                System.out.println("Not Prime");
            }
            else{
                System.out.println("Prime");
            }
        }
    }
}
