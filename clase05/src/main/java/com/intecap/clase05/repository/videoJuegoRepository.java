package com.intecap.clase05.repository;

import com.intecap.clase05.model.videoJuegoModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class videoJuegoRepository {
    private List<videoJuegoModel> videoJuegos = new ArrayList<>();

    public List<videoJuegoModel> findAll(){
        return this.videoJuegos;
    }
    public void save (videoJuegoModel videoJuego){
        this.videoJuegos.add(videoJuego);
    }
}
