
package com.intecap.clase05.controller;

import com.intecap.clase05.model.hotelModel;
import com.intecap.clase05.service.hotelService;
import jakarta.validation.Valid;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author oskto
 */

@RestController
@RequestMapping("/api/hotel")

public class hotelController {
    

    private final hotelService service;

    public hotelController(hotelService service) {
        this.service = service;
    }

    @GetMapping
    public List<hotelModel> listarTodos() {
        return service.obtenerTodos();
    }

    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody hotelModel hotel, BindingResult result) {
        if (result.hasErrors()) {
            Map<String, String> errores = new LinkedHashMap<>();
            result.getFieldErrors().forEach(e ->
                errores.put(e.getField(), e.getDefaultMessage())
            );
            return ResponseEntity.badRequest().body(errores);
        }
        service.guardar(hotel);
        return ResponseEntity.ok("Reservación registrada con éxito");
    }

}
