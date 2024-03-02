public class philhealth {
  static double PhilHealthdeduc (double wage){

    double contribution;
    
    if (wage <= 10000){
      contribution = 300;
    }
    else if (wage >= 10000.01 && wage <= 59999.99){
      contribution = wage * 0.03;
    }
    else if (wage >= 60000){
      contribution = 1800;
    }
    else{
      contribution = 0;
    }

    // Monthly premium contribution payments are equally shared between the employee and employer
    
    return contribution / 2;
  }
}