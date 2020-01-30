package com.canal.cucumber.repositories;

import com.canal.cucumber.models.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author m.zouari
 */
public interface AdresseRepository extends JpaRepository<Adresse, Long> {
}
