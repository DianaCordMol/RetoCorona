package co.corona.stepDefinitions;

import co.corona.steps.PaginaInicioStep;
import co.corona.steps.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;


public class PrincipalStepDefinition {

    PaginaInicioStep paginaInicioStep = new PaginaInicioStep();

    @Dado("^Que el usuario se encuentra en la pagina$")
    public void queElUsuarioSeEncuentraEnLaPagina() throws IOException{
        paginaInicioStep.abrirNavegador();
    }


    @Cuando("^El desee comprar un producto y lo elija$")
    public void elDeseeComprarUnProductoYLoElija() throws IOException{
    }

    @Entonces("^Se visualizara el producto en el carrito$")
    public void seVisualizaraElProductoEnElCarrito() throws IOException{
    }


}
