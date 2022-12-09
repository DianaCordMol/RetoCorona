package co.corona.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://corona.co")
public class InicioPageObject extends PageObject {

    By lnkPisos = By.xpath("//a[@href='/productos/revestimientos/pisos/c/pisos' and @class='coc-card-header']");

    By lnkProductos = By.xpath("//a[@title='Productos']");

    By imgPorcelanato = By.xpath("//img[@src='/medias/card-piso-porcelanato.jpg?context=bWFzdGVyfHJvb3R8MjE5NzQ3fGltYWdlL2pwZWd8aDRkL2g4NS85MDk3MjQxNjI0NjA2L2NhcmQtcGlzby1wb3JjZWxhbmF0by5qcGd8NzA5YjJiODg1NWVhM2VhZjZjNGYyMTdjNmFjNDZjOTFkYzEwODM2MTU0NWY2M2M2ZjczZWY0NDUxNTBhOTg0Nw']//parent::a");

    By imgProducto = By.xpath("//img[@title='Piso PORCELANATO® - Nordik Gris Caras Diferenciadas 24x120']");

    By lblDescripcion = By.className("description");

    By btnAgregarCarrito = By.id("addToCartButton");

    By lblMensajeExitoso = By.className("coc-title-add-cart-text");

    public By getLnkProductos() {
        return  lnkProductos;
    }

    public By getLnkPisos() {
        return lnkPisos;
    }

    public By getImgPorcelanato() {
        return imgPorcelanato;
    }

    public By getImgProducto() {
        return imgProducto;
    }

    public By getLblDescripcion() {
        return lblDescripcion;
    }

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public By getLblMensajeExitoso() {
        return lblMensajeExitoso;
    }
}
