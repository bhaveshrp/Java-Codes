/*Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
*/

import java.util.*;
import java.io.*;


class Example5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            char a = sc.next().charAt(0);
            if(a>=48 && a<=57){
                System.out.println("Digit");
            }
            else if((a>=65 && a<=90) || (a>=97 && a<=122)){
                System.out.println("Alphabhet");
            }
            else{
                System.out.println("Special Character");
            }
            
                
        }
        
        
    }
}
