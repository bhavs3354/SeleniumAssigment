package seleniumassign;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retrying_setup implements IRetryAnalyzer{
	
	
		private int retryCount = 0;
		
		
		private static final int maxRetryCount = 3;
	 
		@Override
		public boolean retry(ITestResult result) {
			 
			if(retryCount < maxRetryCount)
			{
				retryCount++;
				System.out.println("Retrying Test method : "+result.getName() + " for " + retryCount +" times. ");
				return true;
			}
			return false;
		}

}
