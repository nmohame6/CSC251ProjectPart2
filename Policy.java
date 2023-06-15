import java.util.*;

class Policy{

// declaring relevant fields
   private int polnumber;
   private String provname;
   private String polfirst;
   private String pollast;
   private int polage;
   private boolean smokestat;
   private double polheight;
   private double polweight;
   private double calcBMI;
   private double calcInsuranceNumber= 600.00;
   private double addFee = 0;
   // no arg constructor
public Policy(){
    polnumber = 0;
    provname = "";
    polfirst = "";
    pollast = "";
    polage = 0;
    smokestat = false;
    polheight = 0;
    polweight = 0;
    calcBMI = 0;
    
}
public Policy(int polnumber, String provname, String polfirst, String pollast, int polage, boolean smokestat, double polheight, double polweight){
   this.polnumber = polnumber;
   this.provname = provname;
   this.polfirst = polfirst;
   this.pollast = pollast;
   this.polage = polage;
   this.smokestat = smokestat;
   this.polheight = polheight;
   this.polweight = polweight;
   }

// @param polnumber (sets policy number)
public void setPolNumber(int polnumber){
   this.polnumber = polnumber;
   }
// @param provname sets provider name
public void setProvName(String provname){
   this.provname = provname;
   }
// @ param polfirst sets policyholders first name
public void setPolFirst(String polfirst){
   this.polfirst = polfirst;
   }
// @ param pollast sets policyholders last name
public void setPolLast(String pollast){
   this.pollast = pollast;
   }
// @ param polage sets policy holders age
public void setPolAge(int polage){
   this.polage = polage;
   }
// @ param smokestat sets smoker status
public void setSmokeStat(boolean smokestat){
   this.smokestat = smokestat;
   }
// @ param polheight sets policyholders height
public void setPolHeight( double polheight){
   this.polheight = polheight;
   }
// @param polweight sets policyholders weight
public void setPolWeight(double polweight){
   this.polweight = polweight;
   }
// @return calcBMI using weight & height returns BMI for policyholder
public double calculateBMI(){
   calcBMI = (polweight * 703)/ (polheight*polheight);
   return calcBMI;
   }
// @return calcInsuranceNumber returns insurance policy's total cost
public double calculateInsurancePolicy(){
   if(polage >=50){
      addFee +=75;
   }
   if(smokestat){
      addFee +=100;
   }
   if(calcBMI >= 35){
     addFee += ((calcBMI - 35)*20);
   }
   calcInsuranceNumber += addFee;
   return calcInsuranceNumber;
}

// @ return polnumber returns policy number
public int getPolNumber(){
   return polnumber;
   }

//@ return provname returns provider's name
public String getProvName(){
   return provname;
   }

//@return polfirst returns policy holder's first name
public String getPolFirst(){
   return polfirst;
   }

//@return pollast returns policy holder's last name
public String getPolLast(){
   return pollast;
   }

//@return polage returns policy holder's last name
public int getPolAge(){
   return polage;
   }

//@return smokestat returns whether or not policyholder is a smoker 
public boolean getSmokeStat(){
   return smokestat;
   }
//@return polheight returns policyholders height
public double getPolHeight(){
   return polheight;
   }
//@return polweight returns policyholders weight
public double getPolWeight(){
   return polweight;
   }


} 
