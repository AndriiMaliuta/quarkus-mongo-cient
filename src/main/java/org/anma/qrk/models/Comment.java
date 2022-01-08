package org.anma.qrk.models;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@MongoEntity(collection = "comments", database = "people")
public class Comment {

    public ObjectId id;
    public String body;
    public String category;
    public LocalDateTime createdAt;
    public String authorId;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

//    public String getAuthorIdStr() {
//        return authorIdStr;
//    }
//
//    public void setAuthorIdStr(String authorIdStr) {
//        this.authorIdStr = authorIdStr;
//    }
}
