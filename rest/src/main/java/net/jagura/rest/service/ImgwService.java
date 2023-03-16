package net.jagura.rest.service;

import net.jagura.rest.model.ImgwDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImgwService {

    private RestTemplate restTemplate = new RestTemplate();

    public ImgwDto getSynop() {
        String response = restTemplate.getForObject("http://danepubliczne.imgw.pl/api/data/synop/station/sniezka",
                String.class);
        return null;
    }
}
