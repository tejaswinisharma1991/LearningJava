package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {
    public static void main(String[] args) {
        WebDriver driver =new FirefoxDriver();
        driver.get("https://rediffmail.com");
    }
}
