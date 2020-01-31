package com.canal.cucumber.controllers;

import com.canal.cucumber.models.Abonne;
import com.canal.cucumber.models.Mouvement;
import com.canal.cucumber.services.MouvementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * @author m.zouari
 */
@RestController
@RequestMapping("api/v1/mouvement")
public class MouvementController {

    private MouvementService mouvementService;

    public MouvementController (MouvementService mouvementService) {
        this.mouvementService = mouvementService;
    }

    @PostMapping("")
    public ResponseEntity<Void> create (@RequestBody Mouvement mouvement, final BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,("Mouvement not valid "));
        }
        return new ResponseEntity(mouvementService.create(mouvement),HttpStatus.CREATED);
    }
}
