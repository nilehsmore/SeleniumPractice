package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tom_25_SelectReverseCheckBoxes {
    public static void main(String[] args) {
        System.out.println("this is method 2 to reverse select check boxes");
        m1();


    }
        public static void m1 () {

            System.setProperty("webdriver.chrome.driver", "\\E:\\Chromedriver\\chromedriver.exe\\");
            WebDriver driver = new ChromeDriver();
            driver.get("C:\\Users\\hp\\IdeaProjects\\HTML_Basics\\dom_09_checkboxex.html");


            List<WebElement> check = driver.findElements(By.xpath("/html/body/input"));
            System.out.println(check.size());
            for (int i = check.size() - 1; i >= 0; i--) {
                check.get(i).click();
            }


        }

    }
    class reve {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "\\E:\\Chromedriver\\chromedriver.exe\\");
            WebDriver driver = new ChromeDriver();
            driver.get("C:\\Users\\hp\\IdeaProjects\\HTML_Basics\\dom_09_checkboxex.html");
            List<WebElement> check = driver.findElements(By.xpath("//input"));
            System.out.println("this is method 1");
            System.out.println(check.size());

// for ascending order //
            for (WebElement element : check) {
                element.click();
            }

            //   for decending order //

            for (int i = check.size() - 1; i >= 0; i--) {
                check.get(i).click();

    }}}