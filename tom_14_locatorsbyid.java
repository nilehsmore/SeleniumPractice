package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_14_locatorsbyid {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");

// driver.findElement(By.id("email")).sendKeys("nilesh");
driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("ford");

        }
    }

