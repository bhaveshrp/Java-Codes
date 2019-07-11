import java.util.*;
import java.io.*;

class Example15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        for(;num!=0;){
            sum = sum + (num%10);
            num = num/10;
        }
        System.out.println(sum);
    }
}
