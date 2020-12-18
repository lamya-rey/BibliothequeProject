# BibliothequeProject
#Bienvenue à notre projet de fin semestre 👋
(Notre projet a comme objectif de gérer une bibliothèque)
***
##Réalisé par groupe numéro 11
(Lamya Rayess, Ahlem Fahem, Abdellah Abouhanifa)
***
##Les Classes
* User

(id, name, age, category, email, userName, nbrEmpr)

Les utilisateurs sont categorises par leur age Enfant < 13, 13 < Ado < 18, 18 < Adulte

* Book 

(id, title, isbn, category, user)

Un livre a une categorie (enfant (0-13 ans), ado (13-18 ans), adulte)

* Comment

(id, content, title, book, user)
***
##Les API

Pour chaque classe, vous pouvez récupérer tous les objets de ce type dans la base de données, les ajouter, les supprimer ou les modifier.

* Récupérer: /getAll

* Recherche: /findByTitle (pour Book et Comment) ainsi que /findByName (pour User)

* Ajouter: /add/

* Modifier: /update/

* Supprimer: /deleteAll et /delete/{id}

* Authentification: 

Un utilisateur ne peut emprunter que 3 livres maximum

Un enfant ne peut pas emprunter un livre "ado" ou "adulte"

Un ado ne peut pas enprunter un livre "adulte"

***
##Utilisation des API avec navigateur:

On lance l'application et on démarre notre navigateur Internet.
 
* url

localhost:8080

* Si on souhaitez récupérer tous les objets d'une classe. On ajoute la classe à la fin de l'URL.
  
  Par exemple: localhost:8080/user/
  
  Cette requête récupère tout les utilisateurs dans la base.
***
  
##Test des API avec Postman :
  
Toute une collection des tests des api dans notre fichier postman qui se trouve dans package api

* Exemple d'un test dans postman:

Si vous souhaitez apporter des modifications à la base de données.

Par exemple: DELETE localhost:8080/user/1

Cette requête supprime l'utilisateur qui a l'ID 1.
