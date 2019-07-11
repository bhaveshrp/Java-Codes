class Example2{
    public static void main(String args[]){
        int arr[] = new int[]{0,10,12,2,3,4,18,20,2,5};
        int max = 0;
        int min = 1000;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        
        System.out.println("Maximum value of arr[]: " + max);
        System.out.println("Minimum value of the arr[]: " + min);
    }
}
