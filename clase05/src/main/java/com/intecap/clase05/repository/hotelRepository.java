/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intecap.clase05.repository;

import com.intecap.clase05.model.hotelModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author oskto
 */
@Repository
public class hotelRepository {
    
    private final List<hotelModel> data = new ArrayList<>();

    public List<hotelModel> findAll() {
        return this.data;
    }

    public void save(hotelModel hotel) {
        this.data.add(hotel);
    }

}
