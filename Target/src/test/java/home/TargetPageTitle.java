package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TargetPageTitle extends CommonAPI {

    @Test
    public void checkTitle(){
        String exceptedTitle = "Target : Expect More. Pay Less.";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(exceptedTitle, actualTitle);
    }
}
