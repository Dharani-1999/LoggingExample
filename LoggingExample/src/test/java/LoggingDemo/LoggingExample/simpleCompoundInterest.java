package LoggingDemo.LoggingExample;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class simpleCompoundInterest {
	static final Logger logger = LogManager.getLogger(simpleCompoundInterest.class);
	@Test
	public void simpleCompound(){
		double principleAmount,rateOfInterest,time;
		   double amount=0,rate=1;
		   double simpleInterest;
		   double compoundInterest;
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.format("%s","Enter principle amount\n");
		   principleAmount=sc.nextInt();
		   
		   System.out.format("%s","Enter rate of interest\n");
		   rateOfInterest=sc.nextInt();
		   
		   System.out.format("%s","Enter time\n");
		   time=sc.nextInt();
		   logger.debug("Simple and compound interest debugger");
		   try {
		      simpleInterest=((principleAmount)*(rateOfInterest)*(time))/100;
		      //printing compound interest
		      System.out.format(" Simple interest : %.3f\n",simpleInterest);
		   
		      rateOfInterest=1+(rateOfInterest/100);
		      for(int i=1;i<=time;i++){
			   rate*=rateOfInterest;
		      }
		      amount=principleAmount*rate;
		      compoundInterest=amount-principleAmount;
		   
		      //printing compound interest
		      System.out.format(" Compound interest : %.3f\n",compoundInterest);
		   }
		   catch(ArithmeticException e){
			   logger.error("Error occurred while calculating the interest",e);
			   e.printStackTrace();
		   }
		   logger.info("Interest calculated succesfully");
		   
	}
}
