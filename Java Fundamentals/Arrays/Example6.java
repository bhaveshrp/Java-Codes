class Example6{
    public static void main(String args[]){
        int arr[] = new int[]{22,1,21,1,5,3};
        int temp;
        int len = arr.length;
        //Sorting using bubble Sort
        for(int i=0;i<len;i++){
            for(int j=0;j<(len-1);j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<len;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        
    }
}
