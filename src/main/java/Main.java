import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    /*-----------Get the Employee Information-----------*/
    System.out.println("Enter your EmployeeID: ");
    int empID = sc.nextInt();
    
    String Name = empinfo.empName(empID);
    System.out.println("Employee Name: " + Name);
    
    double monthlywage = empinfo.monthlyWage(empID);
    System.out.println("Monthly wage: " + monthlywage); 

    /*-----------Calculate Grosswage-----------*/
    double hourlyrate = empinfo.hourlyRate(empID);
    double hours = time.log();
    double grossWage = (4 * hours) * hourlyrate;


    /*---------Calculate Government Deductions---------*/
    double SSSdeduc = sss.Sssdeduc(monthlywage);
    double PhilHealthdeduc = philhealth.PhilHealthdeduc(monthlywage);
    double Pagibigdeduc = pagibig.Pagibigdeduc(monthlywage);
    double deductedWage = grossWage - (SSSdeduc + PhilHealthdeduc + Pagibigdeduc);
    
    /*------------Calculate Tax Deductions------------*/
    double withholdingtax = tax.taxdeduc(deductedWage);

    System.out.println("SSS Contribution: " + SSSdeduc);
    System.out.println("PhilHealth Contribution: " + PhilHealthdeduc);
    System.out.println("Pag-Ibig Contribution: " + Pagibigdeduc);

 /*------------Retrieve & Show Allowances------------*/
    double[] allowances = empinfo.calculateAllowances(empID);
    System.out.println("Rice Subsidy: " + allowances[0]);
    System.out.println("Phone Allowance: " + allowances[1]);
    System.out.println("Clothes Allowance: " + allowances[2]);
    
    double netpay = deductedWage - withholdingtax;

    System.out.println("Net Pay: " + netpay); 
   sc.close();
  }
}