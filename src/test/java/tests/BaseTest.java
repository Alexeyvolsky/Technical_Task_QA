package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import pages.*;
import utils.PropertyReader;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected final static String BASE_URL = System.getenv().getOrDefault("BASE_URL", PropertyReader.getProperty("url"));
    protected final static String USERNAME = System.getenv().getOrDefault("EMAIL", PropertyReader.getProperty("username"));
    protected final static String PASSWORD = System.getenv().getOrDefault("PASSWORD", PropertyReader.getProperty("password"));
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected PostingPage postingPage;
    protected NewBuildingsPage newBuildingsPage;
    protected ApartmentsPage apartmentsPage;
    protected RoomsPage roomsPage;
    protected GaragesPage garagesPage;
    @BeforeClass(alwaysRun = true)
    public void SetUp(ITestContext testContext) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);
        loginPage = new LoginPage(driver);
        postingPage = new PostingPage(driver);
        newBuildingsPage = new NewBuildingsPage(driver);
        apartmentsPage = new ApartmentsPage(driver);
        roomsPage = new RoomsPage(driver);
        garagesPage = new GaragesPage(driver);
    }
    @BeforeClass(alwaysRun = true)
    public void navigate() {
        driver.get(BASE_URL);
    }

   @AfterClass(alwaysRun = true)
   public void tearDown() {
       driver.quit();
   }
}
