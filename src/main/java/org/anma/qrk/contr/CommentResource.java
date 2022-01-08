package org.anma.qrk.contr;

import org.anma.qrk.models.Comment;
import org.anma.qrk.models.web.CommentWeb;
import org.anma.qrk.repo.CommentRepo;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/comment")
public class CommentResource {

    @Inject
    CommentRepo commentRepo;

    @GET
    public List<Comment> comments() {
//        commentRepo.findAll().stream().map(c -> )
        return commentRepo.findAll().list();
    }
}
