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
public class Conseiller implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="conseiller_id")
    private Long conseillerId;

    private Long matricule;
    private String nom;
    private String prenom;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
    @JoinColumn(name = "conseiller_id")
    private List<Mouvement> mouvements = new ArrayList<>();
}