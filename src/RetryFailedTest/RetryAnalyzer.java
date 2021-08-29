package RetryFailedTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int counter = 0;
    private int max = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (counter<max){
            counter++;
            return true;
        }
        return false;
    }
}
