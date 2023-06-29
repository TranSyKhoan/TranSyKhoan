package TestSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class web {
    public static void main(String [] args){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://webappstage.mytv.vn/");
        driver.findElement(By.xpath("//a[@class='menu-header-item d-inline-flex justify-content-between align-items-center w-100 h-100 title-active-white']//img[@alt='Image']")).click();






    }
    }
