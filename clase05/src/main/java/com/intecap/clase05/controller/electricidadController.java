package com.intecap.clase05.controller;

import com.intecap.clase05.model.electricidadModel;
import com.intecap.clase05.service.electricidadService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/electricidad")
public class electricidadController {
    private final electricidadService service;

    public electricidadController(electricidadService service){
        this.service = service;
    }

    @GetMapping
    public List<electricidadModel> listarTodos(){
        return service.obtenerTodos();
    }

    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody electricidadModel electricidad, BindingResult result){
        if(result.hasErrors()){
            Map<String, String> errores = new LinkedHashMap<>();
            result.getFieldErrors().forEach(e ->
                    errores.put(e.getField(), e.getDefaultMessage())
            );
            return ResponseEntity.badRequest().body(errores);
        }
        service.guardar(electricidad);
        return ResponseEntity.ok("Guardado con exito");
    }
}
