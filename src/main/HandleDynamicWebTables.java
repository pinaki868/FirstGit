package main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import  static main.Base.driver;
public class HandleDynamicWebTables extends Demo{
    @Test
    public static void testCase(){
        CommonFunctions.loginToApp("https://www.nyse.com/ipo-center/recent-ipo");
        driver.manage().window().maximize();
        System.out.println("title is "+driver.getTitle());
        System.out.println("desired text is "+driver.findElement(By.xpath("(//table[@class='table table-data table-condensed spacer-lg'])[1]/thead/tr/th[2]")).getText());
        List<WebElement> noOfRows = driver.findElements(By.xpath("(//table[@class='table table-data table-condensed spacer-lg'])[1]/tbody/tr[1]/td[1]"));
        System.out.println("No. of Rows "+noOfRows.size());

        for (int i = 1; i <= noOfRows.size(); i++) {
            WebElement columnTitle = driver.findElement(By.xpath("(//table[@class='table table-data table-condensed spacer-lg'])[1]/tbody/tr["+i+"]/td[2]"));
            if (columnTitle.equals("Zhangmen Education Inc.")){
                String date = driver.findElement(By.xpath("(//table[@class='table table-data table-condensed spacer-lg'])[1]/tbody/tr["+i+"]/td[1]")).getText();
                System.out.println("date is "+date);
                break;
            }
        }

    }

}
