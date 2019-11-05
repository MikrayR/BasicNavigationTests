package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {

        List<String> Url= Arrays.asList("https://lulugandgeorgia.com",
                                            "https://wayfair.com",
                                                "https://walmart.com",
                                                    "https://westelm.com");
        for(String eachUrl: Url){
            WebDriver driver=BrowserFactory.getDriver("chrome");
            driver.get(eachUrl);
            String title=driver.getTitle().replace(" ","").toLowerCase();
            System.out.println(eachUrl+ " Url contains the title: "+ eachUrl.toLowerCase().contains(title));

            driver.quit();
        }


    }
}
