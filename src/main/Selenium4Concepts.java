package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Selenium4Concepts {
    static WebDriver driver;


    public static void getLocation(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        WebElement element = driver.findElement(By.linkText(""));
        //selenium 3
      int x =   element.getLocation().getX();
      int y = element.getLocation().getY();
        //selenium 4

        Rectangle rectangle = element.getRect();
        //get Height
        rectangle.getHeight();
        rectangle.getWidth();
        //get location
        rectangle.getX();
    }

    public static void takeScreenshot(WebElement element,File filename) throws IOException {
        File scr = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr,new File("./target/Screenshots/"+filename+".png"));
    }

    public static void takeScreenshot(WebDriver driver,File filename) throws IOException {
        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr,new File("./target/Screenshots/"+filename+".png"));
    }

}
