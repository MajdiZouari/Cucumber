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
public class Abonne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="abonne_id")
    private Long abonneId;

    private String nom;
    private String prenom;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
    @JoinColumn(name = "abonne_id")
    private List<Adresse> adresses = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
    @JoinColumn(name = "abonne_id")
    private List<Contrat> contrats = new ArrayList<>();
}
