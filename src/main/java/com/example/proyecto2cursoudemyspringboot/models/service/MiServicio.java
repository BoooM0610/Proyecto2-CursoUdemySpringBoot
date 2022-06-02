package com.example.proyecto2cursoudemyspringboot.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service("miServicioSimple")
public class MiServicio implements IServicio
{
    @Override
    public String operacion()
    {
        return "ejecutar algún proceso importate simple...";
    }
}
