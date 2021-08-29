package Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("");
        Properties prop = new Properties();
        prop.load(fis);
        prop.getProperty("");

    }
}
