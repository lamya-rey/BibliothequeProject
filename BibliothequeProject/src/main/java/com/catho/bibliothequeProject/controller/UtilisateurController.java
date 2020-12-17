package com.catho.bibliothequeProject.controller;

import com.catho.bibliothequeProject.dao.UserRepository;
import com.catho.bibliothequeProject.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/users")
public class UtilisateurController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Iterable<Utilisateur> getAllUsers() {
        return userRepository.findAll();
    }
    @GetMapping("/{userId}")
    public Optional<Utilisateur> getUserById(@PathVariable("userId") int userId) {
        return userRepository.findById(userId);
    }
}