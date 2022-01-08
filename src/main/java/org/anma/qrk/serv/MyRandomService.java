package org.anma.qrk.serv;

import org.anma.qrk.models.Country;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@ApplicationScoped
public class MyRandomService {

    @Inject
    private  CountryService countryService;
    private final Random random = new Random();
    private String lorem = "Lorem ipsum dolor sit amet consectetur adipiscing, elit dictumst primis lacinia ante " +
            "habitasse dis, dignissim nec curae sociosqu montes hendrerit, donec parturient ";


    public String getColor() {
        return List.of("green", "red", "pink", "blue", "brown", "black", "yellow", "orange")
                .get(random.nextInt(8));
    }

    public String getCountryCode() {
        return countryService.findAll().stream()
                .map(Country::getCca2)
                .collect(Collectors.toList())
                .get(random.nextInt(countryService.findAll().size()));
    }

    public String getOrigin() {
        return countryService.findAll().stream()
                .map(Country::getName)
                .collect(Collectors.toList())
                .get(random.nextInt(countryService.findAll().size()));
    }

    public int getAge(int max) {
        return random.nextInt(max);
    }

    public String getBody(int length) {
        String[] words = lorem.split(" ");
        String body = "";
        for (int i = 0; i < length; i++) {
            body = body.concat(words[random.nextInt(words.length - 1)]).concat(" ");
        }
        return body;
    }

    public int getRandomSpeed() {
        return random.nextInt(350);
    }

    public String getRegistry() {
        return null;
    }
}
