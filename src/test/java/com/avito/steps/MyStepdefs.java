package com.avito.steps;

import com.codeborne.selenide.Selenide;
import com.avito.pageobjects.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class MyStepdefs {

    MainPage mainPage = page(MainPage.class);
    ProductPage productPage = page(ProductPage.class);
    LoginPage loginPage = page(LoginPage.class);

    @Given("^Войти на сайт avito$")
    public void войтиНаСайтAvito() {
        open("https://www.avito.ru/");
    }

    @Given("^Перейти в категории$")
    public void перейтиВКатегории() {
        mainPage.categories.click();
    }

    @Given("^выбрать Автомобили$")
    public void выбратьАвтомобили() {
        mainPage.catAvto.click();
    }

    @Given("^Выбрать регион Московская область$")
    public void выбратьРегионМосковскаяОбласть() throws InterruptedException {
        mainPage.region.shouldBe(visible).click();
        Thread.sleep(1000);
        mainPage.mRegion.sendKeys("Московская область");
        Thread.sleep(1000);
        mainPage.regionButton.shouldBe(visible).click();
    }

    @Given("^Поставить чекбокс, только с фото$")
    public void поставитьЧекбоксТолькоСФото() {
        productPage.checkBoxWiev.click();
    }

    @Given("^Ввести в поисковую строку kia$")
    public void ввестиВПоисковуюСтрокуKia() {
        mainPage.searchString.sendKeys("kia k5");
    }

    @Given("^Нажать кнопку поиск$")
    public void нажатьКнопкуПоиск() {
        productPage.searchButton.click();
    }

    @Then("^Получить цену первой машины в списке$")
    public void получитьЦенуПервойМашиныВСписке() {
        //Нажать на первый элемент
        Selenide.actions().moveToElement(productPage.yaPoint, -150, 50 ).click().build().perform();
        //переключаемся на второе окно
        switchToNewTab();
        System.out.println(productPage.price.getText());
    }

    @Then("^Получить url объявления$")
    public void получитьUrlОбъявления() {
        System.out.println("Url объявления - " + getWebDriver().getCurrentUrl());
    }

    @Given("^Выполнить вход на сайт с помощью \"([^\"]*)\" и \"([^\"]*)\"$")
    public void выполнитьВходНаСайтСПомощьюИ(String user, String password){
        loginPage.loginButton.click();
        loginPage.log.sendKeys(user);
        loginPage.pas.sendKeys(password);
        loginPage.loginSubmit.click();
        throw new PendingException();
    }

    @Given("^добавить объявление в избранное$")
    public void добавитьОбъявлениеВИзбранное() throws InterruptedException {
        //кликаю на 1е объявление
        Selenide.actions().moveToElement(productPage.yaPoint, -450, 50 ).click().build().perform();
        switchToNewTab();
        productPage.addAFavorite.click();
        open("https://www.avito.ru/favorites");
        Thread.sleep(3000); //просто для визуала
    }

    private void switchToNewTab() {
        ArrayList<String> tabs = new ArrayList<String> (getWebDriver().getWindowHandles());
        switchTo().window(tabs.get(1));
    }
}
