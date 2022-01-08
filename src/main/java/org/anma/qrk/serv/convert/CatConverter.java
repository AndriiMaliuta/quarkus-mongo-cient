package org.anma.qrk.serv.convert;

import com.github.javafaker.Faker;
import org.anma.qrk.models.Cat;
import org.anma.qrk.models.web.CatWeb;
import org.anma.qrk.serv.PersonService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Random;

@ApplicationScoped
public class CatConverter {

    @Inject
    private PersonService personService;

    public Cat convert(CatWeb catWeb) {
        Cat cat = new Cat();
        cat.setId(catWeb.getId());
        cat.setAge(new Random().nextInt(17));
        cat.setCountryCodes(catWeb.getCountryCodes());;
        cat.setAdaptability(catWeb.getAdaptability());
        cat.setDogFriendly(catWeb.getDogFriendly());
        cat.setHairless(catWeb.getHairless());
        cat.setIndoor(catWeb.getIndoor());
        cat.setIntelligence(catWeb.getIntelligence());
        cat.setWikipediaUrl(catWeb.getWikipediaUrl());
        cat.setOrigin(catWeb.getOrigin());
        cat.setName(Faker.instance().cat().name());
        cat.setBreed(Faker.instance().cat().breed());
        cat.setRegistry(Faker.instance().cat().registry());
        cat.setPersonId(personService.getPersRandomId());        // todo - change to get real ids
        System.out.println("CatWeb converted to Cat");
        return cat;
    }

}
