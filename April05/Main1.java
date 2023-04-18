import java.util.*;

class KIITEmployee implements Comparable<KIITEmployee> {
    private int emp_id;
    private String emp_name;
    private String emp_desig;
    private double basicSalary;
    private double hra;
    private double da;

    public KIITEmployee(int id, String name, String desig, double salary) {
        emp_id = id;
        emp_name = name;
        emp_desig = desig;
        basicSalary = salary;
        hra = 0.15 * basicSalary; // 15% of basicSalary
        da = 0.38 * basicSalary; // 38% of basicSalary
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Designation: " + emp_desig);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
    }

    public double getGrossSalary() {
        return basicSalary + hra + da;
    }

    @Override
    public int compareTo(KIITEmployee other) {
        return Double.compare(this.getGrossSalary(), other.getGrossSalary());
    }
}

public class Main1 {
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);  
      System.out.print("Enter number of employees : ");  
      int n=sc.nextInt();  
        
      List<KIITEmployee> employees=new ArrayList<>(); 

      for(int i=0;i<n;i++) {    
          System.out.println("\nEmployee #" + (i+1));
          System.out.print("Enter employee ID : ");  
          int emp_id=sc.nextInt();  
          sc.nextLine(); // Consume newline character
          System.out.print("Enter employee name : ");  
          String emp_name=sc.nextLine();  
          System.out.print("Enter employee designation : ");  
          String emp_desig=sc.nextLine();    
          System.out.print("Enter basic salary : ");  
          double basicSalary=sc.nextDouble();
          
          KIITEmployee emp = new KIITEmployee(emp_id, emp_name, emp_desig, basicSalary);
          employees.add(emp); 
      } 
        
      Collections.sort(employees);  

      System.out.println("\nEmployees sorted by gross salary (ascending order):");
      for(KIITEmployee emp:employees) {    
            emp.getEmployeeDetails();
            System.out.println("Gross Salary: " + emp.getGrossSalary());
        }    
    }
}
