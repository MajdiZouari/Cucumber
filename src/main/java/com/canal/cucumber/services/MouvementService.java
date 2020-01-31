package com.canal.cucumber.services;

import com.canal.cucumber.models.Mouvement;
import com.canal.cucumber.repositories.MouvementRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author m.zouari
 */
@Service
@Transactional(rollbackFor = Throwable.class)
public class MouvementService {

    private MouvementRepository mouvementRepository;

    public MouvementService (MouvementRepository mouvementRepository){
        this.mouvementRepository = mouvementRepository;
    }

    public Mouvement create (Mouvement mouvement){
        return mouvementRepository.save(mouvement);
    }
}
