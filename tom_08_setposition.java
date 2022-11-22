package SeleniumBasic;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_08_setposition {
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.wikihow.com/Main-Page");
      Thread.sleep(3000L);
      System.out.println("size of the window =" + driver.manage().window().getPosition());
      Point p = new Point(66, 88);
      driver.manage().window().setPosition(p);
      System.out.println("New size of the window =" + driver.manage().window().getPosition());
      driver.close();
   }
}
