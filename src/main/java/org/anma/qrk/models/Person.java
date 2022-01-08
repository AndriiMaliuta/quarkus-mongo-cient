package org.anma.qrk.models;

import io.quarkus.mongodb.panache.common.MongoEntity;

import java.time.LocalDateTime;

@MongoEntity(collection = "person", database = "people")
public class Person {

    private String personId;
    private Long num;
    private String name;
    private String fullName;
    private String email;
    private String gender;
    private String status;
    private int age;
    private int cars;
    private String countryCode;
    private boolean hasChildren;
    private boolean engaged;
    private LocalDateTime createdAt = LocalDateTime.now();
    private String countryId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public boolean isEngaged() {
        return engaged;
    }

    public void setEngaged(boolean engaged) {
        this.engaged = engaged;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", id=" + num +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                ", countryCode='" + countryCode + '\'' +
                ", hasChildren=" + hasChildren +
                ", engaged=" + engaged +
                ", createdAt=" + createdAt +
                ", countryId='" + countryId + '\'' +
                '}';
    }
}
