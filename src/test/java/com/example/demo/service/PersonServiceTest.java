package com.example.demo.service;

import com.example.demo.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class PersonServiceTest {

    private  PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService();
        personService.createUser(1L,"Heiler");
        personService.createUser(2L,"Cristian");
    }

    @DisplayName("Dado un usuario esperamos que sea igual al esperado" +
            "pppp")
    @Test
    void testCrearUser() {
      Person wait = Person.builder().id(1L).name("Heiler").build();
      final Person result = personService.getUser(1L);
      Assertions.assertEquals(wait, result,"Los esperado son diferente");
    }


    @DisplayName("Dado un usuario esperamos que sea igual al esperado" +
            "pppp")
    @Test
    public void testCrearUser2() {
        Person wait = Person.builder().id(1L).name("Heiler").build();
        final Person result = personService.getUser(2L);
        Assertions.assertNotEquals(wait, result,"Los esperado son iguales");
    }
    @Test
    public void testGetUser(){
        Person wait = Person.builder().id(2L).name("Cristian").build();
        final Person result = personService.getUser(2L);
        Assertions.assertEquals(wait, result,"Los esperado son diferente");
    }
}

