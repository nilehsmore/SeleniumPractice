/* Decompiler 1ms, total 325ms, lines 17 */
package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_05_maximize {
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");

      WebDriver driver = new ChromeDriver();
      driver.get("https://kurzgesagt.org");

      Thread.sleep(5000L);
      driver.manage().window().maximize();

      Thread.sleep(5000L);
      driver.close();

   }
}
