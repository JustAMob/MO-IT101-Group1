import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

public class empinfo { //Not used. In case we need to add a new employee.
  static void employeeinfo() {
    // Adding new employee
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    try {
      BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("src/main/tempdatabase/employee.txt"));
      writer.write(name);
      writer.newLine();
      writer.close();


      // Adding monthlywage of the new employee
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

static double monthlyWage(int empID) { //FOR FINDING THE MONTHLY WAGE OF AN EMPLOYEE
    double monthlyWage = 0;
    try {
  
        BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/monthlywage.txt"));
      // Finding which line the monthlywage for the employee is on
        String line;
        int lineIndex = 1;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (lineIndex == empID) {
                System.out.println("Monthly wage: " + line);
              // Converting the string to a double
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

static String empName(int empID){ //FOR FINDING THE NAME OF AN EMPLOYEE
  String name = "";
  try {
    BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/employee.txt"));
    // Finding which line the employee is on
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

  static String empBirthday(int empID){ //FOR FINDING THE NAME OF AN EMPLOYEE
  String empBirthday = "";
  try {
    BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/birthday.txt"));
    // Finding which line the employee is on
    String line;
    int lineIndex = 1;
    boolean found = false;
    while ((line = reader.readLine()) != null) {
      if (lineIndex == empID) {
          empBirthday = line;
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

    return empBirthday;
  }
  
static double hourlyRate(int empID) { //FOR FINDING THE HOURLY RATE OF AN EMPLOYEE
    double hourlyRate = 0;
    try {
      // Finding which line the hourly rate of the employee is on
        BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/hourlyrate.txt"));

        String line;
        int lineIndex = 1;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (lineIndex == empID) {
                System.out.println("Hourly rate: "+ line);
              // Converting the string to a double
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

  static double phoneAllowance(int empID) { //FOR FINDING THE PHONE ALLOWANCE OF AN EMPLOYEE
    double phoneAllowance = 0;
    try {

        BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/phoneallowance.txt"));
      // Finding which line the allowance for the employee is on
        String line;
        int lineIndex = 1;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (lineIndex == empID) {
                System.out.println("Phone Allowance: " + line);
              // Converting the string to a double
                  phoneAllowance = Double.parseDouble(line);
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

    return phoneAllowance;
  }

  static double clothingAllowance(int empID) { //FOR FINDING THE CLOTHING ALLOWANCE OF AN EMPLOYEE
    double clothingAllowance = 0;
    try {

        BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/clothingallowance.txt"));
      // Finding which line the allowance for the employee is on
        String line;
        int lineIndex = 1;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (lineIndex == empID) {
                System.out.println("Clothing Allowance: " + line);
              // Converting the string to a double
                  clothingAllowance = Double.parseDouble(line);
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

    return clothingAllowance;
  }

  static double riceSubsidy(int empID) { //FOR FINDING THE RICE SUBSIDY OF AN EMPLOYEE
    double riceSubsidy = 0;
    try {

        BufferedReader reader = new BufferedReader(new java.io.FileReader("src/main/tempdatabase/ricesubsidy.txt"));
      // Finding which line the allowance for the employee is on
        String line;
        int lineIndex = 1;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (lineIndex == empID) {
                System.out.println("Rice Subsidy: " + line);
              // Converting the string to a double
                  riceSubsidy = Double.parseDouble(line);
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

    return riceSubsidy;
  }
}