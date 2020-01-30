package com.canal.cucumber.services;

import com.canal.cucumber.models.Abonne;
import com.canal.cucumber.repositories.AbonneRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AbonneService {

    private final AbonneRepository abonneRepository;

    public AbonneService(AbonneRepository abonneRepository){
        this.abonneRepository = abonneRepository;
    }

    public Abonne create (Abonne abonne){
        return abonneRepository.save(abonne);
    }

    public Abonne getAbonnebyId (Long id){
        return abonneRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<Abonne> getAll() {
        return abonneRepository.findAll();
    }
}
