package org.anma.qrk.contr;

import org.anma.qrk.models.Car;
import org.anma.qrk.models.web.CarWeb;
import org.anma.qrk.serv.CarService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/cars")
public class CarResource {

    @Inject
    CarService carService;

    @GET
    public List<CarWeb> list() {

        return carService.allCars();
    }

    @POST
    public List<Car> add(Car car) {
        carService.add(car);
        return list();
    }

}