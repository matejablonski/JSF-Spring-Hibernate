package mj.dao;

import java.util.List;

import mj.model.Person;
 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
}