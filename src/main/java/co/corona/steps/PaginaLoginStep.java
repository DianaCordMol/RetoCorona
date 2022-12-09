package co.corona.steps;

import co.corona.pageObjects.PrincipalPageObject;
import co.corona.utils.DatosExcelCeldas;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaLoginStep {

    PrincipalPageObject principalPageObject = new PrincipalPageObject();

    DatosExcelCeldas datos = new DatosExcelCeldas();

    @Step
    public void click(By elemento) {
        principalPageObject.getDriver().findElement(elemento).click();
    }

    @Step
    public void ingresarCredenciales() throws IOException {
        principalPageObject.getDriver().findElement(principalPageObject.getTxtUsername()).sendKeys(datos.leerDatoExcel("Login", "DatosExcel.xlsx", 1, 0));
        principalPageObject.getDriver().findElement(principalPageObject.getTxtPassword()).sendKeys(datos.leerDatoExcel("Login", "DatosExcel.xlsx", 1, 1));
        click(principalPageObject.getBtnSubmit());
    }
}
