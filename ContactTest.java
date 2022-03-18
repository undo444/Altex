package AltexTest;

import Before.BeforeTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.util.List;

public class ContactTest extends BeforeTest {



    @Test

    public void BuyProduct() {


        List<WebElement> Store = Driver.findElements(By.xpath("//ul[@class='MainMenuGeneralWrapper MainMenu-list relative hidden lg:block clearfix']/li"));
        Store.get(6).click();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='transform duration-75 ']")));
        List<WebElement> Arrow = Driver.findElements(By.xpath("//div[@class='transform duration-75 ']"));
        Arrow.get(4).click();

        WebElement ContactPage = Driver.findElement(By.xpath("//a[contains(text(),'Date si formular de contact')]"));
        ContactPage.click();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("contact_full_name")));
        WebElement Name = Driver.findElement(By.id("contact_full_name"));
        Name.click();
        Name.sendKeys("Manolache Alexandru");

        WebElement PhoneNumber = Driver.findElement(By.id("contact_phone"));
        PhoneNumber.sendKeys("0754940939");

        WebElement Email = Driver.findElement(By.id("contact_email"));
        Email.sendKeys("undo444@yahoo.com");

        List<WebElement> CheckBox1 = Driver.findElements(By.xpath("//span[@class='checkbox-control is-radio flex-none w-5 h-5 p-1 mr-2 border-gray-1600 hover:border-black border rounded-full bg-white ']"));
        CheckBox1.get(0).click();


        List<WebElement> Lista = Driver.findElements(By.xpath("//div[@class='Form-select u-position-relative']/select[@name='type']/option"));
        for (int i = 0; i < Lista.size(); i++) {
            String CurentElement = Lista.get(i).getText();
            if (CurentElement.equals("Sesizare")) {
                Lista.get(i).click();
            }
        }
        WebElement Lista2 = Driver.findElement(By.xpath("//div[@class='Form-select u-position-relative']//select[@name='detail']"));
        Select lista2 = new Select(Lista2);
        lista2.selectByVisibleText("Altex Travel");

        WebElement Lista3 = Driver.findElement(By.xpath("//div[@class='Form-select u-position-relative']//select[@name='additionalDetail']"));
        Select lista3 = new Select(Lista3);
        lista3.selectByVisibleText("Conditii Generale");

        WebElement DetailsText = Driver.findElement(By.xpath("//div[@class='mb-4']//textarea"));
        DetailsText.click();
        DetailsText.sendKeys("Detalii Altex Travel");

        WebElement ChooseFile = Driver.findElement(By.name("attachment"));
        String filename = "C:\\altex.png\\";
        File file = new File(filename);
        String path = file.getAbsolutePath();
        ChooseFile.sendKeys(path);

        WebElement TermsAndCondBox = Driver.findElement(By.xpath("//span[@class='checkbox-control flex-none w-5 h-5 p-1 mr-2 border-gray-light border rounded-4px bg-white is-required']"));
        TermsAndCondBox.click();

        

//        WebElement ApplyButton = Driver.findElement(By.xpath("//span[contains(text(),'Aplica')]"));
//        ApplyButton.click();



    }

}







