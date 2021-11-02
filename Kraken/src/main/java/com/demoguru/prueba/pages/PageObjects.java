package com.demoguru.prueba.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://demo.guru99.com/V4/index.php")

public class PageObjects extends PageObject{

        public By textUser = By.xpath("//input[@name='uid']");
        public By textPassword = By.name("password");
        public By btnLogin = By.name("btnLogin");
        public By lblWelcome= By.xpath("//*[contains(text(),'Welcome')]");
        public By ClienteWebPage= By.xpath("//*[text()='New Customer']");
        public By name= By.name("name");
        public By genderClick = By.name("rad1");
        public By birthday=By.name("dob");
        public By address=By.name("addr");
        public By city=By.name("city");
        public By state=By.name("state");
        public By pinno= By.name("pinno");
        public  By telephone= By.name("telephoneno");
        public By email= By.name("emailid");
        public  By password= By.name("password");
        public By submit=By.name("sub");
        public By lblClenteRegistrado=By.xpath("//table[@id='customer']//tr//td[1]");
        public By clienteIDGenerado=By.xpath("(//table[@id='customer']//tr//td)[5]");
        public By cuentaDeLaPagina=By.xpath("//*[text()='New Account']");
        public By cuentaId= By.name("cusid");
        public  By tipoDeCuenta= By.name("selaccount");
        public  By depositoInicial=By.name("inideposit");
        public  By submi = By.name("button2");
        public By LblCuenta= By.xpath("(//table[@id='account']//tr//td)[6]");


}




