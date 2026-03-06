package com.intecap.clase05.service;

import com.intecap.clase05.model.videoJuegoModel;
import com.intecap.clase05.repository.videoJuegoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class videoJuegoService {
    private final videoJuegoRepository repository;

    public videoJuegoService(videoJuegoRepository repository){
        this.repository = repository;
    }
    public List<videoJuegoModel> obtenerTodos(){
        return repository.findAll();
    }

    public void guardar(videoJuegoModel videoJuego){
        repository.save(videoJuego);
    }
}
