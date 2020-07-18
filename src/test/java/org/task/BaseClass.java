package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
static WebDriver driver;
public static void launch(String s) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURKESH KUMAR\\eclipse-workspace\\Adactin\\div\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(s);
}
public static void Fill(WebElement w,String s) {
w.sendKeys(s);

}
public static void klik(WebElement w) {
w.click();

}	
public static void dropdown(WebElement w,String s) {
Select se=new Select(w);
se.selectByVisibleText(s);
}
public static void print(WebElement w) {
String tr = w.getAttribute("value");
System.out.println(tr);
}
}


