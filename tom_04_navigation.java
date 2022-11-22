/* Decompiler 2ms, total 330ms, lines 25 */
package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class tom_04_navigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.discovery.com/");

        Thread.sleep(5000L);

        driver.navigate().to("https://www.gmail.com/");      // will navigate to this link
        Thread.sleep(5000L);

        driver.navigate().back();

        Thread.sleep(5000L);

        driver.navigate().forward();

        Thread.sleep(5000L);

        driver.navigate().refresh();

        Thread.sleep(5000L);

        driver.navigate().to("https://kurzgesagt.org");
        Thread.sleep(5000L);
        driver.quit();
    }
}
