package com.canal.cucumber.services;

import com.canal.cucumber.models.Adresse;
import com.canal.cucumber.repositories.AdresseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author m.zouari
 */
@Service
@Transactional(rollbackFor = Throwable.class)
public class AdresseService {

    private AdresseRepository adresseRepository;

    public AdresseService (AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    public Adresse create (Adresse adresse){
        return adresseRepository.save(adresse);
    }

    public Adresse update (Adresse adresse){
        return adresseRepository.save(adresse);
    }
}
