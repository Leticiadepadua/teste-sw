package com.swapi.sw.planeta;

import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController // cria API rest
@RequestMapping ("/api/v1") //indica o caminho
public class PlanetaController  {

    @Autowired //inserindo repository
    private PlanetaRepository planetaRepository;

    @ResponseStatus(HttpStatus.CREATED) // nos confirma a execução dos metodos
    @PostMapping("/planetas") // permite criar o planeta com as informações necessárias
    public Planeta criarPlaneta(@Valid @RequestBody Planeta planeta) {
        return planetaRepository.save(planeta);
    }

    @GetMapping ("/planetas") //listando planetas que serão inseridos no postman
    public List<Planeta> listarPlanetas(){
        return planetaRepository.findAll();
    }

    @PostMapping ("/planetas/atualiza/{id}") // permitindo buscar o planeta por id
    public void buscaPlanetaPorId(@PathVariable Long id) {
        planetaRepository.findById(id);
    }
    @DeleteMapping ("/planetas/{id}") //permitindo deletar o planeta
    public void deletarPlaneta (@PathVariable Long id) {
        planetaRepository.deleteById(id);
    }

    @PostMapping ("/planetas/nome") // permitindo buscar planeta por nome
    public Planeta buscaPlanetaPorNome(@RequestParam String nome) {
        return planetaRepository.findByNome(nome);
    }
}


