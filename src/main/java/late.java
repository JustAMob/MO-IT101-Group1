public class late {
  static int totallate(String timeString) {
    
    String[] timeParts = timeString.split(":");

    int hours = Integer.parseInt(timeParts[0]); // Convert string to integer. Array format
    int minutes = Integer.parseInt(timeParts[1]);
    // Employee's are given 10 minutes grace period
    if (hours == 8 && minutes > 11){ //Checks how many hours to deduct based on log-in time
      return 1;
    }
    switch (hours){
      case 9:
        return 2;
      case 10:
        return 3;
      case 11:
        return 4;
      case 12:
        return 5;
      case 13:
        return 6;
      case 14:
        return 7;
    }
          
    return 0;
  }
}