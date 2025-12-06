import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
 
public class loginTest {
 
    @Test

    public void login() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.testfire.net/login.jsp");
 
        WebElement user = driver.findElement(By.id("uid"));

        WebElement pass = driver.findElement(By.id("passw"));

        WebElement loginBtn = driver.findElement(By.name("btnSubmit"));
 
        user.sendKeys("admin");

        pass.sendKeys("admin");

        loginBtn.click();
 
        Thread.sleep(2000);
 
        if(driver.getTitle().contains("Home")) {

            System.out.println("Login Passed!");

        } else {

            System.out.println("Login Failed!");

        }
 
        driver.quit();

    }

}

 
