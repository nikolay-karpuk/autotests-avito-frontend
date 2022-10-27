package com.avito.runner;


import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/java/com/avito/features",
        glue = "com/avito/steps",
        tags = "@test2")

public class RunnerTest {
    @BeforeClass
    static public void setupTimeout(){
        Configuration.timeout = 1000;
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;
        open("https://avito.ru/");
        System.setProperty("webdriver.chrome.driver", "src/main/resources");
        Configuration.browser = "chrome";
    }

    @AfterClass
    public static void tearDown() {
        switchTo().window(getWebDriver().getWindowHandle()).close();
        closeWebDriver();
        clearBrowserCache();
    }
}

