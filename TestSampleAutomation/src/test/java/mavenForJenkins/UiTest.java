package mavenForJenkins;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UiTest {
    @Test
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"),"Title does not match");
        driver.quit();
    }
}
