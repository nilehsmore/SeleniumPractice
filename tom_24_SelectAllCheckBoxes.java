package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tom_24_SelectAllCheckBoxes {


    /*   Steps to follow:

 Step 1: First we stored the all checkboxes into List interface.
 Checkbox is a web-element that is why we stored into web-element type into List.
 Step 2: Find out the size of checkboxes (number of counts) using size() method
 Step 3: Using For loop and get() method we iterate all checkboxes.
 Step 4: Using click() method we select the checkbox. */



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\E:\\Chromedriver\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();


        driver.get("C:\\Users\\hp\\IdeaProjects\\HTML_Basics\\dom_09_checkboxex.html");


        List<WebElement> Checkboxes = driver.findElements(By.xpath("/html/body/input"));
        System.out.println(Checkboxes.size());
        for (WebElement element : Checkboxes) {

            element.click();
        }

    }

}