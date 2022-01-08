package org.anma.qrk.serv.convert;

import org.anma.qrk.models.Person;
import org.anma.qrk.models.web.PersonWeb;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonConverter {

    public PersonWeb convert(Person person) {
        PersonWeb personWeb = new PersonWeb();
        personWeb.setName(person.getName());
        personWeb.setAge(person.getAge());
        personWeb.setCars(person.getCars());
        personWeb.setStatus(person.getStatus());
        personWeb.setCountryCode(person.getCountryCode());
        personWeb.setEngaged(person.isEngaged());
        personWeb.setEmail(person.getEmail());
        personWeb.setHasChildren(person.isHasChildren());
        personWeb.setGender(person.getGender());
        personWeb.setFullName(person.getFullName());
        personWeb.setId(person.getId());
        return personWeb;
    }

}
