package com.catho.bibliothequeProject.controllers;

import com.catho.bibliothequeProject.entity.Utilisateur;
import com.catho.bibliothequeProject.Dao.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@RestController()
@RequestMapping(path = "/users")
public class UtilisateurController {
    @Autowired
    private UtilisateurDao UtilisateurDao;
    );
}

