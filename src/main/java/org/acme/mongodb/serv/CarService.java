package org.acme.mongodb.serv;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.acme.mongodb.models.Car;
import org.bson.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarService {

    @Inject
    MongoClient mongoClient;

    private MongoCollection getCollection(){
        return mongoClient.getDatabase("people").getCollection("cars");
    }

    public List<Car> allCars() {
        List<Car> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                Car car = new Car();
                car.setColor(document.getString("color"));
                car.setAge(document.getInteger("age"));
                list.add(car);
            }
        } finally {
            cursor.close();
        }
        return list;

    }

    public void add(Car car){
        Document document = new Document()
                .append("model", car.getModel())
                .append("age", car.getAge())
                .append("registry", car.getRegistry())
                .append("origin", car.getOrigin())
                .append("createdAt", LocalDateTime.now())
                .append("countryCodes", car.getCountryCodes())
                .append("maxSpeed", car.getMaxSpeed())
                .append("personId", car.getPersonId());
        getCollection().insertOne(document);
    }
}
