package com.avito.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @NameOfElement("categories")
    @FindBy(css = ".top-rubricator-rubricatorButton-SoKyQ")
    public SelenideElement categories;

    @NameOfElement("catAvto")
    @FindBy( linkText = "Автомобили")
    public SelenideElement catAvto;


    @NameOfElement("Region")
    @FindBy(css = ".main-location-XUs1_")
    public SelenideElement region;

    @NameOfElement("mRegion")
    @FindBy(css = ".suggest-input-rORJM")
    public SelenideElement mRegion;

    @NameOfElement("RegionButton")
    @FindBy(css = "[data-marker='popup-location/save-button']")
    public SelenideElement regionButton;

    @NameOfElement("Search")
    @FindBy(xpath = "//*[@id=\"downshift-input\"]")
    public SelenideElement searchString;




}
