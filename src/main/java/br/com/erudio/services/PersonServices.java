package br.com.erudio.services;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {
        logger.info("finding all people!");
        List<Person> persons = new ArrayList<Person>();

        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }

        return persons;
    }

    public Person findById(String id) {
        logger.info("Finding one Person");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Samuel");
        person.setLastName("Medeiros");
        person.setAddress("Paulista - PB");
        person.setGender("Male");

        return person;
    }

    public Person create(Person person) {
        logger.info("Finding create person");

        return person;
    }

    public Person update(Person person) {
        logger.info("Updating person");

        return person;
    }

    public void delete(String id) {
        logger.info("Delete person");

    }


    private Person mockPerson(int i) {
        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Person lastname " + i);
        person.setAddress("Some address in Brazil " + i);
        person.setGender("Person some gender " + i);

        return person;
    }

}
