package com.games.chars.controller;

import com.games.chars.models.CharacterProfile;
import com.games.chars.repository.CharacterProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public/character")
public class CharacterProfileController {

    @Autowired
    private CharacterProfileRepository characterProfileRepository;

    @GetMapping("/")
    public List<CharacterProfile> getCharacters(){
        return characterProfileRepository.findAll();
    }

    @PostMapping("/")
    public CharacterProfile addCharacter(@RequestBody CharacterProfile characterProfile) {
        return characterProfileRepository.save(characterProfile);
    }

    @GetMapping("/{id}")
    public CharacterProfile getCharacterProfileById(@PathVariable Long id){
        return characterProfileRepository.findById(id).orElseThrow(() -> new RuntimeException("Character not found: " + id));
    }

    @PutMapping("/{id}")
    public CharacterProfile updateCharacterProfile(@PathVariable Long id, @RequestBody CharacterProfile updater) {
        CharacterProfile character = characterProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Character not found with id: " + id));

        character.setName(updater.getName());
        character.setRole(updater.getRole());
        character.setLevel(updater.getLevel());

        return characterProfileRepository.save(character);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id) {
        characterProfileRepository.deleteById(id);
    }
}
