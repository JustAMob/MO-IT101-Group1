public class late {
  static int totallate(String timeString) {
    
    String[] timeParts = timeString.split(":");

    int hours = Integer.parseInt(timeParts[0]);
    int minutes = Integer.parseInt(timeParts[1]);
    // Employee's are given 10 minutes grace period

    if (hours == 8 && minutes >= 11){
      return 1;
    }
    else if (hours == 1 && minutes >= 11){
      return 1;
    }
    switch (hours){
      case 9:
        return 2;
      case 10:
        return 3;
      case 2:
        return 2;
      case 3:
        return 3;
    }
          
    return 0;
  }
}