import java.util.Scanner;

class Box{
    double width, height, depth;
    double volume;
    Box(){
        System.out.println("Default Constructor");
    }
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double calcVolume(){
        volume = width * height * depth;
        return volume;
    }
    public static void main(String args[]){        
        float volume;
        
        Box obj = new Box(11.1, 45.2, 23.1);
        
        volume = obj.calcVolume();
        System.out.println("Volume of the Box: " + volume);
    }
}
