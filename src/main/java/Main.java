import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your EmployeeID: ");
    int empID = sc.nextInt();
   
    
    String Name = empinfo.empName(empID);
    System.out.println("Employee Name: " + Name);

    double hourlyrate = empinfo.hourlyRate(empID);
    
    double hours = time.log();
   
    double grossWage = hours + hourlyrate;

    double monthlywage = empinfo.monthlyWage(empID);

    double SSSdeduc = sss.Sssdeduc(monthlywage);
    double PhilHealthdeduc = philhealth.PhilHealthdeduc(monthlywage);
    double Pagibigdeduc = pagibig.Pagibigdeduc(monthlywage);

    double deductedWage = grossWage - (SSSdeduc + PhilHealthdeduc + Pagibigdeduc);

    double withholdingtax = tax.taxdeduc(deductedWage);

    System.out.println("SSS Contribution: " + SSSdeduc);
    System.out.println("PhilHealth Contribution: " + PhilHealthdeduc);
    System.out.println("Pag-Ibig Contribution: " + Pagibigdeduc);

    double netpay = deductedWage - withholdingtax;

    System.out.println("Net Pay: " + netpay); 
   sc.close();
  }
}