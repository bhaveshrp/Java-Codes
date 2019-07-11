import java.util.Scanner;

class Example3{
    public static void main(String args[]){
        int arr[] = new int[]{1,4,34,56,7};
        int searchValue;
        boolean found;
        Scanner sc = new Scanner(System.in);
        while(true){
            found = false;
            System.out.println("Enter the search value:");
            searchValue = sc.nextInt();
            for(int i=0;i<arr.length;i++){
                if(arr[i] == searchValue){
                    System.out.println("Index at which the element is found: " + i);
                    found = true;
                }
            }
            if(found == false){
                System.out.println("Value not found: " + "-1");
            }
        }
    }
}
