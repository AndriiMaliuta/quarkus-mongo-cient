package org.anma.qrk.serv;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.anma.qrk.models.Country;
import org.bson.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CountryService {

    @Inject
    MongoClient mongoClient;

    public List<Country> findAll() {

        List<Country> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                Country country = new Country();
                country.setArea(document.getLong("area"));
                country.setPopulation(document.getLong("population"));
                country.setBorders(document.getString("borders"));
                country.setCode(document.getString("code"));
                country.setCapital(document.getString("capital"));
                country.setCca2(document.getString("cca2"));
                country.setContinents(document.getString("continents"));
                country.setRegion(document.getString("region"));
                country.setLanguages(document.getString("languages"));
                country.setStatus(document.getString("status"));
                country.setIndependent(document.getBoolean("independent"));
                list.add(country);
            }
        } finally {
            cursor.close();
        }
        return list;

    }

    //todo - check for logic
    public String getRandomId() {

        Document country = (Document) getCollection().find().first();

        return country.getObjectId("_id").toString();
    }



    private MongoCollection getCollection(){
        return mongoClient.getDatabase("people").getCollection("country");
    }

    public Country getByCapital(String s) {
        return null;
    }
}
