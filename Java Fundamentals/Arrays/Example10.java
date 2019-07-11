class Example10{
    public static void main(String args[]){
        int arr[][] = new int[3][3];
        int max=0;
        if(args.length == 9){
            System.out.println("Below are the command line arguments received:");
            for(int i=0;i<args.length;i++){
                System.out.print(args[i] + " ");
            }
            System.out.println();
            
            System.out.println("The given array is:");
            int k=0;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[i][j] = Integer.parseInt(args[k]);
                    if(arr[i][j] > max){
                        max = arr[i][j];
                    }
                    k++;
                }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){   
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("The biggest number in the given array is:" + max);
        }
        else{
            System.out.println("Please enter 9 integer numbers");
        }
    }
}
