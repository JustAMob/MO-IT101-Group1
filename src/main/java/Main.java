import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    /*-----------Get the Employee Information-----------*/
    System.out.print("Enter the amount of days worked in amonth: ");
    int days = sc.nextInt();

    System.out.print("Enter your EmployeeID: ");
    int empID = sc.nextInt();
    
    System.out.println("\n\n\n|--------------Employee Information--------------| \n");
    String Name = empinfo.empName(empID);
    System.out.println("Employee Name: " + Name);
    String position = empinfo.position(empID);
    System.out.println("Position: " + position);
    String bday = empinfo.birthday(empID);
    System.out.println("Birthday: " + bday);
    double monthlywage = empinfo.monthlyWage(empID);
    System.out.println("Monthly wage: " + monthlywage); 
    double hourlyrate = empinfo.hourlyRate(empID);
    System.out.println("Hourly rate: " + hourlyrate); 

    /*---------------Calculate Grosswage---------------*/
    System.out.println("\n\n\n|--------------Time in and Time out--------------| \n");
    double hours = time.log(days);
    double grossWage = (4 * hours) * hourlyrate;


    /*---------Calculate Government Deductions---------*/
    double SSSdeduc = sss.Sssdeduc(monthlywage);
    double PhilHealthdeduc = philhealth.PhilHealthdeduc(monthlywage);
    double Pagibigdeduc = pagibig.Pagibigdeduc(monthlywage);
    double Totaldeduction = (SSSdeduc + PhilHealthdeduc + Pagibigdeduc);

    double deductedWage = grossWage - Totaldeduction;
    double withholdingtax = tax.taxdeduc(deductedWage);


    /*-------------Calculate Tax Deductions-------------*/
    System.out.println("\n\n\n|--------------Deductions--------------| \n");
    System.out.println("Total Government Deductions: "+ Totaldeduction);
    System.out.println("SSS Contribution: " + SSSdeduc);
    System.out.println("PhilHealth Contribution: " + PhilHealthdeduc);
    System.out.println("Pag-Ibig Contribution: " + Pagibigdeduc);

    /*------------Retrieve & Show Allowances------------*/
    System.out.println("\n\n\n|--------------Allowances--------------| \n");
    double[] allowances = empinfo.calculateAllowances(empID);
    System.out.println("Rice Subsidy: " + allowances[0]);
    System.out.println("Phone Allowance: " + allowances[1]);
    System.out.println("Clothes Allowance: " + allowances[2]);
    double totalallowances = sumArray(allowances);

    System.out.println("\n\n\n|--------------Netpay--------------| \n");
    double netpay = (deductedWage + totalallowances)- withholdingtax;
    System.out.println("Net Pay: " + netpay); 
   sc.close();
  }
  public static double sumArray(double[] array) {
    double sum = 0; 
    for (int i = 0; i < array.length; i++) {
        sum += array[i]; 
    }
    return sum; 
  }
}