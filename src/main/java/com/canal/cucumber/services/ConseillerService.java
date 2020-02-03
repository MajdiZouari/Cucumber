package com.canal.cucumber.services;

import com.canal.cucumber.models.Conseiller;
import com.canal.cucumber.repositories.ConseillerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * @author m.zouari
 */
@Service
@Transactional(rollbackFor = Throwable.class)
public class ConseillerService {

    private ConseillerRepository conseillerRepository;

    public ConseillerService (ConseillerRepository conseillerRepository){
        this.conseillerRepository = conseillerRepository;
    }

    public Conseiller create (Conseiller conseiller){
        return conseillerRepository.save(conseiller);
    }

    public Conseiller update (Conseiller conseiller){
        return conseillerRepository.save(conseiller);
    }
}
