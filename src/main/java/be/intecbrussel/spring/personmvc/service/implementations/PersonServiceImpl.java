package be.intecbrussel.spring.personmvc.service.implementations;


import be.intecbrussel.spring.personmvc.data.PersonDao;
import be.intecbrussel.spring.personmvc.model.Person;
import be.intecbrussel.spring.personmvc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;

    @Autowired
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public Person getPerson(int id) {
        return personDao.readPerson(id);
    }

    @Override
    public void addPerson(Person person) {
        if(personDao.createPerson(person)){
            System.out.println("Person created:" + person);
        }
        else{
            System.out.println("Creating person failed.");
        }
    }

    @Override
    public void addPersonList(List<Person> personList) {
        for(Person p: personList){
            if(personDao.createPerson(p)){
                System.out.println("Person created in list:" + p);
            }else{
                System.out.println("Failed to make this person:" + p);
            }
        }
    }

    @Override
    public List<Person> allPersons() {
        return personDao.getAllPersons();
    }
}
