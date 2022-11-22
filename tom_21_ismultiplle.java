package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tom_21_ismultiplle {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");

        //Store the WWebelement in reference variable

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

        //Create object of the SELECT class and pass variable as a parameter

        Select m1 = new Select(month);


        if (m1.isMultiple()) {
            System.out.println("Allows multiple seelctions");
        } else {
            System.out.println("Dose not allows multiple selections");

        }
    }
}