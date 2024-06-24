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

    @NotNull
    private String name;

    private String gender;

    private String race;

    @NotNull
    private String charClass;

    @NotNull
    private Integer charLevel;

    @NotNull
    private Integer lifePoints;

    @NotNull
    private Integer manaPoints;

    @NotNull
    private Boolean isNpc;
}
