import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    /*-----------Get the Employee Information-----------*/
    System.out.print("Enter the amount of days worked in a month: ");
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
    double grossWage =  hours * hourlyrate;
    System.out.println("Grosswage: " + grossWage);

    /*---------Calculate Government Deductions---------*/
    double SSSdeduc = sss.Sssdeduc(monthlywage);
    double PhilHealthdeduc = philhealth.PhilHealthdeduc(monthlywage);
    double Pagibigdeduc = pagibig.Pagibigdeduc(monthlywage);
    double Totaldeduction = (SSSdeduc + PhilHealthdeduc + Pagibigdeduc);

    double deductedWage = grossWage - Totaldeduction;
    double withholdingtax = tax.taxdeduc(deductedWage);


    /*-------------Calculate Tax Deductions-------------*/
    System.out.println("\n\n\n|--------------Deductions--------------| \n");
    System.out.println("SSS Contribution: " + SSSdeduc);
    System.out.println("PhilHealth Contribution: " + PhilHealthdeduc);
    System.out.println("Pag-Ibig Contribution: " + Pagibigdeduc);
    System.out.println("Withholding Tax: " + withholdingtax);
    System.out.println("Total Deductions: "+ Totaldeduction + withholdingtax);

    /*------------Retrieve & Show Allowances------------*/
    System.out.println("\n\n\n|--------------Allowances--------------| \n");
    double[] allowances = empinfo.calculateAllowances(empID);
    System.out.println("Rice Subsidy: " + allowances[0]);
    System.out.println("Phone Allowance: " + allowances[1]);
    System.out.println("Clothes Allowance: " + allowances[2]);
    double totalallowances = sumArray(allowances);
    System.out.println("Total Allowances: " + totalallowances);

    /*-------------Calculate Net Pay-------------*/
    System.out.println("\n\n\n|--------------Netpay--------------| \n");
    System.out.println("Deductedwage without tax: " + deductedWage);
    double netpay = (deductedWage + totalallowances)- withholdingtax;
    System.out.println("Net Pay: " + netpay); 
   sc.close();
  }
  public static double sumArray(double[] array) { //To get sum of all elements in allowances array
    double sum = 0; 
    for (int i = 0; i < array.length; i++) {
        sum += array[i]; 
    }
    return sum; 
  }
}
