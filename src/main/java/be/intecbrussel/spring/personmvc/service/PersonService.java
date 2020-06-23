package be.intecbrussel.spring.personmvc.service;



import be.intecbrussel.spring.personmvc.model.Person;

import java.util.List;

public interface PersonService {

    Person getPerson(int id);
    void addPerson(Person person);
    void addPersonList(List<Person> personList);

    List <Person> allPersons();
}
