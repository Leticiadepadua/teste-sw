package com.swapi.sw.planeta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, Long> {

    @Query(value = "update Planeta p set p.nome = :nome where p.id= :id")
    void atualizaNome(@Param("nome") String nome, @Param("id") Long id);
}
