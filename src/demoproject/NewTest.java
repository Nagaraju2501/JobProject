package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/Informatics/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("google.com");

        driver.close();
    }
}
