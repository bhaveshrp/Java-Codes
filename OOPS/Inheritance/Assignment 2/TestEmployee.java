class TestEmployee{
    public static void main(String args[]){
        Employee emp = new Employee("Jackkie Tolstoy", 2019, "NINN10256");
    
        emp.setAnnualSalary(1200000.562);
    
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Joining Year: " + emp.getJoiningYear());
        System.out.println("National Insurance Number: " + emp.getNatInsuNo());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());    
    }
}
