package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {

        List<String> Url= Arrays.asList("https://lulugandgeorgia.com",
                                            "https://wayfair.com",
                                                 "https://walmart.com",
                                                        "https://westelm.com");

        WebDriver driver=BrowserFactory.getDriver("chrome");

        for(String eachUrl: Url){
            driver.get(eachUrl);
            String title=driver.getTitle().replace(" ","").toLowerCase();
            System.out.println(eachUrl+" Url contains the title: "+eachUrl.toLowerCase().contains(title));
        }
        driver.quit();
    }

}
