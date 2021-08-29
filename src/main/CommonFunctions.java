package main;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;

import static main.Base.driver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CommonFunctions {

        public static void loginToApp(String url){
            //driver.manage().window().maximize();
            driver.get(url);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            alert.getText();
            alert.dismiss();
            driver.switchTo().frame("");
        }

        public static String callExcel(String col1) throws IOException {
            String fileName = "C:\\Users\\91750\\IdeaProjects\\Excel\\src\\resources\\TestSheet.xlsx";
           // ClassLoader loader = Thread.currentThread().getContextClassLoader();
           // System.out.println("status of the file is "+(new File(fileName).exists()));
            //FileInputStream fis = new FileInputStream(new File(loader.getResource(fileName).getFile()));
            FileInputStream fis = new FileInputStream(new File(fileName));
            XSSFWorkbook xssf = new XSSFWorkbook(fis);
            XSSFSheet sheet = xssf.getSheetAt(0);
            String str= "";

            DataFormatter formatter = new DataFormatter();
            Map<String,String> excelMap = new HashMap<>();
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                String column1 = formatter.formatCellValue(sheet.getRow(i).getCell(0));
                String column2 = formatter.formatCellValue(sheet.getRow(i).getCell(1));
                excelMap.put(column1,column2);
            }
            for (Map.Entry<String,String> e: excelMap.entrySet()
                 ) {
                if (e.getKey().equals(col1)){
                    str = e.getValue();
                }
            }


            return str;
        }



    }


