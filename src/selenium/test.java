package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cezary\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl/");
        WebElement sf = driver.findElement(By.id("L2AGLb"));
        sf.click();
        WebElement pusty = driver.findElement(By.cssSelector("input.gLFyf"));
        pusty.sendKeys("Smieszne koty");
        pusty.click();
        WebElement dalej = driver.findElement(By.cssSelector("input.gNO89b"));
        dalej.click();
        WebElement grafika = driver.findElement(By.cssSelector("[data-hveid='CAEQAw']"));
        grafika.click();


    }
}
