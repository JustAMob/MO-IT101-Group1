import java.util.Scanner;

public class time {
  static double log(int daysworked) {
    Scanner sc = new Scanner(System.in);
    double totaltime = 0;
    double totallatededuc = 0;
    
    for (int day = 1; day <= daysworked; day++) { 

    System.out.printf("Enter Login time(Hr:Mn) for Day %d: ", day);
      String timeStringin = sc.nextLine();
      
      int latededuc = late.totallate(timeStringin); //check for lates
      
      totallatededuc += latededuc;

      double logintime = timeConverter(timeStringin);


    System.out.printf("Enter Logout time(Hr:Mn) for Day %d: ", day);
      String timeStringout = sc.nextLine();

      double logouttime = timeConverter(timeStringout);

      double time = logouttime - logintime;
      int breaktime = breakTime(time); //implement break time

      double daytime = time - breaktime;
      System.out.println("Hours worked that day: " + daytime);
      totaltime += daytime - breaktime;
    }
    
    System.out.println("Total hours worked: "+ totaltime);
    sc.close();
    return totaltime - totallatededuc;
  }
  static double timeConverter(String timeString) { //converts string (Hr:Mn) -> to double
    String[] timeParts = timeString.split(":"); 

    int hours = Integer.parseInt(timeParts[0]);
    int minutes = Integer.parseInt(timeParts[1]);
                        
    int totalMinutes = hours * 60 + minutes;
                                          
    double totalTimeInHours = (double) totalMinutes / 60;

    return totalTimeInHours;
  }
  static int breakTime(double time){ //checks if break time is applicable
    int breaktime = 1;
    if (time <= 4.99 ){ //if less than 5 hours of work, no break time
      breaktime = 0;
    }
    return breaktime;
  }  
  

}
