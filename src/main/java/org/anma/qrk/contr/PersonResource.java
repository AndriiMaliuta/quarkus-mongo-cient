package org.anma.qrk.contr;

import org.anma.qrk.models.Car;
import org.anma.qrk.models.web.CarWeb;
import org.anma.qrk.models.web.PersonWeb;
import org.anma.qrk.repo.PersonRepo;
import org.anma.qrk.serv.CarService;
import org.anma.qrk.serv.PersonService;
import org.anma.qrk.serv.convert.CarConverter;
import org.anma.qrk.serv.convert.PersonConverter;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/cars")
public class PersonResource {

    @Inject
    PersonService personService;
    @Inject
    PersonConverter personConverter;
    @Inject
    PersonRepo personRepo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersonWeb> list() {

        return personRepo.findAll()
                .stream()
                .map(c -> personConverter.convert(c))
                .collect(Collectors.toList());
    }

    @Path("/{personId}")
    @GET
    public PersonWeb personById(@PathParam("personId") String personId) {
        ObjectId objectId = new ObjectId(personId);
        return personConverter.convert(personRepo.findById(objectId));
    }

}