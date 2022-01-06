package com.solvd.beamplify;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {


    @FindBy(xpath = "//input[@id='email' and @type='email']")
    private ExtendedWebElement emailField;

    @FindBy(xpath = "//input[@id='upass' and @type='password']")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//a[@href='register.php3']]")
    private ExtendedWebElement signUpButton;

    @FindBy(xpath = "//i[@class='head-icon icon-login']")
    private ExtendedWebElement logInButton;

    //@FindBy(xpath = "//input[@id='nick-submit' and @type='submit']")
    //private ExtendedWebElement submitLoginButton;

    private By submitLoginButton = By.xpath("//input[@class='button' and @type='submit']");

    @FindBy(xpath = "//input[@Type='text' and @name='sSearch']")
    private ExtendedWebElement searchField;



    public HomePage(WebDriver driver) {
        super(driver);
        open();
    }

    public CreateAccountPage clickSignUpButton(){
        signUpButton.clickIfPresent();
        return new CreateAccountPage(driver);
    }

    public void inputPasswordField(String password){
        passwordField.type(password);
    }

    public void inputEmailField(String email){
        emailField.type(email);
    }

    public void clickLoginButton(){
        logInButton.click();
    }

    public CreateAccountPage submitLogin(){
        //submitLoginButton.click();
        driver.findElement(submitLoginButton).submit();
        return new CreateAccountPage(driver);
    }

    public void setSearchField(String search){
        searchField.type(search);
    }

    public ResultPage performSearch(){
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        return new ResultPage(driver);
    }

}
