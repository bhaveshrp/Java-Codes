class Person{
    private String name;
    private String dateOfBirth;
    
    Person(){}
    
    public Person(String name, String dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    
    /*public String getName(){
        return name;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }*/
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

class Teacher extends Person{
    private double salary;
    private String subject;
    Person per = new Person();
    
    public Teacher(String name, String dateOfBirth, double salary, String subject){
        super(name, dateOfBirth);
        this.salary = salary;
        this.subject = subject;
    }
    
    void display(){
        /*System.out.println("Name: " + per.getName());
        System.out.println("Date of Birth: " + per.getDateOfBirth());*/
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person{
    private String studentId;
    Person per = new Person();
    
    public Student(String name, String dateOfBirth, String studentId){
        super(name, dateOfBirth);
        //System.out.println("Name: " + name);
        //System.out.println("Date of Birth: " + dateOfBirth);
        this.studentId = studentId;
    }
    
    void display(){
        super.display();
        System.out.println("Student Id: " + studentId);
    }
}

class CollegeStudent extends Student{
    private String collegeName;
    private String year;
    
    public CollegeStudent(String name, String dateOfBirth, String studentId, String collegeName, String year){
        super(name, dateOfBirth, studentId);
        this.collegeName = collegeName;
        this.year = year;
    }
    
    void display(){
        super.display();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year: " + year);
    }
}

class Main{
    public static void main(String args[]){
        System.out.println("********Student Details********");
        
        CollegeStudent clgstu = new CollegeStudent("Bhavesh Patil", "18/07/1997", "STID12589", "M. E. S College of Engineering Pune", "final");
        
        clgstu.display();
        
        System.out.println("********Teacher Details********");
        
        Teacher ther = new Teacher("Saurabh Patil", "21/07/2000", 400000.235, "Mechanics");
        ther.display();
        
        
    }
}
