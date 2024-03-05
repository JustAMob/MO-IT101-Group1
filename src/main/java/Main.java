import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /*-----------Get the Employee Information-----------*/
    System.out.printf("Enter your EmployeeID: "); //id scanner
    int empID = sc.nextInt();

    System.out.println(" ");
    System.out.println("------EMPLOYEE DETAILS------");
    String Name = empinfo.empName(empID);
    String Birthday = empinfo.empBirthday(empID);
    System.out.println("Employee ID: " + empID); //employee id
    System.out.println("Employee Name: " + Name); //employee name
    System.out.println("Birthday: " + Birthday); //employee birthday
    
    double monthlywage = empinfo.monthlyWage(empID); //monthly wage
    double hourlyrate = empinfo.hourlyRate(empID); //hourly rate
    
    /*-----------Calculate Grosswage-----------*/
    System.out.println(" ");
    System.out.println("------CALCULATE GROSS WAGE------");

    double hours = time.log();
    double grossWage = (4 * hours) * hourlyrate; //(hours worked for a week * number of weeks per month) * hourly rate

    /*-----------Calculate Benefits-----------*/
    System.out.println(" ");
    System.out.println("------BENEFITS------");
    double riceSubsidy = empinfo.riceSubsidy(empID);
    double phoneAllowance = empinfo.phoneAllowance(empID);
    double clothingAllowance = empinfo.clothingAllowance(empID);
    double totalBenefits = riceSubsidy + phoneAllowance + clothingAllowance;
    System.out.println("TOTAL BENEFITS: " + totalBenefits);
    
    /*---------Calculate Govenrment Deductions---------*/
    System.out.println(" ");
    System.out.println("------DEDUCTIONS------");
    
    double SSSdeduc = sss.Sssdeduc(monthlywage);
    double PhilHealthdeduc = philhealth.PhilHealthdeduc(monthlywage);
    double Pagibigdeduc = pagibig.Pagibigdeduc(monthlywage);
    System.out.println("Social Security System: " + SSSdeduc);
    System.out.println("PhilHealth: " + PhilHealthdeduc);
    System.out.println("Pag-Ibig: " + Pagibigdeduc);
    double deductedWage = grossWage - (SSSdeduc + PhilHealthdeduc + Pagibigdeduc); //gross wage - deductions
    /*---------Calculate Tax Deductions---------*/
    double withholdingtax = tax.taxdeduc(deductedWage);
    double totalDeductions = SSSdeduc + PhilHealthdeduc + Pagibigdeduc + withholdingtax;
    System.out.println("TOTAL DEDUCTIONS: " + totalDeductions);
    
    
     /*----------------SUMMARY-----------------*/
    System.out.println(" ");
    System.out.println("------SUMMARY------");
    System.out.println("Gross Income: " + grossWage);
    System.out.println("Benefits: " + totalBenefits);
    System.out.println("Total Deductions: " + totalDeductions);

    double netpay = deductedWage - withholdingtax; //gross wage with deductions - withholding tax
    System.out.println("Net Pay: " + netpay); 
   sc.close();
  }
}