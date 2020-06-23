package be.intecbrussel.spring.personmvc.controller;

import be.intecbrussel.spring.personmvc.model.Person;
import be.intecbrussel.spring.personmvc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonController {

    private PersonService personService;



    @GetMapping("/")
    public String showPersons(Model model){
        List<Person> personList = personService.allPersons();
        model.addAttribute("persons", personList);
        return "persons";
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}
