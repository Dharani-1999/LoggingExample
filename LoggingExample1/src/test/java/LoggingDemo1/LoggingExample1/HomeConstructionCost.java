package LoggingDemo1.LoggingExample1;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class HomeConstructionCost {
	static final Logger logger = LogManager.getLogger(HomeConstructionCost.class);
	@Test
	public void homeConstructionCost() {
		  double areaOfHome;
		  Scanner sc=new Scanner(System.in);
		  logger.info("Construction cost of the house");
		  logger.info("Enter the area of the house(in feets) : \n");
		  areaOfHome=sc.nextDouble();
		  
		  logger.info("Select the cost of standard material required for the construction of the home per square feet : \n");
		  logger.info("1 : 1200INR for standard materials \n");	
		  logger.info("2 : 1500INR for above standard materials \n");
		  logger.info("3 : 1800INR for high standard materials \n");
		  logger.info("4 : 2500INR for high above standard materials and fully automated home \n");
		  logger.warn("Select correct choice");
		  int choice=sc.nextInt();
		  if(choice>=1 && choice<5){
			   double[] home_Construction_Cost= {
			      areaOfHome*1200,
			      areaOfHome*1500,
			      areaOfHome*1800,
			      areaOfHome*2500
			      
			   };
			   //printing the cost of the home based on the choice chosen by the customers
			   logger.info("Home construction cost "+home_Construction_Cost[choice-1]+"rupees");
		  }
		  else {
			  logger.error("Incorrect choice choosen");
		  }
		  
	   }
}
