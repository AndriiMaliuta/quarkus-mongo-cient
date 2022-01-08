package org.anma.qrk.serv;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.anma.qrk.models.Car;
import org.anma.qrk.models.Country;
import org.bson.Document;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class CountryService {

    @Inject
    MongoClient mongoClient;

    List<Country> findAll() {

        List<Country> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                Country country = new Country();
                country.setArea(document.getLong("area"));
                country.setBorders(document.getInteger("age"));
                country.setBorders(document.getInteger("age"));
                country.setBorders(document.getInteger("age"));
                country.setBorders(document.getInteger("age"));
                country.setBorders(document.getInteger("age"));
                country.setBorders(document.getInteger("age"));
                list.add(country);
            }
        } finally {
            cursor.close();
        }
        return list;

    }



    private MongoCollection getCollection(){
        return mongoClient.getDatabase("people").getCollection("country");
    }

}
