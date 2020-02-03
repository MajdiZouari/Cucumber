package com.canal.cucumber.services;

import com.canal.cucumber.models.Contrat;
import com.canal.cucumber.repositories.ContratRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author m.zouari
 */
@Service
@Transactional(rollbackFor = Throwable.class)
public class ContratService {

    private ContratRepository contratRepository;

    public ContratService (ContratRepository contratRepository){
        this.contratRepository = contratRepository;
    }

    public Contrat create (Contrat contrat){
        return contratRepository.save(contrat);
    }
}
