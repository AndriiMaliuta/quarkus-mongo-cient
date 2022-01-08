package org.anma.qrk.serv.convert;

import org.anma.qrk.models.Car;
import org.anma.qrk.models.web.CarWeb;
import org.anma.qrk.serv.MyRandomService;
import org.anma.qrk.serv.PersonService;
import org.apache.commons.lang3.RandomUtils;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CarConverterImpl {


    @Inject
    private MyRandomService randomService;
    @Inject
    PersonService personService;

    public Car convert(CarWeb carWeb) {
        Car car = new Car();
        car.setCarId(carWeb.getCarId());
//        car.setId(UUID.randomUUID().toString());
        car.setAge(RandomUtils.nextInt(0, 30));
        car.setModel(carWeb.getBrand());   //brand -> model
        car.setPersonId(personService.getPersRandomId());
        car.setCountryCodes(randomService.getCountryCode()); // empty
        car.setOrigin(randomService.getOrigin()); // empty
        car.setColor(randomService.getColor());   // empty
        car.setRegistry(carWeb.getRegistry());
        car.setMaxSpeed(randomService.getRandomSpeed());

        return car;
    }

    public CarWeb convert(Car car) {
        return null;
    }
}
