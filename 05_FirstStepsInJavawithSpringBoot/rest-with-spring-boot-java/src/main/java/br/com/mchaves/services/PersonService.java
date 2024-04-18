package br.com.mchaves.services;

import br.com.mchaves.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public List<Person> findAll() {
        logger.info("Finding all people!");
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person create(Person person) {
        logger.info("Creating one person");
        return person;
    }

    public Person update(Person person) {
        logger.info("Updating one person");
        return person;
    }
    public void delete(String id) {
        logger.info("Deleting one person");
    }


    public Person findByid(String id) {
        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirtName("Matheus");
        person.setLastName("Chaves");
        person.setAddress("Rua 3");
        person.setGender("Male");
        return person;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirtName("Person Name: " + i);
        person.setLastName("Last Name: " + i);
        person.setAddress("In Brazil: " + i);
        person.setGender("Male");
        return person;
    }

}
