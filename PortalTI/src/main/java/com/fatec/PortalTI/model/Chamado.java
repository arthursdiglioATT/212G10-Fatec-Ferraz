package com.fatec.PortalTI.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public @Data class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String prioriedade;
    private String nomeCliente;
    private String categoria;
}
