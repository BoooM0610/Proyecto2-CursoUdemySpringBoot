package com.example.proyecto2cursoudemyspringboot.models.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Component
@RequestScope
public class Factura implements Serializable
{
    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;

    @Autowired
    private List<ItemFactura> items;

    @PostConstruct
    public void inicializar()
    {
        cliente.setNombre(cliente.getNombre().concat(" ").concat("José"));
        descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
    }

    @PreDestroy
    public void destruir()
    {
        System.out.println("Factura destruida: ".concat(descripcion));
    }
}
