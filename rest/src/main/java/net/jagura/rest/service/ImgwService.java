package net.jagura.rest.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.jagura.rest.dto.ImgwDto;
import net.jagura.rest.webclient.prognose.ImgwClient;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ImgwService {

    private final ImgwClient imgwClient;

    public ImgwDto getSynop() {
        return imgwClient.getSynopForStation("sniezka");
    }
}
