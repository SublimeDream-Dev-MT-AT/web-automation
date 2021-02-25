package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPage {
    private WebDriver driver;
    private By nameField = By.id("edit_project_modal_field_name");
    private By addButton = By.xpath("//button[text()='Add']");
    private String nameTemp;

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
        this.nameTemp = "";
    }

    public void setNameFieldProject(String projectName) {
        driver.findElement(nameField).sendKeys(projectName);
        this.nameTemp = projectName;
    }

    public String getNameProject(){
        return this.nameTemp;
    }

    private void sleepBrowser() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickAddButton(){
        driver.findElement(addButton).click();
        this.sleepBrowser();
    }
}
