package pruebasclases;

import examenfinal.Tablero;
import org.testng.Assert;
import org.testng.annotations.Test;

public class juegotests {
    @Test
    private void test_singleton_tablero(){
        Tablero tableroJuego= Tablero.getInstance();
        Tablero tableroJuego2= Tablero.getInstance();
        boolean rpta= tableroJuego2 instanceof Tablero;
        Assert.assertEquals("false", String.valueOf(rpta));
    }
    @Test
    private void test_create_tablero(){
        Tablero tableroJuego= Tablero.getInstance();
        boolean rpta= tableroJuego instanceof Tablero;
        Assert.assertEquals("true", String.valueOf(rpta));
    }
}
