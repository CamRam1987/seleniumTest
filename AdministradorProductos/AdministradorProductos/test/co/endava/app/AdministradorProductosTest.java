package co.endava.app;

import co.endava.datos.Comida;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {
    @Test
    public void descuento() {
        double porcentajeControl = 10;
        Comida p3 = new Comida(103, "queso", 2000, LocalDate.now().plusDays(2));
        Double descuento = p3.getDescuento();
        Double percentProduct = descuento * 100 / p3.getPrecio();

        assertEquals(porcentajeControl, percentProduct);
    }

}


