package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_11_findelement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

         driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("ghgkj");
         driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("password"); //input id

        driver.findElement(By.xpath("//button[@type = 'submit']")).sendKeys("Enter"); //input id

        driver.get("https://www.facebook.com/login"); // go to facebook

        driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("ford");
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("ford321");

        driver.findElement(By.xpath("//button[@type= 'submit']")).click();

        //input[@id='email'] // ID
        //input[@id='pass'] // Password
        //button[@id='u_0_5_J5'] // Button click

        // X PATH BY CONTAINS //

            //tagname[contains (@attribute Name, 'Atttribute value' ) ]

    }
    }