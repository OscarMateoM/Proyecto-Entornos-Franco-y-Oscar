package com.franco.oscar.proyecto.parkingmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.franco.oscar.proyecto.parkingmanager.user.User;

public class testUser {

    @Test
    public void check_user_name() {
        // Arrange
        User oscar = new User("Oscar", "Mateo",  "Martin", null);
        String expected = "Oscar";

        // Act
        String actual = oscar.getFirstName();
<<<<<<< HEAD
=======

>>>>>>> 20a377156890c42a22385869fca92d581c3de77c

        // Assert
        assertEquals(expected, actual);
    }

    
}