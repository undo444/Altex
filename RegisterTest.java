package AltexTest;

import Before.BeforeTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterTest extends BeforeTest {

    @Test

    public void Reg (){


        WebElement AccountClick = Driver.findElement(By.xpath("//span[@class='jsx-71152821 absolute hidden sm:block']"));
        AccountClick.click();

        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement Register = Driver.findElement(By.xpath("//a[@class='underline hover:text-bleu-hover text-red-brand text-sm leading-15.6']"));
        Register.click();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='first_name']")));
        WebElement SurName = Driver.findElement(By.xpath("//input[@name='first_name']"));
        SurName.sendKeys("Alexandru");

        WebElement Name = Driver.findElement(By.xpath("//input[@name='last_name']"));
        Name.sendKeys("Manolache");

        WebElement Email = Driver.findElement(By.xpath("//input[@autocomplete='off']"));
        Email.sendKeys("undo444@yahoo.com");

        WebElement NrTel = Driver.findElement(By.xpath("//input[@name='telephone']"));
        NrTel.sendKeys("0754940939");

        WebElement Password = Driver.findElement(By.xpath("//div[@class='mb-4 '][5]//input"));
        Password.sendKeys("Test1234");

        WebElement PassConfirm = Driver.findElement(By.xpath("//div[@class='mb-4 '][6]//input"));
        PassConfirm.sendKeys("Test1234");

        WebElement TermsBox = Driver.findElement(By.xpath("//span[@class='checkbox-control flex-none w-5 h-5 p-1 mr-2 border-gray-light border rounded-4px bg-white is-required']"));
        TermsBox.click();

        WebElement NewsBox = Driver.findElement(By.xpath("//span[@class='checkbox-control flex-none w-5 h-5 p-1 mr-2 border-gray-light border rounded-4px bg-white ']"));
        NewsBox.click();

//    WebElement RegisterButton = Driver.findElement(By.xpath("//span[contains(text(),'Inregistrare')]"));
//    RegisterButton.click();




    }

}
