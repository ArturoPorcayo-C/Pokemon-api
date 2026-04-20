package com.arturo.pokemonapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity //se convierte en tabla
//La entidad por defecto trae
@Data // equivalente a getters y setters

public class Pokemon {

    @Id// clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //incremento de id

    private String name;
    private String type;

}
