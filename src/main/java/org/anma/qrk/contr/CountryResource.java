package org.anma.qrk.contr;

import org.anma.qrk.models.Country;
import org.anma.qrk.models.web.CountryWeb;
import org.anma.qrk.serv.CountryService;
import org.anma.qrk.serv.convert.CountryConverter;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;
import java.util.stream.Collectors;

@Path("country")
public class CountryResource {

    @Inject
    CountryService countryService;
    @Inject
    CountryConverter countryConverter;

    @GET
    public List<CountryWeb> getAll() {
        return countryService.findAll()
                .stream().map(c -> countryConverter.convert(c)).collect(Collectors.toList());
    }
}
