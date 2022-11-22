package Selenium_Basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_23_Authentication {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();

     driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        // driver.get("http://the-internet.herokuapp.com/basic_auth");


//
//        Thread.sleep(2000);
//         Alert alert = driver.switchTo().alert();

//        System.out.println(alert.getText());

        driver.close();


    }
}

class djsir {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.id("promtButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;  //scrolling purpose
        js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		Thread.sleep(5000);
    String text="komal";
    Alert alt= driver.switchTo().alert();
		alt.sendKeys(text);
		alt.accept();

    String TextfromUI =driver.findElement(By.className("text-success")).getText();
		System.out.println(TextfromUI);
		if(TextfromUI.equals("You entred"+text)) {
        System.out.println(" pass");
    }
		else {
        System.out.println("test case fail");
    }
}
}
