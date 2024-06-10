package com.games.chars.repository;

import com.games.chars.models.EnemyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnemyRepository extends JpaRepository<EnemyModel, Long> {
}
