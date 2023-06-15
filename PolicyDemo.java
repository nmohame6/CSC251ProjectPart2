import java.util.*;
import java.io.*;
class PolicyDemo{
public static void main(String[] args){
   File policyinfo = new File("PolicyInformation.txt");
   Scanner newFile = new Scanner(policyinfo);
   ArrayList<Policy> Policies = new ArrayList<Policy>();
   boolean continueEntering = true;
   int policyNumber=0;
   String providerName= "";
   String policyFirstName = "";
   String policyLastName = "";
   int policyAge = 0;
   String policySmoker = " ";
   boolean polSmoker = false;
   double policyWeight=0;
   double policyHeight=0;
   int smokeCount = 0;
   int nonSmokeCount = 0;


   Scanner userInput = new Scanner(System.in);
   //System.out.println("Please enter the Policy Number: ");
   // policyNumber = userInput.nextInt();
   policyNumber = newFile.nextInt();
   //System.out.println("Please enter the Provider Name: ");
   providerName = newFile.nextLine();
   //System.out.println("Please enter the Policyholder's First Name: " );
   policyFirstName = newFile.nextLine();
   //System.out.println("Please enter the Policyholder's Last Name: " );
   policyLastName = newFile.nextLine();
   //System.out.println("Please enter the Policyholder's age: ");
   policyAge = newFile.nextInt();
   //System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
   policySmoker = newFile.nextLine();
   if(policySmoker == "smoker"){
      polSmoker = true;
      }
   else{
      polSmoker =false;
      }
   //System.out.println("Please enter the Policyholder's Height (in inches): ");
   policyHeight = newFile.nextInt();
   //System.out.println("Please enter the Policyholder's Weight (in pounds): ");
   policyWeight = newFile.nextDouble();
   
           
   

   Policies.add(new Policy(policyNumber, providerName, policyFirstName, policyLastName, policyAge, polSmoker, policyHeight, policyWeight));
   for(int i = 0; i < Policies.size(); i++){
   System.out.println("Policy Number: " + Policies.get(i).getPolNumber());
   System.out.println("Provider Name: " + Policies.get(i).getProvName());
   System.out.println("Policyholder's First Name: " + Policies.get(i).getPolFirst());
   System.out.println("Policyholder's Last Name: " + Policies.get(i).getPolLast());
   System.out.println("Policyholder's Age: " + Policies.get(i).getPolAge());
   if(Policies.get(i).getSmokeStat() == true){
       System.out.println("Policyholder's Smoking Status: Smoker ");
       smokeCount++;
   }
   /*System.out.println("Policyholder's Smoking Status: " + Policies.get(i).getSmokeStat()); 
   if(Policies.get(i).getSmokeStat()== true){
       smokeCount++;
   }*/
   else{
       System.out.println("Policyholder's Smoking Status: Non-Smoker ");
       nonSmokeCount++;
   }
   System.out.println("Policyholder's Weight: " + Policies.get(i).getPolWeight());
   System.out.println("Policyholder's Height: " + Policies.get(i).getPolHeight());
   System.out.println("Policyholder's BMI: " + Policies.get(i).calculateBMI());
   System.out.println("Policy Price: $" + Policies.get(i).calculateInsurancePolicy());

System.out.println("");

}
System.out.println("The number of policies with a smoker is: " + smokeCount);
System.out.print("The number of policies with a non-smoker is: " + nonSmokeCount);

}

}
