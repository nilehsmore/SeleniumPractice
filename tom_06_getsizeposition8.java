/* Decompiler 2ms, total 335ms, lines 18
package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_06_getsizeposition {
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.wikihow.com/Main-Page");
      Thread.sleep(3000L);
      System.out.println("size of the window =" + driver.manage().window().getSize());
      System.out.println("Positiion of window =" + driver.manage().window().getPosition());
      Thread.sleep(3000L);
      driver.close();
   }

        }


 */