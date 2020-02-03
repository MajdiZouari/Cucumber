package com.canal.cucumber.controllers;

import com.canal.cucumber.services.AdresseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author m.zouari
 */
@RestController
@RequestMapping("api/v1/adresse")
public class AdresseController {

    private AdresseService adresseService;

    public AdresseController (AdresseService adresseService){
        this.adresseService = adresseService;
    }
}
