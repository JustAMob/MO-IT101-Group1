import java.util.Scanner;

public class grosswage {
  static double calculateGrossWage() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your hourly pay rate:");
    double rate = sc.nextDouble();
    sc.nextLine();
    
    double hours = time.log();
    System.out.println("Your total hours worked for a Week:" + hours);

    double grossWage = hours * rate;

    System.out.println("Gross wage: " + grossWage);

    sc.close();
    return grossWage;
  }
}