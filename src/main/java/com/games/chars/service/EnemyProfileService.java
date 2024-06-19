package com.games.chars.service;

import com.games.chars.models.EnemyProfile;
import com.games.chars.repository.EnemyProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnemyProfileService {

    @Autowired
    private EnemyProfileRepository repository;

    public List<EnemyProfile> getAllEnemies() {
        return repository.findAll();
    }

    public Optional<EnemyProfile> getEnemyById(Long id) {
        return repository.findById(id);
    }

    public EnemyProfile createEnemy(EnemyProfile enemy) {
        return repository.save(enemy);
    }

    public void deleteEnemy(Long id) {
        repository.deleteById(id);
    }

}
