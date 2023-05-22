package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinksBookMyShow {
    ChromeDriver driver;
    public void search_Page_bookMyShow() {
        this.driver = TestCases.TestCasesInitializer();
    
                System.out.println("Start Test case: testCase02");
                // Nevigate to Url  https://in.bookmyshow.com/explore/home/chennai
                driver.get("https://in.bookmyshow.com/explore/home/chennai");
        
                // Locate the locater for hyperlink  Using Locator "Name" a
                int count = driver.findElements(By.tagName("a")).size();
        
                // Get count of the hyperlinks Using Locator "Name" a
                System.out.println(count);
            }
}
