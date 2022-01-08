package org.anma.qrk.repo;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.anma.qrk.models.City;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CityRepo implements PanacheMongoRepository<City> {


}
