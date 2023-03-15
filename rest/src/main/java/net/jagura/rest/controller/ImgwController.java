package net.jagura.rest.controller;

import lombok.RequiredArgsConstructor;
import net.jagura.rest.dto.ImgwDto;
import net.jagura.rest.service.ImgwService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ImgwController {

    private final ImgwService imgwService;

    @GetMapping("/synop")
    public ImgwDto getSynop() {
        return imgwService.getSynop();
    }
}
