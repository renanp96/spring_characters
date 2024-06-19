package com.games.chars.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "character_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CharacterProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String gender;

    @NotBlank
    private String race;

    @NotBlank
    private String role;

    @NotNull
    private Boolean isNpc;
}
