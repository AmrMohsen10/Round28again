package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestClass2 {

    @Test
      public void noWait() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("adder")).click();
        Assert.assertTrue(driver.findElement(By.id("box0")).isDisplayed());

    }

    @Test
      public void implicitWait() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("adder")).click();
        Assert.assertTrue(driver.findElement(By.id("box0")).isDisplayed());
    }

    @Test
      public void explicitWait() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("adder")).click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(d -> {
            d.findElement(By.id("box0"));
            return true;
        });
        Assert.assertTrue(driver.findElement(By.id("box0")).isDisplayed());
    }
}
