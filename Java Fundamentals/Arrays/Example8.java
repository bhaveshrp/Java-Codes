/*
    Write a program to print the sum of the elements of an array following the given below condition. If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
    
*/
import java.util.Scanner;

class Example9{
    public static int addExceptRange(int []arr,int n){
        int sum=0;
        int i,s=0,e=0;
        for(i=0;i<n;i++){
            if(arr[i] == 6){
                s=i;
            }
            if(arr[i] == 7){
                e=i;
            }
        }
        for(i=0;i<n;i++){
            if(s<e){
                for(i=0;i<n;i++){
                    if(i!=s){
                        sum = sum + arr[i];
                    }
                    else{
                        i = i + (e-s);
                    }
                }
            }
            else{
                sum = sum + arr[i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Example8 obj = new Example8();
        int arr[] = new int[20];
        System.out.println("Enter the number of elements to store in array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = obj.addExceptRange(arr,n);
        System.out.println("Bounded Sum:" + sum);
    }
}
