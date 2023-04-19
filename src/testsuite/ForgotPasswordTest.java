package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //Clicking on forgot your password link
        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        //Verifying text
        String expectedMessage = "Reset Password";
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Error Message", expectedMessage, actualMessage);
    }
}
