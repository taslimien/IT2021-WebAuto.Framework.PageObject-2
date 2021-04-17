package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TargetSearch extends CommonAPI {

    @Test
    public void search() throws InterruptedException {
        driver.findElement(By.id("search")).sendKeys("laptop", Keys.ENTER);
        Thread.sleep(2000);

    }
}
