package com.example.proyecto2cursoudemyspringboot.models.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto
{
    private String nombre;
    private Integer precio;

    public Producto(String nombre, Integer precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }
}
