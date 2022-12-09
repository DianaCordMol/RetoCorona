package co.corona.steps;

import co.corona.pageObjects.InicioPageObject;
import co.corona.pageObjects.PrincipalPageObject;
import co.corona.utils.DatosExcelCeldas;
import co.corona.utils.EsperaImplicita;
import co.corona.utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaInicioStep {

    PrincipalPageObject principalPageObject = new PrincipalPageObject();
    InicioPageObject inicioPageObject = new InicioPageObject();

    EsperaImplicita esperaImplicita = new EsperaImplicita();

    DatosExcelCeldas datos = new DatosExcelCeldas();

    Scroll scroll = new Scroll();

    @Step
    public void abrirNavegador() {
        principalPageObject.open();
    }

    @Step
    public void click(By elemento) {
        principalPageObject.getDriver().findElement(elemento).click();
    }



    /**
     * Método para hacer click en la opción Productos en el topbar
     * @throws IOException
     */
    @Step
    public void clickLnkProductos() throws IOException {
        click(inicioPageObject.getLnkProductos());
    }

    /**
     * Método que recorre varios elementos antes de llegar al producto a elegir
     * @throws IOException
     */
    @Step
    public void navegarProducto() throws IOException{
        scroll.scrollElemento(inicioPageObject.getDriver(), inicioPageObject.getLnkPisos());
        click(inicioPageObject.getLnkPisos());
        scroll.scrollElemento(inicioPageObject.getDriver(), inicioPageObject.getImgPorcelanato());
        click(inicioPageObject.getImgPorcelanato());
        scroll.scrollElemento(inicioPageObject.getDriver(), inicioPageObject.getImgProducto());
        click(inicioPageObject.getImgProducto());
    }

    /**
     * Método que envía el producto al carrito
     * @throws IOException
     */
    @Step
    public void agregarAlCarrito() throws IOException{
        scroll.scrollElemento(inicioPageObject.getDriver(), inicioPageObject.getLblDescripcion());
        esperaImplicita.esperaImplicita(5);
        click(inicioPageObject.getBtnAgregarCarrito());
    }

    /**
     * Validamos que los textos (quitando espacios adelante y al final) coincidan
     * @throws IOException
     */
    @Step
    public void mensajeExitoso() throws IOException {
        esperaImplicita.esperaImplicita(5);
        String validar = inicioPageObject.getDriver().findElement(inicioPageObject.getLblMensajeExitoso()).getText().trim();
        Assert.assertEquals("Agregado a tu carrito para envío", validar);
    }
}
