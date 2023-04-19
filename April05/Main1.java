import java.util.*;

class KIITEmployee {
    private int emp_id;
    private String emp_name;
    private String emp_desig;
    private double basicSalary;
    private double hra;
    private double da;

    public KIITEmployee(int emp_id, String emp_name, String emp_desig, double basicSalary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_desig = emp_desig;
        this.basicSalary = basicSalary;
        this.hra = 0.15 * basicSalary; // 15% of basicSalary
        this.da = 0.38 * basicSalary; // 38% of basicSalary
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + this.emp_id);
        System.out.println("Employee Name: " + this.emp_name);
        System.out.println("Employee Designation: " + this.emp_desig);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("HRA: " + this.hra);
        System.out.println("DA: " + this.da);
    }

    public double getGrossSalary() {
        return this.basicSalary + this.hra + this.da;
    }
}

public class Main1 {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);  
      System.out.print("Enter number of employees : ");  
      int n=sc.nextInt();  
        
      KIITEmployee[] employees = new KIITEmployee[n]; 

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
          employees[i] = emp; 
      } 
        
      for(int i=0;i<n-1;i++) {
        for(int j=i+1;j<n;j++) {
            if(employees[i].getGrossSalary() > employees[j].getGrossSalary()) {
                KIITEmployee temp = employees[i];
                employees[i] = employees[j];
                employees[j] = temp;
            }
        }
      }

      System.out.println("\nEmployees sorted by gross salary (ascending order):");
      for(KIITEmployee emp:employees) {    
            emp.getEmployeeDetails();
            System.out.println("Gross Salary: " + emp.getGrossSalary());
        }    
    }
}