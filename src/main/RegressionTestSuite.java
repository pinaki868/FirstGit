package main;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static main.Base.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RegressionTestSuite extends Demo {

  @Test
  public static void testCase1() throws IOException {
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    Set set = driver.getWindowHandles();
    driver.switchTo().defaultContent();
    driver.switchTo().parentFrame();
    Iterator it1 = set.iterator();
    while (it1.hasNext()){

    }


    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //FileUtils.copyFile(scr,);
    CommonFunctions.loginToApp("https://www.google.co.in/");
    String search = "hi this is good";
    System.out.println("Search value is "+search);
    By stringName = By.xpath("//input[@title='Search");
    By stringName2 = By.xpath("//input[@title='Search");
    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(search);
    driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
    WebDriverWait wait = new WebDriverWait(driver,5);
    select("index",stringName2,"Pinaki");

  }
 public static WebElement getWeb(By locator){
    return driver.findElement(locator);
 }

  public static void select(String type, By locator, String value){
    Select select = new Select(getWeb(locator));
    switch (type){
      case "index":
    select.selectByIndex(Integer.parseInt(value));

      case "value":
      select.selectByValue(value);

      case "visibleText":
        select.selectByVisibleText(value);

      case "default":
        System.out.println("value not present");
    }
  }
@Test(priority = 1,dependsOnGroups = {"jno"},groups = "jno",
        invocationCount = 3,invocationTimeOut = 3000,
        expectedExceptions = NumberFormatException.class)
  public static void method3(){ }

  @Test(dependsOnMethods = {"method3"})
  @Parameters({"browser","QA"})
public static void propertiesLoad(String name1,String name2) throws IOException {
    FileInputStream fis = new FileInputStream("");
    Properties prop = new Properties();
    prop.load(fis);
    prop.getProperty("");
    driver.findElement(By.xpath("")).sendKeys(name1);
      driver.findElement(By.xpath("")).sendKeys(name2);
  }

  @DataProvider(name = "DP")
  public Object[][] dataProv(Method method){
      switch (method.getName()) {
          case "m1":
              return new Object[][]{{2}};
          case "m2":
              return new Object[][]{{"2"}};
      }
      return null;
    }

    @Test(dataProvider = "DP")
    public static void m1(String login){
      driver.findElement(By.xpath("loginXpath")).sendKeys(login);

    }

    @Test(dataProvider = "DP")
    public static void m2(){}
}
