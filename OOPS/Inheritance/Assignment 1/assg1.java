class Animal{
    void eat(){
        System.out.println("Animal::eat() -> Animals show the characteristics of eating like Human Beings");
    }
    void sleep(){
        System.out.println("Animal::sleep() -> Animals sleep considering grass as their bed");
    }
}

class Bird extends Animal{
    void eat(){
        System.out.println("Bird::eat() -> Different birds eat depending on their need and habitat");
    }
    void sleep(){
        System.out.println("Bird::sleep() -> Most of the birds sleep in their nest");
    }
    void fly(){
        System.out.println("Fly::fly() -> Birds show a special characteristics of flying in the open sky. Birds come under the Aves kingdom of living organism classification");
    }
}

class Main{
    public static void main(String args[]){
        Animal a = new Animal();
        a.eat();
        a.sleep();
        
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
