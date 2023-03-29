package com.franco.oscar.proyecto.parkingmanager.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void testGetFirstName() {
        //Arrange
        User user = new User("Manuel","Perez","Gonzalez","Alumno","manuel@hotmail.com");
        String expected = "Manuel";
        //Act
        String actual = user.getFirstName();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void testGetFullName() {
        //Arrange
        User user = new User("Manuel","Perez","Gonzalez","manuel@hotmail.com","Alumno");
        String expected = "Manuel Perez Gonzalez manuel@hotmail.com";
        //Act
        String actual = user.getFullName();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void testGetLastName1() {
        //Arrange
        User user = new User("Manuel","Perez","Gonzalez","Alumno","manuel@hotmail.com");
        String expected = "Perez";
        //Act
        String actual = user.getLastName1();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void testGetLastName2() {
        //Arrange
        User user = new User("Manuel","Perez","Gonzalez","Alumno","manuel@hotmail.com");
        String expected = "Gonzalez";
        //Act
        String actual = user.getLastName2();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void testGetRole() {
        //Arrange
        User user = new User("Manuel","Perez","Gonzalez","manuel@hotmail.com","Alumno");
        String expected = "Alumno";
        //Act
        String actual = user.getRole();
        //Assert
        assertEquals(expected,actual);
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
