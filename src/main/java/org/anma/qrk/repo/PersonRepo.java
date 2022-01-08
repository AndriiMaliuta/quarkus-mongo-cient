package org.anma.qrk.repo;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.anma.qrk.models.Person;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepo implements PanacheMongoRepository<Person> {

    public Person findByName(String name){
        return find("name", name).firstResult();
    }

//    public List<Person> findAlive(){
//        return list("status", Status.Alive);
//    }

    public void deleteLoics(){
        delete("name", "Loïc");
    }

}
