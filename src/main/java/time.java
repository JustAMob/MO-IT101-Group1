import java.util.Scanner;

public class time {
  static double log() {
    Scanner sc = new Scanner(System.in);
    double totaltime = 0;
    double totallatededuc = 0;
    
    for (int day = 1; day <= 2; day++) { //loop for each day of the week

    System.out.printf("Enter Login time(Hr:Mn) for Day %d: ", day);
      String timeStringin = sc.nextLine();

      int latededuc = late.totallate(timeStringin); //checks how many hours to deduct based on log-in time
      
      totallatededuc += latededuc; //ACCUMULATES TOTAL LATE DEDUCTIONS FOR THE WEEK

      double logintime = timeConverter(timeStringin); //converts string into double

    System.out.printf("Enter Logout time(Hr:Mn) for Day %d: ", day);
      String timeStringout = sc.nextLine();

      double logouttime = timeConverter(timeStringout); //converts string into double

      double time = logouttime - logintime; //calculates total hours worked for a day

      System.out.println("Hours worked that day: " + time);
      totaltime += time; //ACCUMULATES TOTAL HOURS FOR THE WEEK
      
    }
    System.out.println(" ");
    System.out.println("Total hours worked: "+ totaltime);
    sc.close();
    return totaltime - totallatededuc; //TOTAL HOURS FOR THE WEEK - TOTAL LATE DEDUCTIONS
  }
  static double timeConverter(String timeString) { //CONVERTING STRING INPUT, INTO INT, INTO DOUBLE
    String[] timeParts = timeString.split(":");

    int hours = Integer.parseInt(timeParts[0]);
    int minutes = Integer.parseInt(timeParts[1]);

    int totalMinutes = hours * 60 + minutes; //CONVERTS HOURS TO MINUTES AND ADDS MINUTES
    double totalTimeInHours = (double) totalMinutes / 60; //CONVERTS TOTAL MINUTES BACK TO HOURS

    return totalTimeInHours;
  }

}