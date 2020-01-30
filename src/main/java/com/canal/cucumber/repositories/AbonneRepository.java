package com.canal.cucumber.repositories;

import com.canal.cucumber.models.Abonne;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author m.zouari
 */
public interface AbonneRepository  extends JpaRepository<Abonne, Long> {
}
