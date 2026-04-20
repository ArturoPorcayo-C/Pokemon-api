package com.arturo.pokemonapi.controller;

import com.arturo.pokemonapi.model.Pokemon;
import com.arturo.pokemonapi.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")//Haces consultas a esa ruta
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping //ruta get
    public List<Pokemon> getAll(){
        return service.getAll();
    }

    @PostMapping // ruta post
    public Pokemon create(@RequestBody Pokemon pokemon){
        return service.save(pokemon);
    }

}
