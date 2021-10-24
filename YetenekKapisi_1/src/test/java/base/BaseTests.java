package base;

import Pages.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import login.LoginTests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Key;

import static Pages.HomePage.bekle;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        goHome();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://www.yetenekkapisi.org/");
        System.out.println("beforemethod");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void takeScreenshot(){
        File file = new File("resources/screenshots/test.png");
        if(file.delete())
            System.out.println("File deleted");
        var camera =(TakesScreenshot)driver;
        File screenshot =camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot.toPath(), Paths.get("resources/screenshots/test.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("aftermethod");
    }

    @AfterClass
    public void tearDown(){
        HomePage.bekle(2000);
        System.out.println("5 saniye içinde kapanacak");
        HomePage.bekle(5000);
        driver.quit();
    }
}
