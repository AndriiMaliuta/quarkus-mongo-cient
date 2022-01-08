package org.anma.qrk.repo;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.anma.qrk.models.Person;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepo implements PanacheMongoRepository<Person> {


}
