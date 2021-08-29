package Inheritence;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.*;
import org.testng.ITestResult;

public class BaseB {


    public static WebDriver driver;

    public final void method2(String s){
        System.out.println("Pinaki");
    }

    public void method1(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        Select sel = new Select(driver.findElement(By.xpath("")));

        WebDriverWait wait = new WebDriverWait(driver,10);
       // wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
        String parent = driver.getWindowHandle();
        Set<String> set = driver.getWindowHandles();
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath(""))).clickAndHold();
        Iterator<String> it1 = set.iterator();
        while (it1.hasNext()){
            String child = it1.next();
            if (!child.equals(parent)){
                driver.switchTo().window(child);
                if (driver.getTitle().equals("")) {
                    Alert al = driver.switchTo().alert();
                    driver.quit();
                }
                driver.quit();
            }
        }
        By locator = By.xpath("");
        //WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.elementToBeClickable(locator));
        System.out.println("base class B");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(locator);
        String color = element.getCssValue("style");
        js.executeScript("argument[0].setAttribute('style',background:yellow;border:2px')");
        js.executeScript("argument[0].setAttribute('style',background:color;border:3px)");
    }

    public void method2(){
        String parentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            String childHandle = iterator.next();
            if (!childHandle.equals(parentHandle)){
                driver.switchTo().window(childHandle);
                if (driver.getTitle().equals("Window1")){
                    Alert alert = driver.switchTo().alert();
                    alert.getText();
                    alert.accept();
                    driver.close();
                }
                else {
                    driver.close();
                }
            }
            driver.switchTo().window(parentHandle);
            driver.quit();
        }

    }


    public static void  main(String args[]){
        Set<String> check = new HashSet<>();
        String parent = "four";
        check.add("one");
        check.add("two");
        check.add("three");
        check.add("four");
        for (int i = 0; i < check.size(); i++) {

        }
        Iterator<String> it1 = check.iterator();
        while (it1.hasNext()){
            String one = it1.next();
            if (!one.equals(parent)){
                System.out.println("the left out is "+one);
            }
        }

    }

    public static void method3(ITestResult testResult) throws IOException {
     if (testResult.getStatus()==ITestResult.FAILURE){
     File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(file,new File(""));
 }
    }

}
