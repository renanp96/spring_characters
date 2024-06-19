package com.games.chars.service;

import com.games.chars.models.CharacterProfile;
import com.games.chars.repository.CharacterProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterProfileService {

    @Autowired
    private CharacterProfileRepository characterProfileRepository;

    public List<CharacterProfile> getAllCharacters() {
        return characterProfileRepository.findAll();
    }

    public Optional<CharacterProfile> getCharacterByID(Long id){
        return characterProfileRepository.findById(id);
    }

    public CharacterProfile createCharacter(CharacterProfile character) {
        return characterProfileRepository.save(character);
    }

    public void deleteCharacter(Long id) {
        characterProfileRepository.deleteById(id);
    }

}
