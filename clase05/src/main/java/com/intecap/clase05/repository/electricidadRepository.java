package com.intecap.clase05.repository;

import com.intecap.clase05.model.electricidadModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class electricidadRepository {
    private List<electricidadModel> electricidadModels = new ArrayList<>();

    public List<electricidadModel> findAll(){
        return this.electricidadModels;
    }
    public void save (electricidadModel electricidadModel){
        this.electricidadModels.add(electricidadModel);
    }
}
