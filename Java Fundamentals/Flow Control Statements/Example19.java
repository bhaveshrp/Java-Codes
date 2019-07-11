import java.util.*;
import java.io.*;

class Example19{
    public static void main(String args[]){
        int i=1,count=1;
        while(count!=6){
            if((i%2 == 0) && (i%3 == 0) && (i%5 == 0)){
                System.out.println(i);
                count++;
            }
            i++;
            
        }
    }
}
