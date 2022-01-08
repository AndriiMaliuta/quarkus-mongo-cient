package org.anma.qrk.serv.convert;

import org.anma.qrk.models.Comment;
import org.anma.qrk.models.web.CommentWeb;
import org.anma.qrk.repo.CommentRepo;
import org.anma.qrk.serv.MyRandomService;
import org.anma.qrk.serv.PersonService;
import org.apache.commons.lang3.RandomUtils;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.time.LocalDateTime;

@ApplicationScoped
public class CommentConverter {

    @Inject
    CommentRepo commentRepo;
    @Inject PersonService personService;

    public CommentWeb convert(Comment comment) {
        CommentWeb commentWeb = new CommentWeb();
        commentWeb.setBody(comment.getBody());
        commentWeb.setCategory(comment.getCategory());
        commentWeb.setCreatedAt(LocalDateTime.now());
        commentWeb.setAuthorId(comment.authorId);

        return commentWeb;
    }


}
