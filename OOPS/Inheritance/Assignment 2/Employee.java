class Employee extends Person{
    private double annual_salary;
    private int joining_year;
    private String nat_insu_no;
    
    public Employee(String name, int joining_year, String nat_insu_no){
        super(name);
        this.joining_year = joining_year;
        this.nat_insu_no = nat_insu_no;
    }

    public void setAnnualSalary(double annual_salary){
        this.annual_salary = annual_salary;
    }
    
    public int getJoiningYear(){
        return joining_year;
    }
    
    public double getAnnualSalary(){
        return annual_salary;    
    }
    
    public String getNatInsuNo(){
        return nat_insu_no;
    }
}

