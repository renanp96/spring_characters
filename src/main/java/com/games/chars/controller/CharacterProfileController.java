package com.games.chars.controller;

import com.games.chars.models.CharacterProfile;
import com.games.chars.service.CharacterProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterProfileController {

    @Autowired
    private CharacterProfileService service;

    @GetMapping
    public List<CharacterProfile> getAllCharacter() {
        return service.getAllCharacters();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CharacterProfile> getCharacterByID(@PathVariable Long id) {
        return service.getCharacterByID(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public CharacterProfile createCharacter(@RequestBody CharacterProfile character) {
        return service.createCharacter(character);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable Long id) {
        service.deleteCharacter(id);
        return ResponseEntity.ok().build();
    }

}
