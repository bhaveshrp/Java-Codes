class Example9{
    public static void main(String []args){
        int i,j,k;
        int arr[][] = new int[2][2];
        if(args.length == 4){
            System.out.println("Below are the command line arguments:");
            for(i=0;i<args.length;i++){
                System.out.print(args[i] + " ");
            }
            System.out.println();
            k=0;
            for(i=0;i<2;i++){
                for(j=0;j<2;j++){
                    arr[i][j] = Integer.parseInt(args[k]);
                    k++;
                }
            }
            System.out.println("Given array is:");
            for(i=0;i<2;i++){
                for(j=0;j<2;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("The reverse of the array is:");
            for(i=1;i>=0;i--){
                for(j=1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
                
        }
        else{
            System.out.println("Please enter 4 integer numbers");
        }
    }
}
