package org.anma.qrk.serv.convert;

import org.anma.qrk.models.Car;
import org.anma.qrk.models.web.CarWeb;
import org.anma.qrk.serv.MyRandomService;
import org.anma.qrk.serv.PersonService;
import org.apache.commons.lang3.RandomUtils;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CarConverter {

    @Inject
    MyRandomService randomService;
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
        CarWeb carWeb = new CarWeb();
        carWeb.setCarId(car.getCarId());
//        car.setId(UUID.randomUUID().toString());
        carWeb.setAge(RandomUtils.nextInt(0, 30));
        carWeb.setModel(car.getModel());   //brand -> model
        carWeb.setPersonId(personService.getPersRandomId());
        carWeb.setCountryCodes(randomService.getCountryCode()); // empty
        carWeb.setOrigin(randomService.getOrigin()); // empty
        carWeb.setColor(randomService.getColor());   // empty
        carWeb.setRegistry(car.getRegistry());
        carWeb.setMaxSpeed(randomService.getRandomSpeed());
        return carWeb;
    }
}
