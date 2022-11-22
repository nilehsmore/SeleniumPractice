/* Decompiler 0ms, total 359ms, lines 5 */
package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_10_google_search {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*           Method 1                */

        driver.get("https://www.google.com"); // go to google

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Nashik");
        element.submit();

        /*           Method 2             */

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//Input[@name='q']")).sendKeys("Panchvati");
        driver.findElement(By.xpath("(//Input[@value='Google Search'])[2]")).click();

        driver.close();

        // If two elements have same Xpath we use indexing (//input[@value='google search'])[2]


    }
}