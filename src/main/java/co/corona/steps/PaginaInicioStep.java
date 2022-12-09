package co.corona.steps;

import co.corona.pageObjects.InicioPageObject;
import co.corona.pageObjects.PrincipalPageObject;
import co.corona.utils.DatosExcelCeldas;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaInicioStep {

    PrincipalPageObject principalPageObject = new PrincipalPageObject();
    InicioPageObject inicioPageObject = new InicioPageObject();

    DatosExcelCeldas datos = new DatosExcelCeldas();

    @Step
    public void abrirNavegador() {
        principalPageObject.open();
    }

    @Step
    public void click(By elemento) {
        principalPageObject.getDriver().findElement(elemento).click();
    }


    @Step
    public void clickLnkProductos() throws IOException {
        click(inicioPageObject.getLnkProductos());
    }
}
