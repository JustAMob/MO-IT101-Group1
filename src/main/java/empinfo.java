import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

public class empinfo {
  static void employeeinfo() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    try {
      BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("src/main/tempdatabase/employee.txt"));
      writer.write(name);
      writer.newLine();
      writer.close();

      System.out.print("Enter your Monthly Wage: ");
      Double monthlywage = sc.nextDouble();
      writer = new BufferedWriter(new java.io.FileWriter("src/main/tempdatabase/monthlywage.txt"));
      writer.write(String.valueOf(monthlywage));
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      sc.close();
    }
  }

  static double monthlywage() {
    double monthlywage = 0;
    try {
      BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/monthlywage.txt"));

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}