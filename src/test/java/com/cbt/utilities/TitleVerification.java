package com.cbt.utilities;

import org.openqa.selenium.WebDriver;


import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException{

        List<String> Url= Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        // open chrome
        WebDriver driver=BrowserFactory.getDriver("chrome");

        //navigate UrlLink using ArrayList index Number 0 position
        driver.get(Url.get(0));

        //save Url by getCurrentUrl() method
        String Url1=driver.getCurrentUrl();

        //save Url title in order to compare with the actual one
        String UrlTitle=driver.getTitle();


        //navigate UrlLink2 using ArrayList index Number 1 position
        driver.get(Url.get(1));

        //save Url2 by getCurrentUrl() method
        String Url2=driver.getCurrentUrl();

        //save UrlLink title2 in order to compare with the actual one
        String UrlTitle2=driver.getTitle();


        //navigate UrlLink3 using ArrayList index Number 1 position
        driver.get(Url.get(2));

        //save Url3 by getCurrentUrl() method
        String Url3=driver.getCurrentUrl();

        //save UrlLink title3 in order to compare with the actual one
        String UrlTitle3=driver.getTitle();

        //comparison between all three titles
        if (UrlTitle.equals(UrlTitle2) && UrlTitle2.equals(UrlTitle3)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

//         check if Url starts with "http://practice.cybertekschool.com"
//        for(String eachUrl: Url){
//            System.out.println(eachUrl.equals("http://practice.cybertekschool.com"));
//            if(eachUrl.startsWith("http://practice.cybertekschool.com")){
//              System.out.println("Pass");

//            }else{
//              System.out.println("Fail");
//              }

        //check if Url starts with "http://practice.cybertekschool.com."
        //Url1
        if(Url1.startsWith("http://practice.cybertekschool.com")){
            System.out.println("Url1 Pass");
        }else{
            System.out.println("Url1 Fail");
            System.out.println("Url1= "+ Url1);
        }
        //Url2
        if(Url2.startsWith("http://practice.cybertekschool.com")){
            System.out.println("Url2 Pass");
        }else{
            System.out.println("Url2 Fail");
            System.out.println("Url2= "+ Url2);
        }

        //Url3
        if(Url3.startsWith("http://practice.cybertekschool.com")){
            System.out.println("Url3 Pass");
        }else{
            System.out.println("Url3 Fail");
            System.out.println("Url3= "+ Url3);
        }

        driver.quit();
    }
}
