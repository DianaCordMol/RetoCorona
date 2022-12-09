package co.corona.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://corona.co")
public class InicioPageObject extends PageObject {

    By lnkPisos = By.linkText("https://corona.co/productos/revestimientos/pisos/c/pisos");

    By lnkProductos = By.linkText("https://corona.co/productos/c/categories");

    public By getLnkProductos() {
        return  lnkProductos;
    }



}
