package SeleniumBasic;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class tom_15_screenshot {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://kurzgesagt.org");
        driver.manage().window().maximize();
        sleep(5000);


        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        File dest= new File("E://Selenium Storage//screenshot.jpg");
        FileHandler.copy(source, dest );
        System.out.println("Screenshot taken");

        sleep(5000);

    }
}

class tom_15_screenshot02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://kurzgesagt.org");
        driver.manage().window().maximize();
        sleep(5000);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

// copy somewhere
      //  FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));    }


        }}