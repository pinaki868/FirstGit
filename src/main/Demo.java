package main;

import org.testng.annotations.*;

public class Demo {

    @BeforeMethod
    public void initializeBrowser(){
        Base.initializeBrowser();
    }

    @AfterMethod
    public void bf2(){
        Base.driver.quit();
    }



}
