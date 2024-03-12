import java.io.IOException;
import java.io.BufferedReader;


public class empinfo{
  static String empName(int empID){
    String name = "";
    try {
      BufferedReader reader = new BufferedReader(new java.io.FileReader("employee.txt"));
      name = StringLineFinder(empID, reader);
      reader.close();
    } catch (IOException e) {
      System.err.println("Error reading data: " + e.getMessage());
    }  
      return name;
    }

static String position(int empID){
  String position = "";
  try {
    BufferedReader reader = new BufferedReader(new java.io.FileReader("position.txt"));
    position = StringLineFinder(empID, reader);
    reader.close();
  } catch (IOException e) {
    System.err.println("Error reading data: " + e.getMessage());
  }  
    return position;
  }    

static String birthday(int empID){
  String bday = "";
  try {
    BufferedReader reader = new BufferedReader(new java.io.FileReader("birthday.txt"));
    bday = StringLineFinder(empID, reader);
    reader.close();
  } catch (IOException e) {
    System.err.println("Error reading data: " + e.getMessage());
  }  
    return bday;
  }

static double monthlyWage(int empID) {
    double monthlyWage = 0;
    try {
        BufferedReader reader = new BufferedReader(new java.io.FileReader("monthlywage.txt"));
        monthlyWage = LineFinder(empID, reader);
      reader.close();
    } catch (IOException e) {
        System.err.println("Error reading data: " + e.getMessage());
    } 
        
    return monthlyWage;
  }

static double hourlyRate(int empID) {
    double hourlyRate = 0;
    try {
        BufferedReader reader = new BufferedReader(new java.io.FileReader("hourlyrate.txt"));
        hourlyRate = LineFinder(empID, reader);
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

  private static String StringLineFinder(int empID, BufferedReader reader){
    String text = "";
    try {
        String line;
        int lineIndex = 1;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (lineIndex == empID) {
                text = line;
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
    return text;
  }

}