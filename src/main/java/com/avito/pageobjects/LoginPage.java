package com.avito.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @NameOfElement("Логин")
    @FindBy(css = "[name='login']")
    public SelenideElement categories;

    @NameOfElement("Пароль")
    @FindBy( css = "[name='password']")
    public SelenideElement catAvto;

}
