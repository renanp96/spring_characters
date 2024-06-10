package com.games.chars.controller;

import com.games.chars.models.EnemyModel;
import com.games.chars.repository.EnemyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/public/enemy")
public class EnemyController {

    @Autowired
    private EnemyRepository repository;

    @GetMapping("/")
    public List<EnemyModel> getEnemies() {
        return repository.findAll();
    }

    @PostMapping("/")
    public EnemyModel createEnemy(@RequestBody EnemyModel enemyModel) {
        return repository.save(enemyModel);
    }

    @GetMapping("/{id}")
    public EnemyModel getEnemyById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Enemy not found: " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteEnemyById(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
