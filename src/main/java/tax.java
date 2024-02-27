public class tax {
  static double taxdeduc (double deductedwage){
    double tax = 0;
    if(deductedwage >= 20833 && deductedwage <= 33333){
      tax = (deductedwage - 20833) * 0.2;
    }
    else if(deductedwage >= 33333 && deductedwage <= 66667){
      tax = (deductedwage - 33333) * 0.25 + 2500;
    }
    else if(deductedwage >= 66667 && deductedwage <= 166667){
      tax = (deductedwage - 66667) * 0.3 + 10833.33;
    }
    else if(deductedwage >= 166667 && deductedwage <= 666667){
      tax = (deductedwage - 166667) * 0.32 + 40833.33;
    }
    else if(deductedwage >= 666667){
      tax = (deductedwage - 666667) * 0.35 + 200833.33;
    }
    else{
      tax = 0;
    }
    System.out.println("Tax Deduction: " + tax);
    return tax;
  }
}