package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_09_currenturl {
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https:/www.jetbrains.com");
      String GetURL = driver.getCurrentUrl();
      System.out.println("current url is:" + GetURL);
      driver.close();
   }
}
