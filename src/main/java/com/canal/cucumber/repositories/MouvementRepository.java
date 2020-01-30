package com.canal.cucumber.repositories;

import com.canal.cucumber.models.Mouvement;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author m.zouari
 */
public interface MouvementRepository extends JpaRepository<Mouvement, Long> {
}
