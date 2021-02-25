import org.testng.annotations.Test;

import pages.ProjectPage;
import pages.TodoPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTest {
    @Test
    public void testCreateProject() {
        loginPage.setUserName("test@gmail.com");
        loginPage.setPassword("test");
        TodoPage todoPage = loginPage.clickLoginButton();
        ProjectPage project = todoPage.clickAddProject();
        project.setNameFieldProject("Demito");
        project.clickAddButton();

        assertTrue(project.getNameProject().contains("Demito"),"Incorrect Message");
    }
}
