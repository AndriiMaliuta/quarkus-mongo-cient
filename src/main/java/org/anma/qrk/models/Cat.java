package org.anma.qrk.models;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;
import org.jboss.logging.annotations.Field;

import java.util.List;

@MongoEntity(collection = "cats")
public class Cat extends PanacheMongoEntity {

    ObjectId id;
    String catId;
     String name;
     String color;
     String breed;
     String registry;
     String origin;
     String wikipediaUrl;
     int age;
     int indoor;
     int adaptability;
     int dogFriendly;
     int intelligence;
     int hairless;
     String personId;
     String countryCodes;

    public static List<Cat> findByModel(String name) {
        return find("name", name).firstResult();
    }

    public static List<Cat> findByAge(int age) {
        return find("age", age).firstResult();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catId='" + catId + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", registry='" + registry + '\'' +
                ", origin='" + origin + '\'' +
                ", wikipediaUrl='" + wikipediaUrl + '\'' +
                ", age=" + age +
                ", indoor=" + indoor +
                ", adaptability=" + adaptability +
                ", dogFriendly=" + dogFriendly +
                ", intelligence=" + intelligence +
                ", hairless=" + hairless +
                ", personId='" + personId + '\'' +
                ", countryCodes='" + countryCodes + '\'' +
                '}';
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIndoor() {
        return indoor;
    }

    public void setIndoor(int indoor) {
        this.indoor = indoor;
    }

    public int getAdaptability() {
        return adaptability;
    }

    public void setAdaptability(int adaptability) {
        this.adaptability = adaptability;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHairless() {
        return hairless;
    }

    public void setHairless(int hairless) {
        this.hairless = hairless;
    }

    public int getDogFriendly() {
        return dogFriendly;
    }

    public void setDogFriendly(int dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
    }

    public String getWikipediaUrl() {
        return wikipediaUrl;
    }

    public void setWikipediaUrl(String wikipediaUrl) {
        this.wikipediaUrl = wikipediaUrl;
    }
}