package demo;
  import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.chrome.ChromeDriver;
    
    import demo.TestCases;
    
    public class GoogleNameCount {
        ChromeDriver driver;
    
        public void Post_Google() {
            this.driver = TestCases.TestCasesInitializer();
            
                    System.out.println("Start testCase: testCase04");
                    //Navigate to URL  https://www.google.com/
                    driver.get("https://www.google.com/");
                    
                    //Click on Search Bar Using Locator "Name" q
                    driver.findElement(By.name("q")).click();
                    
                    //Type in "Puja" in Search bar  Using Locator "Name" q
                    driver.findElement(By.name("q")).sendKeys("Puja");
                    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
                    
                    //Click on Google Search Button Using Locator "XPath" (//input[@value='Google Search'])[1]
                    int count = driver.findElements(By.partialLinkText("Puja")).size();
                    
                    //Count of links in the search result with name Using Locator "XPath" //h3[text()='Puja']
                    //int count = driver.findElementByXPath("a");
                    System.out.println("count :" + count);
                }
    }
    


