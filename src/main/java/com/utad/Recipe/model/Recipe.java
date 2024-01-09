package com.utad.Recipe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "recipe")
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecipe;

    @Column(nullable = false)
    private String title;
    private String intructions;
    private String tag; // vegano

    private Integer time;

}
