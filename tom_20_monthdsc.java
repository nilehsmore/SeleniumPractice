package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class tom_20_monthdsc {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/signup");
        Thread.sleep(5000L);

        driver.manage().window().maximize();

        WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select s = new Select(month);
        List<WebElement> r = s.getOptions();
        TreeSet tre = new TreeSet<>();

        for (int a = 0; a < r.size(); a++) {
            tre.add(r.get(a).getText());
        }
        Iterator<String> itr = tre.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

    }
}