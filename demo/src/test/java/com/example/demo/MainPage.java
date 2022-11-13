package com.example.demo;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {
    public SelenideElement seeDeveloperToolsButton = $x("//*[@data-test-marker='Developer Tools']");
    public SelenideElement findYourToolsButton = $x("//*[@data-test='suggestion-action']");
    public SelenideElement toolsMenu = $x("//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']");
    public SelenideElement searchButton = $("[data-test='site-header-search-action']");



    public SelenideElement certif = $x("//a[@href='#/certificate']");
    public  SelenideElement uslov = $x("/html/body/app-root/app-certificate-page/app-certificate-block-second/div[1]/div/div/div[2]/div[2]");

    public SelenideElement path =$x("/html/body/app-root/app-certificate-page/app-certificate-block-second/div[1]/div/div/div[3]/div[1]");
}
