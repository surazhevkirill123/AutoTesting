import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HelloWebDriver {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.opera.driver", "C:\\Selenium\\Drivers\\operadriver_win64\\operadriver.exe");
        WebDriver driver=new OperaDriver();
        driver.get("https://www.manomano.co.uk");
        WebElement searchInput=driver.findElement((By.id("searchbar")));
        searchInput.sendKeys("sideboard");
        WebElement searchBtn = driver.findElement((By.id("searchbar")));
        searchBtn.click();
        Thread.sleep(10000);
        driver.quit();
//        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("http://seleniumhq.org");
//        WebElement searchInput=driver.findElement((By.id("gsc-i-id1")));
//        searchInput.sendKeys("selenium java");
//        WebElement searchBtn = driver.findElement((By.xpath("//*[@id=\"gsc-i-id1\"]")));
//        searchBtn.click();
//        Thread.sleep(10000);
//        driver.quit();
    }
}
