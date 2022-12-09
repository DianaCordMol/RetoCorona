package co.corona.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {

    EsperaImplicita esperaImplicita = new EsperaImplicita();

    public void scrollElemento(WebDriver driver, By elemento) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(elemento);
        jse.executeScript("arguments[0].scrollIntoView()", element);

        esperaImplicita.esperaImplicita(2);
    }
}
