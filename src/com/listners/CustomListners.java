package com.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListners implements ITestListener {
    //This belongs to ITestListner and will execute before starting of test set/batch
    public void onStart(ITestContext arg){
        System.out.println("Starts test execution..."+arg.getName());
    }

    //This belongs to ITestListner and will execute before starting of test set/batch
    public void onFinish(ITestContext arg){
        System.out.println("Finish test execution..."+arg.getName());
    }

    //This belongs to ITestListner and will execute before starting of test set/batch
    public void onStart(ITestResult arg){
        System.out.println("Start test execution..."+arg.getName());
    }

    //This belongs to ITestListner and will execute before starting of test set/batch
    public void onSkipped(ITestResult arg){
        System.out.println("Skipped test execution..."+arg.getName());
    }
}
