import java.util.*;
import java.io.*;

class Example13{
    public static void main(String args[]){
        for(int num=11;num<99;num++){
            int factors=1;
            for(int i=2;i<100;i++){
                if(num%i == 0){
                    factors++;
                }
            }
            if(factors == 2){
                System.out.println(num + " ");
            }
        }
    }
}
