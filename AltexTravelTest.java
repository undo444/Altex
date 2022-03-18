package AltexTest;

import Before.BeforeTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.annotation.Repeatable;
import java.lang.reflect.Array;
import java.sql.Driver;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AltexTravelTest extends BeforeTest {

@Test
    public void AltexTravel() {


    List<WebElement> AltexTravelClick = Driver.findElements(By.xpath("//ul[@class='MainMenuGeneralWrapper MainMenu-list relative hidden lg:block clearfix']/li"));
    AltexTravelClick.get(7).click();

    ArrayList<String> TabList = new ArrayList<>(Driver.getWindowHandles());
    Driver.switchTo().window(TabList.get(1));

    String actualresult = "Agentia de Turism Altex Travel | Vacanta Ta De Vis Este Aici!";
    String expectedresult = Driver.getTitle();
    Assert.assertEquals(expectedresult,actualresult);

    WebElement Cookie = Driver.findElement(By.id("cookie_accept"));
    Cookie.click();

    new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='mc-closeModal']")));
    WebElement AddClose = Driver.findElement(By.xpath("//div[@class='mc-closeModal']"));
    AddClose.click();

    List<WebElement> RandomDestination = Driver.findElements(By.xpath("//div[@class='overlay']"));
    Random random = new Random();
    int RandomIndex = random.nextInt(RandomDestination.size());
    RandomDestination.get(RandomIndex).click();

    Driver.close();
    Driver.switchTo().window(TabList.get(0));

















}

}