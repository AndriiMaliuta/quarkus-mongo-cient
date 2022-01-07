package org.acme.mongodb;

import org.acme.mongodb.models.Car;
import org.acme.mongodb.serv.CarService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/cars")
public class CarResource {

    @Inject
    CarService carService;

    @GET
    public List<Car> list() {
        return carService.allCars();
    }

    @POST
    public List<Car> add(Car car) {
        carService.add(car);
        return list();
    }

}