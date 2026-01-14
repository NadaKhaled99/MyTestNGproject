import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNgClass {
    //declaration
    WebDriver driver;

    @BeforeTest
    public void prepare() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        //initialization
        driver = new ChromeDriver();
        Thread.sleep(3000);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

    @Test
    //read my annotation --> instead of using main method to run the project but now using annotation to run the project from the test method
    public void openBrowser() {
        System.out.println("Let's open the browser");
        driver.navigate().to("https://www.google.com");
    }

    @Test
    public void signUp() {
        System.out.println("Signing up");
    }

    @Test
    public void login() {
        System.out.println("Logging in");
    }

    @Test
    public void addToCart() {
        System.out.println("Add items to cart");
    }

    @Test
    public void logout() {
        System.out.println("Logging out");
    }

@Test
 public void closeBrowser(){
     System.out.println("Closing browser");
    }
}
