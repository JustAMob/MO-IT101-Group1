import java.io.IOException;
import java.io.BufferedReader;


public class empinfo{
static double monthlyWage(int empID) {
    double monthlyWage = 0;
    try {
  
        BufferedReader reader = new BufferedReader(new java.io.FileReader("monthlywage.txt"));
      // Finding which line the monthlywage for the employee is on
        String line;
        int lineIndex = 1;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (lineIndex == empID) {
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

static String empName(int empID){
  String name = "";
  try {
    BufferedReader reader = new BufferedReader(new java.io.FileReader("employee.txt"));
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
static double hourlyRate(int empID) {
    double hourlyRate = 0;
    try {
      // Finding which line the hourly rate of the employee is on
        BufferedReader reader = new BufferedReader(new java.io.FileReader("hourlyrate.txt"));

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
  
  public static double[] calculateAllowances(int empID) {
    double[] allowances = new double[3]; 
    try  {
      BufferedReader reader = new BufferedReader(new java.io.FileReader("Ricesubsidy.txt"));
      allowances[0] = LineFinder(empID, reader);  
      reader.close();   

      reader = new BufferedReader(new java.io.FileReader("PhoneAllowance.txt"));  
      allowances[1] = LineFinder(empID, reader);
      reader.close();  

      reader = new BufferedReader(new java.io.FileReader("ClothesAllowance.txt"));  
      allowances[2] = LineFinder(empID, reader);
      reader.close();  
  } catch (IOException e) {
      System.err.println("Error reading allowance data: " + e.getMessage());
     
  }
  return allowances;
}
  
  private static double LineFinder(int empID,BufferedReader reader){
    double Amount = 0;
    try {
        
        
        String line;
        int lineIndex = 1;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (lineIndex == empID) {
                Amount = Double.parseDouble(line);
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

   
    return Amount;
  }

}
 
