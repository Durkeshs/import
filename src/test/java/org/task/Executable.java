package org.task;

import org.testng.annotations.Test;

public class Executable extends BaseClass {
	@Test(dataProviderClass=Datapro.class,dataProvider="durke")
private void test(String s1,String s2,String s3,String s4,String s5,String S6,String S7) {
	launch("http://adactinhotelapp.com/");
driver.manage().window().maximize();

//login
FirstPage f=new FirstPage();
Fill(f.getUser(), s1);
Fill(f.getPass(),s2);
klik(f.getLogin());

//search details
SecondPage se=new SecondPage();
dropdown(se.getLocation(), "London");
dropdown(se.getHotel(), "Hotel Creek");
dropdown(se.getRoomtype(), "Super Deluxe");
dropdown(se.getRoomnos(), "5 - Five");
Fill(se.getDatepickin(), "31/05/2020");
Fill(se.getDatepickout(), "26/06/2020");
dropdown(se.getAdultroom(), "1 - One");
dropdown(se.getChildroom(), "2 - Two");
klik(se.getSubmit());

//select hotel
ThirdPage tp=new ThirdPage();
klik(tp.getRadio());
klik(tp.getContinues());

//book hotel
FourthPage fp=new FourthPage();
Fill(fp.getFirstname(), s3);
Fill(fp.getLastname(), s4);
Fill(fp.getAddress(), s5);
Fill(fp.getCcnum(), S6);
dropdown(fp.getCctype(), "VISA");
dropdown(fp.getCcexpmonth(), "May");
dropdown(fp.getCcexpyear(), "2022");
Fill(fp.getCccvv(), S7);
klik(fp.getBooknow());
print(fp.getOrderno());













}
}
