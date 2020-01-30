package com.canal.cucumber.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * @author m.zouari
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Adresse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="adresse_id")
    private Long adresseId;

    private String adresse;
    private String pays;
    private boolean active;
    private boolean principale;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
    @JoinColumn(name = "adresse_id")
    private List<Mouvement> mouvements = new ArrayList<>();
}
