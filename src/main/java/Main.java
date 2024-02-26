public class Main {
  public static void main(String[] args) {

    double monthlywage = empinfo.monthlyWage();

    double grossWage = grosswage.calculateGrossWage();
    
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
  }
}