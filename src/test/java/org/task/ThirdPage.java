package org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage extends BaseClass {
public ThirdPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="radiobutton_0")
private WebElement radio;
@FindBy(id="continue")
private WebElement continues;
public WebElement getRadio() {
	return radio;
}
public WebElement getContinues() {
	return continues;
}

}