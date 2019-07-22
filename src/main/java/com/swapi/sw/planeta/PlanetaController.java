package com.swapi.sw.planeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/v1")
public class PlanetaController  {

    @Autowired
    private PlanetaRepository planetaRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping ("/planetas")
    public List<Planeta> listarPlanetas(){
        return planetaRepository.findAll();

    }


}
