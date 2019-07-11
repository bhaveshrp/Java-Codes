//code for removing duplicate elements from a array and printing the same

class Example7{
    public static void remove_duplicate(int []arr, int len){
        int unique_len = len;
        System.out.println("Array with duplicate elements:");
        for(int i=0;i<unique_len;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array with unique elements:");
        for(int i=0;i<unique_len;i++){
            for(int j=i+1;j<unique_len;j++){
                if(arr[i] == arr[j]){
                    arr[j] = arr[unique_len-1];
                    unique_len--;
                    j--;
                }
            }
        }
        for(int i=0;i<unique_len;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[]{10,10,10,20,11,22,11,20,22};
        int len = arr.length;
        Example7 obj = new Example7();
        obj.remove_duplicate(arr,len);
    }
}
