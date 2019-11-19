package com.geico.pages.login_navigation;

import com.geico.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy(id ="homepage_manage_select")
        @CacheLookup
        public WebElement LoginCategoryElement;

        @FindBy(xpath = "//div[@id='sidebar']/child::div[@class='extra-info']/child::div/child::form/child::div/child::button[@id='manageSubmit']")
        public WebElement loginButtonElement;

        @FindBy(xpath = "//*[@id='header-right-links']/ul[1]/li[2]/a/span")
        public WebElement loginButtonElementAtHeader;

        @FindBy(xpath = "//*[@id='header-right-links']/ul/li[1]/a/span[2]")
        public WebElement geoLocationIconHeader;

        @FindBy(xpath = "//*[@id=\"header-right-links\"]/ul[1]/li[3]/a/span")
        public WebElement searchIconHeader;

        @FindBy(xpath = "//*[@id=\"header-left-links\"]/ul[1]/li[1]/a")
        public WebElement insuranceLeftHeader;

        @FindBy(xpath = "//*[@id=\"header-left-links\"]/ul[1]/li[2]/a")
        public WebElement informationLeftHeader;

        @FindBy(id = "zip")
        public WebElement zipCodeElement;

        @FindBy(className = "zip-code-geo-icon geico-icon icon-geolocation")
        public WebElement zipCodeGeoIcon;

        @FindBy(id = "submitButton")
        public WebElement startQuoteButtonElement;

        @FindBy(xpath = "//*[@id='available_products']/div[1]/span[1]")
        public WebElement AutoInsuranceIcon;

        @FindBy(xpath = "//*[@id='available_products']/div[2]/span[1]")
        public WebElement homeInsuranceIcon;

        @FindBy(xpath = "//*[@id='available_products']/div[3]/span[1]")
        public WebElement rentersInsuranceIcon;

        @FindBy(xpath = "//*[@id='available_products']/div[5]/span[1]")
        public WebElement motorcycleInsuranceIcon;

        @FindBy(xpath = "//*[@id='available_products']/div[6]/span[1]")
        public WebElement boatInsuranceIcon;

        @FindBy(xpath = "//*[@id='more']/span")
        public WebElement moreIcon;

        @FindBy(css = "#recall_link > a")
        public WebElement continueSavedQuote;

        @FindBy(css = "#agents_link > a")
        public WebElement agentsLink;

        @FindBy(xpath = "//a[contains(@href, 'HomeReportAnIncident')]")
        public WebElement reportAnIncidentButton;












}
