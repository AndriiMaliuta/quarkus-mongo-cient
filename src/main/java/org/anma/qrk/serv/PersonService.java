package org.anma.qrk.serv;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.anma.qrk.models.Country;
import org.anma.qrk.models.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PersonService {

    @Inject
    MongoClient mongoClient;

    List<Person> findAll() {




    }

    public String getPersRandomId() {
            return null;
    }


    private MongoCollection getCollection(){
        return mongoClient.getDatabase("people").getCollection("person");
    }

}
