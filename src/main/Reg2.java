package main;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reg2 extends Reg4{

    @Test
    public static void main2(){
        System.out.println("Reg2 test method 1");
    }

    @Test
    public static void main3(){
        System.out.println("Reg2 test method 2");
    }

    @BeforeClass
    public static void main4(){
        System.out.println("before class Reg4");
    }

    @BeforeTest
    public static void main5(){
        System.out.println("before test Reg4");
    }

}
