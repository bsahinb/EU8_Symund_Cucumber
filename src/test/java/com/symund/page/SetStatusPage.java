package com.symund.page;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetStatusPage extends BasePage {

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-online']")
    public WebElement onlineButton;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-away']")
    public WebElement awayButton;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-dnd']")
    public WebElement doNotDisturbBtn;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-invisible']")
    public WebElement invisibleButton;

    @FindBy(xpath = "//form[@class='custom-input__form']/input")
    public WebElement statusMessageBox;

    @FindBy(xpath = "//button[@class='custom-input__emoji-button']")
    public WebElement emojiButton;


    public WebElement getEmoji(String emojiName) {
        String locator = "//span[@data-title='" + emojiName + "']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    @FindBy(xpath = "//button[@class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
    public WebElement closeButton;


    //default status message
    @FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[5]/div[1]/span[2]")
    public WebElement inMeeting;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[5]/div[2]/span[2]")
    public WebElement commuting;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[5]/div[3]/span[2]")
    public WebElement workingRemotely;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[5]/div[4]/span[2]")
    public WebElement outSick;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[5]/div[5]/span[2]")
    public WebElement vacationing;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[7]/button[2]")
    public WebElement setStatusMessageBtn;


}
