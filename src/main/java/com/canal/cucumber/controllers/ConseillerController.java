package com.canal.cucumber.controllers;

import com.canal.cucumber.services.ConseillerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author m.zouari
 */
@RestController
@RequestMapping("api/v1/conseiller")
public class ConseillerController {

    private ConseillerService conseillerService;

    public ConseillerController (ConseillerService conseillerService){
        this.conseillerService = conseillerService;
    }
}
