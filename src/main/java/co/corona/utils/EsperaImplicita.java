package co.corona.utils;

public class EsperaImplicita {

    public void esperaImplicita(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
