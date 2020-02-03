package com.canal.cucumber;

import com.canal.cucumber.models.Abonne;
import com.canal.cucumber.models.Adresse;
import com.canal.cucumber.models.Conseiller;
import com.canal.cucumber.models.Mouvement;
import com.canal.cucumber.services.AbonneService;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
/**
 * @author m.zouari
 */
public class StepsDef extends SpringBootBaseIntegrationTest{

    @Mock
    AbonneService abonneService;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Given("^un abonne avec une adresse principale inactive en France$")
    public void un_abonne_avec_une_adresse_principale_inactive_en_France() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Adresse adresse = new Adresse();
        adresse.setAdresse("1 Place du Spectacle, 92130 Issy-les-Moulineaux");
        adresse.setPays("France");
        adresse.setPrincipale(true);
        adresse.setActive(false);

        List<Adresse> adresses = new ArrayList<>();
        adresses.add(adresse);

        Abonne abonne = new Abonne();
        abonne.setNom("ZOUARI");
        abonne.setPrenom("Majdi");
        abonne.setAdresses(adresses);

        Abonne savedAbonne = new Abonne();
        Mockito.when(abonneService.create(abonne)).thenReturn(abonne);
        savedAbonne = abonneService.create(abonne);
        Assert.assertEquals(savedAbonne.getAdresses(),abonne.getAdresses());
        Assert.assertEquals(savedAbonne.getNom(), abonne.getNom());
        Assert.assertEquals(savedAbonne.getPrenom(), abonne.getPrenom());
    }

    @When("^le conseiller connecte a FACE modifie l'adresse de l'abonne sans date d’effet$")
    public void le_conseiller_connecte_a_FACE_modifie_l_adresse_de_l_abonne_sans_date_d_effet() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Conseiller conseiller = new Conseiller();
        conseiller.setMatricule(007L);
        conseiller.setNom("Rousselet");
        conseiller.setPrenom("André");

        Adresse adresse = new Adresse();
        adresse.setAdresse("1 Place du Spectacle, 92130 Issy-les-Moulineaux");
        adresse.setPays("France");
        adresse.setPrincipale(true);
        adresse.setActive(false);

        Mouvement mouvement =  new Mouvement();
        mouvement.setCanal("FACE");

        List<Mouvement> mouvements = new ArrayList<>();
        mouvements.add(mouvement);

        adresse.setAdresse("44T Quai du Point du Jour, 92100 Boulogne-Billancourt");
        adresse.setMouvements(mouvements);


    }

    @Then("^l'adresse de l'abonne modifiee est enregistree sur l'ensemble des contrats de l'abonne$")
    public void l_adresse_de_l_abonne_modifiee_est_enregistree_sur_l_ensemble_des_contrats_de_l_abonne() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^un mouvement de modification d'adresse est cree$")
    public void un_mouvement_de_modification_d_adresse_est_cree() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^un abonne avec une adresse principale active en Pologne$")
    public void un_abonne_avec_une_adresse_principale_active_en_Pologne() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^le conseiller connecte a EC modifie l'adresse de l'abonne avec date d’effet$")
    public void le_conseiller_connecte_a_EC_modifie_l_adresse_de_l_abonne_avec_date_d_effet() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
