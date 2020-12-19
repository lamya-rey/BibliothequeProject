# BibliothequeProject
#Bienvenue à notre projet de fin semestre 👋
(Notre projet a pour objectif la gestion  d'une bibliothèque)
***
##Réalisé par groupe numéro 11
(Lamya Rayess, Ahlem Fahem, Abdellah Abouhanifa)
***
##Les models
* User

(id, name, age, category, email, userName, nbrEmpr)

Les utilisateurs sont categorisés par leur age Enfant < 13, 13 < Ado < 18, 18 < Adulte

* Book 

(id, title, isbn, category, user)

Un livre a une categorie (enfant (0-13 ans), ado (13-18 ans), adulte)

* Comment

(id, content, title, book, user)
***
##Les API

Pour chaque model, vous pouvez récupérer tous les donnés, les ajouter, les supprimer ou les modifier.

* Récupérer: getAll

* Recherche: findByTitle (pour Book et Comment) ainsi que findByName (pour User)

* Ajouter: save

* Modifier: update

* Supprimer: deleteAll et deleteById

* Règles de gestion: 

Un utilisateur ne peut emprunter que 3 livres au maximum

Un enfant ne peut pas emprunter un livre "ado" ou "adulte"

Un ado ne peut pas enprunter un livre "adulte"

***
##Utilisation des API avec navigateur:

On exéxutant l'application vous pouvez tester sur votre navigateur ou sur postman.
 
* url

localhost:8080

* Pour récupérer  les objets d'un model. On ajoute le path du model à l'URL.
  
  Par exemple: localhost:8080/user/
  
  Cet URL récupère tout les utilisateurs de la base de donnée.
***
  
##Test des API avec Postman :
  
Toute une collection des tests des api dans notre fichier postman qui se trouve dans le package api.

* Exemple d'un test dans postman:

Si vous souhaitez apporter des modifications à la base de donnée.

Par exemple: DELETE localhost:8080/user/1

Cette requête supprime l'utilisateur de l'ID 1.
