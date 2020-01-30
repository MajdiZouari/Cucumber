package com.canal.cucumber.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
/**
 * @author m.zouari
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="contrat_id")
    private Long contratId;

    private Long numero;
}
