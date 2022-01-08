package org.anma.qrk.serv.convert;

import org.anma.qrk.models.City;
import org.anma.qrk.models.web.CityWeb;
import org.anma.qrk.serv.CountryService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CityConverter {

    @Inject
    CountryService countryService;

    public City convert(CityWeb cityWeb) {
        City city = new City();
        city.setName(cityWeb.getCapital()[0]);
        city.setCode(cityWeb.getCca2());
        city.setContinent(String.join(",", cityWeb.getContinents()));
        city.setRegion(cityWeb.getRegion());
        city.setSubregion(cityWeb.getSubregion());
        city.setStatus(cityWeb.getStatus());
        city.setIndependent(cityWeb.isIndependent());
        city.setUnMember(cityWeb.isUnMember());
        city.setPopulation(cityWeb.getPopulation());
        return city;
    }

}
