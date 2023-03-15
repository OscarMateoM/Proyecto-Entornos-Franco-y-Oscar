package com.franco.oscar.proyecto.parkingmanager.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void testGetFirstName() {

    }

    @Test
    void testGetFullName() {

    }

    @Test
    void testGetLastName1() {

    }

    @Test
    void testGetLastName2() {
        //Arrange
        User user = new User("Manuel","Perez","Gonzalez","Alumno");
        String expected = "Gonzalez";
        //Act
        String actual = user.getLastName2();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void testGetRole() {

    }

    @Test
    void testSetFirstName() {

    }

    @Test
    void testSetLastName1() {

    }

    @Test
    void testSetLastName2() {

    }

    @Test
    void testSetRole() {

    }
}
