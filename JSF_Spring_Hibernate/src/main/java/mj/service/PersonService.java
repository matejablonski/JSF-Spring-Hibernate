package mj.service;

import java.util.List;

import mj.model.Person;
 
public interface PersonService {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
     
}