package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void TuwaiqTestMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.clickEn_button();
        Thread.sleep(3000);
        homepage.clickBC_button();
        Thread.sleep(3000);
        homepage.clickFI_button();
        Thread.sleep(3000);
        homepage.clickSI_F();
        Thread.sleep(3000);
        homepage.clickRL();
        Thread.sleep(3000);
        homepage.scroll(0,300);
        Thread.sleep(3000);
      //  homepage.EnterLoginCredentials();


    }





}




