package org.expenses;

import com.aventstack.extentreports.ExtentReports;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.applogin.AppLogin;
import com.aventstack.extentreports.ExtentTest;
import org.applogin.testcase.TestCase1;
import org.desiredcapabilities.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinition2 {

    TestCase1 obj;
    public ExtentTest test;
    public AppiumDriver driver;
    public ExtentReports extent;
    @Given("^Launch the driver $")
    public void launch_the_driver() throws MalformedURLException {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Test Case login", "Description of main login");
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

    }
    @When("^user will enter the user id $")
    public void user_will_enter_the_user_id(){
        // Write code here that turns the phrase above into concrete actions

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj = new TestCase1((AndroidDriver) driver, test);
        obj.userName();
    }
    @When("^user will empty password $")
    public void user_will_empty_password() {
        obj.userName();
    }
    @When("^user will click on Go button $")
    public void user_will_click_on_go_button() {
        // Write code here that turns the phrase above into concrete actions
        obj.goClickButton();
    }
    @Then("^user will click on notification allowed $")
    public void user_will_click_on_notification_allowed_2() {
        // Write code here that turns the phrase above into concrete actions
        obj.permissonAllowed();
    }
}
