package com.intecap.clase05.service;

import com.intecap.clase05.model.farmaciaModel;
import com.intecap.clase05.repository.farmaciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class farmaciaService {
    private final farmaciaRepository repository;

    public farmaciaService(farmaciaRepository repository){
        this.repository = repository;
    }

    public List<farmaciaModel> obtenerTodos(){
        return repository.findAll();
    }

    public void guardar(farmaciaModel farmacia){
        repository.save(farmacia);
    }
}
