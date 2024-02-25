public class pagibig {
  static double Pagibigdeduc (double wage){

    double management;
    double employee;
    
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
    
    if (contribution > 100){
      contribution = 100;
      management = 50;
    }
    
    return contribution - management;
  }
}