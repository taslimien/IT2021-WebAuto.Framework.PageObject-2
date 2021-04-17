package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class AlibabaHomePage extends CommonAPI {

    @Test
    public void homePage(){
        System.out.println(driver.getTitle());
    }
}
