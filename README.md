# BibliothequeProject
#Bienvenue à notre projet de fin semestre 👋
***
##Réalisé par groupe numéro 11
(Lamya Rayess, Ahlem Fahem, Abdellah Abouhanifa)
***
##Les Classes
* User

(id, name, age, category, email, userName, nbrEmpr)
* Book 

(id, title, isbn, category, user)
* Comment

(id, content, title, book, user)
***
##Les API
Pour chaque classe, vous pouvez récupérer tous les objets de ce type dans la base de données, les ajouter, les supprimer ou les modifier.

* Récupérer: /getAll et /getById
* Recherche: /findByTitle (pour Book et Comment) ainsi que < /findByName (pour User)
* Ajouter: /add
* Modifier: /update/{id}
* Supprimer: /deleteAll et /delete/{id}
* Authentification:
***
##Utilisation des API avec navigateur:

On lance l'application et on démarre notre navigateur Internet.
 
* url

localhost:8080

* Si on souhaitez récupérer tous les objets d'une classe. On ajoute la classe à la fin de l'URL.
  
  Par exemple: localhost:8080/user
  
  Cette requête récupère toutes les utilisateurs dans la base.
  
* Si on souhaite apporter des modifications à la base de données.
  
  Par exemple: localhost:8080/user/delete/3
  
  Cette requête supprime l'utilisateur qui possède l'ID 3.
  
  ##Test des API avec Postman :
  
  Toute une collection des tests des api se trouvent dans notre fichier postman.

* Exemple d'un test dans postman:

Si vous souhaitez apporter des modifications à la base de données.

Par exemple: DELETE localhost:8080/user/1

Cette requête supprime l'utilisateur qui a l'ID 1.
