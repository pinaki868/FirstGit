package Inheritence;

import org.testng.annotations.Test;

public class Assert {
    @Test
    public static void method1(String s,Boolean pk){
        org.testng.Assert.assertEquals(pk,"");
        org.testng.Assert.assertTrue(pk,"this is good");

    }
}
