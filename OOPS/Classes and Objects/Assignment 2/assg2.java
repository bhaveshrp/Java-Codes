class Power{
    Power(){
        System.out.println("Class for Calculating Power");
    }
    
    static int powerInt(int num1, int num2){
        int power;
        power = (int)Math.pow(num1,num2);
        return power;
    }
    
    static double powerDouble(double num1, int num2){
        double power;
        power = (double)Math.pow(num1,num2);
        return power;
    }
    
    public static void main(String args[]){
        Power obj = new Power();
        int answerInt;
        double answerDbl;
        answerInt = obj.powerInt(2,4);
        System.out.println("The 2 rased to the power of 4(Math.pow(int,int)): " + answerInt);
        
        answerDbl = obj.powerDouble(4.2,2);
        System.out.println("The 4.2 rased to the power of 2(Math.pow(double,int)): " + answerDbl);
    }
}
