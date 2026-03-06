
package com.intecap.clase05.service;

import com.intecap.clase05.model.hotelModel;
import com.intecap.clase05.repository.hotelRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author oskto
 */
@Service
public class hotelService {
    
    private final hotelRepository repository;

    public hotelService(hotelRepository repository) {
        this.repository = repository;
    }

    public List<hotelModel> obtenerTodos() {
        return repository.findAll();
    }

    public void guardar(hotelModel hotel) {
        repository.save(hotel);
    }

}
