package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*


1.  findElement
2.  click
3.  sendKeys
4.  getText
5.  getAttribute
6.  clear
7.  isDisplayed
8.  isEnabled

 */


public class tom_16_elementmethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org");

  /*      driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Saturn"); // Send Keys

      System.out.println("Search for saturn ");

        Thread.sleep(3000); // wait 3 second

        System.out.println("wait 3 second");

        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).clear(); // Clear Method

        System.out.println("clear saturn");

        String text = driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).getText(); // Get text method

        System.out.println(text); */

        driver.get("https://www.softwaretestinghelp.com/");
        WebElement textDemo = driver.findElement(By.xpath("//*[text()='Write and Earn']"));

        if(textDemo.isDisplayed())
        {
            System.out.println("Element found using text");
        }

        else
            System.out.println("Element not found");
        driver.quit();
    }
}





