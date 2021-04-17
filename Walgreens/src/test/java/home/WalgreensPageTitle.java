package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WalgreensPageTitle extends CommonAPI {

    @Test
    public void checkTitle(){
        String exceptedTitle = "Walgreens: Pharmacy, Health & Wellness, Photo & More for You";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(exceptedTitle, actualTitle);

    }
}
