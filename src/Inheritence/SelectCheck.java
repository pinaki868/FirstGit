package Inheritence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCheck {
    public static WebDriver driver = new ChromeDriver();
    public static void main(String args[]){

        WebElement select = driver.findElement(By.xpath(""));
        method2("index",select,"3");
    }

    public static void method2(String method,WebElement element,String value ){
        Select select = new Select(element);
        switch (method){
            case "vt" :
                select.selectByVisibleText(value);
            case "value":
                select.selectByValue(value);
            case "index":
                select.selectByIndex(Integer.parseInt(value));
            case "default":
                System.out.println("no method");
        }

    }

}
