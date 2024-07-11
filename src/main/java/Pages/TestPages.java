package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;



import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenUrl (){
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL
    }

    public void clickEn_button() throws InterruptedException {
        WebElement clickEn = driver.findElement(EnBtn); // Find button element
        clickEn.click(); // Click on the login button
         }
    public void clickBC_button() throws InterruptedException {
        WebElement clickBC = driver.findElement(BCBtn); // Find button element
        clickBC.click(); // Click on the login button

    }

    public void clickFI_button() throws InterruptedException {
        WebElement clickFI = driver.findElement(FIBtn); // Find button element
        clickFI.click(); // Click on the login button

    }

    public void clickSI_F() throws InterruptedException {
        WebElement clickSIF = driver.findElement(SIFBtn); // Find button element
        clickSIF.click(); // Click on the login button
        driver.findElement(SIFBtn).sendKeys("data");}

    public void clickRL() throws InterruptedException {
        //WebElement clickRL = driver.findElement(RL); // Find button element
        //clickRL.click(); // Click on the login button
        WebElement selectRE = driver.findElement(Riyad);  // Find button element
        selectRE.click(); // Click on the login button


    }

    public void scroll(int x , int y)  {
       JavascriptExecutor  js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollTo(arguments[0],arguments[1]);",x,y);



    }





    // Method to click on the learn button on the home page
    //public void clicklearn_button() throws InterruptedException {
     //   WebElement clickLearn = driver.findElement(learnBtn); // Find login button element
     //   clickLearn.click(); // Click on the login button
     //   Thread.sleep(3000);
   // }

    // Method to enter login credentials and verify login
    //public void EnterLoginCredentials () throws InterruptedException {
       // driver.findElement(emailAddressLogin).sendKeys("nn16nm@hotmail.com"); // Find email address field and enter email
       //Thread.sleep(3000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
       // driver.findElement(passwordLogin).sendKeys("Nnmal@1996"); // Find password field and enter password
      //  driver.findElement(signInBtn).click(); // Click on sign-in button

     //   boolean homepageview = driver.findElement(assertionUponLogin).isDisplayed(); // Check if assertion element is displayed
    //    Assert.assertTrue(homepageview, "home page is not displayed!"); // Assert that homepageview is true





}
