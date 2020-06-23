package be.intecbrussel.spring.personmvc;


import be.intecbrussel.spring.personmvc.data.PersonDao;
import be.intecbrussel.spring.personmvc.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PersonmvcApplication {

	public static void main(String[] args) {
		 SpringApplication.run(PersonmvcApplication.class, args);

	}

}
