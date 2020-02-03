# Cucumber
BDD scenario with cucumber

Ce projet contient une API Rest avec des tests cucumber.

Une base de données Postgresql a été utilisée pour le stockage des données.

L'accès à la BDD se fait par l'intermédiaire de Spring JPA.

Le modèle de données est représenté par les annotations Hibernate.

L'application est réparties sur differentes couches :

- Controllers
- Repositories
- Services
- Models

## Frameworks utilisés

- Springboot
- JPA
- Lombok
- Cucumber
- TestNg
- Serenity
- Mockito

## Installation

Lancez un terminal git et exécutez la commande suivante :
git clone https://github.com/MajdiZouari/Cucumber.git

Ensuite, installez le projet avec la commande :
mvn clean install

Pour lancer les tests, il suffit d'exécuter la commande :
mvn test

Les rapports Serenity sont publiés dans le dossier :
/target/site/serenity/index.html
