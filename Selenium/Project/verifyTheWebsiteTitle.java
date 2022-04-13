package Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class verifyTheWebsiteTitle {
//    @Test
    WebDriver driver;
    String Title;

    @BeforeMethod
    public void OpenBrowser() {
        driver = new FirefoxDriver();
    }
    @Test
    public void VerifyTitle() {

        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();
        Title= driver.getTitle();
        Assert.assertEquals(Title,"OrangeHRM" );


    }

    @AfterMethod
    public void CloseBrowser(){
        driver.close();
    }



//
//    public void VerifyTitle(){
//
//       if (Assert.assertEquals(Title,))
//
//
//}


}
