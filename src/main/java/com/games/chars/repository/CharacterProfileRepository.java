package com.games.chars.repository;

import com.games.chars.models.CharacterProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterProfileRepository extends JpaRepository<CharacterProfile, Long> {
}
