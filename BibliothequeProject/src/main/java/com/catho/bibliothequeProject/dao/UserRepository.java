package com.catho.bibliothequeProject.dao;


import com.catho.bibliothequeProject.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user"
        , path = "users")
public interface UserRepository extends CrudRepository<Utilisateur, Integer> {
}