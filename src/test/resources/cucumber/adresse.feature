# Created by MZouari on 01/29/2020

  # The feature that contains scenarios,  It’s a good idea to use a name similar to the file name.
Feature: adresse
  Tester que la modification de l'adresse d'un abonne est propagee sur ses contrats et qu'un mouvement de modification
  d'adresse est cree

  # The scenario : a concrete example illustrating how the software should behave.
  Scenario Outline: Client veut modifier l'adresse d'un abonne residant en France sans ou avec date d'effet
    # The steps : This is what Cucumber will execute.
    Given un abonne avec une adresse principale <active> en <pays>
    When le conseiller connecte a <canal> modifie l'adresse de l'abonne <condition>
    Then l'adresse de l'abonne modifiee est enregistree sur l'ensemble des contrats de l'abonne
    And un mouvement de modification d'adresse est cree

    # Use of variables and examples
    Examples:
      | canal | active   | pays    | condition         |
      | FACE  | inactive | France  | sans date d’effet |
      | EC    | active   | Pologne | avec date d’effet |