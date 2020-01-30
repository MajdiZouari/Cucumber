package com.canal.cucumber.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
/**
 * @author m.zouari
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mouvement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="mouvement_id")
    private Long mouvementId;

    private String canal;
    private LocalDate dateEffet;
}