package be.intecbrussel.spring.personmvc.data.implementations;

import be.intecbrussel.spring.personmvc.data.PersonDao;
import be.intecbrussel.spring.personmvc.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PersonJpaDaoImpl implements PersonDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public boolean createPerson(Person person) {
        entityManager.persist(person);
        return false;
    }

    @Override
    @Transactional
    public Person readPerson(int read) {
        return entityManager.find(Person.class,read);
    }

    @Override
    @Transactional
    public boolean updatePerson(Person person) {
        Person p =entityManager.find(Person.class,person.getId());
        if (p!=null) {
            p.setDateOfBirth(person.getDateOfBirth());
            p.setFirstName(person.getFirstName());
            p.getFirstName();
return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean deletePerson(Person person) {
        entityManager.remove(person);
        return true;
    }

    @Override
    @Transactional
    public List<Person> getAllPersons() {
        return entityManager.createQuery("SELECT p FROM Person p").getResultList();
    }
}
