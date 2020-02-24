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
		   logger.info("Enter principle amount");
		   principleAmount=sc.nextInt();
		   
		   logger.info("Enter rate of interest");
		   rateOfInterest=sc.nextInt();
		   
		   logger.info("Enter time");
		   time=sc.nextInt();
		   logger.debug("Simple and compound interest debugger");
		   try {
		      simpleInterest=((principleAmount)*(rateOfInterest)*(time))/100;
		      //printing compound interest
		      logger.info("Simple interest :"+simpleInterest);
		   
		      rateOfInterest=1+(rateOfInterest/100);
		      for(int i=1;i<=time;i++){
			   rate*=rateOfInterest;
		      }
		      amount=principleAmount*rate;
		      compoundInterest=amount-principleAmount;
		   
		      //printing compound interest
		      logger.info("Compound interest:"+compoundInterest);
		   }
		   catch(ArithmeticException e){
			   logger.error("Error occurred while calculating the interest",e);
			   e.printStackTrace();
			   logger.info("Interest calculation failed");
		   }
		   logger.info("Interest calculated succesfully");
		   
	}
}
