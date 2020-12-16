package com.catho.bibliothequeProject.controllers;

import java.util.Optional;
import java.util.Set;

@RestController()
@RequestMapping(path = "/users")
public class UtilisateurController {
    @Autowired
    private UserRepository userRepository;
    );
    @GetMapping
    public Iterable<Utilisateur> getUsers() {
        return userRepository.findAll();
    }
    @GetMapping("/{userId}")
    public Optional<Utilisateur> getUser(@PathVariable("userId") int userId) {
        return userRepository.findById(userId);
    }
}
