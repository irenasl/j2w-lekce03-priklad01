package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CardController {

    @GetMapping("/")
    public ModelAndView card () {

//      "rucni" vytvoreni
//        Person person = new Person();
//         person.setGivenName("Jan");
//         person.setSurname("Palach");
//         person.setBirthDate(LocalDate.of(1948,8,11));

        // pres constructor:
        Person person = new Person("Uplne", "Jiny",LocalDate.of(1978,8,11));
        Address address = new Address("Kobližná 20", "Brno", "60200");

        ModelAndView card = new ModelAndView("card");
        card.addObject("person", person);       // předávám celý objekt
        card.addObject("address", address);

        return card;
    }
}
