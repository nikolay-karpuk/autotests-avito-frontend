package com.avito.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @NameOfElement("Логин")
    @FindBy(css = "[name='login']")
    public SelenideElement log;

    @NameOfElement("Пароль")
    @FindBy( css = "[name='password']")
    public SelenideElement pas;

    @NameOfElement("Кнопка вызывающее окно логина")
    @FindBy( css = "[data-marker='header/login-button']")
    public SelenideElement loginButton;

    @NameOfElement("Кнопка входа")
    @FindBy( css = "[name='submit']")
    public SelenideElement loginSubmit;

}
