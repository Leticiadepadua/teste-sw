package com.swapi.sw.planeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/api/v1")
public class PlanetaController  {

    @Autowired
    private PlanetaRepository planetaRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/planetas")
    public Planeta criarPlaneta(@Valid @RequestBody Planeta planeta) {
        return planetaRepository.save(planeta);
    }

    @GetMapping ("/planetas")
    public List<Planeta> listarPlanetas(){
        return planetaRepository.findAll();

    }

    @PatchMapping ("/planetas/atualiza/{id}")
    public void atualizaNome(@PathVariable Long id, @RequestParam String nome) {
        planetaRepository.atualizaNome(nome, id);
    }
    @DeleteMapping ("/planetas/{id}")
    public void deletarPlaneta (@PathVariable Long id) {
        planetaRepository.deleteById(id);
    }

}
