package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class Activity_10_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());
        Actions actions= new Actions(driver);
        WebElement pressedkey= driver.findElement(By.id("keyPressed"));
        Action actionperformed= actions.sendKeys("I").build();
        actionperformed.perform();
        System.out.println("Pressed Key "+pressedkey.getText());

       Action sequesnce2= actions.keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build();
       sequesnce2.perform();
       System.out.println("Pressed Key "+pressedkey.getText());
       driver.close();

    }
}
