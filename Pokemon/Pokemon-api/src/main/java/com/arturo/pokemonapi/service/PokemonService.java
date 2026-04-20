package com.arturo.pokemonapi.service;

import com.arturo.pokemonapi.model.Pokemon;
import com.arturo.pokemonapi.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //indica que es el service
public class PokemonService {

    @Autowired //inyecta el repositorio
    private PokemonRepository repository; // le ponemos de nombre repository

    public List<Pokemon> getAll(){
        return repository.findAll(); // retornamos todos los pokemones
    }

    public Pokemon save(Pokemon pokemon){ // creamos un pokemon de tipo pokemon
        return repository.save(pokemon); //metodo save
    }

}
