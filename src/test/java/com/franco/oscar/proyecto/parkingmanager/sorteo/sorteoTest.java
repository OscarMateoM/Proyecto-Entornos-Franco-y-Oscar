package com.franco.oscar.proyecto.parkingmanager.sorteo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;







public class sorteoTest {
    @Test
    void testGetDescripcion() {
        //Arrange
        sorteo sorteo = new sorteo("Parking Manager", "23-03-2023", "Abierto");
        String expected = "Parking Manager";
        //Act
        String actual = sorteo.getDescripcion();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void testGetEstado() {
        //Arrange
        sorteo sorteo = new sorteo("Parking Manager", "23-03-2023", "Abierto");
        String expected = "Abierto";
        //Act
        String actual = sorteo.getEstado();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void testGetFecha() {
        //Arrange
        sorteo sorteo = new sorteo("Parking Manager", "23-03-2023","Abierto");
        String expected = "23-03-2023";
        //Act
        String actual = sorteo.getFecha();
        //Assert
        assertEquals(expected,actual);
    }

}
