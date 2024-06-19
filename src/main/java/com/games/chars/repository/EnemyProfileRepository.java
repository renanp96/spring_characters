package com.games.chars.repository;

import com.games.chars.models.EnemyProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnemyProfileRepository extends JpaRepository<EnemyProfile, Long> {
}
