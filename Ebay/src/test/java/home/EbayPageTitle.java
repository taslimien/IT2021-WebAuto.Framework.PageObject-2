package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayPageTitle extends CommonAPI {

    @Test
    public void checkTitle(){
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
