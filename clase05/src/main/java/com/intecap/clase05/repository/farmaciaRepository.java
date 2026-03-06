package com.intecap.clase05.repository;

import com.intecap.clase05.model.farmaciaModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class farmaciaRepository {
    private List<farmaciaModel> farmaciaModels = new ArrayList<>();

    public List<farmaciaModel> findAll(){
        return this.farmaciaModels;
    }
    public void save (farmaciaModel farmaciaModel){
        this.farmaciaModels.add(farmaciaModel);
    }
}
