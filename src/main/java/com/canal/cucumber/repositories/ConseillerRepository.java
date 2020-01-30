package com.canal.cucumber.repositories;

import com.canal.cucumber.models.Conseiller;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author m.zouari
 */
public interface ConseillerRepository extends JpaRepository<Conseiller, Long> {
}
