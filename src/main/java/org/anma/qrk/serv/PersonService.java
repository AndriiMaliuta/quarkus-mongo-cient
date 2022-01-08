package org.anma.qrk.serv;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.anma.qrk.models.Person;
import org.bson.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PersonService {

    @Inject
    MongoClient mongoClient;

    List<Person> findAll() {

        List<Person> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                Person person = new Person();
                person.setAge(document.getInteger("age"));
                person.setName(document.getString("name"));
                person.setFullName(document.getString("fullName"));
                person.setEmail(document.getString("email"));
                person.setGender(document.getString("gender"));
                person.setStatus(document.getString("status"));
                person.setCars(document.getInteger("cars"));
                person.setCountryCode(document.getString("countryCode"));
                person.setHasChildren(document.getBoolean("hasChildren"));
                person.setEngaged(document.getBoolean("engaged"));
//                person.setCountryId();

                list.add(person);
            }
        } finally {
            cursor.close();
        }
        return list;

    }

    public String getPersRandomId() {
            return null;
    }


    private MongoCollection getCollection(){
        return mongoClient.getDatabase("people").getCollection("person");
    }

}
