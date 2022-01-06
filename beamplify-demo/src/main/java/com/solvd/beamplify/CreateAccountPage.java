package com.solvd.beamplify;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends AbstractPage {


            @FindBy(xpath = "//input[@id='uname' and @type= 'text']")
            private ExtendedWebElement yourNicknameField;

            @FindBy(xpath = "(//input[@id='email' and @type='email'])[2]")
            private ExtendedWebElement yourEmailField;

            @FindBy(xpath = "(//input[@id='upass' and @type= 'password'])[2]")
            private ExtendedWebElement yourPasswordField;

            @FindBy(xpath = "//input[@id= 'iagree1' and @type= 'checkbox']")
            private ExtendedWebElement roundCheckBox1;

            @FindBy(xpath = "//input[@id= 'iagree2' and @type= 'checkbox']")
            private ExtendedWebElement roundCheckBox2;

            //@FindBy(xpath = "//input[@class= 'button' and @type= 'submit']")
            //private ExtendedWebElement submitButton;

            private By submitButton = By.xpath("//input[@class= 'button' and @type= 'submit']");

            @FindBy (xpath = "//div[class'normal-text res-error']//p")
            private ExtendedWebElement errorMessage;

            public CreateAccountPage(WebDriver driver){
                super(driver);
            }

            public void setYourNicknameField(String nicknameField){
                yourNicknameField.type(nicknameField);
            }

            public void setYourEmailField(String emailField){
                yourEmailField.type(emailField);
            }

            public void setYourPasswordField(String passwordField){
                yourPasswordField.type(passwordField);
            }

            public void clickRoundCheckBox1(){
                roundCheckBox1.click();
            }

            public void clickRoundCheckBox2(){
                roundCheckBox2.click();
            }

            public String getErrorMessage(){
                return errorMessage.getText();
            }

            public RegisterPage clickSubmitButton(){
                driver.findElement(submitButton).submit();
                return new RegisterPage(driver);
    }


}
