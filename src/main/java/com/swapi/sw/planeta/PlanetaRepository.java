package com.swapi.sw.planeta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //quem possibilitará fazer os metodos
public interface PlanetaRepository extends JpaRepository<Planeta, Long> {

    //Solicitando a informação pelo id do banco de dados

    @Query(value = "update Planeta p set p.nome = :nome where p.id= :id")
    void buscaNomePorId(@Param("nome") String nome, @Param("id") Long id);

    // Solicitando a informação pelo nome do banco de dados
    Planeta findByNome (@Param("nome") String nome);

}
