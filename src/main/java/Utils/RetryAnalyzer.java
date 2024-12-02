package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import java.sql.SQLOutput;

public class RetryAnalyzer implements IRetryAnalyzer {

    int count = 0;
    int retryCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        while (count<retryCount){
            count++;
            return true;
        }
        return false;
    }
}
