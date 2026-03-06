package com.intecap.clase05.service;

import com.intecap.clase05.model.electricidadModel;
import com.intecap.clase05.repository.electricidadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class electricidadService {
    private final electricidadRepository repository;

    public electricidadService(electricidadRepository repository){
        this.repository = repository;
    }

    public List<electricidadModel> obtenerTodos(){
        return repository.findAll();
    }

    public void guardar(electricidadModel electricidad){
        repository.save(electricidad);
    }

}
