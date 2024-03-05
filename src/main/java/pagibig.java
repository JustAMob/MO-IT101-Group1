public class pagibig {
  static double Pagibigdeduc (double wage){ //Checks which income range the wage falls into using if and else if statements

    double management; 
    double employee; //hold the respective portions of the Pag-IBIG contribution for the employer (management) and the employee
    
    if (wage >=1000 && wage <= 1500){
      management = wage * 0.01;
      employee = wage * 0.02;
    }
    else if (wage >1500){
      management = wage * 0.02;
      employee = wage * 0.02;
    }
    else{
      management = 0;
      employee = 0;
    }
    
    double contribution = employee + management; 
  
    if (contribution > 100){ //To ensure that the total contribution does not exceed 100 (Maximum contribution amount)
      contribution = 100;
      management = 50;
    }
    
    return contribution - management;
  }
}