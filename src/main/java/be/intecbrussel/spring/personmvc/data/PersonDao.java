package be.intecbrussel.spring.personmvc.data;


import be.intecbrussel.spring.personmvc.model.Person;

import java.util.List;

public interface PersonDao {

    boolean createPerson(Person person);
    Person readPerson(int read);
    boolean updatePerson(Person person);
    boolean deletePerson(Person person);
    List<Person> getAllPersons();
}
