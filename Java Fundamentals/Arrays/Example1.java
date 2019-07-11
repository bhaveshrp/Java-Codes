class Example1{
    public static void main(String []args){
        int a[] = new int[]{1,3,3,4,5};
        int sum=0;
        float avg;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        avg = (float)sum / a.length;            //Type Casting sum to float for getting appropriate results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}


