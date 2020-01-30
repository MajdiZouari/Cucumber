package com.canal.cucumber.repositories;

import com.canal.cucumber.models.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author m.zouari
 */
public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
