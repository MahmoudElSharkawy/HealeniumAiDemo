package healenium;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HealeniumDemo {

    @Test
    public void seleniumTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://elenastepuro.github.io/test_env/index.html");

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> driver.findElement(By.id("change_wait")).isDisplayed());
        driver.findElement(By.id("Submit")).click();


//        WebElement e = driver.findElement(By.id("change_wait"));
        driver.findElement(By.id("change_wait")).sendKeys("Test Healenium :D");
        Assert.assertTrue(driver.findElement(By.id("change_wait")).isDisplayed()); // new id is #newWaitId

        driver.quit();
    }

    @Test
    public void healeniumTest1() {
        WebDriver delegate = new ChromeDriver();
        //create Self-healing driver
        SelfHealingDriver driver = SelfHealingDriver.create(delegate);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://elenastepuro.github.io/test_env/index.html");

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(102));
        wait.until(d -> driver.findElement(By.id("change_wait")).isDisplayed());
        driver.findElement(By.id("Submit")).click();


        driver.findElement(By.id("change_wait")).sendKeys("Test Healenium :D");
        Assert.assertTrue(driver.findElement(By.id("change_wait")).isDisplayed()); // new id is #newWaitId

        driver.quit();
    }

    @Test
    public void healeniumTest2() {
        WebDriver delegate = new ChromeDriver();
        //create Self-healing driver
        SelfHealingDriver driver = SelfHealingDriver.create(delegate);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://elenastepuro.github.io/test_env/index.html");

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(102));
        wait.until(d -> driver.findElement(By.id("change_wait")).isDisplayed());
        driver.findElement(By.id("Submit")).click();


        WebElement e = driver.findElement(By.id("change_wait"));
        e.sendKeys("Test Healenium :D");
        Assert.assertTrue(e.isDisplayed()); // new id is #newWaitId

        driver.quit();
    }
}
