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
      sc.nextLine();
      writer = new BufferedWriter(new java.io.FileWriter("src/main/tempdatabase/monthlywage.txt"));
      writer.write(String.valueOf(monthlywage));
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      sc.close();
    }
  }

static double monthlyWage(int empID) {
    double monthlyWage = 0;
    try {
  
        BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/monthlywage.txt"));

        String line;
        int lineIndex = 1;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (lineIndex == empID) {
                System.out.println(line);
                monthlyWage = Double.parseDouble(line);
                found = true; 
                break;
            }
            lineIndex++;
        }
        if (!found) {
            System.out.println("Incorrect EmployeeID");
        }
      reader.close();
    } catch (IOException e) {
        System.err.println("Error reading data: " + e.getMessage());
    } 
        
    return monthlyWage;
  }

static String empName(int empID){
  String name = "";
  try {
    BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/employee.txt"));
    String line;
    int lineIndex = 1;
    boolean found = false;
    while ((line = reader.readLine()) != null) {
      if (lineIndex == empID) {
        name = line;
        found = true; 
        break;
      }
      lineIndex++;
    }
    if (!found) {
      System.out.println("Incorrect EmployeeID");
    }
    reader.close();
  } catch (IOException e) {
    System.err.println("Error reading data: " + e.getMessage());
  } 
  
    return name;
  }
static double hourlyRate(int empID) {
    double hourlyRate = 0;
    try {

        BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/hourlyrate.txt"));

        String line;
        int lineIndex = 1;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (lineIndex == empID) {
                System.out.println(line);
                hourlyRate = Double.parseDouble(line);
                found = true; 
                break;
            }
            lineIndex++;
        }
        if (!found) {
            System.out.println("Incorrect EmployeeID");
        }
      reader.close();
    } catch (IOException e) {
        System.err.println("Error reading data: " + e.getMessage());
    } 

    return hourlyRate;
  }
  
}