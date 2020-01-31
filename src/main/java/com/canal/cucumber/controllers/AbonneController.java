package com.canal.cucumber.controllers;

import com.canal.cucumber.models.Abonne;
import com.canal.cucumber.services.AbonneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import java.util.List;
/**
 * @author m.zouari
 */
@RestController
@RequestMapping("api/v1/abonne")
public class AbonneController {

    private AbonneService abonneService;

    public AbonneController(AbonneService abonneService){
        this.abonneService = abonneService;
    }

    @PostMapping("")
    public ResponseEntity <Void> create (@RequestBody Abonne abonne, final BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,("Abonne not valid "));
        }
        return new ResponseEntity(abonneService.create(abonne),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity <Abonne> read (@PathVariable Long id) {
        try {
            Abonne abonne = abonneService.getAbonnebyId(id);
            return new ResponseEntity<Abonne>(abonne, HttpStatus.OK);
        } catch (EntityNotFoundException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Abonne not found");
        }
    }

    @PutMapping("")
    public ResponseEntity <Void> update (@RequestBody Abonne abonne, final BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,("Abonne not valid "));
        }
        return new ResponseEntity(abonneService.update(abonne),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Abonne>> getAll(){
        return ResponseEntity.ok(abonneService.getAll());
    }
}
