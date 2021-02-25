package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage {
    private WebDriver driver;

    private By addProjectLink = By.linkText("Add Project");

    public TodoPage(WebDriver driver) {
        this.driver = driver;
    }

    private void sleepBrowser() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ProjectPage clickAddProject() {
        this.sleepBrowser();
        driver.findElement(addProjectLink).click();
        return new ProjectPage(driver);
    }
}
