package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class WalgreensSearch extends CommonAPI {

    @Test
    public void search() throws InterruptedException {
        driver.findElement(By.id("ntt-placeholder")).sendKeys("Toothpaste", Keys.ENTER);
        Thread.sleep(2000);

    }
}
