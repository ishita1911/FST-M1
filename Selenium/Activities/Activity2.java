package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws Exception{
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println("ID value "+driver.findElement(By.id("about-link")).getText());
        System.out.println("ClassName value "+driver.findElement(By.className("inverted")).getText());
        System.out.println("LinkText"+driver.findElement(By.linkText("About Us")).getText());
        System.out.println("CSS Selector"+driver.findElement(By.cssSelector("#about-link")).getText());

//        driver.close();
    }

}
