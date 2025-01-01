package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;

public class TestClass {

    @Test
       public void test() {
          WebDriver driver = new ChromeDriver();
            driver.get("https://www.duckduckgo.com");
            assert Objects.equals(driver.getTitle(), "Google");
            driver.quit();

    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.duckduckgo.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img)[1]")));
        assert logo.isDisplayed();
        driver.quit();
    }


    @Test
      public void test3()  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.duckduckgo.com");


    }
}


