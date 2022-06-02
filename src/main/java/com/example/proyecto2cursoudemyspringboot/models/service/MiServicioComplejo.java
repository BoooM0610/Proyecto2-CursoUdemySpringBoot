package com.example.proyecto2cursoudemyspringboot.models.service;

import org.springframework.stereotype.Service;

//@Service("miServicioComplejo")
public class MiServicioComplejo implements IServicio
{
    @Override
    public String operacion()
    {
        return "ejecutar algún proceso importate complicado...";
    }
}
