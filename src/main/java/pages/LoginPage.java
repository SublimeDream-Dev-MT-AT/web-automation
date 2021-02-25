package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login_form");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public TodoPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new TodoPage(driver);
    }
}
