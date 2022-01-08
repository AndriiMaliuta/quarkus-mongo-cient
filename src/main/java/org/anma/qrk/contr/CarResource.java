package org.anma.qrk.contr;

import org.anma.qrk.models.Car;
import org.anma.qrk.models.web.CarWeb;
import org.anma.qrk.serv.CarService;
import org.anma.qrk.serv.convert.CarConverter;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

@Path("/cars")
public class CarResource {

    @Inject
    CarService carService;
    @Inject
    CarConverter carConverter;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CarWeb> list() {

        return carService.allCars()
                .stream()
                .map(c -> carConverter.convert(c))
                .collect(Collectors.toList());
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Car add(Car car) {
        carService.add(car);
        return car;
    }

}