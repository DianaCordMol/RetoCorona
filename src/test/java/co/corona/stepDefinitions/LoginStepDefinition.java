package co.corona.stepDefinitions;

import co.corona.steps.PaginaLoginStep;
import co.corona.steps.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    PaginaLoginStep paginaLoginStep;

    @Dado("^Que el usuario se encuentra en la pagina web$")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() {
        paginaPrincipalStep.abrirNavegador();
    }

    @Cuando("^El desee loguearse e ingrese con sus credenciales$")
    public void elDeseeLoguearseEIngreseConSusCredenciales() throws IOException {
        paginaPrincipalStep.clickInicioSesion();
        paginaLoginStep.ingresarCredenciales();
        paginaPrincipalStep.validarLogin();
    }

    @Entonces("^Se visualizara el mensaje de bienvenida con su nombre$")
    public void seVisualizaraElMensajeDeBienvenidaConSuNombre() {
    }

}
