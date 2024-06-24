package com.games.chars.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "enemy_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnemyProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String race;

    @NotNull
    private String enemyClass;

    @NotNull
    private Integer enemyLevel;

    @NotNull
    private Integer lifePoints;

    @NotNull
    private Integer manaPoints;

    private Boolean isBoss;

}
