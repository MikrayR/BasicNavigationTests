package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests1 {
     /*
1.Open browser
2.Go to website https://google.com
3.Save the title in a string variable
4.Go to https://etsy.com
5.Save the title in a string variable
6.Navigate back to previous page
7.Verify that title is same is in step 3
8.Navigate forward to previous page
9.Verify that title is same is in step 5
10.Each test should close the browser after completion
GitHub1.Pushthis project toGitHub. Do not push the target folderto GitHub.
Push other filesandfolders.Ignore thetargetfolder.
 */
     public static void main(String[] args) throws InterruptedException {
         testChrome();


     }
     public static void testChrome()throws InterruptedException{


        //1. open chrome browser
         WebDriver driver=BrowserFactory.getDriver("chrome");

         //2. go to the website
         driver.get("https://google.com");

         //3. create title
         String ExpectTitle=driver.getTitle();
         //saving title
         System.out.println("ExpectTitle: "+ ExpectTitle);

         //4.Go to https://etsy.com
         driver.get("https://etsy.com");

         //5.Save the title in a string variable
         String CurrentTitle=driver.getTitle();
         System.out.println("CurrentTitle: "+CurrentTitle);
         Thread.sleep(2000);

         //6.Navigate back to ExpectTitle
         driver.navigate().back();
         String ActualTitle=driver.getTitle();

         //7.Verify that ActualTitle is same as  ExpectTitle
         StringUtility.verifyEquals(ExpectTitle,ActualTitle);

         //8.Navigate forward to previous page
         driver.navigate().forward();

         //9.Verify that title is same is in step 5
         String CurrentTitle2=driver.getTitle();

         //Verify that Currentpage same as Actual
         StringUtility.verifyEquals(CurrentTitle2, CurrentTitle);

         driver.quit();








     }
}

