/* Decompiler 1ms, total 543ms, lines 20 */
package SeleniumBasic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_07_setsize {
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.wikihow.com/Main-Page");
      Thread.sleep(3000L);
      System.out.println("size of the window =" + driver.manage().window().getSize());
      Dimension d = new Dimension(1200, 1000);
      driver.manage().window().setSize(d);
      System.out.println("New of the window =" + driver.manage().window().getSize());
      driver.close();
   }
}
