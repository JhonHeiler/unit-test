package com.example.demo.service;

import com.example.demo.model.Person;

import java.util.HashMap;

public class PersonService {
    private final HashMap<Long, Person> user = new HashMap<>();

    public void createUser(Long id, String name){
        user.put(id, new Person(id,name));
    }

    public Person getUser(Long id){
        return user.get(id);
    }

}
