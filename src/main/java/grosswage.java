import java.util.Scanner;

public class grosswage {
   static double calculateGrossWage() {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your hourly pay rate:");
    double rate = sc.nextDouble();
    
    double hours = time.log();
    System.out.println("Your total hours worked for a Week:" + hours);

    double grossWage = hours * rate;

    System.out.println("Gross wage: " + grossWage);

    sc.close();
    return grossWage;
  }
}