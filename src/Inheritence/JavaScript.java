package Inheritence;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static main.Base.driver;
public class JavaScript {



    public static void drawBorder(){
        WebElement element = driver.findElement(By.xpath(""));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("argument[0].style.border=5x",element);

    }

    public static void highlightElement(){
        WebElement element = driver.findElement(By.xpath(""));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //String color = element.getCssValue("backgroundColor");
        js.executeScript("argument[0].style.backgroundValue= yellow", element);
    }

    public static void inputDate(){
        WebElement element = driver.findElement(By.xpath(""));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String value = "30-Sept-2013";
        js.executeScript("argument[0].setAttribute('value','"+value+"')",element);
    }

}
