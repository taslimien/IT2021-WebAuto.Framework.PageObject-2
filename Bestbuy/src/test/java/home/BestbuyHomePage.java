package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class BestbuyHomePage extends CommonAPI {

    @Test
    public void homePage(){
        System.out.println(driver.getTitle());
    }

}
