package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        driver.getTitle();
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        //Enter text
        firstName.sendKeys("Ishita");
        lastName.sendKeys("Garg");

        //Enter the email
        driver.findElement(By.id("email")).sendKeys("test11@example.com");

        //Enter the contact number
        driver.findElement(By.id("number")).sendKeys("123456433890");

        //Click Submit
        driver.findElement(By.cssSelector(".ui.green.button")).click();

        //Close the browser
        driver.close();
    }
}




