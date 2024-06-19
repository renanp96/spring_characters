package com.games.chars.controller;

import com.games.chars.models.EnemyProfile;
import com.games.chars.service.EnemyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enemy")
public class EnemyProfileController {

    @Autowired
    private EnemyProfileService service;

    @GetMapping
    public List<EnemyProfile> getAllEnemies() {
        return service.getAllEnemies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnemyProfile> getEnemyById(@PathVariable Long id) {
        return service.getEnemyById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public EnemyProfile createEnemy(@RequestBody EnemyProfile enemy) {
        return service.createEnemy(enemy);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnemy(@PathVariable Long id) {
        service.deleteEnemy(id);
        return ResponseEntity.ok().build();
    }

}
