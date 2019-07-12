import java.util.Scanner;

class Patient{
    String patientName;
    double weight;
    double height;
    
    Patient(){
        System.out.println("Class for computing BMI of the Patient");
    }
    
    double computeBMI(){
        double result;
        result = weight / (height * height);
        return result;
    }
    
    public static void main(String args[]){
        double result;
        int n;
        Patient obj = new Patient();
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of patient");
        n = ip.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of the Patient " + (i+1));
            obj.patientName = ip.next();
            System.out.println("Enter the weight of " + obj.patientName + ": ");
            obj.weight = ip.nextDouble();
            System.out.println("Enter the height of " + obj.patientName + ": ");
            obj.height = ip.nextDouble();
            result = obj.computeBMI();
            System.out.println("The BMI of " + obj.patientName + " is: " + result);
        }
    }
}
