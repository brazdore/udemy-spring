package com.example.udemyspring.resources;

import com.example.udemyspring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Takanashi Kiara", "kiarathephoenix@gmail.com", "99996969", "calliS2kiara");
        return ResponseEntity.ok().body(u);
    }
}
