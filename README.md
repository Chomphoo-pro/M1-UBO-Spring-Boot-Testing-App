# Fork du projet

clone: git://github.com/Prakkkmak/M1-UBO-Spring-Boot-Testing-App.git
source: https://traveling-seaplane-72f.notion.site/TP-API-M1-INFORMATIQUE-SPRING-BOOT-5b267fc667374ad3a5f5a528e7b2ff1c

# RENDU SPRING BOOT
##### Chomphoo LE BEUX


1) Changement des propriétés de connection dans application.properties

## Exercice 3
# Où est le point d’entrée ?
Dans le fichier Controller: localhost:8080/dogs

# Quels sont les URL à appeler pour utiliser l’API ?
- getDogs(GET): localhost:8080/dogs
- getDog(GET): localhost:8080/dogs/1
- saveDog(POST): localhost:8080/dogs + Body>RAW>JSON
- deleteDog(DELETE): localhost:8080/dogs/1

# Identifier le format Controller → Service → Repository
- Controller: Gestion de l'interface REST - Contient les points d'entrées de l'API
- Service: Contient les différents services disponibles
- Repository: Enregistre et récupère les données


# Test unitaire
dans le dossier build.gradle j'ai ajouter cette ligne dans les dépendances : implementation 'org.springdoc:springdoc-openapi-ui:1.6.5'
Nous pouvons ensuite avoir la documentation sur le lien: http://localhost:8080/swagger-ui/index.html


Récupération d'utilisateur(GET): localhost:8080/utilisateurs
Ajout d'utilisateur(POST): localhost:8080/utilisateurs (dans le body > row > JSON)
{
    "login":"chomphoo",
    "prenom":"chomphoo",
    "nom":"LE BEUX"
}
Suppression d'utilisateur(DELETE): localhost:8080/utilisateurs/chomphoo