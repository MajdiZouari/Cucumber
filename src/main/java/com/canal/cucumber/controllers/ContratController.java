package com.canal.cucumber.controllers;

import com.canal.cucumber.services.ContratService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author m.zouari
 */
@RestController
@RequestMapping("api/v1/contrat")
public class ContratController {

    private ContratService contratService;

    public ContratController (ContratService contratService){
        this.contratService = contratService;
    }
}
