/* Decompiler 2ms, total 364ms, lines 28 */
package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_03_checkingtitle {
   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "\\E:\\Chromedriver\\chromedriver.exe\\");

      WebDriver driver = new ChromeDriver();
      driver.get("https://www.linkedin.com");
      String title = driver.getTitle();
      System.out.println("Website Title is :" + title);
      String Expected = "LinkedIn: Log In or Sign Up";

      if (title.equals(Expected)) {
         System.out.println("This test is performed by first method :Test Passed!");
      } else {
         System.out.println("Test Failed");
      }

      if (title.equals("LinkedIn: Log In or Sign Up*")) {
         System.out.println("True");
      } else {
         System.out.println("This is checked by 2nd Method:False");
      }

      if (title.equalsIgnoreCase("LinkedIn: Log In or Sign Up")){
         System.out.println("This checcked by 3rd method : True" );
      }
      else
         System.out.println("False");
   }
}
