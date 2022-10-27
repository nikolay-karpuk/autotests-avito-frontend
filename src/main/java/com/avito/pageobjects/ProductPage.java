package com.avito.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @NameOfElement("Search Button")
    @FindBy(css = "[data-marker='search-form/submit-button']")
    public SelenideElement searchButton;

    @NameOfElement("Точка")
    @FindBy(xpath = "/html/body")
    public SelenideElement yaPoint;


    @NameOfElement("CheckBoxW")
    @FindBy(css = ".checkbox-group-item-vM_BO")
    public SelenideElement checkBoxWiev;

    @NameOfElement("Цена авто")
    @FindBy(css = ".desktop-ged5cz")
    public SelenideElement price;

    @NameOfElement("Добавить в избранное")
    @FindBy(css = ".style-header-add-favorite-M7nA2")
    public SelenideElement addAFavorite;

}
