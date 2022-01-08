package org.anma.qrk.serv.convert;

import org.anma.qrk.models.City;
import org.anma.qrk.models.Country;
import org.anma.qrk.models.web.CityWeb;
import org.anma.qrk.models.web.CountryWeb;
import org.anma.qrk.models.web.Name;
import org.anma.qrk.serv.CountryService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class CountryConverter {

    @Inject
    CountryService countryService;

    public CountryWeb convert(Country country) {
        CountryWeb countryWeb = new CountryWeb();
        Name name = new Name();
        name.setOfficial(country.getName());
        countryWeb.setName(name);
        countryWeb.setCca2(country.getCca2());
        countryWeb.setContinents(new String[] {country.getContinents()});
        countryWeb.setRegion(country.getRegion());
        countryWeb.setStatus(country.getStatus());
        countryWeb.setIndependent(country.isIndependent());
        countryWeb.setUnMember(country.getUnMember());
        countryWeb.setPopulation(country.getPopulation());
        countryWeb.setCapital(new String[] {country.getCapital()});
//        countryWeb.setCountryId(country.getId());
        return countryWeb;
    }

}
