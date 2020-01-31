package com.canal.cucumber;

import com.canal.cucumber.models.Adresse;

import java.util.HashMap;
import java.util.Map;

public class AdresseRepository {

    private static Map<String, Adresse> adresses = null;

    public AdresseRepository() {
        adresses = new HashMap<>();
        adresses.put("inactive_France", new Adresse("FACE", "inactive", "France", "sans date d'effet"));
        adresses.put("active_Pologne", new Adresse("EC", "active", "Pologne", "avec date d'effet"));
    }

    public Adresse findById(String id) {
        return adresses.get(id);
    }

    public Adresse update(Adresse adresse) {
        return adresses.put(adresse.getActive()+"_"+adresse.getPays(), adresse);
    }

}