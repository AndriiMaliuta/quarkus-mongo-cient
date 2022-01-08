package org.anma.qrk.repo;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.anma.qrk.models.Comment;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CommentRepo implements PanacheMongoRepository<Comment> {


}
