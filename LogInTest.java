package AltexTest;

import Before.BeforeTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest extends BeforeTest{

    @Test

    public void SignIn(){


        WebElement AccountClick = Driver.findElement(By.xpath("//span[@class='jsx-71152821 absolute hidden sm:block']"));
        AccountClick.click();

        WebElement Email = Driver.findElement(By.xpath("//input[@placeholder='Introdu adresa de email']"));
        Email.sendKeys("undo444@yahoo.com");

        WebElement Password = Driver.findElement(By.xpath("//input[@placeholder='Parola']"));
        Password.sendKeys("test1234");

        WebElement SignInButton = Driver.findElement(By.xpath("//span[contains(text(),'Autentificare')]"));
        SignInButton.click();











    }
}
