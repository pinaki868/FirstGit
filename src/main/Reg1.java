package main;

import RetryFailedTest.RetryAnalyzer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reg1 extends Reg3 {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public static void main1(){
        System.out.println("test method1");
    }

    @Test
    public static void main2(){
        System.out.println("test method2");
    }

    @BeforeClass
    public static void main3(){
        System.out.println("before class Reg3");
    }

    @BeforeTest
    public static void main4(){
        System.out.println("before test Reg3");
    }

}
