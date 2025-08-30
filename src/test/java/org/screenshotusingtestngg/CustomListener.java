package org.screenshotusingtestngg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On Test Start ");
        testStart(result.getMethod().getMethodName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("PassTestCase");
        passed(result.getMethod().getMethodName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("FailTestCase");
        failed(result.getMethod().getMethodName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

        this.onTestFailure(result);
    }
    @Override
    public void onStart(ITestContext context) {
        System.out.println("starting>>>");

    }
    @Override
    public void onFinish(ITestContext context) {
    }


}
