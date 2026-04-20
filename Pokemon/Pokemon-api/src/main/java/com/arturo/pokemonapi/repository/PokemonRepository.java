package com.arturo.pokemonapi.repository; //Este documento es una interfaz que lleva los valores

import com.arturo.pokemonapi.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    //interfaz que extiende de pokemon.java y trae sus atributos



}
