package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_10_1 {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());
        WebElement cube= driver.findElement(By.id("wrapD3Cube"));
        actions.click(cube);
        WebElement cubeval= driver.findElement(By.className("active"));
        System.out.println("Left click "+cubeval.getText());
        actions.doubleClick(cube).perform();
        cubeval= driver.findElement(By.className("active"));
        System.out.println("double click "+cubeval.getText());

        actions.contextClick(cube).perform();
        cubeval= driver.findElement(By.className("active"));
        System.out.println("right click "+cubeval.getText());
        driver.close();
    }
}
