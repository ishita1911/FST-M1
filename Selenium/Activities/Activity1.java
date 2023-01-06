package Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) throws Exception{
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.com/search?q=hello+Google&gs_ivs=1");

        driver.close();
    }
}
