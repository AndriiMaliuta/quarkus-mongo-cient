package org.anma.qrk.models;

import java.time.LocalDateTime;

public class Comment {

    public String body;
    public String category;
    public LocalDateTime createdAt;
    public String authorId;


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
