import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class ICanWin {
    @Test
    public void ICanWin() throws InterruptedException {
        System.setProperty("webdriver.opera.driver", "C:\\Selenium\\Drivers\\operadriver_win64\\operadriver.exe");
        WebDriver driver=new OperaDriver();
        driver.get("https://pastebin.com");
        WebElement pasteInput=driver.findElement((By.xpath("//*[@id=\"postform-text\"]")));
        pasteInput.sendKeys("Hello from WebDriver");
        WebElement pasteExpiration=driver.findElement((By.id("postform-expiration")));
        Select postformExpiration=new Select(pasteExpiration);
        postformExpiration.selectByValue("10M");
        driver.quit();
    }
}
