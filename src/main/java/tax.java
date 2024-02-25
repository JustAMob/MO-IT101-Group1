public class tax {
  static double taxdeduc (double deductedwage){

    if(deductedwage >= 20833 && deductedwage <= 33333){
      return (deductedwage - 20833) * 0.2;
    }
    else if(deductedwage >= 33333 && deductedwage <= 66667){
      return (deductedwage - 33333) * 0.25 + 2500;
    }
    else if(deductedwage >= 66667 && deductedwage <= 166667){
      return (deductedwage - 66667) * 0.3 + 10833.33;
    }
    else if(deductedwage >= 166667 && deductedwage <= 666667){
      return (deductedwage - 166667) * 0.32 + 40833.33;
    }
    else if(deductedwage >= 666667){
      return (deductedwage - 666667) * 0.35 + 200833.33;
    }
    else{
      return 0;
    }

  }
}