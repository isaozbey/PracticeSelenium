package org.pages;

import com.Ozbey.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
