package com.swapi.sw.planeta;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "planeta")
@Data
public class Planeta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column (name = "clima")
    private String clima;

    @Column (name = "terreno")
    private String terreno;

    @Column (name = "aparicoes")
    private Long aparicoes;




}
