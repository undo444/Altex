package AltexTest;

import Before.BeforeTest;
import javafx.beans.binding.ListExpression;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BuyTest extends BeforeTest {


    @Test

    public void BuyProduct() {


        List<WebElement> ClickProducts = Driver.findElements(By.xpath("//ul[@class='MainMenuGeneralWrapper MainMenu-list relative hidden lg:block clearfix']/li"));
        ClickProducts.get(0).click();

        List<WebElement> ProductList = Driver.findElements(By.xpath("//li[@class='ProductsMenu-item ']/a"));
        ProductList.get(1).click();


        List<WebElement> LaptopClick = Driver.findElements(By.xpath("//ul[@class='ProductsMenu-categoriiList w-full py-10px mt-1 pl-30px pr-2 text-sm min-h-full']//li//a"));
        LaptopClick.get(0).click();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='Products flex flex-wrap relative -mx-1 sm:-mx-2']//li/a/h2")));
        List<WebElement> Lista = Driver.findElements(By.xpath("//ul[@class='Products flex flex-wrap relative -mx-1 sm:-mx-2']//li/a/h2"));
        Random RandomProduct = new Random();
        int RandomIndexProduct = RandomProduct.nextInt(Lista.size());
        Lista.get(RandomIndexProduct).click();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='leading-none text-center rounded-tr-lg rounded-bl-lg outline-none font-medium text-base text-white active:opacity-75 group w-full block bg-red-lightdark sm:hover:bg-red-hover sm:focus:bg-red-active']")));
        WebElement AddToCart = Driver.findElement(By.xpath("//button[@class='leading-none text-center rounded-tr-lg rounded-bl-lg outline-none font-medium text-base text-white active:opacity-75 group w-full block bg-red-lightdark sm:hover:bg-red-hover sm:focus:bg-red-active']"));
        AddToCart.click();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='md:w-1/3 md:min-w-232px md:text-right hidden lg:block']/a")));
        WebElement SeeCart = Driver.findElement(By.xpath("//div[@class='md:w-1/3 md:min-w-232px md:text-right hidden lg:block']/a"));
        SeeCart.click();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='mt-4 mb-4']/a")));
        WebElement ContinueClick = Driver.findElement(By.xpath("//div[@class='mt-4 mb-4']/a"));
        ContinueClick.click();


        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='email']")));
        WebElement EmailClick = Driver.findElement(By.xpath("//input[@name='email']"));
        EmailClick.click();
        EmailClick.sendKeys("test150150@yahoo.com");

        WebElement NextClick = Driver.findElement(By.xpath("//span[contains(text(),'Pasul urmator')]"));
        NextClick.click();

        new WebDriverWait(Driver, 40).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Persoana fizica')]")));
        WebElement PersFizica = Driver.findElement(By.xpath("//span[contains(text(),'Persoana fizica')]"));
        PersFizica.click();

        WebElement Surname = Driver.findElement(By.id("address_first_name"));
        Surname.click();
        Surname.sendKeys("Alexandru");

        WebElement Name = Driver.findElement(By.id("address_last_name"));
        Name.click();
        Name.sendKeys("Manolache");

        WebElement PhoneNumber = Driver.findElement(By.id("address_telephone_facturare"));
        PhoneNumber.click();
        PhoneNumber.sendKeys("0754940939");

        WebElement Adress = Driver.findElement(By.xpath("//textarea[@name='street']"));
        Adress.click();
        Adress.sendKeys("Stefan cel Mare ");


        WebElement Judet = Driver.findElement(By.id("react-select-2-input"));
        Judet.sendKeys("Cluj");
        Judet.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement localitate = Driver.findElement(By.id("react-select-3-input"));
        localitate.sendKeys("CLUJ-NAPOCA");
        localitate.sendKeys(Keys.ENTER);

        List<WebElement> PayBox = Driver.findElements(By.xpath("//span[@class='checkbox-control is-radio flex-none w-5 h-5 p-1 mr-2 border-gray-1600 hover:border-black border rounded-full bg-white ']"));
        PayBox.get(7).click();

        WebElement ContinueClick2 = Driver.findElement(By.xpath("//span[contains(text(),'Continua')]"));
        ContinueClick2.click();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='checkbox-control flex-none w-5 h-5 p-1 mr-2 border-gray-light border rounded-4px bg-white is-required']")));
        WebElement TermsBox = Driver.findElement(By.xpath("//span[@class='checkbox-control flex-none w-5 h-5 p-1 mr-2 border-gray-light border rounded-4px bg-white is-required']"));
        TermsBox.click();

        WebElement NewsBox = Driver.findElement(By.xpath("//span[@class='checkbox-control flex-none w-5 h-5 p-1 mr-2 border-gray-light border rounded-4px bg-white ']"));
        NewsBox.click();


//        WebElement SendButton = Driver.findElement(By.xpath("//span[contains(text(),'Trimite comanda')]"));
//        SendButton.click();
    }
}


























