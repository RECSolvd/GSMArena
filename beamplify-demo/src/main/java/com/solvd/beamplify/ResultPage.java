package com.solvd.beamplify;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends AbstractPage {

    @FindBy(xpath = "//div[@id='news']//h3")
    private ExtendedWebElement errorMessage;

    public ResultPage(WebDriver driver){
        super(driver);
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }
}
