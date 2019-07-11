import java.util.*;
import java.io.*;

class Example14{
    public static void main(String args[]){
        int factors=0;
        if(args.length != 0){
            int num = Integer.parseInt(args[0]);
            if(num == 2){
                System.out.println("Prime");
            }
            else if(num == 1){
                System.out.println("1 is neither prime nor composite");
            }
            else if(num == 0){
                System.out.println("0 is neither prime nor composite");
            }
            else{
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
        else{
            System.out.println("Please enter an integer number");
        }
    }
}
