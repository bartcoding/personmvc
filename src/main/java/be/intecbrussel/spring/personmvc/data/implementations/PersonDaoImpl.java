package be.intecbrussel.spring.personmvc.data.implementations;



import be.intecbrussel.spring.personmvc.data.PersonDao;
import be.intecbrussel.spring.personmvc.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    private List<Person> persondb = new ArrayList<Person>();


    @Override
    public boolean createPerson(Person person) {
        for(int i = 0; i < persondb.size(); i++){
            if(persondb.get(i).getId() == person.getId()){
                return false;
            }else {
                persondb.add(person);

            }
        }return true;
    }

    @Override
    public Person readPerson(int id) {
        for (int i = 0; i < persondb.size(); i++) {
            if (persondb.get(i).getId() == id) {
                return persondb.get(i);
            }
        }
            return null;
        }

    @Override
    public boolean updatePerson(Person person) {
        for(int i = 0; i < persondb.size(); i++){
            if(persondb.get(i).getId() == person.getId()){
                persondb.set(i,person);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deletePerson(Person person) {
        for(int i = 0; i < persondb.size(); i++){
            if(persondb.get(i).getId() == person.getId()){
                persondb.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Person> getAllPersons() {
        return persondb;
    }
}
