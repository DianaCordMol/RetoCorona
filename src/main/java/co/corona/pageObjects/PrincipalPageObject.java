package co.corona.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://corona.co")
public class PrincipalPageObject extends PageObject {

    By lblInicioSesion = By.xpath("//span[contains(text(), 'Ingresa')]");

    By txtUsername = By.id("j_username");

    By txtPassword = By.id("j_password");

    By btnSubmit = By.xpath("//form[@id='loginForm']//button[@type='submit']");

    By lblValidacion = By.xpath("//*[@class='account-pre-text']/child::span[2]");

    public By getLblInicioSesion() {
        return lblInicioSesion;
    }

    public By getTxtUsername() {
        return txtUsername;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public By getLblValidacion() {
        return lblValidacion;
    }


}
