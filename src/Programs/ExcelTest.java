package Programs;// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ExcelTest {

    public void main() throws IOException {

        String fileName = "config/TestSheet.xlsx";
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        System.out.println("file is "+file.exists());

        //FileInputStream fis = new FileInputStream(new File("C:\\Users\\91750\\Desktop\\TestSheet.xlsx"));
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        Map<String, String> map = new HashMap();
        DataFormatter formatter = new DataFormatter();

        for(int i = 0; i <= sheet.getLastRowNum(); ++i) {
            String col1 = formatter.formatCellValue(sheet.getRow(i).getCell(0));
            String col2 = formatter.formatCellValue(sheet.getRow(i).getCell(1));
            map.put(col1, col2);
        }

        for (Map.Entry entry: map.entrySet()
             ) {
            if (entry.getKey().equals("32")){
                System.out.println("required value is "+entry.getValue());
                break;
            }
        }

    }

    public static void main(String args[]) throws IOException {
        ExcelTest exl = new ExcelTest();
        exl.main();

    }
}
