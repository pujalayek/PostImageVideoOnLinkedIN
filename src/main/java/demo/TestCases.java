package demo;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

import com.google.common.io.Files;

public class TestCases {
   static ChromeDriver driver;

    public static ChromeDriver TestCasesInitializer() {
        System.out.println("Driver initialization");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
//SESSION 4 ASSIGMENTS
    public void testCase03(){
        
        System.out.println("Start Test case: testCase03");
          LinkedinPost Post = new LinkedinPost();
          Post.Post_linkin();
        
        //   public void search_Page_bookMyShow() {
        //     this.driver = TestCases.TestCasesInitializer();
            
        //     public void testCase03() throws InterruptedException {
        //     System.out.println("Start testCase: testCase03");
        //     // Navigate to URL https://www.linkedin.com/
        //     driver.get("https://www.linkedin.com/");
            
        //     // Type "Email or phone: in Username textbox Using Locator "Name" session_key
        //     driver.findElementByName("session_key").sendKeys("pujalayek93@gmail.com");
            
        //     // Type "Password" in password textbox Using Locator "Name" session_password
        //     driver.findElementByName("session_password").sendKeys("D0ryL@yek93");
            
        //     // Click on "Sign in" button Using Locator "XPath" //button[@type='submit']
        //     driver.findElementByXPath("//button[@type='submit']").click();
            
        //     // Print the count of "Who's viewed your profile" Using Locator "XPath"
        //     // //*[contains(text(),'viewed your
        //     // profile')]/../../following-sibling::div//strong
        //     String viewedProfile = driver
        //             .findElement(
        //                     By.xpath("//*[contains(text(),'viewed your profile')]/../../following-sibling::div//strong"))
        //             .getText();
        //     System.out.println("Who's viewed your profile: " + viewedProfile);
           
        //    // Print the count of "Impressions of your post" Using Locator "XPath"
        //     // //*[text()='Impressions of your post']/../../following-sibling::div//strong
    
        //     String impressionPost = driver
        //             .findElement(By.xpath("//*[text()='Impressions of your post']/../../following-sibling::div//strong"))
        //             .getText();
        //     System.out.println("Impressions of your post: " + impressionPost);
    
        //     // Click on "Start a post" button Using Locator "XPath" //button[contains(@class,'share-box-feed-entry__trigger')]
        //     driver.findElementByXPath("//button[contains(@class,'share-box-feed-entry__trigger')]").click();
    
        //     // Type message in textbox Using Locator "XPath" //div[@data-placeholder='What do you want to talk about?']
        //     driver.findElementByXPath("//div[@data-placeholder='What do you want to talk about?']").sendKeys("SDLC");
        //     Thread.sleep(1000);
        //     // Click on "Post" button Using Locator "XPath"
        //     // //button[contains(@class,'share-actions__primary-action artdeco-button')]
        //     driver.findElementByXPath("//button[contains(@class,'share-actions__primary-action artdeco-button')]")
        //             .click();
        //     // Verify that "Post successful" message is displayed Using Locator "XPath" //*[text()='Post successful.']
        //     boolean isDisplayed = driver.findElementByXPath("//*[text()='Post successful.']").isDisplayed();
        //     System.out.println("Post is posted successfully: " + isDisplayed);
        // }
    }


}
