package com.canal.cucumber;
import com.canal.cucumber.repositories.AbonneRepository;
import com.canal.cucumber.services.AbonneService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    String active;
    String pays;
    Adresse adresseModel;
    Adresse actual;

    @Given("un abonne avec une adresse principale inactive en France")
    public void un_abonne_avec_une_adresse_principale_inactive_en_France() {
        actual = adresseRepository.findById("inactive_France");
    }

    @When("le conseiller connecte a FACE modifie l'adresse de l'abonne sans date dÆeffet")
    public void le_conseiller_connecte_a_FACE_modifie_l_adresse_de_l_abonne_sans_date_d_effet() {
        if(actual.getPays().equals("France") && actual.getCanal().equals("FACE"))
            actual.setCondition("sans date d’effet");
    }

    @Then("l'adresse de l'abonne modifiee est enregistree sur l'ensemble des contrats de l'abonne")
    public void l_adresse_de_l_abonne_modifiee_est_enregistree_sur_l_ensemble_des_contrats_de_l_abonne() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("un mouvement de modification d'adresse est cree")
    public void un_mouvement_de_modification_d_adresse_est_cree() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("un abonne avec une adresse principale active en Pologne")
    public void un_abonne_avec_une_adresse_principale_active_en_Pologne() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("le conseiller connecte a EC modifie l'adresse de l'abonne avec date dÆeffet")
    public void le_conseiller_connecte_a_EC_modifie_l_adresse_de_l_abonne_avec_date_d_effet() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}