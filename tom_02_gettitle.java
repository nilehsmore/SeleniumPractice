/* Decompiler 2ms, total 333ms, lines 15 */
package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_02_gettitle {
   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "\\E:\\Chromedriver\\chromedriver.exe\\");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.linkedin.com");

      String title = driver.getTitle();
      System.out.println("this is title of the website=" + title);
   }
}
