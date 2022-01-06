package com.solvd.beamplify;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends AbstractPage {

    @FindBy (xpath = "//div[@class='normal-text res-error']//p")
    private ExtendedWebElement emailFailed;

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public String getInvalidEmailText(){
        return emailFailed.getText();
    }


}
