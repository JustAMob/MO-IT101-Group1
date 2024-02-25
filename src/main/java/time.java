import java.util.Scanner;

public class time {
  static double log() {
    Scanner sc = new Scanner(System.in);
    double totaltime = 0;
    double totallatededuc = 0;
    
    for (int day = 1; day <= 1; day++) {

    System.out.printf("Enter Login time(Hr:Mn) for Day %d: ", day);
      String timeStringin = sc.nextLine();

      int latededuc = late.totallate(timeStringin);
      
      totallatededuc += latededuc;

      double logintime = timeConverter(timeStringin);

    System.out.printf("Enter Logout time(Hr:Mn) for Day %d: ", day);
      String timeStringout = sc.nextLine();

      double logouttime = timeConverter(timeStringout);

      double time = logouttime - logintime;

      System.out.println("Total hours worked: " + time);
      totaltime += time;

    }
    sc.close();
    return totaltime - totallatededuc;
  }
  static double timeConverter(String timeString) {
    String[] timeParts = timeString.split(":");

    int hours = Integer.parseInt(timeParts[0]);
    int minutes = Integer.parseInt(timeParts[1]);

    int totalMinutes = hours * 60 + minutes;
    double totalTimeInHours = (double) totalMinutes / 60;

    return totalTimeInHours;
  }

}