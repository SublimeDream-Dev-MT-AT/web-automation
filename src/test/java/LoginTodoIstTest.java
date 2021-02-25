import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTodoIstTest {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        this.openBrowser();
        this.loginTodo();
        this.dreamBrowser();
        this.closeBrowser();
    }

    public void openBrowser(){
        driver.get("https://todoist.com/users/showlogin");
        driver.manage().window().maximize();
    }

    public void loginTodo(){
        WebElement email=driver.findElement(By.id("email"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.id("login_form"));

        email.sendKeys("sublimedream.dgsoto@gmail.com");
        password.sendKeys("todoist1987");
        login.click();

        String actualUrl="https://todoist.com/app/";
        String expectedUrl= driver.getCurrentUrl();

        System.out.println(this.validateLogin(actualUrl, expectedUrl));
    }

    public void dreamBrowser(){
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeBrowser(){
        driver.quit();
    }

    public boolean validateLogin(String actual, String expected){
        return actual.equalsIgnoreCase(expected);
    }

    public static void main(String[] args) {
        LoginTodoIstTest loginTodoIst = new LoginTodoIstTest();
        loginTodoIst.setUp();
    }
}
