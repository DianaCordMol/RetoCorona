package co.corona.steps;

import co.corona.pageObjects.PrincipalPageObject;
import co.corona.utils.DatosExcelCeldas;
import co.corona.utils.EsperaImplicita;
import cucumber.api.java.bs.I;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaPrincipalStep {

    EsperaImplicita esperaImplicita = new EsperaImplicita();
    PrincipalPageObject principalPageObject = new PrincipalPageObject();

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
    public void clickInicioSesion() {
        click(principalPageObject.getLblInicioSesion());
        //esperaImplicita.esperaImplicita(500);
    }

    @Step
    public void validarLogin() throws IOException{
        String validar = principalPageObject.getDriver().findElement(principalPageObject.getLblValidacion()).getText();
        Assert.assertEquals(datos.leerDatoExcel("Login", "DatosExcel.xlsx", 1, 2), validar);
    }




}
